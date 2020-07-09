package dao;

import java.util.List;

import bean.TrClass;

public interface TrClassDao {
	//获取所带班级信息
	public List<TrClass> getTrClassInfo(String teacher_id);
}
