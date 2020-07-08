package dao;

import java.util.List;

import bean.Project;

public interface ProjectDAO {
	//根据教师id查找信息
	public List<Project> GetAllInfoById(String id);
	
}
