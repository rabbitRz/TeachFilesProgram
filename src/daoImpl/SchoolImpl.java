package daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

import Utils.DBUtils;
import bean.School;
import dao.ISchool;

public class SchoolImpl implements ISchool {

	public List<School> show() throws RuntimeException {
		Connection conn=DBUtils.getConnection();
		String sql="select * from school";
		
		PreparedStatement st=null;
		ResultSet rs=null;
		List<School> list=new ArrayList<School>();
		try {
			st=conn.prepareStatement(sql);
			rs=st.executeQuery();
			while(rs.next()) {
				School s=new School();
				s.setNewsname(rs.getString("newsname"));
				s.setNewsinfo(rs.getString("newsinfo"));
				s.setNewsdate(rs.getDate("newsdate"));				
				//System.out.println(s.getArticlename());
				list.add(s);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			DBUtils.close(rs, st, conn);
		}
		return list;
	}
	public static void main(String[] args) {
		SchoolImpl schoolImpl=new SchoolImpl();
		List<School> list=schoolImpl.show();
		
		
		
	}

}
