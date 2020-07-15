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
import bean.PaperPeople;
import dao.IPaper;
import daoImpl.PaperImpl;

public class AdminAddPaperServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public AdminAddPaperServlet() {
        super();
      
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");	
		Paper paper=new Paper();
		PaperPeople paperPeople=new PaperPeople();
		IPaper iPaper=new PaperImpl();
		String paper_name=request.getParameter("paper_name");
		String journal_name=request.getParameter("journal_name");
		String retime=request.getParameter("release_time");
		String journal_level=request.getParameter("journal_level");
		String paper_index=request.getParameter("paper_index");
		String paper_ranking=request.getParameter("paper_ranking");
		int people1_id=Integer.parseInt(request.getParameter("people1_id"));
		int people2_id=Integer.parseInt(request.getParameter("people2_id"));
		int people3_id=Integer.parseInt(request.getParameter("people3_id"));
		System.out.println(people2_id);
		paper.setPaper_name(paper_name);
		paper.setJournal_name(journal_name);
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");		
		try {
			Date retimed = df.parse(retime);
			java.sql.Date release_time = new java.sql.Date(retimed.getTime());
			paper.setRelease_time(release_time);		
		} catch (ParseException e) {
			e.printStackTrace();
		}		
		paper.setJournal_level(journal_level);
		paper.setPaper_index(paper_index);
		paper.setPaper_ranking(paper_ranking);
		Paper paper2=new Paper();
		paper2=iPaper.findnewid();
		int paper_id=paper2.getPaper_id();
		paperPeople.setPaper_id(paper_id);
		paperPeople.setPeople1_id(people1_id);
		paperPeople.setPeople2_id(people2_id);
		paperPeople.setPeople3_id(people3_id);
		boolean res=iPaper.insertpaper(paper);
		boolean res1=iPaper.insertpaperpeople(paperPeople);
		if(res&&res1) {
			request.getRequestDispatcher("/AdminGetPaperServlet").forward(request, response);
		}
		
	}
	

}
