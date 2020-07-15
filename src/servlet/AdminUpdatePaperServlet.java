package servlet;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Paper;
import dao.IPaper;
import daoImpl.PaperImpl;

/**
 * Servlet implementation class AdminUpdatePaperServlet
 */
public class AdminUpdatePaperServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public AdminUpdatePaperServlet() {
        super();
      
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");	
		int id=Integer.parseInt(request.getParameter("id"));
		Paper paper=new Paper();
		IPaper iPaper=new PaperImpl();
		String paper_name=request.getParameter("paper_name");
		String journal_name=request.getParameter("journal_name");
		String retime=request.getParameter("release_time");
		String journal_level=request.getParameter("journal_level");
		String paper_index=request.getParameter("paper_index");
		String paper_ranking=request.getParameter("paper_ranking");
		paper.setPaper_name(paper_name);
		paper.setJournal_name(journal_name);
		paper.setJournal_level(journal_level);
		paper.setPaper_index(paper_index);
		paper.setPaper_ranking(paper_ranking);
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");		
		try {
			Date retimed = df.parse(retime);
			java.sql.Date release_time = new java.sql.Date(retimed.getTime());
			paper.setRelease_time(release_time);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	    
		boolean flag=iPaper.updatepaper(paper, id);
		if(flag) {
	    request.getRequestDispatcher("/AdminGetPaperServlet").forward(request, response);					
		}
		
	}

}
