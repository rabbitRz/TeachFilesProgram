package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Application;
import dao.IApplication;
import daoImpl.ApplicationImpl;

/**
 * Servlet implementation class GetApplicationServlet
 */
public class GetApplicationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public GetApplicationServlet() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("utf-8");
		IApplication dao=new ApplicationImpl();
		int teacher_id=Integer.parseInt(request.getParameter("teacher_id"));
		//System.out.println(teacher_id);
		List<Application> applications=dao.findbytid(teacher_id);
		//System.out.println(applications);
	
		request.setAttribute("applications",applications);		
		request.setAttribute("teacher_id",teacher_id);	
		request.getRequestDispatcher("application/application.jsp").forward(request, response);
	}

}
