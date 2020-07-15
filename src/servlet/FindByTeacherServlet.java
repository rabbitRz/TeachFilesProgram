package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Teacher;
import dao.TeacherManageDao;
import daoImpl.TeacherManageDaoImpl;


/**
 * Servlet implementation class FindByTeacherServlet
 */
public class FindByTeacherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FindByTeacherServlet() {
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
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		resp.setCharacterEncoding("utf-8");
		
		String select = req.getParameter("select");
		String input  = req.getParameter("input");
		System.out.println("select:"+select+",input:"+input);
		if(select.equals("1")){
	 		TeacherManageDao dao=new TeacherManageDaoImpl();
	 		int id = Integer.parseInt(input);
	 		List<Teacher> teachers = dao.findById(id);
	 		req.setAttribute("teachers", teachers);
	 		req.getRequestDispatcher("admin/teacherManage/showAllTeacher.jsp").forward(req, resp);
		}else if(select.equals("2")){
			TeacherManageDao dao=new TeacherManageDaoImpl();
			List<Teacher> teachers = dao.findByTitle(input);
	 		req.setAttribute("teachers", teachers);
	 		req.getRequestDispatcher("admin/teacherManage/showAllTeacher.jsp").forward(req, resp);
		}else if(select.equals("3")){
			TeacherManageDao dao=new TeacherManageDaoImpl();
			List<Teacher> teachers = dao.findBySex(input);
			req.setAttribute("teachers", teachers);
	 		req.getRequestDispatcher("admin/teacherManage/showAllTeacher.jsp").forward(req, resp);
		}
	}

}
