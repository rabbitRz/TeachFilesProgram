package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.User;
import dao.UserDao;
import daoImpl.UserDaoImpl;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
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
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		UserDao userDao=new UserDaoImpl();
		boolean flag = false;
		User user=new User();
		try {
			user = userDao.login(username, password);
			System.out.println("用户名："+user.getUsername()+"//"+username);
			System.out.println("密码："+user.getPassword()+"//"+password);
			request.setAttribute("user", user);
			if(password.equals(user.getPassword())&&username.equals(user.getUsername())) {
				flag=true;
			}
			System.out.println("flag:"+flag);
		} catch (Exception e) {
			e.printStackTrace();
		}
				
		if(flag){
			if(user.getRole_id()==1)
			request.getRequestDispatcher("/teacher/index.jsp").forward(request, response);
			else {
				request.getRequestDispatcher("/admin/index.jsp").forward(request, response);
			}
		}else{
			request.getRequestDispatcher("/login.jsp").forward(request, response);
		}
	}

}
