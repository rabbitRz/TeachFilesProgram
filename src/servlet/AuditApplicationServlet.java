package servlet;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Application;
import bean.Teacher;
import dao.IApplication;
import daoImpl.ApplicationImpl;


public class AuditApplicationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public AuditApplicationServlet() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");			
		int id=Integer.parseInt(request.getParameter("id"));	
		//System.out.println("shwen"+id);
		IApplication dao = new ApplicationImpl();	
		Application application=new Application();
		Teacher teacher=new Teacher();
		application=dao.findbyida(id);
		teacher.setName(application.getName());
		teacher.setSex(application.getSex());
		teacher.setNativeplace(application.getNativeplace());
		teacher.setBirthday(application.getBirthday());
		teacher.setEducation(application.getEducation());
		teacher.setTitle(application.getTitle());
		teacher.setQuatime(application.getQuatime());
		teacher.setGraschool(application.getGraschool());
		teacher.setGratime(application.getGratime());
		teacher.setMajor(application.getMajor());
		teacher.setWorkingtime(application.getWorkingtime());	
		teacher.setCurrentmajor(application.getCurrentmajor());
		int teacher_id=application.getTeacher_id();
		boolean flag=dao.updateapply(id);
		boolean flag1=dao.teacherUpdate(teacher,teacher_id);
		//request.setAttribute("emps", emps);
		if(flag&&flag1) {
		request.getRequestDispatcher("/AdminApplicationServlet").forward(request, response);
		}
	}

}
