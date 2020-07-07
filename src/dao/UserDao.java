package dao;

import bean.User;

public interface UserDao {
	//登录
	public User login(String username,String password) throws Exception;

}
