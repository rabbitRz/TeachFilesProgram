package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Paper;
import dao.IPaper;
import daoImpl.PaperImpl;

/**
 * Servlet implementation class AdminGetPapeServlet
 */
public class AdminGetPapeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public AdminGetPapeServlet() {
        super();
      
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		response.setContentType("application/json;charest=utf-8");
		int id = Integer.parseInt(request.getParameter("id"));
		IPaper iPaper=new PaperImpl();
		Paper paper2 = iPaper.findbyid(id);	
		request.setAttribute("paper2", paper2);	
		request.getRequestDispatcher("admin/paperManage/updatepaper.jsp").forward(request, response);
	}

}
