package daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import Utils.DBUtils;
import bean.Paper;
import bean.PaperPeople;
import bean.Teacher;
import dao.TeacherDao;

public class TeacherDaoImpl implements TeacherDao{
	
	//通过user_id显示个人信息
	public Teacher showPersonalInfo(int user_id) {
		Connection conn=DBUtils.getConnection();
		String sql="select * from teacher where user_id="+user_id;
		//System.out.println(sql);
		PreparedStatement st=null;
		ResultSet rs=null;
		Teacher teacher=new Teacher();
		try {
			st=conn.prepareStatement(sql);
			rs=st.executeQuery();
			while(rs.next()) {
				//Teacher teacher=new Teacher();
				teacher.setUser_id(rs.getInt("user_id"));
				teacher.setId(rs.getInt("id"));
				teacher.setName(rs.getString("name"));
				teacher.setSex(rs.getString("sex"));
				teacher.setNativeplace(rs.getString("nativeplace"));
				teacher.setBirthday(rs.getDate("birthday"));
				teacher.setEducation(rs.getString("education"));
				teacher.setTitle(rs.getString("title"));
				teacher.setQuatime(rs.getDate("quatime"));
				teacher.setGraschool(rs.getString("graschool"));
				teacher.setMajor(rs.getString("major"));
				teacher.setWorkingtime(rs.getString("workingtime"));
				teacher.setCurrentmajor(rs.getString("currentmajor"));
							
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("showPersonalInfo(int user_id)运行出错!");
		}finally {
			DBUtils.close(rs, st, conn);
		}
		return teacher;
	}
	//通过教师id显示个人信息
    public Teacher showPersonById(int id) {
    	Connection conn=DBUtils.getConnection();
		String sql="select * from teacher where id="+id;
		//System.out.println(sql);
		PreparedStatement st=null;
		ResultSet rs=null;
		Teacher teacher=new Teacher();
		try {
			st=conn.prepareStatement(sql);
			rs=st.executeQuery();
			while(rs.next()) {
			//Teacher teacher=new Teacher();
			teacher.setUser_id(rs.getInt("user_id"));
			teacher.setId(rs.getInt("id"));
			teacher.setName(rs.getString("name"));
			teacher.setSex(rs.getString("sex"));
			teacher.setNativeplace(rs.getString("nativeplace"));
			teacher.setBirthday(rs.getDate("birthday"));
			teacher.setEducation(rs.getString("education"));
			teacher.setTitle(rs.getString("title"));
			teacher.setQuatime(rs.getDate("quatime"));
			teacher.setGraschool(rs.getString("graschool"));
			teacher.setMajor(rs.getString("major"));
			teacher.setWorkingtime(rs.getString("workingtime"));
			teacher.setCurrentmajor(rs.getString("currentmajor"));
								
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("showPersonalInfo(int user_id)运行出错!");
		}finally {
			DBUtils.close(rs, st, conn);
		}
		return teacher;
	}
	//通过id显示个人的论文信息
	public List<Paper> showPapers(int id) {
		Connection conn=DBUtils.getConnection();
		String sql="select p.* from paper p where p.paper_id in (select paper_id FROM paperpeople where paperpeople.people1_id="+id+" or paperpeople.people2_id="+id+" or paperpeople.people3_id="+id+")";
		System.out.println(sql);
		PreparedStatement st=null;
		ResultSet rs=null;
		List<Paper> list=new ArrayList<Paper>();
		try {
			st=conn.prepareStatement(sql);
			rs=st.executeQuery();
			while(rs.next()) {
				Paper paper=new Paper();
				//PaperPeople paperPeople=new PaperPeople();
				paper.setPaper_id(rs.getInt("paper_id"));
				paper.setPaper_name(rs.getString("paper_name"));
				paper.setJournal_level(rs.getString("journal_level"));
				paper.setJournal_name(rs.getString("journal_name"));
				System.out.println(paper.getPaper_name());
				//str=rs.getString("course_class");
				list.add(paper);  
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("showPapers(int id)运行出错!");
		}finally {
			DBUtils.close(rs, st, conn);
		}
		return list;
	}
	
	public static void main(String[] args) {
	TeacherDaoImpl daoImpl=new TeacherDaoImpl();
	int user_id=1;
	try {
		List<Paper> teachers=daoImpl.showPapers(1);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

}
