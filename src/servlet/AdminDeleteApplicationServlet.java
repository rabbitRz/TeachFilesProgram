package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Application;
import dao.IApplication;
import daoImpl.ApplicationImpl;

/**
 * Servlet implementation class AdminDeleteApplicationServlet
 */
public class AdminDeleteApplicationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public AdminDeleteApplicationServlet() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		int id=Integer.parseInt(request.getParameter("id"));	
		IApplication dao=new ApplicationImpl();	
		boolean res=dao.deletebytid(id);
		if(res) {		
			request.getRequestDispatcher("/AdminApplicationHistoryServlet").forward(request, response);
		}
	}

	}


