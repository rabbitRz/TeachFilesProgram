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
 * Servlet implementation class AdminApplicationHistoryServlet
 */
public class AdminApplicationHistoryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public AdminApplicationHistoryServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		IApplication iApplication=new ApplicationImpl();
		List<Application> application4=iApplication.findhistory();
		request.setAttribute("application4", application4);	
		request.getRequestDispatcher("admin/applicationManage/applicationhistory.jsp").forward(request, response);
	}


}
