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
import daoImpl.PaperImpl;
import daoImpl.SchoolImpl;

/**
 * Servlet implementation class GetSchoolServlet
 */
public class GetSchoolServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public GetSchoolServlet() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		ISchool iSchool=new SchoolImpl();
		List<School> school=iSchool.show();
		System.out.println(school);
		request.setAttribute("school", school);	
		
		IPaper iPaper=new PaperImpl();
		List<Paper> paper=iPaper.show();
		System.out.println(paper);
		request.setAttribute("paper", paper);	
	
		request.getRequestDispatcher("school/school.jsp").forward(request, response);
	}

}
