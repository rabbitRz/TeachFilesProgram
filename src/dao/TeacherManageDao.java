package dao;

import java.util.List;

import bean.Teacher;
import bean.User;

public interface TeacherManageDao {
	//创建一个用户
	public boolean createUser(User user);

	//删除一个老师
	public boolean teacherDelete(int id);

	//修改老师信息
	public boolean teacherUpdate(Teacher teacher);
	
	//显示未分配的user_id
	public List<User> showUId();

	//添加教师信息
	public boolean teacherAdd(Teacher teacher);
	
	List<Teacher> findById(int id);

	List<Teacher> findByTitle(String input);

	List<Teacher> findBySex(String input);


}
