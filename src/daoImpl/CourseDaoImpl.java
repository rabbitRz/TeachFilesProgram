package daoImpl;

import java.awt.datatransfer.StringSelection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import Utils.DBUtils;
import bean.course;
import dao.CourseDao;

public class CourseDaoImpl implements CourseDao {
	//根据teacher id查看该老师所带所有班级
	public List<String> GetClassByTrId(String teacher_id) {
		// TODO Auto-generated method stub
		Connection conn=DBUtils.getConnection();
		String sql="select course_class from course where teacher_id="+teacher_id;
		PreparedStatement st=null;
		ResultSet rs=null;
		List<String> list=new ArrayList<String>();
		try {
			st=conn.prepareStatement(sql);
			rs=st.executeQuery();
			while(rs.next()) {
				String str="";
				str=rs.getString("course_class");
				list.add(str);
				HashSet h = new HashSet(list);   
				list.clear();   
				list.addAll(h);   
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			DBUtils.close(rs, st, conn);
		}
		return list;
	}
	//获取当前假期的开学日期
	public String getTermStart() {
	// TODO Auto-generated method stub
		Connection conn=DBUtils.getConnection();
		String sql="select max(date) max_date from holiday where holiday.desc ='开学'";
		PreparedStatement st=null;
		ResultSet rs=null;
		String str="";
		try {
			st=conn.prepareStatement(sql);
			rs=st.executeQuery();
			if(rs.next()) {
				str=rs.getString("max_date");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			DBUtils.close(rs, st, conn);
		}	
		return str;
    }
	//根据teacher id查看该老师所有课程信息
		public List<course> FindCouserBuTrId(String teacher_id) {
			// TODO Auto-generated method stub
			Connection conn=DBUtils.getConnection();
			String sql="select c.*,t.name from course c,teacher t where c.teacher_id=t.id and t.id="+teacher_id;
			PreparedStatement st=null;
			ResultSet rs=null;
			List<course> list=new ArrayList<course>();
			try {
				st=conn.prepareStatement(sql);
				rs=st.executeQuery();
				while(rs.next()) {
					course c=new course();
					c.setCourse_class(rs.getString("course_class"));
					c.setCourse_hours(rs.getInt("course_hours"));
					c.setCourse_id(rs.getInt("course_id"));
					c.setCourse_name(rs.getString("course_name"));
					c.setCourse_place(rs.getString("course_place"));
					c.setStart_courseweek(rs.getInt("start_courseweek"));
					c.setEnd_courseweek(rs.getInt("end_courseweek"));
					c.setCouser_peoplenum(rs.getInt("course_peoplenum"));
					c.setTeacher_id(rs.getInt("teacher_id"));
					c.setTeachr_name(rs.getString("name"));
					c.setTerm_start(rs.getString("term_start"));
					c.setWeek(rs.getString("week"));
					list.add(c);
					
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				DBUtils.close(rs, st, conn);
			}
			
			return list;
		}
		//根据教师所带班级以及周数查找课程表
		public List<course> FindByClass_Week(String teacher_id, String claString, String weekString) {
			// TODO Auto-generated method stub
			Connection conn=DBUtils.getConnection();
			String sql="select c.*,t.name from course c,teacher t where c.teacher_id=t.id and c.course_class='"+
			claString+"' and c.start_courseweek<="+weekString+" and c.end_courseweek>="+weekString+" and t.id="+teacher_id;
			PreparedStatement st=null;
			ResultSet rs=null;
			List<course> list=new ArrayList<course>();
			try {
				st=conn.prepareStatement(sql);
				rs=st.executeQuery();
				while (rs.next()) {
					course c=new course();
					c.setCourse_class(rs.getString("course_class"));
					c.setCourse_hours(rs.getInt("course_hours"));
					c.setCourse_id(rs.getInt("course_id"));
					c.setCourse_name(rs.getString("course_name"));
					c.setCourse_place(rs.getString("course_place"));
					c.setStart_courseweek(rs.getInt("start_courseweek"));
					c.setEnd_courseweek(rs.getInt("end_courseweek"));
					c.setCouser_peoplenum(rs.getInt("course_peoplenum"));
					c.setTeacher_id(rs.getInt("teacher_id"));
					c.setTeachr_name(rs.getString("name"));
					c.setTerm_start(rs.getString("term_start"));
					c.setWeek(rs.getString("week"));
					list.add(c);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				DBUtils.close(rs, st, conn);
			}
			
			return list;
		}
		//查看其全部课程信息
		public List<course> getAllCourse() {
			// TODO Auto-generated method stub
			Connection conn=DBUtils.getConnection();
			String sql="select c.*,t.name name from course c,teacher t where t.id=c.teacher_id";
			PreparedStatement st=null;
			ResultSet rs=null;
			List<course> list=new ArrayList<course>();
			try {
				st=conn.prepareStatement(sql);
				rs=st.executeQuery();
				while (rs.next()) {
					course c=new course();
					c.setCourse_class(rs.getString("course_class"));
					c.setCourse_hours(rs.getInt("course_hours"));
					c.setCourse_id(rs.getInt("course_id"));
					c.setCourse_name(rs.getString("course_name"));
					c.setCourse_place(rs.getString("course_place"));
					c.setStart_courseweek(rs.getInt("start_courseweek"));
					c.setEnd_courseweek(rs.getInt("end_courseweek"));
					c.setCouser_peoplenum(rs.getInt("course_peoplenum"));
					c.setTeacher_id(rs.getInt("teacher_id"));
					c.setTeachr_name(rs.getString("name"));
					c.setTerm_start(rs.getString("term_start"));
					c.setWeek(rs.getString("week"));
					list.add(c);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				DBUtils.close(rs, st, conn);
			}
			
			return list;
		}
		public static void main(String[] args) {
			CourseDaoImpl daoImpl=new CourseDaoImpl();
			/*List<String> list=daoImpl.GetClassByTrId("1");
			for(int i=0;i<list.size();i++) {
				System.out.println(list.get(i));
			}*/
			//System.out.println(daoImpl.getTermStart());
			//List<course> list=daoImpl.FindByClass_Week("1","计算机科学与技术","18");
			List<course> list=daoImpl.getAllCourse();
			for(int i=0;i<list.size();i++) {
				System.out.println(list.get(i));
		}
}

}
