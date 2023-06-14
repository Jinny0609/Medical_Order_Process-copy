package gmt.medical.model;

public class LoginVO {
	private int user_id;
	private String email_id;
	private String password;
	private String name;
	private String phonenum;
	private String hcode;
	
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhonenum() {
		return phonenum;
	}
	public void setPhonenum(String phonenum) {
		this.phonenum = phonenum;
	}
	public String getHcode() {
		return hcode;
	}
	public void setHcode(String hcode) {
		this.hcode = hcode;
	}
	
	@Override
	public String toString() {
	    return "LoginVO{" +
	            "user_id='" + user_id + '\'' +
	            ", email_id='" + email_id + '\'' +
	            ", password='" + password + '\'' +
	            ", name='" + name + '\'' +
	            ", phonenum='" + phonenum + '\'' +
	            ", hcode='" + hcode + '\'' +
	            '}';
 }
}
