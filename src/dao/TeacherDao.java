package dao;

import java.util.List;

import bean.Teacher;

public interface TeacherDao {
	
	//通过教师id显示个人信息
	public Teacher showPersonalInfo(int id); 

}
