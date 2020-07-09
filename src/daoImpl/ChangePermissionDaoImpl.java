package daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Utils.DBUtils;
import dao.ChangePermissionDao;

public class ChangePermissionDaoImpl implements ChangePermissionDao{
	//插入数据
	public void insertChangePermission(String paper_id, String member, String member_per, String application) {
		// TODO Auto-generated method stub
		Connection conn=DBUtils.getConnection();
		String sql="INSERT into ChangePermission(paper_id,people1_id,people1_name,people1_permission,application)\r\n" + 
				"SELECT pp.paper_id,pp.people1_id,t.name,'"+member_per+"','"+application+"' from teacher t,paperpeople "
				+ "pp where pp.paper_id="+paper_id+" and"
				+ " t.id=pp.people1_id\r\n" + 
				"and NOT EXISTS(SELECT paper_id from paperpeople where paper_id="+paper_id+" and people1_id="+member+");\r\n" + 
				"\r\n" + 
				"INSERT into ChangePermission(paper_id,people2_id,people2_name,people2_permission,application)\r\n" + 
				"SELECT pp.paper_id,pp.people2_id,t.name,'"+member_per+"','"+application+"' from teacher t,paperpeople "
				+ "pp where pp.paper_id="+paper_id+" and t.id=pp.people2_id\r\n" + 
				"and NOT EXISTS(SELECT paper_id from paperpeople where paper_id="+paper_id+" and people2_id="+member+");\r\n" + 
				"\r\n" + 
				"INSERT into ChangePermission(paper_id,people3_id,people3_name,people3_permission,application)\r\n" + 
				"SELECT pp.paper_id,pp.people3_id,t.name,'"+member_per+"','"+application+"' from teacher t,paperpeople pp "
				+ "where pp.paper_id="+paper_id+" and t.id=pp.people3_id\r\n" + 
				"and NOT EXISTS(SELECT paper_id from paperpeople where paper_id="+paper_id+" and people3_id="+member+");";
		PreparedStatement st=null;
		try {
			st=conn.prepareStatement(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			DBUtils.close(null, st, conn);
		}
	}
	public static void main(String[] args) {
		ChangePermissionDaoImpl daoImpl=new ChangePermissionDaoImpl();
	}
}
