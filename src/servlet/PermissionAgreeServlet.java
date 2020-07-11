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

import bean.ChangePermission;
import daoImpl.ChangePermissionDaoImpl;

/**
 * Servlet implementation class PermissionAgreeServlet
 * 查看该成员是否有不同意的申请
 */
@WebServlet("/permissionAgree")
public class PermissionAgreeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PermissionAgreeServlet() {
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
		String techer_idString=request.getParameter("teacher_id");
		ChangePermissionDaoImpl daoImpl=new ChangePermissionDaoImpl();
		List<ChangePermission> list=new ArrayList<ChangePermission>();
		list=daoImpl.getDIsAgree(techer_idString);
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
