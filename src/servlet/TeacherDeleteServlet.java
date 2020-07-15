package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.TeacherManageDao;
import daoImpl.TeacherManageDaoImpl;

/**
 * Servlet implementation class TeacherDeleteServlet
 */
public class TeacherDeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TeacherDeleteServlet() {
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
		TeacherManageDao dao = new TeacherManageDaoImpl();
		
		int id = Integer.parseInt(request.getParameter("id"));
		System.out.println(id);
		boolean flag=dao.teacherDelete(id);
		PrintWriter out = response.getWriter();
 			if(flag) {			
 				out.print("<script>alert('删除教师信息及账户成功!');window.location.href='ShowAllTeacherServlet'</script>");
 				
 			}else {
 				out.print("<script>alert('删除教师信息及账户失败!');window.location.href='ShowAllTeacherServlet'</script>");
 			}

	}

}
