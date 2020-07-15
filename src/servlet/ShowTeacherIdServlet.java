package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Project;
import bean.Teacher;
import dao.ProjectManageDao;
import dao.TeacherDao;
import daoImpl.ProjectManageDaoImpl;
import daoImpl.TeacherDaoImpl;

/**
 * Servlet implementation class ShowTeacherIdServlet
 */
public class ShowTeacherIdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowTeacherIdServlet() {
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
		
		int id = Integer.parseInt(request.getParameter("id"));
		
		TeacherDao teacherDao=new TeacherDaoImpl();
		List<Teacher> list=teacherDao.showAllTeachers();
		request.setAttribute("teachers", list);
		
		ProjectManageDao dao=new ProjectManageDaoImpl();
		Project project=dao.showProOnlyById(id);
		request.setAttribute("project", project);
		request.getRequestDispatcher("admin/ProjectManage/addProjectPeople.jsp").forward(request, response);
	}

}
