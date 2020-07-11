package dao;

import java.util.List;

import bean.Paper;
import bean.Parper_PaperPeople;

public interface PaperDao {
	List<Paper> show() throws RuntimeException;
	//根据教师id获取教师论文信息
	public List<Parper_PaperPeople> getPaperAllInfo(String teacher_id);
}
