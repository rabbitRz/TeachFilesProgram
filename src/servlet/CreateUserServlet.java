package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.User;
import dao.TeacherManageDao;
import daoImpl.TeacherManageDaoImpl;

/**
 * Servlet implementation class CreateUserServlet
 */
public class CreateUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreateUserServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8"); 
		response.setContentType("text/html");
		int user_id = Integer.parseInt(request.getParameter("user_id"));
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		int role_id = Integer.parseInt(request.getParameter("role_id"));		
 		User user = new User();
 		user.setUser_id(user_id);
 		user.setUsername(username);
 		user.setPassword(password);
 		user.setRole_id(role_id);
 		
		TeacherManageDao teacherManageDao = new TeacherManageDaoImpl();
		boolean flag=teacherManageDao.createUser(user);
		PrintWriter out = response.getWriter();
		//System.out.println(flag);
		if(flag) {			
			out.print("<script>alert('创建用户成功!');window.location.href='admin/teacherManage/createUser.jsp'</script>");
			
		}else {
			out.print("<script>alert('创建用户失败!');window.location.href='admin/teacherManage/createUser.jsp'</script>");
		}
	}

}
