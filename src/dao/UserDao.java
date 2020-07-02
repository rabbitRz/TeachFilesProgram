package dao;

public interface UserDao {
	//登录
	public boolean login(String username,String password) throws Exception;

}
