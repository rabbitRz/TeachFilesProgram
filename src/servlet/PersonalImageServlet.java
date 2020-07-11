package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;

import bean.Teacher;
import daoImpl.TeacherDaoImpl;

/**
 * Servlet implementation class PersonalImageServlet
 */

@WebServlet("/PersonalImage")
public class PersonalImageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PersonalImageServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		String t_id=request.getParameter("teacher_id");
		TeacherDaoImpl daoImpl=new TeacherDaoImpl();
		Teacher t=new Teacher();
		t=daoImpl.showPersonById(Integer.parseInt(t_id));
		response.setContentType("application/json;charest=utf-8");
		ObjectMapper mapper=new ObjectMapper();
		String data=mapper.writeValueAsString(t);
		PrintWriter pw=response.getWriter();
		pw.println(data);
		pw.flush();
		pw.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
