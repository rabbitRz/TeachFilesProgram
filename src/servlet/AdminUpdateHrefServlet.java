package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;

import bean.User;
import bean.course;
import dao.UserDao;
import daoImpl.CourseDaoImpl;
import daoImpl.UserDaoImpl;

/**
 * Servlet implementation class AdminUpdateHrefServlet
 * 通过课程id查看课程表信息
 */
@WebServlet("/adminCourseUpdate")
public class AdminUpdateHrefServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminUpdateHrefServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		String course_idString=request.getParameter("course_id");
		CourseDaoImpl daoImpl=new CourseDaoImpl();
		course c=new course();
		c=daoImpl.getCourseById(course_idString);
		ObjectMapper mapper=new ObjectMapper();
		String data=mapper.writeValueAsString(c);
		PrintWriter pWriter=response.getWriter();
		pWriter.println(data);
		pWriter.flush();
		pWriter.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
