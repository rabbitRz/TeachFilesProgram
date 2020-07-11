package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import daoImpl.ChangePermissionDaoImpl;

/**
 * Servlet implementation class SciChangPermissionServlet
 * 更改权限申请提交
 */
@WebServlet("/SciChangPermission")
public class SciChangPermissionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SciChangPermissionServlet() {
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
		String paper_id=request.getParameter("paper_id");
		String application=request.getParameter("application");
		String member=request.getParameter("member");
		String member_per=request.getParameter("member_per");
		ChangePermissionDaoImpl daoImpl=new ChangePermissionDaoImpl();
		boolean flag=daoImpl.insertChangePermission(paper_id, member, member_per, application);
		String str="";
		if(flag) {
			str="提交申请成功，请等待论文所有参与人员确认！";
		}else {
			str="提交申请失败，您可能已经提交过申请或者该篇论文已被提交过申请！";
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
