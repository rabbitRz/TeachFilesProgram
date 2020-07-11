package dao;

import java.util.List;

import bean.Paper;

public interface IPaper {
	List<Paper> show() throws RuntimeException;

}
