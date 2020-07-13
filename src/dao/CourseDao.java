package dao;

import java.util.List;

import bean.course;
import servlet.UpdatePermissionServlet;

public interface CourseDao {
	//根据teacher id查看该老师所带所有班级
	public List<String> GetClassByTrId(String teacher_id); 
	//获取当前假期的开学日期
	public String getTermStart();
    //根据teacher id查看该老师所有课程信息
	public List<course> FindCouserBuTrId(String teacher_id); 
	//根据教师所带班级以及周数查找课程表
	public List<course> FindByClass_Week(String teacher_id,String claString,String weekString); 
	//查看其全部课程信息
	public List<course> getAllCourse();
	//根据课程id查看课程信息
	public course getCourseById(String course_id);
	//根据课程id进行修改信息
	public boolean UpdateCourseById(String course_id);
	//根据课程id删除课程信息
	public boolean deleteCourse(String id);
}
