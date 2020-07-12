package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;

import daoImpl.ChangePermissionDaoImpl;

/**
 * Servlet implementation class PermissionSubServlet
 * 根据个人意愿对申请表进行修改
 */
@WebServlet("/PermissionSub")
public class PermissionSubServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PermissionSubServlet() {
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
		String paper_id=request.getParameter("paper_id");
		String people_permission=request.getParameter("people_permission");
		String flag="";
		ChangePermissionDaoImpl daoImpl=new ChangePermissionDaoImpl();
		if(people_permission=="N") {
			flag="论文编号为"+paper_id+"的论文申请提交失败！";
			//插入result语句
			daoImpl.UpdateRes(paper_id, "N");
		}else{
			boolean t=false;
			//更新语句per
			t=daoImpl.insertPer(paper_id, teacher_id, people_permission);
			//更新result
			daoImpl.UpdateResY(paper_id, "Y");
			if(t)
				flag="论文更新成功";
			else {
				flag="论文更新失败";
			}
		}
		PrintWriter pWriter=response.getWriter();
		pWriter.println(flag);
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
