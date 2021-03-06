package bean;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Teacher {
	int id;//编号
	String name;//姓名
	String sex;//性别
	String nativeplace;//籍贯
	Date birthday;//出生日期
	String education;//学历
	String title;//职称
	Date quatime;//取得资格时间
	String graschool;//毕业学校
	Date gratime;//毕业时间
	String major;//专业
	String workingtime;//参加工作时间
	String currentmajor;//现从事专业
	int user_id;//用户id
	
	User user;
	
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getNativeplace() {
		return nativeplace;
	}
	public void setNativeplace(String nativeplace) {
		this.nativeplace = nativeplace;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getEducation() {
		return education;
	}
	public void setEducation(String education) {
		this.education = education;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Date getQuatime() {
		return quatime;
	}
	public void setQuatime(Date quatime) {
		this.quatime = quatime;
	}
	public String getGraschool() {
		return graschool;
	}
	public void setGraschool(String graschool) {
		this.graschool = graschool;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public String getWorkingtime() {
		return workingtime;
	}
	public void setWorkingtime(String workingtime) {
		this.workingtime = workingtime;
	}
	public String getCurrentmajor() {
		return currentmajor;
	}
	public void setCurrentmajor(String currentmajor) {
		this.currentmajor = currentmajor;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public Date getGratime() {
		return gratime;
	}
	public void setGratime(Date gratime) {
		this.gratime = gratime;
	}
	@Override
	public String toString() {
		return "Teacher [id=" + id + ", name=" + name + ", sex=" + sex + ", nativeplace=" + nativeplace + ", birthday="
				+ birthday + ", education=" + education + ", title=" + title + ", quatime=" + quatime + ", graschool="
				+ graschool + ", gratime=" + gratime + ", major=" + major + ", workingtime=" + workingtime
				+ ", currentmajor=" + currentmajor + ", user_id=" + user_id + ", user=" + user + "]";
	}
	
	

}
