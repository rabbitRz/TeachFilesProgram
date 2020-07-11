package dao;

import java.util.List;

import bean.ChangePermission;
public interface ChangePermissionDao {
	//插入数据
	public boolean insertChangePermission(String paper_id,String member,String member_per,String application);
	//查看该成员是否有申请未同意
	public List<ChangePermission> getDIsAgree(String teacher_id);
}
