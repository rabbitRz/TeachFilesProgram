package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Teacher;
import bean.User;
import dao.TeacherManageDao;
import daoImpl.TeacherManageDaoImpl;

/**
 * Servlet implementation class TeacherAddServlet
 */
public class TeacherAddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TeacherAddServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html");
		
		//int id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		String sex = request.getParameter("sex");
		String nativeplace = request.getParameter("nativeplace");
		String education = request.getParameter("education");
		String title = request.getParameter("title");		
		String graschool = request.getParameter("graschool");		
		String major = request.getParameter("major");
		String workingtime = request.getParameter("workingtime");
		String currentmajor = request.getParameter("currentmajor");
		int user_id=Integer.parseInt(request.getParameter("user_id"));
		
		Teacher teacher = new Teacher();
  		teacher.setUser_id(user_id);
  		
  		String birthdayStr = request.getParameter("birthday");
		String q = request.getParameter("quatime");	
		String grat = request.getParameter("gratime");
		
		System.out.println("birthdayStr:"+birthdayStr);
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat df1 = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat df2 = new SimpleDateFormat("yyyy-MM-dd");
		Date birthd =null;
		Date quat =null;
		Date grati=null;
		try {
			birthd = df.parse(birthdayStr);
			System.out.println("birthd"+birthd);
			quat =df1.parse(q);
			grati=df2.parse(grat);
			java.sql.Date birthday = new java.sql.Date(birthd.getTime());
			teacher.setBirthday(birthday);
			java.sql.Date quatime = new java.sql.Date(quat.getTime());
			teacher.setQuatime(quatime);
			java.sql.Date gratime = new java.sql.Date(grati.getTime());
			teacher.setGratime(gratime);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
		//teacher.setId(id);
		teacher.setName(name);
  		teacher.setSex(sex);
  		teacher.setNativeplace(nativeplace); 		
  		teacher.setEducation(education);
  		teacher.setTitle(title);  		
  		teacher.setGraschool(graschool);		
  		teacher.setMajor(major);
  		teacher.setWorkingtime(workingtime);
  		teacher.setCurrentmajor(currentmajor);
  		//User user=new User();
  		//user.setUsername(username);
  		//user.setPassword(password);
  		//teacher.setUser(user);
		
		TeacherManageDao dao=new TeacherManageDaoImpl();
		boolean flag=dao.teacherAdd(teacher);
		PrintWriter out = response.getWriter();
		//System.out.println(flag);
		if(flag) {			
			out.print("<script>alert('添加教师信息成功!');window.location.href='ShowUIdServlet'</script>");
			
		}else {
			out.print("<script>alert('添加教师信息失败!');window.location.href='ShowUIdServlet'</script>");
		}
	}

}
