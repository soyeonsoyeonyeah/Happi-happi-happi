package kr.ac.kopo.vo;

public class MemberVO {

	public static MemberVO loginVO;
	private String name;
	private int phone;
	private int bd;
	private String id;
	private String password;
	
	public MemberVO() {
		super();
	
}
	public MemberVO(String name, int phone, int bd, String id, String password) {
		super();
		this.name = name;
		this.phone = phone;
		this.bd = bd;
		this.id = id;
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public int getBd() {
		return bd;
	}
	public void setBd(int bd) {
		this.bd = bd;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "MemberVO [name=" + name + ", phone=" + phone + ", bd=" + bd + ", id=" + id + ", password=" + password
				+ "]";
	}
	public String getTitle() {
		// TODO Auto-generated method stub
		return null;
	}





}




