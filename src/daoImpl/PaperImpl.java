package daoImpl;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Utils.DBUtils;
import bean.Application;
import bean.Paper;
import bean.PaperPeople;
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

	public List<Paper> showall() throws RuntimeException {
		Connection conn=DBUtils.getConnection();
		String sql="select * from paper,paperpeople where paper.paper_id=paperpeople.paper_id and permission=1;";
		
		PreparedStatement st=null;
		ResultSet rs=null;
		List<Paper> list=new ArrayList<Paper>();
		try {
			st=conn.prepareStatement(sql);
			rs=st.executeQuery();
			while(rs.next()) {
				Paper p=new Paper();
				//Teacher t=new Teacher();
				p.setPaper_id(rs.getInt("paper_id"));
				p.setPaper_name(rs.getString("paper_name"));
				p.setJournal_name(rs.getString("journal_name"));
				p.setRelease_time(rs.getDate("release_time"));
				p.setJournal_level(rs.getString("journal_level"));
				p.setPaper_index(rs.getString("paper_index"));
				p.setPaper_ranking(rs.getString("paper_ranking"));
				//System.out.println(s.getArticlename());
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

	public boolean updatepaper(Paper paper,int id) throws RuntimeException {
		Connection conn=DBUtils.getConnection();
		PreparedStatement st=null;
		ResultSet rs=null;
		String sql = "Update paper set" +
				" paper_name = '" + paper.getPaper_name() + "', " +
				" journal_name = '" + paper.getJournal_name() + "', " +
				" release_time = '" + paper.getRelease_time() + "', " +
				" journal_level = '" + paper.getJournal_level()+ "', " +
				" paper_index = '" + paper.getPaper_index() + "', " +
				" paper_ranking = '" + paper.getPaper_ranking() + "' " +
				" where paper_id="+id;			
		//System.out.println(sql);
	int i = 0;
	try{	
		st = conn.prepareStatement(sql);
		i  = st.executeUpdate();
		}catch(Exception e){
		e.printStackTrace();
		System.out.println("PaperUpdate异常");
		}finally{			
			DBUtils.close(rs, st, conn);			
		}
	if(i==0){
	    return false;
	}else{
		return true;
	}
	}
	  public static void main(String[] args) {
			Paper paper=new Paper();
			IPaper daoIPaper=new PaperImpl();
			//daoIPaper.updatepaper("论计算机", "兰州理工大学校报", null, "学科论文", "被SCI检索到", "di", 1);
			//System.out.println(paper.getPaper_id());
			//System.out.println("xiug");
		}
	public boolean deletepaper(int id) throws RuntimeException {
		boolean flag=false;
		Connection conn=DBUtils.getConnection();
		PreparedStatement st = null;
		ResultSet rs = null;	
		String sql = "delete from paperpeople where paper_id ="+id;
		int shan=0;
		try {
				st=conn.prepareStatement(sql);
				shan=st.executeUpdate();
				
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
			finally {
				DBUtils.close(null, st, conn);		
		}
		if(shan>0) {
			flag=true;
		}
		return flag;
	}

	public boolean deleteafterpaper(int id) throws RuntimeException {
		boolean flag=false;
		Connection conn=DBUtils.getConnection();
		PreparedStatement st = null;
		ResultSet rs = null;	
		String sql = "delete from paper where paper_id ="+id;
		int shan=0;
		try {
				st=conn.prepareStatement(sql);
				shan=st.executeUpdate();
				
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
			finally {
				DBUtils.close(null, st, conn);		
		}
		if(shan>0) {
			flag=true;
		}
		return flag;
	}

	public boolean insertpaper(Paper paper) throws RuntimeException {
		boolean flag=false;
		Connection conn=DBUtils.getConnection();
		String sql="insert into paper(paper_name,journal_name,release_time,journal_level,paper_index,paper_ranking) values(?,?,?,?,?,?);";		
		PreparedStatement st=null;
		int res=0;
		try {
			st=conn.prepareStatement(sql);		
			st.setString(1,paper.getPaper_name());
			st.setString(2,paper.getJournal_name());
			st.setDate(3,(Date)paper.getRelease_time());
			st.setString(4, paper.getJournal_level());
			st.setString(5, paper.getPaper_index());
			st.setString(6, paper.getPaper_ranking());	
			res=st.executeUpdate();		
			if(res==1)
				flag=true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			DBUtils.close(null, st, conn);
		}
		return flag;
	}

	public boolean insertpaperpeople(PaperPeople paperPeople) throws RuntimeException {
		boolean flag=false;
		Connection conn=DBUtils.getConnection();
		String sql="insert into paperpeople(paper_id,people1_id,people2_id,people3_id,permission) values(?,?,?,?,?)";		
		PreparedStatement st=null;
		int res=0;
		try {
			st=conn.prepareStatement(sql);		
			st.setInt(1,paperPeople.getPaper_id());
			st.setInt(2,paperPeople.getPeople1_id());
			st.setInt(3,paperPeople.getPeople2_id());
			st.setInt(4,paperPeople.getPeople3_id());
			st.setInt(5,0);
			res=st.executeUpdate();		
			if(res==1)
				flag=true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			DBUtils.close(null, st, conn);
		}
		return flag;
	}

	public Paper findnewid() throws RuntimeException {
		Connection conn=DBUtils.getConnection();
		String sql="select Max(paper_id) as paper_id from paper";
		PreparedStatement st=null;
		ResultSet rs=null;
		Paper p=new Paper();
        try {
        	st=conn.prepareStatement(sql);
			rs=st.executeQuery();
			while(rs.next()) {									
				p.setPaper_id(rs.getInt("paper_id"));				
		    }
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtils.close(rs, st, conn);
		}
		return p;
	}
 

public Paper findbyid(int id) throws RuntimeException {
	Connection conn=DBUtils.getConnection();
	String sql="select * from paper where paper_id="+id;
	PreparedStatement st=null;
	ResultSet rs=null;
	Paper p=new Paper();
	try {
     	st=conn.prepareStatement(sql);
	    rs=st.executeQuery();
	    while(rs.next()) {									
		    p.setPaper_id(rs.getInt("paper_id"));
		    p.setPaper_name(rs.getString("paper_name"));
		    p.setJournal_name(rs.getString("journal_name"));
		    p.setRelease_time(rs.getDate("release_time"));
		    p.setJournal_level(rs.getString("journal_level"));
		    p.setPaper_index(rs.getString("paper_index"));
		    p.setPaper_ranking(rs.getString("paper_ranking"));
		    
	}
		
    }catch (SQLException e) {
		e.printStackTrace();
	}finally {
		DBUtils.close(rs, st, conn);
	}
	return p;
}

public List<PaperPeople> showpeople() throws RuntimeException {
	Connection conn=DBUtils.getConnection();
	String sql="select * from paperpeople ";
	PreparedStatement st=null;
	ResultSet rs=null;
	List<PaperPeople> list=new ArrayList<PaperPeople>() ;
	try {
     	st=conn.prepareStatement(sql);
	    rs=st.executeQuery();
	    while(rs.next()) {	
	    	PaperPeople p=new PaperPeople();
		    p.setPaper_id(rs.getInt("paper_id"));
		    p.setPeople1_id(rs.getInt("people1_id"));
		    p.setPeople2_id(rs.getInt("people2_id"));
		    p.setPeople3_id(rs.getInt("people3_id"));
		    p.setPermission(rs.getInt("permission"));
		    list.add(p);
	}
		
    }catch (SQLException e) {
		e.printStackTrace();
	}finally {
		DBUtils.close(rs, st, conn);
	}
	return list;
}

public List<Teacher> showteacher() throws RuntimeException {
	Connection conn=DBUtils.getConnection();
	String sql="select * from teacher ";
	PreparedStatement st=null;
	ResultSet rs=null;
	List<Teacher> list=new ArrayList<Teacher>() ;
	try {
     	st=conn.prepareStatement(sql);
	    rs=st.executeQuery();
	    while(rs.next()) {	
	    	Teacher p=new Teacher();
		    p.setId(rs.getInt("id"));
		    list.add(p);
	}
		
    }catch (SQLException e) {
		e.printStackTrace();
	}finally {
		DBUtils.close(rs, st, conn);
	}
	return list;
}

public List<Paper> adminshowall() throws RuntimeException {
	Connection conn=DBUtils.getConnection();
	String sql="select * from paper;";
	
	PreparedStatement st=null;
	ResultSet rs=null;
	List<Paper> list=new ArrayList<Paper>();
	try {
		st=conn.prepareStatement(sql);
		rs=st.executeQuery();
		while(rs.next()) {
			Paper p=new Paper();
			//Teacher t=new Teacher();
			p.setPaper_id(rs.getInt("paper_id"));
			p.setPaper_name(rs.getString("paper_name"));
			p.setJournal_name(rs.getString("journal_name"));
			p.setRelease_time(rs.getDate("release_time"));
			p.setJournal_level(rs.getString("journal_level"));
			p.setPaper_index(rs.getString("paper_index"));
			p.setPaper_ranking(rs.getString("paper_ranking"));
			//System.out.println(s.getArticlename());
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
