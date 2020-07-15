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
 * Servlet implementation class DoTeacherUpdateServlet
 */
public class DoTeacherUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DoTeacherUpdateServlet() {
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
			
		int id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		String sex = request.getParameter("sex");
		String nativeplace = request.getParameter("nativeplace");
		String education = request.getParameter("education");
		String title = request.getParameter("title");		
		String graschool = request.getParameter("graschool");		
		String major = request.getParameter("major");
		String workingtime = request.getParameter("workingtime");
		String currentmajor = request.getParameter("currentmajor");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		Teacher teacher = new Teacher();
  		teacher.setId(id);
		
		String q = request.getParameter("quatime");
		
		String grat = request.getParameter("gratime");
		
		String birthdayStr = request.getParameter("birthday");
		
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat df1 = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat df2 = new SimpleDateFormat("yyyy-MM-dd");
		Date birthd =null;
		Date quat =null;
		Date grati=null;
		try {
			birthd = df.parse(birthdayStr);
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
		
		
		teacher.setName(name);
  		teacher.setSex(sex);
  		teacher.setNativeplace(nativeplace);
  		
  		teacher.setEducation(education);
  		teacher.setTitle(title);
  		
  		teacher.setGraschool(graschool);
  		
  		teacher.setMajor(major);
  		teacher.setWorkingtime(workingtime);
  		teacher.setCurrentmajor(currentmajor);
  		User user=new User();
  		user.setUsername(username);
  		user.setPassword(password);
  		teacher.setUser(user);
		
		TeacherManageDao dao = new TeacherManageDaoImpl();
		
		boolean flag=dao.teacherUpdate(teacher);
		PrintWriter out = response.getWriter();
		//System.out.println(flag);
		if(flag) {			
			out.print("<script>alert('修改教师信息成功!');window.location.href='admin/teacherManage/teacherUpdate.jsp'</script>");
			
		}else {
			out.print("<script>alert('修改教师信息失败!');window.location.href='admin/teacherManage/teacherUpdate.jsp'</script>");
		}
	}

}
