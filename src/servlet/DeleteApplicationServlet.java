package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Application;
import dao.IApplication;
import daoImpl.ApplicationImpl;

public class DeleteApplicationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public DeleteApplicationServlet() {
        super();
     
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
		doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		Application application1=new Application();
		int id=Integer.parseInt(request.getParameter("id"));
		//System.out.println(id);
		IApplication dao=new ApplicationImpl();
		application1=dao.findteacherid(id);
		
		//System.out.println(application1.getTeacher_id());
		boolean res=dao.deletebytid(id);
		if(res) {
			request.setAttribute("application1", application1);
			request.getRequestDispatcher("application/tiaozhuan.jsp").forward(request, response);
		}
	}

}
