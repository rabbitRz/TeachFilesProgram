package daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Utils.DBUtils;
import bean.Paper;
import bean.Parper_PaperPeople;
import dao.PaperDao;

public class PaperDaoImpl implements PaperDao {
	public List<Paper> show() throws RuntimeException {
		Connection conn=DBUtils.getConnection();
		String sql="SELECT p.*,o.* from paper p JOIN (SELECT pp.paper_id,t.name,pp.permission from teacher t JOIN paperpeople pp ON (t.id =pp.people1_id or t.id=pp.people2_id or \r\n" + 
				"t.id=people3_id )) o ON p.paper_id=o.paper_id and o.permission=1;";
		
		PreparedStatement st=null;
		ResultSet rs=null;
		List<Paper> list=new ArrayList<Paper>();
		try {
			st=conn.prepareStatement(sql);
			rs=st.executeQuery();
			while(rs.next()) {
				Paper p=new Paper();
				//Teacher t=new Teacher();
				p.setPaper_name(rs.getString("paper_name"));
				p.setJournal_name(rs.getString("journal_name"));
				p.setRelease_time(rs.getDate("release_time"));
				p.setJournal_level(rs.getString("journal_level"));
				p.setPaper_index(rs.getString("paper_index"));
				p.setPaper_ranking(rs.getString("paper_ranking"));
				//System.out.println(s.getArticlename());
				//String name=t.getName();
				p.setTeachername(rs.getString("name"));
				list.add(p);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			DBUtils.close(rs, st, conn);
		}
		return list;
	}
	//根据教师id获取教师论文信息
	public List<Parper_PaperPeople> getPaperAllInfo(String teacher_id) {
		// TODO Auto-generated method stub
		Connection conn=DBUtils.getConnection();
		String sql="select DISTINCT p.*,o.permission,o.people1_id people1_id,\r\n" + 
				"CASE when ISNULL(o.people1_id) then \r\n" + 
				"(\" \")\r\n" + 
				"else (SELECT t.name from teacher t where t.id=o.people1_id) END people1_name\r\n" + 
				",o.people2_id people2_id,\r\n" + 
				"CASE when ISNULL(o.people2_id) then \r\n" + 
				"(\" \")\r\n" + 
				"else (SELECT t.name from teacher t where t.id=o.people2_id) END people2_name\r\n" + 
				",o.people3_id people3_id,\r\n" + 
				"CASE when ISNULL(o.people3_id) then \r\n" + 
				"(\" \")\r\n" + 
				"else (SELECT t.name from teacher t where t.id=o.people3_id) END people3_name\r\n" + 
				"from paper p,teacher t,\r\n" + 
				"(select pp.* from paperpeople pp where pp.people1_id="+teacher_id+" or\r\n" + 
				"pp.people2_id="+teacher_id+" or pp.people3_id="+teacher_id+") o \r\n" + 
				"where p.paper_id=o.paper_id ";
		PreparedStatement st=null;
		ResultSet rs=null;
		List<Parper_PaperPeople> list=new ArrayList<Parper_PaperPeople>();
		try {
			st=conn.prepareStatement(sql);
			rs=st.executeQuery();
			while (rs.next()) {
				Parper_PaperPeople paperPeople=new Parper_PaperPeople();
				paperPeople.setJournal_level(rs.getString("journal_level"));
				paperPeople.setJournal_name(rs.getString("journal_name"));
				paperPeople.setPaper_id(rs.getInt("paper_id"));
				paperPeople.setPaper_index(rs.getString("paper_index"));
				paperPeople.setPaper_name(rs.getString("paper_name"));
				paperPeople.setPaper_ranking(rs.getString("paper_ranking"));
				paperPeople.setPeople1_id(rs.getInt("people1_id"));
				paperPeople.setPeople2_id(rs.getInt("people2_id"));
				paperPeople.setPeople2_name(rs.getString("people2_name"));
				paperPeople.setPeople3_id(rs.getInt("people3_id"));
				paperPeople.setPeople3_name(rs.getString("people3_name"));
				paperPeople.setPermission(rs.getInt("permission"));
				paperPeople.setProple1_name(rs.getString("people1_name"));
				paperPeople.setRelease_time(rs.getString("release_time"));
				list.add(paperPeople);
				
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
		PaperDaoImpl daoImpl=new PaperDaoImpl();
		List<Parper_PaperPeople> list=new ArrayList<Parper_PaperPeople>();
		list=daoImpl.getPaperAllInfo("1");
		for(int i=0;i<list.size();i++)
			System.out.println(list.get(i));
	}
}
