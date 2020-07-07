package bean;

public class Project {
private int pro_id;//项目编号
private String pro_name;//项目名称
private String pro_category;//项目类别
private String pro_starttime;//项目开始时间
private String pro_finishtime;//项目结束时间
private String pro_identime;//项目鉴定日期
private String pro_identification;//项目鉴定结论
private String pro_prize;//项目获奖情况
private String pro_ranking;//项目排名
private Teacher leader_id;//领导老师id
private Teacher leader_name;//领导老师name
private Teacher t1_id;//队员1id
private Teacher t1_name;//队员1name
private Teacher t2_id;//队员2id
private Teacher t2_name;//队员2name
private Teacher t3_id;//队员3id
private Teacher t3_name;//队员3name

public int getPro_id() {
	return pro_id;
}
public String getPro_name() {
	return pro_name;
}
public String getPro_category() {
	return pro_category;
}
public String getPro_starttime() {
	return pro_starttime;
}
public String getPro_finishtime() {
	return pro_finishtime;
}
public String getPro_identime() {
	return pro_identime;
}
public String getPro_identification() {
	return pro_identification;
}
public String getPro_prize() {
	return pro_prize;
}
public String getPro_ranking() {
	return pro_ranking;
}
public void setPro_id(int pro_id) {
	this.pro_id = pro_id;
}
public void setPro_name(String pro_name) {
	this.pro_name = pro_name;
}
public void setPro_category(String pro_category) {
	this.pro_category = pro_category;
}
public void setPro_starttime(String pro_starttime) {
	this.pro_starttime = pro_starttime;
}
public void setPro_finishtime(String pro_finishtime) {
	this.pro_finishtime = pro_finishtime;
}
public void setPro_identime(String pro_identime) {
	this.pro_identime = pro_identime;
}
public void setPro_identification(String pro_identification) {
	this.pro_identification = pro_identification;
}
public void setPro_prize(String pro_prize) {
	this.pro_prize = pro_prize;
}
public void setPro_ranking(String pro_ranking) {
	this.pro_ranking = pro_ranking;
}
public Teacher getLeader_id() {
	return leader_id;
}
public Teacher getLeader_name() {
	return leader_name;
}
public Teacher getT1_id() {
	return t1_id;
}
public Teacher getT1_name() {
	return t1_name;
}
public Teacher getT2_id() {
	return t2_id;
}
public Teacher getT2_name() {
	return t2_name;
}
public Teacher getT3_id() {
	return t3_id;
}
public Teacher getT3_name() {
	return t3_name;
}
public void setLeader_id(Teacher leader_id) {
	this.leader_id = leader_id;
}
public void setLeader_name(Teacher leader_name) {
	this.leader_name = leader_name;
}
public void setT1_id(Teacher t1_id) {
	this.t1_id = t1_id;
}
public void setT1_name(Teacher t1_name) {
	this.t1_name = t1_name;
}
public void setT2_id(Teacher t2_id) {
	this.t2_id = t2_id;
}
public void setT2_name(Teacher t2_name) {
	this.t2_name = t2_name;
}
public void setT3_id(Teacher t3_id) {
	this.t3_id = t3_id;
}
public void setT3_name(Teacher t3_name) {
	this.t3_name = t3_name;
}
@Override
public String toString() {
	return "Project [pro_id=" + pro_id + ", pro_name=" + pro_name + ", pro_category=" + pro_category
			+ ", pro_starttime=" + pro_starttime + ", pro_finishtime=" + pro_finishtime + ", pro_identime="
			+ pro_identime + ", pro_identification=" + pro_identification + ", pro_prize=" + pro_prize
			+ ", pro_ranking=" + pro_ranking + ", leader_id=" + leader_id + ", leader_name=" + leader_name + ", t1_id="
			+ t1_id + ", t1_name=" + t1_name + ", t2_id=" + t2_id + ", t2_name=" + t2_name + ", t3_id=" + t3_id
			+ ", t3_name=" + t3_name + "]";
}


}
