package servlet;

import java.io.IOException;

import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Application;
import bean.Teacher;
import dao.IApplication;
import daoImpl.ApplicationImpl;

/**
 * Servlet implementation class ApplicationServlet
 */
public class ApplicationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public ApplicationServlet() {
        super();
      
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		//response.setContentType("text/html;charset=utf-8");
		response.setCharacterEncoding("utf-8");
		String idString=request.getParameter("id1");
		//System.out.println(idString);
		int teacher_id=Integer.parseInt(idString);		
		String name=request.getParameter("name");	
		String sex=request.getParameter("sex");
		String nativeplace=request.getParameter("nativeplace");
		String birth=request.getParameter("birthday");
		System.out.println(birth);
		String education=request.getParameter("education");
		//String title=request.getParameter("title");
		//String quat=request.getParameter("quatime");
		String graschool=request.getParameter("graschool");
		//String grat=request.getParameter("gratime");
		String major=request.getParameter("major");
		String workingtime=request.getParameter("workingtime");
		String currentmajor=request.getParameter("currentmajor");
		String paper_name=request.getParameter("paper_name");
		String journal_name=request.getParameter("journal_name");
		System.out.println(journal_name);
		IApplication dao=new ApplicationImpl();
		Teacher t=new Teacher();
		//System.out.println(name);
		t=dao.findbyid(teacher_id);
		int user_id=t.getUser_id();
		System.out.println(user_id);
		Application a=new Application();
		
		//a.setTeacher_id(t.getId());
		a.setTeacher_id(teacher_id);
		a.setName(name);
		a.setSex(sex);
		a.setNativeplace(nativeplace);
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		
		try {
			Date birthd = df.parse(birth);
			java.sql.Date birthday = new java.sql.Date(birthd.getTime());
			a.setBirthday(birthday);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}						
		a.setEducation(education);
		//a.setTitle(title);
		
		a.setGraschool(graschool);
		
		a.setMajor(major);
		a.setWorkingtime(workingtime);
		a.setCurrentmajor(currentmajor);
		//a.setPaper_name(paper_name);
		//a.setJournal_name(journal_name);
		boolean res=dao.insert(a);
		Teacher teacher1=new Teacher();
		teacher1=dao.findbyid(teacher_id);
		System.out.println(teacher1.getUser_id());
		//System.out.println(teacher1.getUser_id());
		if(res) {
			request.setAttribute("teacher1", teacher1);
			request.getRequestDispatcher("teacher/personal/tiaozhuan.jsp").forward(request, response);
		}
	}

}
