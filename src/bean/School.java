package bean;

import java.sql.Date;

public class School {
	private int id;
	private String newsname;
	private String newsinfo;
	private Date newsdate;
	private String articlename;
	private String articleinfo;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNewsname() {
		return newsname;
	}
	public void setNewsname(String newsname) {
		this.newsname = newsname;
	}
	public String getNewsinfo() {
		return newsinfo;
	}
	public void setNewsinfo(String newsinfo) {
		this.newsinfo = newsinfo;
	}
	public Date getNewsdate() {
		return newsdate;
	}
	public void setNewsdate(Date newsdate) {
		this.newsdate = newsdate;
	}
	public String getArticlename() {
		return articlename;
	}
	public void setArticlename(String articlename) {
		this.articlename = articlename;
	}
	public String getArticleinfo() {
		return articleinfo;
	}
	public void setArticleinfo(String articleinfo) {
		this.articleinfo = articleinfo;
	}
	
	

}
