package daoImpl;


import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



import Utils.DBUtils;
import bean.Application;

import bean.Teacher;

import dao.IApplication;

public class ApplicationImpl implements IApplication {

	public boolean insert(Application a) throws RuntimeException {
		// TODO Auto-generated method stub
		//System.out.println(a);
		boolean flag=false;
		Connection conn=DBUtils.getConnection();
		String sql="insert into application(name,sex,nativeplace,birthday,education,title,quatime,graschool,gratime,major,workingtime,currentmajor,status,teacher_id,paper_name,journal_name,reason) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		
		PreparedStatement st=null;
		int res=0;
		try {
			st=conn.prepareStatement(sql);		
			st.setString(1,a.getName());
			st.setString(2,a.getSex());
			st.setString(3,a.getNativeplace());
			st.setDate(4,(Date) a.getBirthday());
			st.setString(5, a.getEducation());
			st.setString(6, a.getTitle());
			st.setDate(7, (Date) a.getQuatime());
			st.setString(8, a.getGraschool());
			st.setDate(9, (Date) a.getGratime());
			st.setString(10, a.getMajor());
			st.setString(11, a.getWorkingtime());
			st.setString(12, a.getCurrentmajor());
			st.setInt(13, 0);
			st.setInt(14, a.getTeacher_id());
			st.setString(15, a.getPaper_name());
			st.setString(16, a.getJournal_name());	
			st.setString(17, a.getReason());
			res=st.executeUpdate();
			
			if(res==1)
				flag=true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			DBUtils.close(null, st, conn);
		}
		return flag;
		
	}

	public List<Application> findbytid(int teacher_id) throws RuntimeException {
		Connection conn=DBUtils.getConnection();
		String sql="select * from application where status=0 and teacher_id=?";
		PreparedStatement st=null;
		ResultSet rs=null;
		List<Application> list=new ArrayList<Application>();
        try {
        	st=conn.prepareStatement(sql);
        	st.setInt(1, teacher_id);
			rs=st.executeQuery();
			while(rs.next()) {			
				Application a=new Application();
				a.setId(rs.getInt("id"));
				a.setTeacher_id(rs.getInt("teacher_id"));
				a.setName(rs.getString("name"));
				a.setSex(rs.getString("sex"));
				a.setNativeplace(rs.getString("nativeplace"));
				a.setBirthday(rs.getDate("birthday"));
				a.setEducation(rs.getString("education"));
				a.setTitle(rs.getString("title"));
				a.setQuatime(rs.getDate("quatime"));
				a.setGraschool(rs.getString("graschool"));
				a.setGratime(rs.getDate("gratime"));
				a.setMajor(rs.getString("major"));
				a.setWorkingtime(rs.getString("workingtime"));
				a.setCurrentmajor(rs.getString("currentmajor"));
				a.setStatus(rs.getInt("status"));
				a.setPaper_name(rs.getString("paper_name"));
				a.setJournal_name(rs.getString("journal_name"));
				a.setReason(rs.getString("reason"));
				list.add(a);
				
		    }
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtils.close(rs, st, conn);
		}
		return list;
	}

	public Application findbyida(int id) throws RuntimeException {
		Connection conn=DBUtils.getConnection();
		String sql="select * from application where id= ?";
		PreparedStatement st=null;
		ResultSet rs=null;
		Application a=new Application();
        try {
        	st=conn.prepareStatement(sql);
        	st.setInt(1, id);
			rs=st.executeQuery();
			while(rs.next()) {									
				a.setId(rs.getInt("id"));
				a.setTeacher_id(rs.getInt("teacher_id"));
				a.setName(rs.getString("name"));
				a.setSex(rs.getString("sex"));
				a.setNativeplace(rs.getString("nativeplace"));
				a.setBirthday(rs.getDate("birthday"));
				a.setEducation(rs.getString("education"));
				a.setTitle(rs.getString("title"));
				a.setQuatime(rs.getDate("quatime"));
				a.setGraschool(rs.getString("graschool"));
				a.setGratime(rs.getDate("gratime"));
				a.setMajor(rs.getString("major"));
				a.setWorkingtime(rs.getString("workingtime"));
				a.setCurrentmajor(rs.getString("currentmajor"));
				a.setStatus(rs.getInt("status"));
				a.setPaper_name(rs.getString("paper_name"));
				a.setJournal_name(rs.getString("journal_name"));
				a.setReason(rs.getString("reason"));
		    }
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtils.close(rs, st, conn);
		}
		return a;
	}

