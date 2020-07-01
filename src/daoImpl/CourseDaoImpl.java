package daoImpl;

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
	
	//根据teacher id查看该老师所有课程信息
		public List<course> FindCouserBuTrId(String teacher_id) {
			// TODO Auto-generated method stub
			Connection conn=DBUtils.getConnection();
			String sql="select c.*,t.name from course c,teacher t where c.teacher_id=t.id and t.id="+teacher_id;
			return null;
		}
	//查看所有课程信息
	public List<course> GetAll() {
		// TODO Auto-generated method stub
		return null;
	}
public static void main(String[] args) {
	CourseDaoImpl daoImpl=new CourseDaoImpl();
	List<String> list=daoImpl.GetClassByTrId("1");
	for(int i=0;i<list.size();i++) {
		System.out.println(list.get(i));
	}
}
}
