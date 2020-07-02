package daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import Utils.DBUtils;
import bean.Teacher;
import dao.TeacherDao;

public class TeacherDaoImpl implements TeacherDao{

	public Teacher showPersonalInfo(int id) {
		Connection conn=DBUtils.getConnection();
		String sql="select * course_class from teacher where id="+id;
		PreparedStatement st=null;
		ResultSet rs=null;
		Teacher teacher=new Teacher();
		try {
			st=conn.prepareStatement(sql);
			rs=st.executeQuery();
			while(rs.next()) {
				//Teacher teacher=new Teacher();
				teacher.setId(id);
				teacher.setName(rs.getString("name"));
				teacher.setSex(rs.getString("sex"));
				teacher.setNativeplace(rs.getString("nativeplace"));
				teacher.setBirthday(rs.getDate("birthday"));
				teacher.setEducation(rs.getString("education"));
				teacher.setTitle(rs.getString(rs.getString("title")));
				teacher.setQuatime(rs.getDate("guatime"));
				teacher.setGraschool(rs.getString("graschool"));
				teacher.setMajor(rs.getString("major"));
				teacher.setWorkingtime(rs.getString("workingtime"));
				teacher.setCurrentmajor(rs.getString("currentmajor"));
							
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("showPersonalInfo(int id)运行出错!");
		}finally {
			DBUtils.close(rs, st, conn);
		}
		return teacher;
	}

}
