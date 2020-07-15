package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Application;
import bean.School;
import dao.IApplication;
import dao.ISchool;
import daoImpl.ApplicationImpl;
import daoImpl.SchoolImpl;

/**
 * Servlet implementation class AdminApplicationServlet
 */
public class AdminApplicationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminApplicationServlet() {
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
		IApplication iApplication=new ApplicationImpl();
		List<Application> application2=iApplication.findnoapply();
		request.setAttribute("application2", application2);	
		request.getRequestDispatcher("admin/applicationManage/application.jsp").forward(request, response);
		
	}

}
