package bean;

import java.sql.Date;

public class Application {
	private int id;
	private int teacher_id;
	private String name;
	private String sex;
	private String nativeplace;
	private Date birthday;
	private String education;
	private String title;
	private Date quatime;
	private String graschool;
	private Date gratime;
	private String major;
	private String workingtime;
	private String currentmajor;
	private int status;
	private String paper_name;
	private String journal_name;
	private String reason;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getTeacher_id() {
		return teacher_id;
	}
	public void setTeacher_id(int teacher_id) {
		this.teacher_id = teacher_id;
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
	public Date getGratime() {
		return gratime;
	}
	public void setGratime(Date gratime) {
		this.gratime = gratime;
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
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getPaper_name() {
		return paper_name;
	}
	public void setPaper_name(String paper_name) {
		this.paper_name = paper_name;
	}
	public String getJournal_name() {
		return journal_name;
	}
	public void setJournal_name(String journal_name) {
		this.journal_name = journal_name;
	}
	
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	@Override
	public String toString() {
		return "Application [id=" + id + ", teacher_id=" + teacher_id + ", name=" + name + ", sex=" + sex
				+ ", nativeplace=" + nativeplace + ", birthday=" + birthday + ", education=" + education + ", title="
				+ title + ", quatime=" + quatime + ", graschool=" + graschool + ", gratime=" + gratime + ", major="
				+ major + ", workingtime=" + workingtime + ", currentmajor=" + currentmajor + ", status=" + status
				+ ", paper_name=" + paper_name + ", journal_name=" + journal_name + ", reason=" + reason + "]";
	}
	
	

}
