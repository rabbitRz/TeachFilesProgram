package dao;

import java.util.List;

import bean.course;

public interface CourseDao {
	//根据teacher id查看该老师所带所有班级
	public List<String> GetClassByTrId(String teacher_id); 
	//获取当前假期的开学日期
	public String getTermStart();
    //根据teacher id查看该老师所有课程信息
	public List<course> FindCouserBuTrId(String teacher_id); 
	//根据教师所带班级以及周数查找课程表
	public List<course> FindByClass_Week(String teacher_id,String claString,String weekString); 
	
}
