package object;

public class user {
	private int id;
	private String name;
	private String username;
	private String password;
	public user() {
		
	}
	public user(String usr,String pwd) {
		this.username = usr;
		this.password = pwd;
	}
	public String getusername() {
		return username;
	}
	public void setusername(String usr) {
		this.username = usr;
	}
	public String getpassword() {
		return password;
	}
	public void setpassword(String pwd) {
		this.password = pwd;
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
}
