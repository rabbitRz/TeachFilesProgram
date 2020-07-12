package dao;

import java.util.List;

import bean.ChangePermission;
import bean.tip;
public interface ChangePermissionDao {
	//插入数据
	public boolean insertChangePermission(String paper_id,String member,String member_per,String application);
	//查看该成员是否有申请未同意
	public List<ChangePermission> getDIsAgree(String teacher_id);
	//更新result
	public boolean UpdateRes(String paper_id,String result);
	//插入个人意愿
	public boolean insertPer(String paper_id,String teacher_id,String people_permission);
	//若条件符合，更新result为'Y'
	public boolean UpdateResY(String paper_id,String result);
	//查看所有result不为空的信息，并将其插入到tip表中
	public boolean insertTip();
	//删除result不为空的信息
	public boolean delete();
	//查询tip中需要提示给个人的信息
	public List<tip> getTip(String teacher_id);
	//更改论文状态
	public boolean updatePaper();
	//在tip表中个人意见
	public boolean insertTipPer(String paper_id,String teacher_id,String res);
	//删除所有人都查看到的信息
	public boolean deleTip(String paper_id);
}
