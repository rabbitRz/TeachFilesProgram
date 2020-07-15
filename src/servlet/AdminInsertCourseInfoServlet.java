package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;

import bean.UpdateInfo;
import daoImpl.CourseDaoImpl;

/**
 * Servlet implementation class AdminInsertCourseInfoServlet
 * 录入课程信息
 */
@WebServlet("/AdminInsertCourseInfo")
public class AdminInsertCourseInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminInsertCourseInfoServlet() {
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
		String course_name=request.getParameter("name");
		String course_class=request.getParameter("class");
		String course_hour=request.getParameter("hour");
		String peoplenum=request.getParameter("peoplenum");
		String place=request.getParameter("place");
		String teacher_id=request.getParameter("teacher");
		String startweek=request.getParameter("startweek");
		String endweek=request.getParameter("endweek");
		String xinqi=request.getParameter("xinqi");
		String term_start=request.getParameter("term_start");
		CourseDaoImpl daoImpl=new CourseDaoImpl();
		UpdateInfo u2=new UpdateInfo();
		String str="";
		boolean flag=true;
		//查看该老师在当天是否有课，并给出该老师的无课时间
		//System.out.println(daoImpl.GetTrDay(teacher_id, xinqi, course_hour, startweek, endweek, term_start).isRes());
		if(!daoImpl.GetTrDay(teacher_id, xinqi, course_hour, startweek, endweek, term_start).isRes()) {
			str+=daoImpl.GetTrDay(teacher_id, xinqi, course_hour, startweek, endweek, term_start).getInfo();
			str+="插入失败！";
			flag=false;
			System.out.println(1+" "+flag);
		}else if(!daoImpl.getDayClass(place, xinqi, course_hour, startweek, endweek, term_start).isRes()) {
			//查看该教师在当天是否被占用，并给出当天未被占用的教室
			str+=daoImpl.getDayClass(place, xinqi, course_hour, startweek, endweek, term_start).getInfo();
			str+="插入失败！";
			flag=false;
			System.out.println(2+" "+flag);
		}else {
			//进行插入
			flag=daoImpl.InsertCourseById(course_name, course_class, course_hour, peoplenum, place, teacher_id, startweek, endweek, xinqi, term_start);
			if(flag) {
				str="插入成功！";
			}else {
				str="插入失败！";
			}
			System.out.println(3+" "+flag);
		}
		u2.setInfo(str);
		u2.setRes(flag);
		response.setContentType("application/json;charest=UTF-8");
		ObjectMapper mapper=new ObjectMapper();
		String data=mapper.writeValueAsString(u2);
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
