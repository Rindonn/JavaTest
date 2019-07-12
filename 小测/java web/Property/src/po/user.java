package po;

public class user {
	private int id;
	private String name;
	private String phone;
	private int buildingno;
	private int unit;
	private String roomno;
	private int state;
	public user() {
		
	}
	public user(int id,String name,String phone,int buildingno,int unit,String roomno,int state) {
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.buildingno = buildingno;
		this.unit = unit;
		this.roomno = roomno;
		this.state = state;
	}
	public int getid() {
		return id;
	}
	public void setid(int id) {
		this.id = id;
	}
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name = name;
	}
	public String getphone() {
		return phone;
	}
	public void setphone(String phone) {
		this.phone = phone;
	}
	public int getbuildingno() {
		return buildingno;
	}
	public void setbuildingno(int buildingno) {
		this.buildingno = buildingno;
	}
	public int getunit() {
		return unit;
	}
	public void setunit(int unit) {
		this.unit = unit;
	}
	public String getroomno() {
		return roomno;
	}
	public void setroomno(String roomno) {
		this.roomno = roomno;
	}
	public int getstate() {
		return state;
	}
	public void setstate(int state) {
		this.state = state;
	}
}
