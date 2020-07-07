package daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import Utils.DBUtils;
import bean.User;
import dao.UserDao;

public class UserDaoImpl implements UserDao{

	//登录
	public User login(String username, String password) throws Exception {
		Connection conn=DBUtils.getConnection();
		String sql = "select * from user where username ='"+username+"' and password = '"+password+"'";
		System.out.println(sql);
		PreparedStatement st = conn.prepareStatement(sql);

		ResultSet rs = st.executeQuery();
		User u = new User();
		if(rs.next()){
			//u = new User();
			u.setUser_id(rs.getInt("user_id"));
			u.setUsername(rs.getString("username"));
			u.setPassword(rs.getString("password"));
			u.setRole_id(rs.getInt("role_id"));
		}	
		
	
		rs.close();
		st.close();
		conn.close();
		return u;
	}
/*public static void main(String[] args) {
	UserDaoImpl daoImpl=new UserDaoImpl();
	String username="908657326@qq.com";
	String password="123456";
	try {
		User user=daoImpl.login(username, password);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}*/
}
