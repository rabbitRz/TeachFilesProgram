package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Project;
import dao.ProjectManageDao;
import daoImpl.ProjectManageDaoImpl;

/**
 * Servlet implementation class DoProjectUpdateServlet
 */
public class DoProjectUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DoProjectUpdateServlet() {
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
		int pro_id = Integer.parseInt(request.getParameter("pro_id"));
		
		String pro_name = request.getParameter("pro_name");
		String pro_category = request.getParameter("pro_category");
		String pro_starttime = request.getParameter("pro_starttime");
		String pro_finishtime = request.getParameter("pro_finishtime");
		String pro_identime = request.getParameter("pro_identime");	
		String pro_identification = request.getParameter("pro_identification");		
		String pro_prize = request.getParameter("pro_prize");
		String pro_ranking = request.getParameter("pro_ranking");
		int leader_id=Integer.parseInt(request.getParameter("leader_id"));
		int memeber1_id = Integer.parseInt(request.getParameter("member1_id"));
		int memeber2_id = Integer.parseInt(request.getParameter("member2_id"));
		int memeber3_id = Integer.parseInt(request.getParameter("member3_id"));
		
		Project project=new Project();
		project.setPro_id(pro_id);
		project.setPro_name(pro_name);
		project.setPro_category(pro_category);
		project.setPro_starttime(pro_starttime);
		project.setPro_finishtime(pro_finishtime);
		project.setPro_identime(pro_identime);
		project.setPro_identification(pro_identification);
		project.setPro_prize(pro_prize);
		project.setPro_ranking(pro_ranking);
		project.setLeader_id(leader_id);
		project.setT1_id(memeber1_id);
		project.setT2_id(memeber2_id);
		project.setT3_id(memeber3_id);
		
		ProjectManageDao dao=new ProjectManageDaoImpl();
		boolean flag=dao.projectUpdate(project);
		PrintWriter out = response.getWriter();
		//System.out.println(flag);
		if(flag) {			
			out.print("<script>alert('修改项目信息成功!');window.location.href='ShowAllProjectServlet'</script>");
			
		}else {
			out.print("<script>alert('修改项目信息失败!');window.location.href='ShowAllProjectServlet'</script>");
		}
	
	}

}
