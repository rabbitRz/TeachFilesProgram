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
}
