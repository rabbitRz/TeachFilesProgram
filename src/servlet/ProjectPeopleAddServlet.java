package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Project;
import dao.ProjectManageDao;
import daoImpl.ProjectManageDaoImpl;

/**
 * Servlet implementation class ProjectPeopleAddServlet
 */
public class ProjectPeopleAddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProjectPeopleAddServlet() {
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
		int pro_id = Integer.parseInt(request.getParameter("project_id"));
		int leader_id=Integer.parseInt(request.getParameter("leader_id"));
		int memeber1_id = Integer.parseInt(request.getParameter("member1_id"));
		int memeber2_id = Integer.parseInt(request.getParameter("member2_id"));
		int memeber3_id = Integer.parseInt(request.getParameter("member3_id"));
		
		Project project=new Project();
		project.setPro_id(pro_id);
		project.setLeader_id(leader_id);
		project.setT1_id(memeber1_id);
		project.setT2_id(memeber2_id);
		project.setT3_id(memeber3_id);
		
		ProjectManageDao dao=new ProjectManageDaoImpl();
		boolean flag=dao.projectPeopleAdd(project);
		PrintWriter out = response.getWriter();
		//System.out.println(flag);
		if(flag) {			
			out.print("<script>alert('项目添加人员成功!');window.location.href='ShowAllProjectServlet'</script>");
			
		}else {
			out.print("<script>alert('项目添加人员失败!');window.location.href='ShowAllProjectServlet'</script>");
		}
	}

}
