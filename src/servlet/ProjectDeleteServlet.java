package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ProjectManageDao;
import daoImpl.ProjectManageDaoImpl;

/**
 * Servlet implementation class ProjectDeleteServlet
 */
public class ProjectDeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProjectDeleteServlet() {
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
		ProjectManageDao dao = new ProjectManageDaoImpl();
		
		int id = Integer.parseInt(request.getParameter("id"));
		boolean flag=dao.projectDelete(id);
		PrintWriter out = response.getWriter();
 			if(flag) {			
 				out.print("<script>alert('删除项目信息成功!');window.location.href='ShowAllProjectServlet'</script>");
 				
 			}else {
 				out.print("<script>alert('删除项目信息失败!');window.location.href='ShowAllProjectServlet'</script>");
 			}
	}

}
