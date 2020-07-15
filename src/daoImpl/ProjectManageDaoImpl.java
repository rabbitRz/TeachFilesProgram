package daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Utils.DBUtils;
import bean.Project;
import dao.ProjectManageDao;

public class ProjectManageDaoImpl implements ProjectManageDao{

	//显示所有项目信息
	public List<Project> showProjects() {
		Connection conn=DBUtils.getConnection();
		String sql="select p.*,pp.* from project p,projectpeople pp where p.pro_id=pp.project_id";
		//System.out.println(sql);
		PreparedStatement st=null;
		ResultSet rs=null;
		List<Project> list=new ArrayList<Project>();
		try {
			st=conn.prepareStatement(sql);
			rs=st.executeQuery();
			while(rs.next()) {
				Project p=new Project();
				p.setPro_id(rs.getInt("pro_id"));
				p.setPro_name(rs.getString("pro_name"));
				p.setPro_category(rs.getString("pro_category"));
				p.setPro_starttime(rs.getString("pro_starttime"));
				p.setPro_finishtime(rs.getString("pro_finishtime"));
				p.setPro_identime(rs.getString("pro_identime"));
				p.setPro_identification(rs.getString("pro_identification"));
				p.setPro_prize(rs.getString("pro_prize"));
				p.setPro_ranking(rs.getString("pro_ranking"));
				p.setLeader_id(rs.getInt("leader_id"));
				p.setT1_id(rs.getInt("member1_id"));
				p.setT2_id(rs.getInt("member2_id"));
				p.setT3_id(rs.getInt("member3_id"));
				list.add(p);  
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("showProjects()运行出错!");
		}finally {
			DBUtils.close(rs, st, conn);
		}
		return list;
	}

	public Project showProjectById(int id) {
		Connection conn=DBUtils.getConnection();
		String sql="select p.*,pp.* from project p,projectpeople pp where p.pro_id=pp.project_id and p.pro_id="+id;
		//System.out.println(sql);
		PreparedStatement st=null;
		ResultSet rs=null;
		Project p=new Project();
		try {
			st=conn.prepareStatement(sql);
			rs=st.executeQuery();
			while(rs.next()) {
				p.setPro_id(rs.getInt("pro_id"));
				p.setPro_name(rs.getString("pro_name"));
				p.setPro_category(rs.getString("pro_category"));
				p.setPro_starttime(rs.getString("pro_starttime"));
				p.setPro_finishtime(rs.getString("pro_finishtime"));
				p.setPro_identime(rs.getString("pro_identime"));
				p.setPro_identification(rs.getString("pro_identification"));
				p.setPro_prize(rs.getString("pro_prize"));
				p.setPro_ranking(rs.getString("pro_ranking"));
				p.setLeader_id(rs.getInt("leader_id"));
				p.setT1_id(rs.getInt("member1_id"));
				p.setT2_id(rs.getInt("member2_id"));
				p.setT3_id(rs.getInt("member3_id"));
							
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("showProjectById(int id)运行出错!");
		}finally {
			DBUtils.close(rs, st, conn);
		}
		return p;
	}

	public boolean projectUpdate(Project project) {
		Connection conn=DBUtils.getConnection();
		PreparedStatement st=null;
		ResultSet rs=null;
		String sql = "Update project,projectpeople set" +
					" pro_name = '" + project.getPro_name() + "', " +
					" pro_category = '" + project.getPro_category() + "', " +
					" pro_starttime = '" + project.getPro_starttime() + "', " +
					" pro_finishtime = '" + project.getPro_finishtime() + "', " +
					" pro_identime = '" + project.getPro_identime() + "', " +
					" pro_identification = '" + project.getPro_identification() + "', " +
				    " pro_prize = '" + project.getPro_prize() + "', " +
					" pro_ranking = '" + project.getPro_ranking() + "', " +
					" leader_id = " + project.getLeader_id() + ", " +
					" member1_id = " + project.getT1_id() + " ," +
					" member1_id = " + project.getT2_id() + ", " +
					" member1_id = " + project.getT3_id() +
					" where project.pro_id=projectpeople.project_id\r\n"
					+ "and pro_id = " + project.getPro_id();
		System.out.println(sql);
	int i = 0;
	try{	
		st = conn.prepareStatement(sql);
		i  = st.executeUpdate();
		}catch(Exception e){
		e.printStackTrace();
		System.out.println("projectUpdate(Project project)异常");
		}finally{			
			DBUtils.close(rs, st, conn);			
		}
	if(i==0){
	return false;
	}else{
		return true;
	}
	}

	public boolean projectAdd(Project project) {
		Connection conn=DBUtils.getConnection();
		PreparedStatement st=null;
		ResultSet rs=null;
		//System.out.println(sql);
		String sql = "insert into project(pro_name,pro_category,pro_starttime,pro_finishtime,pro_identime,pro_identification,pro_prize,pro_ranking)" +
				"values(?,?,?,?,?,?,?,?)"; 
		int i = 0;
		try{	
			st = conn.prepareStatement(sql);
			st.setString(1, project.getPro_name());
			st.setString(2, project.getPro_category());
			st.setString(3, project.getPro_starttime());
			st.setString(4, project.getPro_finishtime());
			st.setString(5, project.getPro_identime());
			st.setString(6, project.getPro_identification());
			st.setString(7, project.getPro_prize());
			st.setString(8, project.getPro_ranking());
		
			
			i  = st.executeUpdate();
 		}catch(Exception e){
			e.printStackTrace();
			System.out.println("projectAdd(Project project)异常");
		}finally{			
			DBUtils.close(rs, st, conn);			
		}
		if(i==0){
		return false;
		}else{
			return true;
		}
	}

	public List<Project> showNotProjects() {
		Connection conn=DBUtils.getConnection();
		String sql="select p.* \r\n" + 
				"from project p\r\n" + 
				"where p.pro_id not in\r\n" + 
				"(select p.pro_id from project p,projectpeople pp where p.pro_id=pp.project_id)";
		//System.out.println(sql);
		PreparedStatement st=null;
		ResultSet rs=null;
		List<Project> list=new ArrayList<Project>();
		try {
			st=conn.prepareStatement(sql);
			rs=st.executeQuery();
			while(rs.next()) {
				Project p=new Project();
				p.setPro_id(rs.getInt("pro_id"));
				p.setPro_name(rs.getString("pro_name"));
				p.setPro_category(rs.getString("pro_category"));
				p.setPro_starttime(rs.getString("pro_starttime"));
				p.setPro_finishtime(rs.getString("pro_finishtime"));
				p.setPro_identime(rs.getString("pro_identime"));
				p.setPro_identification(rs.getString("pro_identification"));
				p.setPro_prize(rs.getString("pro_prize"));
				p.setPro_ranking(rs.getString("pro_ranking"));
				//p.setLeader_id(rs.getInt("leader_id"));
				//p.setT1_id(rs.getInt("member1_id"));
				//p.setT2_id(rs.getInt("member2_id"));
				//p.setT3_id(rs.getInt("member3_id"));
				list.add(p);  
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("showProjects()运行出错!");
		}finally {
			DBUtils.close(rs, st, conn);
		}
		return list;
	}

	public Project showProOnlyById(int id) {
		Connection conn=DBUtils.getConnection();
		String sql="select p.* from project p where p.pro_id="+id;
		//System.out.println(sql);
		PreparedStatement st=null;
		ResultSet rs=null;
		Project p=new Project();
		try {
			st=conn.prepareStatement(sql);
			rs=st.executeQuery();
			while(rs.next()) {
				p.setPro_id(rs.getInt("pro_id"));
				p.setPro_name(rs.getString("pro_name"));
				p.setPro_category(rs.getString("pro_category"));
				p.setPro_starttime(rs.getString("pro_starttime"));
				p.setPro_finishtime(rs.getString("pro_finishtime"));
				p.setPro_identime(rs.getString("pro_identime"));
				p.setPro_identification(rs.getString("pro_identification"));
				p.setPro_prize(rs.getString("pro_prize"));
				p.setPro_ranking(rs.getString("pro_ranking"));
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("showProOnlyById(int id)运行出错!");
		}finally {
			DBUtils.close(rs, st, conn);
		}
		return p;
	}

	public boolean projectPeopleAdd(Project project) {
		Connection conn=DBUtils.getConnection();
		PreparedStatement st=null;
		ResultSet rs=null;
		//System.out.println(sql);
		String sql = "insert into projectpeople(leader_id,member1_id,member2_id,member3_id,project_id)" +
				"values(?,?,?,?,?)"; 
		int i = 0;
		try{	
			st = conn.prepareStatement(sql);
			st.setInt(1, project.getLeader_id());
			st.setInt(2, project.getT1_id());
			st.setInt(3, project.getT2_id());
			st.setInt(4, project.getT3_id());
			st.setInt(5, project.getPro_id());		
			
			i  = st.executeUpdate();
 		}catch(Exception e){
			e.printStackTrace();
			System.out.println("projectpeopleAdd(Project project)异常");
		}finally{			
			DBUtils.close(rs, st, conn);			
		}
		if(i==0){
		return false;
		}else{
			return true;
		}
	}

	public boolean projectDelete(int id) {
		Connection conn=DBUtils.getConnection();
		String sql="delete p,pp \r\n" + 
				"from project p,projectpeople pp \r\n" + 
				"where p.pro_id=pp.project_id and p.pro_id ="+id;
		PreparedStatement st=null;
		ResultSet rs=null;
		int shan = 0;		
		try{	
			st = conn.prepareStatement(sql);
			shan = st.executeUpdate();				
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("projectDelete(int id)异常");
		}finally{			
			DBUtils.close(rs, st, conn);			
		}
		
		if(shan > 0){
			return true;
		}else{
			return false;
		}
	}

}
