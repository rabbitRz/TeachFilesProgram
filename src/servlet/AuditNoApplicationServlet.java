package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.IApplication;
import daoImpl.ApplicationImpl;

public class AuditNoApplicationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public AuditNoApplicationServlet() {
        super();
       
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");	
		
		int id=Integer.parseInt(request.getParameter("id"));
		String reason=request.getParameter("reason");
		//System.out.println("noshwen"+reason);
		IApplication dao = new ApplicationImpl();	
		boolean flag=dao.updatenoapply(id, reason);
		//request.setAttribute("emps", emps);
		if(flag) {
		request.getRequestDispatcher("/AdminApplicationServlet").forward(request, response);					
	}
	}
}