	public boolean deletebytid(int id) throws RuntimeException {
		boolean flag=false;
		Connection conn=DBUtils.getConnection();
		PreparedStatement st = null;
		ResultSet rs = null;	
		String sql = "delete from application where id ="+id;
		int shan=0;
		try {
				st=conn.prepareStatement(sql);
				shan=st.executeUpdate();
				
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
			finally {
				DBUtils.close(null, st, conn);		
		}
		if(shan>0) {
			flag=true;
		}
		return flag;
	}

	public Teacher findbyid(int id) throws RuntimeException {
		Connection conn=DBUtils.getConnection();
		String sql="select user_id from teacher where id=?";
		PreparedStatement st=null;
		ResultSet rs=null;
		Teacher a=new Teacher();
        try {
        	st=conn.prepareStatement(sql);
        	st.setInt(1, id);
			rs=st.executeQuery();
			while(rs.next()) {									
				a.setUser_id(rs.getInt("user_id"));							
		    }
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtils.close(rs, st, conn);
		}
		return a;
	}

	public Application findteacherid(int id) throws RuntimeException {
		Connection conn=DBUtils.getConnection();
		String sql="select teacher_id from application where id= ?";
		PreparedStatement st=null;
		ResultSet rs=null;
		Application a=new Application();
        try {
        	st=conn.prepareStatement(sql);
        	st.setInt(1, id);
			rs=st.executeQuery();
			while(rs.next()) {									
				a.setTeacher_id(rs.getInt("teacher_id"));						
		    }
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtils.close(rs, st, conn);
		}
		return a;
	}
	public boolean updateapply(int id) throws RuntimeException {
		Connection conn=DBUtils.getConnection();
 		String sql = "Update application set status=1 where id=?";
 		PreparedStatement st=null;
 		int rs=0;
 		boolean flag=false;
 		try {
 			st=conn.prepareStatement(sql);
 			st.setInt(1, id);
 			rs=st.executeUpdate();
 			if(rs==1)
 				flag=true;
 		} catch (SQLException e) {
 			// TODO Auto-generated catch block
 			e.printStackTrace();
 		}finally {
 			DBUtils.close(null, st,conn);
 		}
 		return flag;
	}
	public boolean updatenoapply(int id,String reason) throws RuntimeException {
		Connection conn=DBUtils.getConnection();
 		String sql = "Update application set status=2,reason='"+reason+"' where id=?";
 		PreparedStatement st=null;
 		int rs=0;
 		boolean flag=false;
 		try {
 			st=conn.prepareStatement(sql);
 			st.setInt(1, id);
 			rs=st.executeUpdate();
 			if(rs==1)
 				flag=true;
 		} catch (SQLException e) {
 			// TODO Auto-generated catch block
 			e.printStackTrace();
 		}finally {
 			DBUtils.close(null, st,conn);
 		}
 		return flag;
	}
	public boolean updatereaderapply(int id) throws RuntimeException {
		Connection conn=DBUtils.getConnection();
 		String sql = "Update application set status=3 where id=?";
 		PreparedStatement st=null;
 		int rs=0;
 		boolean flag=false;
 		try {
 			st=conn.prepareStatement(sql);
 			st.setInt(1, id);
 			rs=st.executeUpdate();
 			if(rs==1)
 				flag=true;
 		} catch (SQLException e) {
 			// TODO Auto-generated catch block
 			e.printStackTrace();
 		}finally {
 			DBUtils.close(null, st,conn);
 		}
 		return flag;
	}


	public static void main(String[] args) {
		ApplicationImpl daoApplicationImpl=new ApplicationImpl();
		//boolean flag=daoApplicationImpl.updateapply(5);
		Application application=new Application();
		//List<Application> list=new ArrayList<Application>();
		//list=daoApplicationImpl.findbytid(1);
	//	System.out.println(list.get(0).getTeacher_id());
		//Teacher teacher=new Teacher();
		//teacher=daoApplicationImpl.findbyid(1);
		//System.out.println(teacher.getUser_id());
		
	}
	public List<Application> findnoapply() throws RuntimeException {
		Connection conn=DBUtils.getConnection();
		String sql="select * from application where status=0";
		
		PreparedStatement st=null;
		ResultSet rs=null;
		List<Application> list=new ArrayList<Application>();
		try {
			st=conn.prepareStatement(sql);
			rs=st.executeQuery();
			while(rs.next()) {
				Application a=new Application();
				a.setId(rs.getInt("id"));
				a.setName(rs.getString("name"));
				a.setSex(rs.getString("sex"));
				a.setNativeplace(rs.getString("nativeplace"));	
				a.setBirthday(rs.getDate("birthday"));
				a.setEducation(rs.getString("education"));
				a.setTitle(rs.getString("title"));
				a.setQuatime(rs.getDate("quatime"));
				a.setGraschool(rs.getString("graschool"));
				a.setGratime(rs.getDate("gratime"));
				a.setMajor(rs.getString("major"));
				a.setWorkingtime(rs.getString("workingtime"));
				a.setCurrentmajor(rs.getString("currentmajor"));
				a.setPaper_name(rs.getString("paper_name"));
				a.setJournal_name(rs.getString("journal_name"));
				a.setTeacher_id(rs.getInt("teacher_id"));
				a.setReason(rs.getString("reason"));
				//System.out.println(s.getArticlename());
				list.add(a);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			DBUtils.close(rs, st, conn);
		}
		return list;
	}

	public boolean teacherUpdate(Teacher teacher,int teacher_id) throws RuntimeException {
		Connection conn=DBUtils.getConnection();
		PreparedStatement st=null;
		ResultSet rs=null;
		String sql = "Update teacher set" +
					" name = '" + teacher.getName() + "', " +
					" sex = '" + teacher.getSex() + "', " +
					" nativeplace = '" + teacher.getNativeplace() + "', " +
					" birthday = '" + teacher.getBirthday() + "', " +
					" education = '" + teacher.getEducation() + "', " +
					" title = '" + teacher.getTitle() + "', " +
					" quatime = '" + teacher.getQuatime() + "', " +
					" graschool = '" + teacher.getGraschool() + "', " +
					" gratime = '" + teacher.getGratime() + "', " +
					" major = '" + teacher.getMajor() + "' ," +
					" workingtime = '" + teacher.getWorkingtime() + "', " +
					" currentmajor = '" + teacher.getCurrentmajor() + "' " +
					" where id="+teacher_id;				
		//System.out.println(sql);
	int i = 0;
	try{	
		st = conn.prepareStatement(sql);
		i  = st.executeUpdate();
		}catch(Exception e){
		e.printStackTrace();
		System.out.println("teacherUpdate(Application application)异常");
		}finally{			
			DBUtils.close(rs, st, conn);			
		}
	if(i==0){
	return false;
	}else{
		return true;
	}
	}

	public List<Application> findhistory() throws RuntimeException {
		Connection conn=DBUtils.getConnection();
		String sql="select * from application where status=1 or status=2 or status=3";
		PreparedStatement st=null;
		ResultSet rs=null;
		List<Application> list=new ArrayList<Application>();
        try {
        	st=conn.prepareStatement(sql);
			rs=st.executeQuery();
			while(rs.next()) {			
				Application a=new Application();
				a.setId(rs.getInt("id"));
				a.setTeacher_id(rs.getInt("teacher_id"));
				a.setName(rs.getString("name"));
				a.setSex(rs.getString("sex"));
				a.setNativeplace(rs.getString("nativeplace"));
				a.setBirthday(rs.getDate("birthday"));
				a.setEducation(rs.getString("education"));
				a.setTitle(rs.getString("title"));
				a.setQuatime(rs.getDate("quatime"));
				a.setGraschool(rs.getString("graschool"));
				a.setGratime(rs.getDate("gratime"));
				a.setMajor(rs.getString("major"));
				a.setWorkingtime(rs.getString("workingtime"));
				a.setCurrentmajor(rs.getString("currentmajor"));
				a.setStatus(rs.getInt("status"));
				a.setPaper_name(rs.getString("paper_name"));
				a.setJournal_name(rs.getString("journal_name"));
				a.setReason(rs.getString("reason"));
				list.add(a);
				
		    }
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtils.close(rs, st, conn);
		}
		return list;
	}

	public List<Application> findbytea_id(int teacher_id) throws RuntimeException {
		Connection conn=DBUtils.getConnection();
		String sql="select * from application where status=2 and teacher_id=?";
		PreparedStatement st=null;
		ResultSet rs=null;
		List<Application> list=new ArrayList<Application>();
        try {
        	st=conn.prepareStatement(sql);
        	st.setInt(1, teacher_id);
			rs=st.executeQuery();
			while(rs.next()) {			
				Application a=new Application();
				a.setId(rs.getInt("id"));
				a.setTeacher_id(rs.getInt("teacher_id"));
				a.setName(rs.getString("name"));
				a.setSex(rs.getString("sex"));
				a.setNativeplace(rs.getString("nativeplace"));
				a.setBirthday(rs.getDate("birthday"));
				a.setEducation(rs.getString("education"));
				a.setTitle(rs.getString("title"));
				a.setQuatime(rs.getDate("quatime"));
				a.setGraschool(rs.getString("graschool"));
				a.setGratime(rs.getDate("gratime"));
				a.setMajor(rs.getString("major"));
				a.setWorkingtime(rs.getString("workingtime"));
				a.setCurrentmajor(rs.getString("currentmajor"));
				a.setStatus(rs.getInt("status"));
				a.setPaper_name(rs.getString("paper_name"));
				a.setJournal_name(rs.getString("journal_name"));
				a.setReason(rs.getString("reason"));
				list.add(a);
				
		    }
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtils.close(rs, st, conn);
		}
		return list;
	}
	public List<Application> findbyt_id(int teacher_id) throws RuntimeException {
		Connection conn=DBUtils.getConnection();
		String sql="select * from application where status=0 and teacher_id=?";
		PreparedStatement st=null;
		ResultSet rs=null;
		List<Application> list=new ArrayList<Application>();
        try {
        	st=conn.prepareStatement(sql);
        	st.setInt(1, teacher_id);
			rs=st.executeQuery();
			while(rs.next()) {			
				Application a=new Application();
				a.setId(rs.getInt("id"));
				a.setTeacher_id(rs.getInt("teacher_id"));
				a.setName(rs.getString("name"));
				a.setSex(rs.getString("sex"));
				a.setNativeplace(rs.getString("nativeplace"));
				a.setBirthday(rs.getDate("birthday"));
				a.setEducation(rs.getString("education"));
				a.setTitle(rs.getString("title"));
				a.setQuatime(rs.getDate("quatime"));
				a.setGraschool(rs.getString("graschool"));
				a.setGratime(rs.getDate("gratime"));
				a.setMajor(rs.getString("major"));
				a.setWorkingtime(rs.getString("workingtime"));
				a.setCurrentmajor(rs.getString("currentmajor"));
				a.setStatus(rs.getInt("status"));
				a.setPaper_name(rs.getString("paper_name"));
				a.setJournal_name(rs.getString("journal_name"));
				a.setReason(rs.getString("reason"));
				list.add(a);
				
		    }
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtils.close(rs, st, conn);
		}
		return list;
	}
	public Teacher findbyuser_id(int user_id) throws RuntimeException {
		Connection conn=DBUtils.getConnection();
		String sql="select * from teacher where user_id=?";
		PreparedStatement st=null;
		ResultSet rs=null;
		Teacher teacher=new Teacher();
        try {
        	st=conn.prepareStatement(sql);
        	st.setInt(1, user_id);
			rs=st.executeQuery();
			while(rs.next()) {			
				teacher.setId(rs.getInt("id"));
				
		    }
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtils.close(rs, st, conn);
		}
		return teacher;
	}

	

	
	

}
	

