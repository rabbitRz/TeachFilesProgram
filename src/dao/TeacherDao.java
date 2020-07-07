package dao;

import java.util.List;

import bean.Paper;
import bean.Teacher;

public interface TeacherDao {
	
	//通过user_id显示个人信息(不包含论文信息)
	public Teacher showPersonalInfo(int user_id); 
	
	//通过教师id显示个人的论文信息
	public List<Paper> showPapers(int id);

}
