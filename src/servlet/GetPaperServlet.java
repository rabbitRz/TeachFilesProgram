package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Paper;
import bean.School;
import dao.IPaper;
import dao.ISchool;
import dao.PaperDao;
import daoImpl.PaperDaoImpl;
import daoImpl.SchoolImpl;

/**
 * Servlet implementation class GetPaperServlet
 */
public class GetPaperServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetPaperServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		PaperDao iPaper=new PaperDaoImpl();
		List<Paper> paper=iPaper.show();
		System.out.println(paper);
		request.setAttribute("paper", paper);	
		request.getRequestDispatcher("school/school.jsp").forward(request, response);
		
	}

}
