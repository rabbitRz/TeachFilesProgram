package bean;

import java.sql.Date;

public class Paper {
	private int paper_id;//论文编号
	private String paper_name;//论文名称
	private String journal_name;//期刊名称
	private Date release_time;//发布时间
	private String journal_level;//期刊级别
	private String paper_index;//索引情况
	private String paper_ranking;//排名
	private String teachername;
	public int getPaper_id() {
		return paper_id;
	}
	public void setPaper_id(int paper_id) {
		this.paper_id = paper_id;
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
	public Date getRelease_time() {
		return release_time;
	}
	public void setRelease_time(Date release_time) {
		this.release_time = release_time;
	}
	public String getJournal_level() {
		return journal_level;
	}
	public void setJournal_level(String journal_level) {
		this.journal_level = journal_level;
	}
	public String getPaper_index() {
		return paper_index;
	}
	public void setPaper_index(String paper_index) {
		this.paper_index = paper_index;
	}
	public String getPaper_ranking() {
		return paper_ranking;
	}
	public void setPaper_ranking(String paper_ranking) {
		this.paper_ranking = paper_ranking;
	}
	public String getTeachername() {
		return teachername;
	}
	public void setTeachername(String teachername) {
		this.teachername = teachername;
	}
	
	
	

}
