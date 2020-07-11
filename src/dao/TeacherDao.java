package dao;

import java.util.List;

import bean.Paper;
import bean.Project;
import bean.Teacher;

public interface TeacherDao {
	
	//通过user_id显示个人信息(不包含论文信息)
	public Teacher showPersonalInfo(int user_id); 
	//通过教师id显示个人信息
	public Teacher showPersonById(int id);
	//通过教师id显示个人的论文信息
	public List<Paper> showPapers(int id);
	//通过教师id显示个人的项目信息
	public List<Project> showProjects(int id);
	//显示所有教师信息
	public List<Teacher> showAllTeachers();
}
