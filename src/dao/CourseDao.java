package dao;

import java.util.List;

import bean.course;

public interface CourseDao {
	//根据teacher id查看该老师所带所有班级
	public List<String> GetClassByTrId(String teacher_id); 
    //根据teacher id查看该老师所有课程信息
	public List<course> FindCouserBuTrId(String teacher_id); 
	//查看所有课程信息
	public List<course> GetAll();
}
