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

import bean.course;
import bean.tip;
import daoImpl.ChangePermissionDaoImpl;
import daoImpl.CourseDaoImpl;

/**
 * Servlet implementation class UpdatePermissionServlet
 */
@WebServlet("/updatePer")
public class UpdatePermissionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdatePermissionServlet() {
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
		String teacher_id=request.getParameter("teacher_id");
		ChangePermissionDaoImpl daoImpl=new ChangePermissionDaoImpl();
		daoImpl.updatePaper();
		daoImpl.insertTip();
		daoImpl.delete();
		List<tip> list=new ArrayList<tip>();
		//System.out.println("tip:"+list.get(0));
		list=daoImpl.getTip(teacher_id);
		response.setContentType("application/json;charest=UTF-8");
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
