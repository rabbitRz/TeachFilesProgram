package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.IApplication;
import dao.IPaper;
import daoImpl.ApplicationImpl;
import daoImpl.PaperImpl;


public class AdminDeletePaperServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
          
    public AdminDeletePaperServlet() {
        super();
      
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		int id=Integer.parseInt(request.getParameter("id"));	
		IPaper dao=new PaperImpl();
		boolean res=dao.deletepaper(id);
		boolean res1=dao.deleteafterpaper(id);
		if(res&&res1) {		
			request.getRequestDispatcher("/AdminGetPaperServlet").forward(request, response);
		}
	}


}
