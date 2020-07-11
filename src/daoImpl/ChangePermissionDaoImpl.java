package daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.sun.crypto.provider.RSACipher;

import Utils.DBUtils;
import bean.ChangePermission;
import dao.ChangePermissionDao;

public class ChangePermissionDaoImpl implements ChangePermissionDao{
	//插入数据
	public boolean insertChangePermission(String paper_id, String member, String member_per, String application) {
		// TODO Auto-generated method stub
		Connection conn=DBUtils.getConnection();
		Connection conn2=DBUtils.getConnection();
		Connection conn3=DBUtils.getConnection();
		String sql="INSERT into ChangePermission(paper_id,people1_id,people1_name,people2_id,people2_name,people3_id,people3_name,people1_permission,application)\r\n" + 
				"SELECT pp.paper_id,pp.people1_id,t.name,pp.people2_id,\r\n" + 
				"case when ISNULL(pp.people2_id)  THEN\r\n" + 
				"('')\r\n" + 
				"ELSE \r\n" + 
				"(SELECT t2.name FROM teacher t2 WHERE t2.id=pp.people2_id)\r\n" + 
				"END \r\n" + 
				",pp.people3_id,\r\n" + 
				"case when ISNULL(pp.people3_id)  THEN\r\n" + 
				"('')\r\n" + 
				"ELSE  \r\n" + 
				"(SELECT t3.name FROM teacher t3 WHERE t3.id=pp.people3_id)\r\n" + 
				"END\r\n" + 
				",'"+member_per+"','"+application+"' from \r\n" + 
				"teacher t,paperpeople pp \r\n" + 
				"where pp.paper_id="+paper_id+" and t.id=pp.people1_id and pp.people1_id="+member+" and \r\n" + 
				"NOT EXISTS(SELECT id from ChangePermission where paper_id="+paper_id+") \r\n" + 
				"and EXISTS(SELECT people1_id from paperpeople where people1_id="+member+");";
		String sql2="INSERT into ChangePermission(paper_id,people1_id,people1_name,people2_id,people2_name,people3_id,people3_name,people2_permission,application)\r\n" + 
				"SELECT pp.paper_id,pp.people1_id,t.name,pp.people2_id,\r\n" + 
				"case when ISNULL(pp.people2_id)  THEN\r\n" + 
				"('')\r\n" + 
				"ELSE \r\n" + 
				"(SELECT t2.name FROM teacher t2 WHERE t2.id=pp.people2_id)\r\n" + 
				"END \r\n" + 
				",pp.people3_id,\r\n" + 
				"case when ISNULL(pp.people3_id)  THEN\r\n" + 
				"('')\r\n" + 
				"ELSE  \r\n" + 
				"(SELECT t3.name FROM teacher t3 WHERE t3.id=pp.people3_id)\r\n" + 
				"END\r\n" + 
				",'"+member_per+"','"+application+"' from \r\n" + 
				"teacher t,paperpeople pp \r\n" + 
				"where pp.paper_id="+paper_id+" and t.id=pp.people1_id and pp.people2_id="+member+" and \r\n" + 
				"NOT EXISTS(SELECT id from ChangePermission where paper_id="+paper_id+") \r\n" + 
				"and EXISTS(SELECT people2_id from paperpeople where people2_id="+member+");";
		String sql3="INSERT into ChangePermission(paper_id,people1_id,people1_name,people2_id,people2_name,people3_id,people3_name,people3_permission,application)\r\n" + 
				"SELECT pp.paper_id,pp.people1_id,t.name,pp.people2_id,\r\n" + 
				"case when ISNULL(pp.people2_id)  THEN\r\n" + 
				"('')\r\n" + 
				"ELSE \r\n" + 
				"(SELECT t2.name FROM teacher t2 WHERE t2.id=pp.people2_id)\r\n" + 
				"END \r\n" + 
				",pp.people3_id,\r\n" + 
				"case when ISNULL(pp.people3_id)  THEN\r\n" + 
				"('')\r\n" + 
				"ELSE  \r\n" + 
				"(SELECT t3.name FROM teacher t3 WHERE t3.id=pp.people3_id)\r\n" + 
				"END\r\n" + 
				",'"+member_per+"','"+application+"' from \r\n" + 
				"teacher t,paperpeople pp \r\n" + 
				"where pp.paper_id="+paper_id+" and t.id=pp.people1_id and pp.people3_id="+member+" and \r\n" + 
				"NOT EXISTS(SELECT id from ChangePermission where paper_id="+paper_id+") \r\n" + 
				"and EXISTS(SELECT people3_id from paperpeople where people3_id="+member+");";
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
	//查看该成员是否有申请未同意
	public List<ChangePermission> getDIsAgree(String teacher_id) {
		// TODO Auto-generated method stub
		Connection conn=DBUtils.getConnection();
		String sql="SELECT * from ChangePermission where people1_id="+teacher_id+" or people2_id="+teacher_id + 
				" or people3_id="+teacher_id;
		//System.out.println(sql);
		PreparedStatement st=null;
		ResultSet rs=null;
		List<ChangePermission> list=new ArrayList<ChangePermission>();
		try {
			st=conn.prepareStatement(sql);
			rs=st.executeQuery();
			while (rs.next()) {
				boolean flag=false;
				int t=rs.getInt("people1_id");
				if(t==Integer.parseInt(teacher_id)) {
					if(rs.getString("people1_permission")==""||rs.getString("people1_permission")==null) {
						flag=true;
					}
				}
				t=rs.getInt("people2_id");
				if(t==Integer.parseInt(teacher_id)) {
					if(rs.getString("people2_permission")==""||rs.getString("people2_permission")==null) {
						flag=true;
					}
				}
				t=rs.getInt("people3_id");
				if(t==Integer.parseInt(teacher_id)) {
					if(rs.getString("people3_permission")==""||rs.getString("people3_permission")==null) {
						flag=true;
					}
				}
				if(flag) {
					ChangePermission permission=new ChangePermission();
					permission.setApplication(rs.getString("application"));
					permission.setId(rs.getInt("id"));
					permission.setParper_id(rs.getInt("paper_id"));
					permission.setPeople1_id(rs.getInt("people1_id"));
					permission.setPeople1_name(rs.getString("people1_name"));
					permission.setPeople1_permission(rs.getString("people1_permission"));
					permission.setPeople2_id(rs.getInt("people2_id"));
					permission.setPeople2_name(rs.getString("people2_name"));
					permission.setPeople2_permission(rs.getString("people2_permission"));
					permission.setPeople3_id(rs.getInt("people3_id"));
					permission.setPeople3_name(rs.getString("people3_name"));
					permission.setPeople3_permission(rs.getString("people3_permission"));
					list.add(permission);
				}
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
		ChangePermissionDaoImpl daoImpl=new ChangePermissionDaoImpl();
		/*boolean t=daoImpl.insertChangePermission("2", "1", "Y", "公开");
		System.out.println(t);*/
		List<ChangePermission> list=new ArrayList<ChangePermission>();
		list=daoImpl.getDIsAgree("2");
		System.out.println("集合长度"+list.size()+"\n");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}
