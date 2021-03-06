package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Application;
import bean.Paper;
import bean.Project;
import bean.Teacher;
import dao.IApplication;
import dao.TeacherDao;
import daoImpl.ApplicationImpl;
import daoImpl.TeacherDaoImpl;

/**
 * Servlet implementation class PersonalInfoServlet
 * 个人信息
 */
@WebServlet("/personal")
public class PersonalInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PersonalInfoServlet() {
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
		response.setContentType("text/html");
		
		TeacherDao teacherDao=new TeacherDaoImpl();
		IApplication iApplication=new ApplicationImpl();
		int user_id = Integer.parseInt(request.getParameter("user_id"));
		System.out.println("用户编号:"+user_id);
		Teacher teacher=teacherDao.showPersonalInfo(user_id);
		request.setAttribute("teacher", teacher);
		int teacher_id=teacher.getId();
		List<Application> applications5=iApplication.findbytea_id(teacher_id);
		List<Application> applications7=iApplication.findbyt_id(teacher_id);
		request.setAttribute("applications7", applications7);
		request.setAttribute("applications5", applications5);
		System.out.println("老师的id："+teacher.getId());
		List<Paper> papers=teacherDao.showPapers(teacher.getId());
		request.setAttribute("papers", papers);
		
		List<Project> projects=teacherDao.showProjects(teacher.getId());
		request.setAttribute("projects", projects);
		request.getRequestDispatcher("teacher/personal/personalInfo.jsp").forward(request, response);
	}

}
