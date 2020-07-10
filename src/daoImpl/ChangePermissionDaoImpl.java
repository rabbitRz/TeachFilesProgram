package daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.sun.crypto.provider.RSACipher;

import Utils.DBUtils;
import dao.ChangePermissionDao;

public class ChangePermissionDaoImpl implements ChangePermissionDao{
	//插入数据
	public boolean insertChangePermission(String paper_id, String member, String member_per, String application) {
		// TODO Auto-generated method stub
		Connection conn=DBUtils.getConnection();
		Connection conn2=DBUtils.getConnection();
		Connection conn3=DBUtils.getConnection();
		String sql="INSERT into ChangePermission(paper_id,people1_id,people1_name,people1_permission,application)\r\n" + 
				"SELECT pp.paper_id,pp.people1_id,t.name,'"+member_per+"','"+application+"' from teacher t,paperpeople "
				+ "pp where pp.paper_id="+paper_id+" and"
				+ " t.id=pp.people1_id and pp.people1_id="+member + 
				" and NOT EXISTS(SELECT id from ChangePermission where paper_id="+paper_id+")"+
				" and EXISTS(SELECT people2_id from paperpeople where people1_id="+member+");";
		String sql2="INSERT into ChangePermission(paper_id,people2_id,people2_name,people2_permission,application)\r\n" + 
				"SELECT pp.paper_id,pp.people2_id,t.name,'"+member_per+"','"+application+"' from teacher t,paperpeople "
				+ "pp where pp.paper_id="+paper_id+" and t.id=pp.people2_id and pp.people2_id="+member + 
				" and NOT EXISTS(SELECT id from ChangePermission where paper_id="+paper_id+")"+
				" and EXISTS(SELECT people2_id from paperpeople where people2_id="+member+");";
		String sql3="INSERT into ChangePermission(paper_id,people3_id,people3_name,people3_permission,application)\r\n" + 
				"SELECT pp.paper_id,pp.people3_id,t.name,'"+member_per+"','"+application+"' from teacher t,paperpeople pp "
				+ "where pp.paper_id="+paper_id+" and t.id=pp.people3_id and pp.people3_id="+member + 
				" and NOT EXISTS(SELECT id from ChangePermission where paper_id="+paper_id+")"+
				" and EXISTS(SELECT people3_id from paperpeople where people3_id="+member+");";
		PreparedStatement st=null;
		PreparedStatement st2=null;
		PreparedStatement st3=null;
		int flag=0,flag2=0,flag3=0;
		//System.out.println(sql+"\n"+sql2+"\n"+sql3);
		boolean tr=true;
		try {
			st=conn.prepareStatement(sql);
			flag=st.executeUpdate();
			if(flag==0) {
			st2=conn2.prepareStatement(sql2);
			flag2=st2.executeUpdate();
			if(flag2==0) {
			st3=conn3.prepareStatement(sql3);
			flag3=st3.executeUpdate();
			}
			}
			/*System.out.println(flag);
			System.out.println(flag2); 
			System.out.println(flag3);*/
			if(flag==0&&flag2==0&&flag3==0)
				tr=false;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			DBUtils.close(null, st, conn);
			DBUtils.close(null, st2, conn2);
			DBUtils.close(null, st3, conn3);
		}
		return tr;
	}
	public static void main(String[] args) {
		ChangePermissionDaoImpl daoImpl=new ChangePermissionDaoImpl();
		boolean t=daoImpl.insertChangePermission("2", "1", "Y", "公开");
		System.out.println(t);
	}
}
