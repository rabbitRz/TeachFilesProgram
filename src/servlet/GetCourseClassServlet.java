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

import daoImpl.CourseDaoImpl;

/**
 * Servlet implementation class GetCourseClassServlet
 * 获取该教师所带的所有班级信息
 */
@WebServlet("/CourClass")
public class GetCourseClassServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetCourseClassServlet() {
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
		//后期需要修改
		String teacher_id="1";
		CourseDaoImpl daoImpl=new CourseDaoImpl();
		List<String> list=new ArrayList<String>();
		list=daoImpl.GetClassByTrId(teacher_id);
		ObjectMapper mapper=new ObjectMapper();
		String data=mapper.writeValueAsString(list);
		PrintWriter pWriter=response.getWriter();
		pWriter.println(list);
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
