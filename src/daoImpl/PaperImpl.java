package daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Utils.DBUtils;
import bean.Paper;
import bean.School;
import bean.Teacher;
import dao.IPaper;

public class PaperImpl implements IPaper {

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

}
