package dao;

import java.util.List;

import bean.Project;

public interface ProjectManageDao {
	//显示已分配人员项目信息
	List<Project> showProjects();

	//通过pro_id显示项目信息(有人员)
	Project showProjectById(int id);

	//修改项目信息
	boolean projectUpdate(Project project);

	//添加项目信息
	boolean projectAdd(Project project);

	//显示未分配人员项目信息
	List<Project> showNotProjects();

	//通过pro_id显示项目信息
	Project showProOnlyById(int id);

	//为项目添加人员信息
	boolean projectPeopleAdd(Project project);

	//删除项目信息
	boolean projectDelete(int id);

	
}
