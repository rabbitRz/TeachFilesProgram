package bean;
//教师所带班级
public class TrClass {
	private int teacher_id;//教师id
	private String course_class;//所带班级
	private String course_name;//所带课程页面
	public int getTeacher_id() {
		return teacher_id;
	}
	public String getCourse_class() {
		return course_class;
	}
	public String getCourse_name() {
		return course_name;
	}
	public void setTeacher_id(int teacher_id) {
		this.teacher_id = teacher_id;
	}
	public void setCourse_class(String course_class) {
		this.course_class = course_class;
	}
	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}
	@Override
	public String toString() {
		return "TrClass [teacher_id=" + teacher_id + ", course_class=" + course_class + ", course_name=" + course_name
				+ "]";
	}
	
}
