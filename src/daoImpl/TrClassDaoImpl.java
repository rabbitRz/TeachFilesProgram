package daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Utils.DBUtils;
import bean.Parper_PaperPeople;
import bean.TrClass;
import dao.PaperDao;
import dao.TrClassDao;

public class TrClassDaoImpl implements TrClassDao {
	//获取所带班级信息
	public List<TrClass> getTrClassInfo(String teacher_id) {
		// TODO Auto-generated method stub
		Connection conn=DBUtils.getConnection();
		String sql="select DISTINCT teacher_id,course_class,GROUP_CONCAT(DISTINCT course_name) course_name "
				+ "from course where teacher_id="+teacher_id+" GROUP BY course_class;";
		PreparedStatement st=null;
		ResultSet rs=null;
		List<TrClass> list=new ArrayList<TrClass>();
		try {
			st=conn.prepareStatement(sql);
			rs=st.executeQuery();
			while(rs.next()) {
				TrClass t=new TrClass();
				t.setCourse_class(rs.getString("course_class"));
				t.setCourse_name(rs.getString("course_name"));
				t.setTeacher_id(rs.getInt("teacher_id"));
				list.add(t);
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
		List<TrClass > list=new ArrayList<TrClass>();
		TrClassDaoImpl daoImpl=new TrClassDaoImpl();
		list=daoImpl.getTrClassInfo("1");
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
	}
}
