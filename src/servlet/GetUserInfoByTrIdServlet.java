package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;

import bean.TrClass;
import bean.User;
import daoImpl.TeacherDaoImpl;
import daoImpl.TrClassDaoImpl;

/**
 * Servlet implementation class GetUserInfoByTrIdServlet
 * 通过教师id获取user的信息
 */
@WebServlet("/userInfoTr")
public class GetUserInfoByTrIdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetUserInfoByTrIdServlet() {
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
		String teaString=request.getParameter("teacher_id");
		TeacherDaoImpl daoImpl=new TeacherDaoImpl();
		User user=new User();
		user=daoImpl.getTeacherInfo(teaString);
		response.setContentType("application/json;charest=UTF-8");
		ObjectMapper mapper=new ObjectMapper();
		String data=mapper.writeValueAsString(user);
		PrintWriter pWriter=response.getWriter();
		pWriter.println(data);
		pWriter.flush();
		pWriter.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
