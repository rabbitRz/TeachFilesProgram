package bean;

import java.util.function.IntToLongFunction;

public class course {
private int course_id;//课程号
private String course_name;//课程名字
private int course_hours;//课程具体节数
private String course_class;//班级
private int couser_peoplenum;//上课人数
private int teacher_id;//老师id
private String teachr_name;//老师名字
private String term_start;//学期开始时间
private int start_courseweek;//课程开始周数
private int end_courseweek;//课程开始周数
private String course_place;//上课地点
private String week;//上课星期
public int getCourse_id() {
	return course_id;
}
public String getCourse_name() {
	return course_name;
}
public int getCourse_hours() {
	return course_hours;
}
public String getCourse_class() {
	return course_class;
}
public int getCouser_peoplenum() {
	return couser_peoplenum;
}
public int getTeacher_id() {
	return teacher_id;
}
public String getTeachr_name() {
	return teachr_name;
}
public String getTerm_start() {
	return term_start;
}
public String getCourse_place() {
	return course_place;
}
public String getWeek() {
	return week;
}
public void setCourse_id(int course_id) {
	this.course_id = course_id;
}
public void setCourse_name(String course_name) {
	this.course_name = course_name;
}
public void setCourse_hours(int course_hours) {
	this.course_hours = course_hours;
}
public void setCourse_class(String course_class) {
	this.course_class = course_class;
}
public void setCouser_peoplenum(int couser_peoplenum) {
	this.couser_peoplenum = couser_peoplenum;
}
public void setTeacher_id(int teacher_id) {
	this.teacher_id = teacher_id;
}
public void setTeachr_name(String teachr_name) {
	this.teachr_name = teachr_name;
}
public void setTerm_start(String term_start) {
	this.term_start = term_start;
}
public void setCourse_place(String course_place) {
	this.course_place = course_place;
}
public void setWeek(String week) {
	this.week = week;
}
public int getStart_courseweek() {
	return start_courseweek;
}
public int getEnd_courseweek() {
	return end_courseweek;
}
public void setStart_courseweek(int start_course_week) {
	this.start_courseweek = start_course_week;
}
public void setEnd_courseweek(int end_course_week) {
	this.end_courseweek = end_course_week;
}
@Override
public String toString() {
	return "course [course_id=" + course_id + ", course_name=" + course_name + ", course_hours=" + course_hours
			+ ", course_class=" + course_class + ", couser_peoplenum=" + couser_peoplenum + ", teacher_id=" + teacher_id
			+ ", teachr_name=" + teachr_name + ", term_start=" + term_start + ", start_course_week=" + start_courseweek
			+ ", end_course_week=" + end_courseweek + ", course_place=" + course_place + ", week=" + week + "]";
}


}
