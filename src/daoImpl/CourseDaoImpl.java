package daoImpl;

import java.awt.datatransfer.StringSelection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import org.eclipse.jdt.internal.compiler.lookup.VariableBinding;

import Utils.DBUtils;
import bean.UpdateInfo;
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
		//根据课程id查看课程信息
		public course getCourseById(String course_id) {
			// TODO Auto-generated method stub
			Connection conn=DBUtils.getConnection();
			String sql="select c.*,t.name name from course c,teacher t where t.id=c.teacher_id and course_id="+course_id;
			PreparedStatement st=null;
			ResultSet rs=null;
			course c=new course();
			try {
				st=conn.prepareStatement(sql);
				rs=st.executeQuery();
				if(rs.next()) {
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
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				DBUtils.close(rs, st, conn);
			}
			
			return c;
		}
		//根据课程id进行修改信息
		public boolean UpdateCourseById(String course_id,String name,String course_class,String hours,String people_num,String place,String teacher_id,String startweek,String endweek,String xinqi,String term_start) {
			// TODO Auto-generated method stub
			Connection conn=DBUtils.getConnection();
			String sql="UPDATE course SET course_class='"+course_class+"',course_hours="+hours+",course_name='"+name+"',"
					+ "course_peoplenum="+people_num+",course_place='"+place+"',start_courseweek='"+startweek+"'\r\n" + 
					",end_courseweek='"+endweek+"',`week`='"+xinqi+"',teacher_id="+teacher_id+",term_start='"+
					term_start+"',course_week='"+startweek
					+"-"+endweek+"' WHERE course_id="+course_id;
			System.out.println(sql);
			PreparedStatement st=null;
			boolean flag=false;
			List<String> list=new ArrayList<String>();
			try {
				st=conn.prepareStatement(sql);
				int t=st.executeUpdate();
				if(t==1) {
					flag=true;
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				DBUtils.close(null, st, conn);
			}
			
			return flag;
		}
		//录入数据
		public boolean InsertCourseById(String name, String course_class, String hours,String people_num, String place, String teacher_id, String startweek, String endweek, String xinqi,String term_start) {
			Connection conn=DBUtils.getConnection();
			String sql="insert into course(course_class,course_hours,course_name,course_peoplenum,"
					+ "course_place,start_courseweek,end_courseweek,`week`,teacher_id,term_start,course_week"
					+ ") values('"+course_class+"',"+hours+",'"+name+"',"
					+ ""+people_num+",'"+place+"','"+startweek+"'\r\n" + 
					",'"+endweek+"','"+xinqi+"',"+teacher_id+",'"+
					term_start+"','"+startweek
					+"-"+endweek+"')";
			System.out.println(sql);
			PreparedStatement st=null;
			boolean flag=false;
			List<String> list=new ArrayList<String>();
			try {
				st=conn.prepareStatement(sql);
				int t=st.executeUpdate();
				if(t==1) {
					flag=true;
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				DBUtils.close(null, st, conn);
			}
			
			return flag;
		}
		//根据课程id删除课程信息
		public boolean deleteCourse(String id) {
			// TODO Auto-generated method stub
			Connection conn=DBUtils.getConnection();
			String sql="delete from course where course_id="+id;
			System.out.println(sql);
			PreparedStatement st=null;
			boolean flag=false;
			List<String> list=new ArrayList<String>();
			try {
				st=conn.prepareStatement(sql);
				int t=st.executeUpdate();
				if(t==1) {
					flag=true;
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				DBUtils.close(null, st, conn);
			}
			
			return flag;
		}
		//查看hoilday表的全部信息
		public List<String> getAllTerm() {
		// TODO Auto-generated method stub
			Connection conn=DBUtils.getConnection();
			String sql="select * from holiday where  holiday.`desc`='开学'";
			PreparedStatement st=null;
			ResultSet rs=null;
			List<String> list=new ArrayList<String>();
			try {
				st=conn.prepareStatement(sql);
				rs=st.executeQuery();
				if(rs.next()) {
					String str=new String();
					str=rs.getString("date");
					list.add(str);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				DBUtils.close(rs, st, conn);
			}
			
			return list;
		}
		//查看当天某一个时间点该老师是否有课
		public UpdateInfo GetTrDay(String teacher_id, String week, String hours, String start, String end,String term) {
			// TODO Auto-generated method stub
			Connection conn=DBUtils.getConnection();
			String sql="select max(end_courseweek) end_week,MIN(START_courseweek) start_week from course "
					+ "where teacher_id="+teacher_id+" and week='"+week+"' and course_hours="+hours+" and term_start='"+term+"' "
							+ "GROUP BY teacher_id";
			System.out.println("老师"+sql);
			PreparedStatement st=null;
			ResultSet rs=null;
			String str="";
			UpdateInfo oInfo=new UpdateInfo();
			boolean flag=true;
			try {
				st=conn.prepareStatement(sql);
				rs=st.executeQuery();
				if(rs.next()) {
					str="教师编号为"+teacher_id+"在"+term+"学期第"+rs.getInt("start_week")+"周到第"+rs.getInt("end_week")+"周"+week+"有课\n";
					if(Integer.parseInt(start)>Integer.parseInt(end)||Integer.parseInt(end)>=rs.getInt("start_week")&&Integer.parseInt(end)<=rs.getInt("end_week")) {
						flag=false;
					}
					if(Integer.parseInt(start)>Integer.parseInt(end)||Integer.parseInt(start)>=rs.getInt("start_week")&&Integer.parseInt(start)<=rs.getInt("end_week")) {
						flag=false;
					}
					if(Integer.parseInt(start)>Integer.parseInt(end)||Integer.parseInt(start)<rs.getInt("start_week")&&Integer.parseInt(end)>rs.getInt("end_week")) {
						flag=false;
					}
					//System.out.println("flag"+flag);
				}
				oInfo.setInfo(str);
				oInfo.setRes(flag);
				//System.out.println(flag);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				DBUtils.close(rs, st, conn);
			}
			
			return oInfo;
		}
		//查看当前教室是否被占用
		public UpdateInfo getDayClass(String place, String week, String hours, String start, String end,String term) {
			// TODO Auto-generated method stub
			Connection conn=DBUtils.getConnection();
			String sql="select max(end_courseweek) end_week,MIN(START_courseweek) start_week from course "
					+ "where course_place='"+place+"' and week='"+week+"' and course_hours="+hours+" and term_start='"+term+"' "
							+ "GROUP BY course_place";
			System.out.println("教室"+sql);
			PreparedStatement st=null;
			ResultSet rs=null;
			String str="";
			UpdateInfo oInfo=new UpdateInfo();
			boolean flag=true;
			try {
				st=conn.prepareStatement(sql);
				rs=st.executeQuery();
				if(rs.next()) {
					str="教室"+place+"在"+term+"学期第"+rs.getInt("start_week")+"周到第"+rs.getInt("end_week")+"周"+week+"被占用\n";
					if(Integer.parseInt(start)>Integer.parseInt(end)||Integer.parseInt(end)>=rs.getInt("start_week")&&Integer.parseInt(end)<=rs.getInt("end_week")) {
						flag=false;
						System.out.println(1);
					}
					if(Integer.parseInt(start)>Integer.parseInt(end)||Integer.parseInt(start)>=rs.getInt("start_week")&&Integer.parseInt(start)<=rs.getInt("end_week")) {
						flag=false;
						System.out.println(2);
					}
					if(Integer.parseInt(start)>Integer.parseInt(end)||Integer.parseInt(start)<rs.getInt("start_week")&&Integer.parseInt(end)>rs.getInt("end_week")) {
						flag=false;
						System.out.println(3);
					}
				}
				oInfo.setInfo(str);
				oInfo.setRes(flag);
				System.out.println(flag);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				DBUtils.close(rs, st, conn);
			}
			//System.out.println(oInfo.getInfo());
			return oInfo;
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
