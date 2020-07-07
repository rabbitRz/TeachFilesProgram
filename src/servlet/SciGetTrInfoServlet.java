package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.mail.internet.NewsAddress;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;

import bean.Teacher;
import daoImpl.TeacherDaoImpl;

/**
 * Servlet implementation class SciGetTrInfoServlet
 * 根据教师id查找出教师信息
 */
@WebServlet("/SciGetTrInfo")
public class SciGetTrInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SciGetTrInfoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		String teacString=request.getParameter("teacher_id");
		TeacherDaoImpl daoImpl=new TeacherDaoImpl();
		Teacher t=new Teacher();
		t=daoImpl.showPersonalInfo(Integer.parseInt(teacString));
		response.setContentType("application/json;charest=utf-8");
		ObjectMapper mapper=new ObjectMapper();
		String data=mapper.writeValueAsString(t);
		PrintWriter pw=response.getWriter();
		pw.println(data);
		pw.flush();
		pw.close();
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
