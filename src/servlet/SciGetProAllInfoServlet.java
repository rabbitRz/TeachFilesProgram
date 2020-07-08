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

import bean.Project;
import daoImpl.ProjectDaoImpl;

/**
 * Servlet implementation class SciGetProAllInfoServlet
 * 获取项目所有获奖情况
 */
@WebServlet("/SciGetProA")
public class SciGetProAllInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SciGetProAllInfoServlet() {
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
		//教师id
		String teString=request.getParameter("teacher_id");
		ProjectDaoImpl daoImpl=new ProjectDaoImpl();
		List<Project> list=new ArrayList<Project>();
		list=daoImpl.GetAllInfoById(teString);
		ObjectMapper mapper=new ObjectMapper();
		String data=mapper.writeValueAsString(list);
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
