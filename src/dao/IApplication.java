package dao;

import java.util.List;
import bean.Application;
import bean.Teacher;

public interface IApplication {
	boolean insert(Application a) throws RuntimeException;
	Teacher findbyid(int id) throws RuntimeException;
	List<Application> findbytid(int teacher_id) throws RuntimeException;
	boolean deletebytid(int id) throws RuntimeException;
	Application findteacherid(int id) throws RuntimeException;
	List<Application> findnoapply() throws RuntimeException;
	boolean updateapply(int id) throws RuntimeException;
	boolean updatenoapply(int id,String reason) throws RuntimeException;
	boolean teacherUpdate(Teacher teacher,int teacher_id) throws RuntimeException;
	Application findbyida(int id) throws RuntimeException;
	List<Application> findhistory() throws RuntimeException;
	List<Application> findbytea_id(int teacher_id) throws RuntimeException;
	List<Application> findbyt_id(int teacher_id) throws RuntimeException;
	Teacher findbyuser_id(int user_id) throws RuntimeException;
	boolean updatereaderapply(int id) throws RuntimeException;
}
