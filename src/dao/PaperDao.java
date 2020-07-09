package dao;

import java.util.List;

import bean.Parper_PaperPeople;

public interface PaperDao {
	//根据教师id获取教师论文信息
	public List<Parper_PaperPeople> getPaperAllInfo(String teacher_id);
}
