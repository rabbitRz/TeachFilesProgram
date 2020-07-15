package daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Utils.DBUtils;
import bean.Teacher;
import bean.User;
import dao.TeacherManageDao;

public class TeacherManageDaoImpl implements TeacherManageDao {

	//创建账户
	public boolean createUser(User user) {
		Connection conn=DBUtils.getConnection();
		String sql="insert into user(user_id,username,password,role_id)" +
				"values(?,?,?,?)"; 
		PreparedStatement st=null;
		ResultSet rs=null;
		int i = 0;
		try{	
			st = conn.prepareStatement(sql);
			st.setInt(1, user.getUser_id());
			st.setString(2, user.getUsername());
			st.setString(3, user.getPassword());
			st.setInt(4, user.getRole_id());
			i  = st.executeUpdate();
 		}catch(Exception e){
			e.printStackTrace();
			System.out.println("createUser(User user)异常");
		}finally{			
			DBUtils.close(rs, st, conn);			
		}
		if(i==0){
		return false;
		}else{
			return true;
	}

}
	//删除一个老师
	public boolean teacherDelete(int id) {
		Connection conn=DBUtils.getConnection();
		String sql="delete t,u from teacher t,user u where t.user_id=u.user_id and t.id ="+id;
		PreparedStatement st=null;
		ResultSet rs=null;
		int shan = 0;		
		try{	
			st = conn.prepareStatement(sql);
			shan = st.executeUpdate();				
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("teacherDelete(int id)异常");
		}finally{			
			DBUtils.close(rs, st, conn);			
		}
		
		if(shan > 0){
			return true;
		}else{
			return false;
		}
	}
	
	//修改教师信息
	public boolean teacherUpdate(Teacher teacher) {
		Connection conn=DBUtils.getConnection();
		PreparedStatement st=null;
		ResultSet rs=null;
		String sql = "Update teacher,user set" +
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
					" currentmajor = '" + teacher.getCurrentmajor() + "' ," +
					" username = '" + teacher.getUser().getUsername() + "', " +
					" password = '" + teacher.getUser().getPassword() + "' " +
					" where teacher.user_id=user.user_id\r\n"
					+ "and id = " + teacher.getId();
		System.out.println(sql);
	int i = 0;
	try{	
		st = conn.prepareStatement(sql);
		i  = st.executeUpdate();
		}catch(Exception e){
		e.printStackTrace();
		System.out.println("teacherUpdate(Teacher teacher)异常");
		}finally{			
			DBUtils.close(rs, st, conn);			
		}
	if(i==0){
	return false;
	}else{
		return true;
	}
	}
	
