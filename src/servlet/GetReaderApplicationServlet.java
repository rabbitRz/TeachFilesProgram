package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Application;
import bean.Teacher;
import dao.IApplication;
import daoImpl.ApplicationImpl;

public class GetReaderApplicationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public GetReaderApplicationServlet() {
        super();
       
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");		
		int id=Integer.parseInt(request.getParameter("id"));
		IApplication dao = new ApplicationImpl();
		Application application1=dao.findteacherid(id);
		Teacher teacher1=new Teacher();
		teacher1=dao.findbyid(application1.getTeacher_id());
		boolean flag=dao.updatereaderapply(id);
		if(flag) {
			request.setAttribute("teacher1", teacher1);
		    request.getRequestDispatcher("application/tiaozhuan2.jsp").forward(request, response);					
	}
	}

}
