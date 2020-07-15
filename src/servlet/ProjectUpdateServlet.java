package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Project;
import dao.ProjectManageDao;
import daoImpl.ProjectManageDaoImpl;

/**
 * Servlet implementation class ProjectUpdateServlet
 */
public class ProjectUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProjectUpdateServlet() {
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
		ProjectManageDao dao=new ProjectManageDaoImpl();
		Project project=dao.showProjectById(id);
		request.setAttribute("project", project);	
		request.getRequestDispatcher("admin/ProjectManage/projectUpdate.jsp").forward(request, response);
	}

}
