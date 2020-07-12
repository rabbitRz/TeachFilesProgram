package bean;

public class tip {
	private int paper_id;//论文编号
	private int people1_id;//队员1编号
	private String people1_res;//队员1是否获得提示
	private int people2_id;//队员2编号
	private String people2_res;//队员2是否获得提示
	private int people3_id;//队员3编号
	private String people3_res;//队员3是否获得提示
	private String info;//提示信息
	public int getPaper_id() {
		return paper_id;
	}
	public int getPeople1_id() {
		return people1_id;
	}
	public String getPeople1_res() {
		return people1_res;
	}
	public int getPeople2_id() {
		return people2_id;
	}
	public String getPeople2_res() {
		return people2_res;
	}
	public int getPeople3_id() {
		return people3_id;
	}
	public String getPeople3_res() {
		return people3_res;
	}
	public String getInfo() {
		return info;
	}
	public void setPaper_id(int paper_id) {
		this.paper_id = paper_id;
	}
	public void setPeople1_id(int people1_id) {
		this.people1_id = people1_id;
	}
	public void setPeople1_res(String people1_res) {
		this.people1_res = people1_res;
	}
	public void setPeople2_id(int people2_id) {
		this.people2_id = people2_id;
	}
	public void setPeople2_res(String people2_res) {
		this.people2_res = people2_res;
	}
	public void setPeople3_id(int people3_id) {
		this.people3_id = people3_id;
	}
	public void setPeople3_res(String people3_res) {
		this.people3_res = people3_res;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	@Override
	public String toString() {
		return "tip [paper_id=" + paper_id + ", people1_id=" + people1_id + ", people1_res=" + people1_res
				+ ", people2_id=" + people2_id + ", people2_res=" + people2_res + ", people3_id=" + people3_id
				+ ", people3_res=" + people3_res + ", info=" + info + "]";
	}
	
}
