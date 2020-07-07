package bean;

public class PaperPeople {
	int id;
	int paper_id;//论文编号
	int people1_id;//成员1编号
	int people2_id;
	int people3_id;
	int permission;//开放权限
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPaper_id() {
		return paper_id;
	}
	public void setPaper_id(int paper_id) {
		this.paper_id = paper_id;
	}
	public int getPeople1_id() {
		return people1_id;
	}
	public void setPeople1_id(int people1_id) {
		this.people1_id = people1_id;
	}
	public int getPeople2_id() {
		return people2_id;
	}
	public void setPeople2_id(int people2_id) {
		this.people2_id = people2_id;
	}
	public int getPeople3_id() {
		return people3_id;
	}
	public void setPeople3_id(int people3_id) {
		this.people3_id = people3_id;
	}
	public int getPermission() {
		return permission;
	}
	public void setPermission(int permission) {
		this.permission = permission;
	}
	
	

}
