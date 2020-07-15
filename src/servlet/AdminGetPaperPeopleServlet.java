package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Paper;
import bean.PaperPeople;
import bean.Teacher;
import dao.IPaper;
import daoImpl.PaperImpl;

/**
 * Servlet implementation class AdminGetPaperPeopleServlet
 */
public class AdminGetPaperPeopleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public AdminGetPaperPeopleServlet() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		response.setContentType("application/json;charest=utf-8");
		IPaper iPaper=new PaperImpl();
		List<Teacher> paperPeople= iPaper.showteacher();
		request.setAttribute("paperPeople", paperPeople);	
		request.getRequestDispatcher("admin/paperManage/addpaper.jsp").forward(request, response);
	}

}
