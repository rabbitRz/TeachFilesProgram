package dao;

import java.util.List;

import bean.Paper;
import bean.PaperPeople;
import bean.Teacher;

public interface IPaper {
	List<Paper> show() throws RuntimeException;
	List<Paper> showall() throws RuntimeException;
	List<Paper> adminshowall() throws RuntimeException;
	boolean updatepaper(Paper paper,int id) throws RuntimeException;
    boolean deletepaper(int id) throws RuntimeException;
    boolean deleteafterpaper(int id) throws RuntimeException;
    boolean insertpaper(Paper paper) throws RuntimeException;
    boolean insertpaperpeople(PaperPeople paperPeople) throws RuntimeException;
    Paper findnewid() throws RuntimeException;
    Paper findbyid(int id) throws RuntimeException;
    List<PaperPeople> showpeople() throws RuntimeException;
    List<Teacher> showteacher() throws RuntimeException;

}
