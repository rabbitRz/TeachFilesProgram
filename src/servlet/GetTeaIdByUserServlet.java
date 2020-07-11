package servlet;

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

import bean.Teacher;
import bean.course;
import daoImpl.CourseDaoImpl;
import daoImpl.TeacherDaoImpl;

/**
 * Servlet implementation class GetTeaIdByUserServlet
 * 根据用户id查看teacher信息
 */
@WebServlet("/uT")
public class GetTeaIdByUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetTeaIdByUserServlet() {
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
		String user_idString=request.getParameter("user_id");
		TeacherDaoImpl daoImpl=new TeacherDaoImpl();
		Teacher teacher=daoImpl.showPersonalInfo(Integer.parseInt(user_idString));
		String tString=String.valueOf(teacher.getId());
		response.setContentType("application/json;charest=UTF-8");
		PrintWriter pWriter=response.getWriter();
		pWriter.println(tString);
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