	//显示未分配的user_id
	public List<User> showUId() {
		Connection conn=DBUtils.getConnection();
		String sql="SELECT user_id from user where user_id"
				+ " not in(select u.user_id from teacher t,user u where t.user_id=u.user_id)";
		PreparedStatement st=null;
		ResultSet rs=null;
		List<User> users=new ArrayList<User>();
		try {
			st=conn.prepareStatement(sql);
			rs=st.executeQuery();
			while(rs.next()) {
				User user=new User();
				user.setUser_id(rs.getInt("user_id"));
				users.add(user);   
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("showUId()异常");
		}finally {
			DBUtils.close(rs, st, conn);
		}
		return users;
	}
	
	//添加教师信息
	public boolean teacherAdd(Teacher teacher) {
		Connection conn=DBUtils.getConnection();
		PreparedStatement st=null;
		ResultSet rs=null;
		//System.out.println(sql);
		String sql = "insert into teacher(name,sex,nativeplace,birthday,education,title,quatime,graschool,gratime,major,workingtime,currentmajor,user_id)" +
				"values(?,?,?,?,?,?,?,?,?,?,?,?,?)"; 
		int i = 0;
		try{	
			st = conn.prepareStatement(sql);
			st.setString(1, teacher.getName());
			st.setString(2, teacher.getSex());
			st.setString(3, teacher.getNativeplace());
			st.setDate(4, teacher.getBirthday());
			st.setString(5, teacher.getEducation());
			st.setString(6, teacher.getTitle());
			st.setDate(7, teacher.getQuatime());
			st.setString(8, teacher.getGraschool());
			st.setDate(9, teacher.getGratime());
			st.setString(10, teacher.getMajor());
			st.setString(11, teacher.getWorkingtime());
			st.setString(12, teacher.getCurrentmajor());
			st.setInt(13, teacher.getUser_id());
			
			i  = st.executeUpdate();
 		}catch(Exception e){
			e.printStackTrace();
			System.out.println("teacherAdd(Teacher teacher)异常");
		}finally{			
			DBUtils.close(rs, st, conn);			
		}
		if(i==0){
		return false;
		}else{
			return true;
		}
	}
	//按照教师编号关键字查询
	public List<Teacher> findById(int id) {
		Connection conn=DBUtils.getConnection();
		String sql="select t.*,u.* from teacher t,user u where u.user_id=t.user_id and t.id="+id;
		//System.out.println(sql);
		PreparedStatement st=null;
		ResultSet rs=null;
		List<Teacher> list=new ArrayList<Teacher>();
		try {
			st=conn.prepareStatement(sql);
			rs=st.executeQuery();
			while(rs.next()) {
				Teacher teacher=new Teacher();
				User user=new User();
				user.setUsername(rs.getString("username"));
				user.setPassword(rs.getString("password"));
				teacher.setUser(user);
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
				teacher.setGratime(rs.getDate("gratime"));
				teacher.setMajor(rs.getString("major"));
				teacher.setWorkingtime(rs.getString("workingtime"));
				teacher.setCurrentmajor(rs.getString("currentmajor"));
				//System.out.println(teacher.getBirthday());
				list.add(teacher);  
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("findById(int id)运行出错!");
		}finally {
			DBUtils.close(rs, st, conn);
		}
		return list;
	}
	//按照教师职称关键字查询
	public List<Teacher> findByTitle(String input) {
		Connection conn=DBUtils.getConnection();
		String sql="select t.*,u.* from teacher t,user u where u.user_id=t.user_id and t.title='"+input+"'";
		System.out.println(sql);
		PreparedStatement st=null;
		ResultSet rs=null;
		List<Teacher> list=new ArrayList<Teacher>();
		try {
			st=conn.prepareStatement(sql);
			rs=st.executeQuery();
			while(rs.next()) {
				Teacher teacher=new Teacher();
				User user=new User();
				user.setUsername(rs.getString("username"));
				user.setPassword(rs.getString("password"));
				teacher.setUser(user);
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
				teacher.setGratime(rs.getDate("gratime"));
				teacher.setMajor(rs.getString("major"));
				teacher.setWorkingtime(rs.getString("workingtime"));
				teacher.setCurrentmajor(rs.getString("currentmajor"));
				//System.out.println(teacher.getBirthday());
				list.add(teacher);  
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("findByTitle(String input)运行出错!");
		}finally {
			DBUtils.close(rs, st, conn);
		}
		return list;
	}
	//按照教师性别关键字查询
	public List<Teacher> findBySex(String input) {
		Connection conn=DBUtils.getConnection();
		String sql="select t.*,u.* from teacher t,user u where u.user_id=t.user_id and t.sex='"+input+"'";
		System.out.println(sql);
		PreparedStatement st=null;
		ResultSet rs=null;
		List<Teacher> list=new ArrayList<Teacher>();
		try {
			st=conn.prepareStatement(sql);
			rs=st.executeQuery();
			while(rs.next()) {
				Teacher teacher=new Teacher();
				User user=new User();
				user.setUsername(rs.getString("username"));
				user.setPassword(rs.getString("password"));
				teacher.setUser(user);
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
				teacher.setGratime(rs.getDate("gratime"));
				teacher.setMajor(rs.getString("major"));
				teacher.setWorkingtime(rs.getString("workingtime"));
				teacher.setCurrentmajor(rs.getString("currentmajor"));
				//System.out.println(teacher.getBirthday());
				list.add(teacher);  
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("findBySex(String input)运行出错!");
		}finally {
			DBUtils.close(rs, st, conn);
		}
		return list;
	}
	
	
	
	
}
