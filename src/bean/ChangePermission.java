package bean;

public class ChangePermission {
	private int id;//id
	private int parper_id;//论文id
	private int people1_id;//成员1id
	private String people1_name;//成员1姓名
	private String people1_permission;//成员1是否同意
	private int people2_id;//成员2id
	private String people2_name;//成员2姓名
	private String people2_permission;//成员2是否同意
	private int people3_id;//成员3id
	private String people3_name;//成员3姓名
	private String people3_permission;//成员3是否同意
	private String application;//申请
	public int getId() {
		return id;
	}
	public int getParper_id() {
		return parper_id;
	}
	public int getPeople1_id() {
		return people1_id;
	}
	public String getPeople1_name() {
		return people1_name;
	}
	public String getPeople1_permission() {
		return people1_permission;
	}
	public int getPeople2_id() {
		return people2_id;
	}
	public String getPeople2_name() {
		return people2_name;
	}
	public String getPeople2_permission() {
		return people2_permission;
	}
	public int getPeople3_id() {
		return people3_id;
	}
	public String getPeople3_name() {
		return people3_name;
	}
	public String getPeople3_permission() {
		return people3_permission;
	}
	public String getApplication() {
		return application;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setParper_id(int parper_id) {
		this.parper_id = parper_id;
	}
	public void setPeople1_id(int people1_id) {
		this.people1_id = people1_id;
	}
	public void setPeople1_name(String people1_name) {
		this.people1_name = people1_name;
	}
	public void setPeople1_permission(String people1_permission) {
		this.people1_permission = people1_permission;
	}
	public void setPeople2_id(int people2_id) {
		this.people2_id = people2_id;
	}
	public void setPeople2_name(String people2_name) {
		this.people2_name = people2_name;
	}
	public void setPeople2_permission(String people2_permission) {
		this.people2_permission = people2_permission;
	}
	public void setPeople3_id(int people3_id) {
		this.people3_id = people3_id;
	}
	public void setPeople3_name(String people3_name) {
		this.people3_name = people3_name;
	}
	public void setPeople3_permission(String people3_permission) {
		this.people3_permission = people3_permission;
	}
	public void setApplication(String application) {
		this.application = application;
	}
	@Override
	public String toString() {
		return "ChangePermission [id=" + id + ", parper_id=" + parper_id + ", people1_id=" + people1_id
				+ ", people1_name=" + people1_name + ", people1_permission=" + people1_permission + ", people2_id="
				+ people2_id + ", people2_name=" + people2_name + ", people2_permission=" + people2_permission
				+ ", people3_id=" + people3_id + ", people3_name=" + people3_name + ", people3_permission="
				+ people3_permission + ", application=" + application  + "]";
	}
	
}
