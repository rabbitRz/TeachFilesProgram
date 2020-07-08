package daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Utils.DBUtils;
import bean.Project;
import dao.ProjectDAO;

public class ProjectDaoImpl implements ProjectDAO {
	//根据教师id查找信息
	public List<Project> GetAllInfoById(String id) {
		// TODO Auto-generated method stub
		Connection conn=DBUtils.getConnection();
		String sql="select DISTINCT p.*,t.id leader_id,t.name leader_name,o.member1_id member1_id,\r\n" + 
				"CASE when ISNULL(o.member1_id) then \r\n" + 
				"(\" \")\r\n" + 
				"else (SELECT t.name from teacher t where t.id=o.member1_id) END member1_name\r\n" + 
				",o.member2_id member2_id,\r\n" + 
				"CASE when ISNULL(o.member2_id) then \r\n" + 
				"(\" \")\r\n" + 
				"else (SELECT t.name from teacher t where t.id=o.member2_id) END member2_name\r\n" + 
				",o.member3_id member3_id,\r\n" + 
				"CASE when ISNULL(o.member3_id) then \r\n" + 
				"(\" \")\r\n" + 
				"else (SELECT t.name from teacher t where t.id=o.member3_id) END member3_name\r\n" + 
				"from project p,teacher t,\r\n" + 
				"(select pp.* from projectpeople pp where pp.leader_id="+id+" or\r\n" + 
				"pp.member1_id="+id+" or pp.member2_id="+id+" or member3_id="+id+") o \r\n" + 
				"where p.pro_id=o.project_id and t.id=o.leader_id  \r\n" + 
				";\r\n" + 
				"";
		PreparedStatement st=null;
		ResultSet rs=null;
		List<Project> list=new ArrayList<Project>();
		try {
			st=conn.prepareStatement(sql);
			rs=st.executeQuery();
			while (rs.next()) {
				Project pr=new Project();
				pr.setPro_starttime(rs.getString("pro_starttime"));
				pr.setLeader_id(rs.getInt("leader_id"));
				pr.setLeader_name(rs.getString("leader_name"));
				pr.setPro_category(rs.getString("pro_category"));
				pr.setPro_finishtime(rs.getString("pro_finishtime"));
				pr.setPro_id(rs.getInt("pro_id"));
				pr.setPro_identification(rs.getString("pro_identification"));
				pr.setPro_identime(rs.getString("pro_identime"));
				pr.setPro_name(rs.getString("pro_name"));
				pr.setPro_prize(rs.getString("pro_prize"));
				pr.setPro_ranking(rs.getString("pro_ranking"));
				pr.setT1_id(rs.getInt("member1_id"));
				pr.setT1_name(rs.getString("member1_name"));
				pr.setT2_id(rs.getInt("member2_id"));
				pr.setT2_name(rs.getString("member2_name"));
				pr.setT3_id(rs.getInt("member3_id"));
				pr.setT3_name(rs.getString("member3_name"));
				list.add(pr);
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
		ProjectDaoImpl daoImpl=new ProjectDaoImpl();
		List<Project> list=new ArrayList<Project>();
		list=daoImpl.GetAllInfoById("1");
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
	}
}
