package daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sound.midi.Soundbank;

import com.sun.crypto.provider.RSACipher;

import Utils.DBUtils;
import bean.ChangePermission;
import bean.tip;
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
				" or people3_id="+teacher_id+" and ISNULL(result)";
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
	//更新result
	public boolean UpdateRes(String paper_id, String result) {
		// TODO Auto-generated method stub
		Connection conn=DBUtils.getConnection();
		String sql="update ChangePermission set result='"+result+"' where paper_id="+paper_id;
		PreparedStatement st=null;
		boolean flag=false;
		try {
			st=conn.prepareStatement(sql);
			int t=st.executeUpdate();
			if(t==1)
				flag=true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			DBUtils.close(null, st, conn);
		}
		return flag;
	}
	//插入个人意愿
	public boolean insertPer(String paper_id, String teacher_id, String people_permission) {
		// TODO Auto-generated method stub
		Connection conn=DBUtils.getConnection();
		Connection conn1=DBUtils.getConnection();
		String sql="select * from ChangePermission where paper_id="+paper_id;
		String sql1="";
		PreparedStatement st=null,st1=null;
		ResultSet rs=null;
		boolean flag=false;
		try {
			st=conn.prepareStatement(sql);
			rs=st.executeQuery();
			if(rs.next()) {
				int t=rs.getInt("people1_id");
				if(t==Integer.parseInt(teacher_id)) {
					if(rs.getString("people1_permission")==""||rs.getString("people1_permission")==null) {
						sql1="update ChangePermission set people1_permission='"+people_permission+"' where paper_id="+paper_id;
						st1=conn1.prepareStatement(sql1);
						int ii=st1.executeUpdate();
						if(ii==1)
							flag=true;
					}
				}
				t=rs.getInt("people2_id");
				if(t==Integer.parseInt(teacher_id)) {
					if(rs.getString("people2_permission")==""||rs.getString("people2_permission")==null) {
						sql1="update ChangePermission set people2_permission='"+people_permission+"' where paper_id="+paper_id;
						st1=conn1.prepareStatement(sql1);
						int ii=st1.executeUpdate();
						if(ii==1)
							flag=true;
					}
				}
				t=rs.getInt("people3_id");
				if(t==Integer.parseInt(teacher_id)) {
					if(rs.getString("people3_permission")==""||rs.getString("people3_permission")==null) {
						sql1="update ChangePermission set people3_permission='"+people_permission+"' where paper_id="+paper_id;
						st1=conn1.prepareStatement(sql1);
						int ii=st1.executeUpdate();
						if(ii==1)
							flag=true;
					}
				}
			}
			System.out.println(sql);
			System.out.println(sql1);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			DBUtils.close(rs, st, conn);
			DBUtils.close(null, st1, conn1);
		}
		return flag;
	}
	//若条件符合，更新result为'Y'
	public boolean UpdateResY(String paper_id, String result) {
		// TODO Auto-generated method stub
		Connection conn=DBUtils.getConnection();
		String sql="update ChangePermission set result='Y' where paper_id="+paper_id + 
				" and " + 
				"case WHEN ISNULL(people1_id) THEN " + 
				"ISNULL(people1_permission) " + 
				"ELSE " + 
				"people1_permission='Y' " + 
				"END " + 
				" and " + 
				"case WHEN ISNULL(people2_id) THEN " + 
				"ISNULL(people2_permission) " + 
				"ELSE " + 
				"people2_permission=\"Y\"\r\n" + 
				"END\r\n" + 
				" and \r\n" + 
				"case WHEN ISNULL(people3_id) THEN\r\n" + 
				"ISNULL(people3_permission)\r\n" + 
				"ELSE\r\n" + 
				"people3_permission=\"Y\"\r\n" + 
				"END\r\n" ;
		System.out.println(sql);
		PreparedStatement st=null;
		boolean flag=false;
		try {
			st=conn.prepareStatement(sql);
			int t=st.executeUpdate();
			if(t==1)
				flag=true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			DBUtils.close(null, st, conn);
		}
		return flag;
	}
	//查看所有result不为空的信息，并将其插入到tip表中
	public boolean insertTip() {
			// TODO Auto-generated method stub
		Connection conn=DBUtils.getConnection();
		String sql="insert into tip(paper_id,people1_id,people2_id,people3_id,info)  \r\n" + 
				"(SELECT paper_id,people1_id,people2_id,people3_id,result from ChangePermission WHERE NOT ISNULL(result)) ";
		PreparedStatement st=null;
		boolean flag=false;
		try {
			st=conn.prepareStatement(sql);
			int t=st.executeUpdate();
			if(t==1)
				flag=true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			DBUtils.close(null, st, conn);
		}
		return flag;
	}
	//删除result不为空的信息
	public boolean delete() {
		// TODO Auto-generated method stub
		Connection conn=DBUtils.getConnection();
		String sql="delete from ChangePermission where NOT ISNULL(result)";
		PreparedStatement st=null;
		boolean flag=false;
		try {
			st=conn.prepareStatement(sql);
			int t=st.executeUpdate();
			if(t==1)
				flag=true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			DBUtils.close(null, st, conn);
		}
		return flag;
	}
	//查询tip中需要提示给个人的信息
	public List<tip> getTip(String teacher_id) {
		// TODO Auto-generated method stub
		Connection conn=DBUtils.getConnection();
		String sql="SELECT * from tip where people1_id="+teacher_id+" "
				+ "or people2_id="+teacher_id+" or people3_id="+teacher_id;
		//System.out.println("tip:"+sql);
		PreparedStatement st=null;
		ResultSet rs=null;
		List<tip> list=new ArrayList<tip>();
		try {
			st=conn.prepareStatement(sql);
			rs=st.executeQuery();
			while (rs.next()) {
				int t1=rs.getInt("people1_id");
				if(t1==Integer.parseInt(teacher_id)) {
					if(rs.getString("people1_res")==""||rs.getString("people1_res")==null) {
						tip t=new tip();
						t.setInfo(rs.getString("info"));
						t.setPaper_id(rs.getInt("paper_id"));
						t.setPeople1_id(rs.getInt("people1_id"));
						t.setPeople1_res(rs.getString("people1_res"));
						t.setPeople2_id(rs.getInt("people2_id"));
						t.setPeople2_res(rs.getString("people2_res"));
						t.setPeople3_id(rs.getInt("people3_id"));
						t.setPeople3_res(rs.getString("people3_res"));
						list.add(t);
					}
				}
				t1=rs.getInt("people2_id");
				if(t1==Integer.parseInt(teacher_id)) {
					if(rs.getString("people2_res")==""||rs.getString("people2_res")==null) {
						tip t=new tip();
						t.setInfo(rs.getString("info"));
						t.setPaper_id(rs.getInt("paper_id"));
						t.setPeople1_id(rs.getInt("people1_id"));
						t.setPeople1_res(rs.getString("people1_res"));
						t.setPeople2_id(rs.getInt("people2_id"));
						t.setPeople2_res(rs.getString("people2_res"));
						t.setPeople3_id(rs.getInt("people3_id"));
						t.setPeople3_res(rs.getString("people3_res"));
						list.add(t);	
					}
				}
				t1=rs.getInt("people3_id");
				if(t1==Integer.parseInt(teacher_id)) {
					if(rs.getString("people3_permission")==""||rs.getString("people3_permission")==null) {
						tip t=new tip();
						t.setInfo(rs.getString("info"));
						t.setPaper_id(rs.getInt("paper_id"));
						t.setPeople1_id(rs.getInt("people1_id"));
						t.setPeople1_res(rs.getString("people1_res"));
						t.setPeople2_id(rs.getInt("people2_id"));
						t.setPeople2_res(rs.getString("people2_res"));
						t.setPeople3_id(rs.getInt("people3_id"));
						t.setPeople3_res(rs.getString("people3_res"));
						list.add(t);	
					}
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
	//更改论文状态
	public boolean updatePaper() {
		// TODO Auto-generated method stub
		Connection conn=DBUtils.getConnection();
		Connection conn1=DBUtils.getConnection();
		String sql="SELECT paper_id,application from ChangePermission WHERE result='Y'";
		String sql1="update paperpeople set permission=";
		//System.out.println("tip:"+sql);
		PreparedStatement st=null;
		ResultSet rs=null;
		PreparedStatement st1=null;
		boolean flag=false;
		try {
			st=conn.prepareStatement(sql);
			rs=st.executeQuery();
			while (rs.next()) {
				if(rs.getString("application").equals("公开")) {
					sql1=sql1+"1 where paper_id="+rs.getInt("paper_id");
				}
				else if(rs.getString("application").equals("私有")) {
					sql1=sql1+"0 where paper_id="+rs.getInt("paper_id");
				}
				System.out.println("权限更新："+rs.getString("application")+" \n"+sql1);
				st1=conn1.prepareStatement(sql1);
				int t=st1.executeUpdate();
				if(t==1)
					flag=true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			DBUtils.close(rs, st, conn);
			DBUtils.close(null, st1, conn1);
		}
		
		return flag;
	}
	//在tip表中个人意见
	public boolean insertTipPer(String paper_id,String teacher_id,String res) {
		Connection conn=DBUtils.getConnection();
		Connection conn1=DBUtils.getConnection();
		String sql="select * from tip where paper_id="+paper_id;
		String sql1="";
		PreparedStatement st=null,st1=null;
		ResultSet rs=null;
		boolean flag=false;
		try {
			st=conn.prepareStatement(sql);
			rs=st.executeQuery();
			if(rs.next()) {
				int t=rs.getInt("people1_id");
				if(t==Integer.parseInt(teacher_id)) {
					if(rs.getString("people1_res")==""||rs.getString("people1_res")==null) {
						sql1="update tip set people1_res='"+res+"' where paper_id="+paper_id;
						st1=conn1.prepareStatement(sql1);
						int ii=st1.executeUpdate();
						if(ii==1)
							flag=true;
					}
				}
				t=rs.getInt("people2_id");
				if(t==Integer.parseInt(teacher_id)) {
					if(rs.getString("people2_res")==""||rs.getString("people2_res")==null) {
						sql1="update tip set people2_res='"+res+"' where paper_id="+paper_id;
						st1=conn1.prepareStatement(sql1);
						int ii=st1.executeUpdate();
						if(ii==1)
							flag=true;
					}
				}
				t=rs.getInt("people3_id");
				if(t==Integer.parseInt(teacher_id)) {
					if(rs.getString("people3_res")==""||rs.getString("people3_res")==null) {
						sql1="update tip set people3_res='"+res+"' where paper_id="+paper_id;
						st1=conn1.prepareStatement(sql1);
						int ii=st1.executeUpdate();
						if(ii==1)
							flag=true;
					}
				}
			}
			System.out.println(sql);
			System.out.println(sql1);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			DBUtils.close(rs, st, conn);
			DBUtils.close(null, st1, conn1);
		}
		return flag;
	}
	public boolean deleTip(String paper_id) {
		// TODO Auto-generated method stub
		Connection conn=DBUtils.getConnection();
		Connection conn1=DBUtils.getConnection();
		String sql="select * from tip where paper_id="+paper_id;
		String sql1="delete from tip where  paper_id="+paper_id;;
		PreparedStatement st=null,st1=null;
		ResultSet rs=null;
		boolean flag1=false;
		boolean flag2=false;
		boolean flag3=false;
		boolean flag=false;
		try {
			st=conn.prepareStatement(sql);
			rs=st.executeQuery();
			if(rs.next()) {
				int t=rs.getInt("people1_id");
				if(t!=0) {
					if(rs.getString("people1_res")==""||rs.getString("people1_res")==null) {
						flag1=true;
					}
				}
				
				t=rs.getInt("people2_id");
				if(t!=0) {
					if(rs.getString("people2_res")==""||rs.getString("people2_res")==null) {
						flag2=true;
					}
				}
				t=rs.getInt("people3_id");
				if(t!=0) {
					if(rs.getString("people3_res")==""||rs.getString("people3_res")==null) {
						flag3=true;
					}
				}
				System.out.println("删除flag:"+flag1+" "+flag2+" "+flag3);
				if(!flag1&&!flag2&&!flag3) {
					st1=conn1.prepareStatement(sql1);
					int t8=st1.executeUpdate();
					if(t8==1)
						flag=true;
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			DBUtils.close(rs, st, conn);
			DBUtils.close(null, st1, conn1);
		}
		return flag;
		
	}
	//删除所有满足条件的tip
	public boolean deleAllTip() {
		// TODO Auto-generated method stub
		Connection conn=DBUtils.getConnection();
		Connection conn1=DBUtils.getConnection();
		String sql="select * from tip";
		String sql1="delete from tip where  paper_id=";
		PreparedStatement st=null,st1=null;
		ResultSet rs=null;
		boolean flag1=false;
		boolean flag2=false;
		boolean flag3=false;
		boolean flag=false;
		try {
			st=conn.prepareStatement(sql);
			rs=st.executeQuery();
			while(rs.next()) {
				int t=rs.getInt("people1_id");
				if(t!=0) {
					if(rs.getString("people1_res")==""||rs.getString("people1_res")==null) {
						flag1=true;
					}
				}
				t=rs.getInt("people2_id");
				if(t!=0) {
					if(rs.getString("people2_res")==""||rs.getString("people2_res")==null) {
						flag2=true;
					}
				}
				t=rs.getInt("people3_id");
				if(t!=0) {
					if(rs.getString("people3_res")==""||rs.getString("people3_res")==null) {
						flag3=true;
					}
				}
				//System.out.println("删除flag:"+flag1+" "+flag2+" "+flag3);
				if(!flag1&&!flag2&&!flag3) {
					st1=conn1.prepareStatement(sql1+rs.getInt("paper_id"));
					int t8=st1.executeUpdate();
					if(t8==1)
						flag=true;
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			DBUtils.close(rs, st, conn);
			DBUtils.close(null, st1, conn1);
		}
		return flag;
		
	}
	
	public static void main(String[] args) {
		ChangePermissionDaoImpl daoImpl=new ChangePermissionDaoImpl();
		/*boolean t=daoImpl.insertChangePermission("2", "1", "Y", "公开");
		System.out.println(t);*/
		/*List<ChangePermission> list=new ArrayList<ChangePermission>();
		list=daoImpl.getDIsAgree("1");
		System.out.println("集合长度"+list.size()+"\n");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}*/
		boolean f=daoImpl.deleTip("1");
		System.out.println(f);
	}
}
