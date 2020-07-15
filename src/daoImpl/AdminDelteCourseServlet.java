package daoImpl;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;

import bean.course;

/**
 * Servlet implementation class AdminDelteCourseServlet
 * 删除课程信息
 */
@WebServlet("/ADdeleteCour")
public class AdminDelteCourseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminDelteCourseServlet() {
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
		//教师id
		String course_id=request.getParameter("course_id");
		CourseDaoImpl daoImpl=new CourseDaoImpl();
		boolean flag=false;
		flag=daoImpl.deleteCourse(course_id);
		String str="";
		if (flag) {
			str="删除成功！";
		} else {
			str="删除失败！";
		}
		PrintWriter pWriter=response.getWriter();
		pWriter.println(str);
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
