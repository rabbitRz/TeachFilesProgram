package daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import Utils.DBUtils;
import bean.User;
import dao.UserDao;

public class UserDaoImpl implements UserDao{

	//登录
	public boolean login(String username, String password) throws Exception {
		boolean flag = true;
		Connection conn=DBUtils.getConnection();
		String sql = "select * from user where user_name = ? and user_pass = ?";
		PreparedStatement st = conn.prepareStatement(sql);
		st.setString(1, username);
		st.setString(2, password);
		ResultSet rs = st.executeQuery();
		User u = null;
		if(rs.next()){
			u = new User();
			u.setUser_id(rs.getInt("user_id"));
			u.setUsername(rs.getString("username"));
			u.setPassword(rs.getString("password"));
			u.setRole_id(rs.getInt("role_id"));
		}		
		rs.close();
		st.close();
		conn.close();		
		if(u==null){
			flag = false;
		}
		return flag;
	}

}
