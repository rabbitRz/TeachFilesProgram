package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Teacher;
import dao.TeacherDao;
import daoImpl.TeacherDaoImpl;

/**
 * Servlet implementation class TeacherUpdateServlet
 */
@WebServlet("/TeacherUpdate")
public class TeacherUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TeacherUpdateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		response.setContentType("application/json;charest=utf-8");
		int id = Integer.parseInt(request.getParameter("id"));
		System.out.println("id:"+id);
		TeacherDao teacherDao=new TeacherDaoImpl();
		Teacher teacher = teacherDao.showPersonById(id);	
		System.out.println(teacher.getName());
		request.setAttribute("teacher", teacher);	
		request.getRequestDispatcher("admin/teacherManage/teacherUpdate.jsp").forward(request, response);
	}

}
