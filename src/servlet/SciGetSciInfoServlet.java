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

import bean.Parper_PaperPeople;
import bean.Teacher;
import daoImpl.PaperDaoImpl;

/**
 * Servlet implementation class SciGetSciInfoServlet
 * 获取科研信息
 */
@WebServlet("/SciGetSciInfo")
public class SciGetSciInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SciGetSciInfoServlet() {
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
		String teString=request.getParameter("teacher_id");
		List<Parper_PaperPeople> list=new ArrayList<Parper_PaperPeople>();
		PaperDaoImpl daoImpl=new PaperDaoImpl();
		list=daoImpl.getPaperAllInfo(teString);
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
