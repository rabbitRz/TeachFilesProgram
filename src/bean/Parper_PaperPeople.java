package bean;

import java.sql.Date;

public class Parper_PaperPeople {
	private int paper_id;//论文编号
	private String paper_name;//论文名称
	private String journal_name;//期刊名称
	private String release_time;//发布时间
	private String journal_level;//期刊级别
	private String paper_index;//索引情况
	private String paper_ranking;//排名
	private int people1_id;//成员1编号
	private String people1_name;//成员1姓名
	private int people2_id;//成员2编号
	private String people2_name;//成员2姓名
	private int people3_id;//成员3编号
	private String people3_name;//成员3姓名
	private int permission;//开放权限
	public int getPaper_id() {
		return paper_id;
	}
	public String getPaper_name() {
		return paper_name;
	}
	public String getJournal_name() {
		return journal_name;
	}
	public String getRelease_time() {
		return release_time;
	}
	public String getJournal_level() {
		return journal_level;
	}
	public String getPaper_index() {
		return paper_index;
	}
	public String getPaper_ranking() {
		return paper_ranking;
	}
	public int getPeople1_id() {
		return people1_id;
	}
	public String getPeople1_name() {
		return people1_name;
	}
	public int getPeople2_id() {
		return people2_id;
	}
	public String getPeople2_name() {
		return people2_name;
	}
	public int getPeople3_id() {
		return people3_id;
	}
	public String getPeople3_name() {
		return people3_name;
	}
	public int getPermission() {
		return permission;
	}
	public void setPaper_id(int paper_id) {
		this.paper_id = paper_id;
	}
	public void setPaper_name(String paper_name) {
		this.paper_name = paper_name;
	}
	public void setJournal_name(String journal_name) {
		this.journal_name = journal_name;
	}
	public void setRelease_time(String release_time) {
		this.release_time = release_time;
	}
	public void setJournal_level(String journal_level) {
		this.journal_level = journal_level;
	}
	public void setPaper_index(String paper_index) {
		this.paper_index = paper_index;
	}
	public void setPaper_ranking(String paper_ranking) {
		this.paper_ranking = paper_ranking;
	}
	public void setPeople1_id(int people1_id) {
		this.people1_id = people1_id;
	}
	public void setProple1_name(String prople1_name) {
		this.people1_name = prople1_name;
	}
	public void setPeople2_id(int people2_id) {
		this.people2_id = people2_id;
	}
	public void setPeople2_name(String people2_name) {
		this.people2_name = people2_name;
	}
	public void setPeople3_id(int people3_id) {
		this.people3_id = people3_id;
	}
	public void setPeople3_name(String people3_name) {
		this.people3_name = people3_name;
	}
	public void setPermission(int permission) {
		this.permission = permission;
	}
	@Override
	public String toString() {
		return "Parper_PaperPeople [paper_id=" + paper_id + ", paper_name=" + paper_name + ", journal_name="
				+ journal_name + ", release_time=" + release_time + ", journal_level=" + journal_level
				+ ", paper_index=" + paper_index + ", paper_ranking=" + paper_ranking + ", people1_id=" + people1_id
				+ ", prople1_name=" + people1_name + ", people2_id=" + people2_id + ", people2_name=" + people2_name
				+ ", people3_id=" + people3_id + ", people3_name=" + people3_name + ", permission=" + permission + "]";
	}
}
