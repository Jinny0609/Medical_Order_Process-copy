package gmt.medical.model;

public class Shipping_address {
	private String recive;
	private String pscode;
	private String address_road;
    private String address_detail;
    private String phonenum;
    private String request;
    
 // Getters and Setters
	
    public String getRecive() {
		return recive;
	}
	public void setRecive(String recive) {
		this.recive = recive;
	}
	public String getPscode() {
		return pscode;
	}
	public void setPscode(String pscode) {
		this.pscode = pscode;
	}
	public String getAddress_detail() {
		return address_detail;
	}
	public void setAddress_detail(String address_detail) {
		this.address_detail = address_detail;
	}
	public String getPhonenum() {
		return phonenum;
	}
	public void setPhonenum(String phonenum) {
		this.phonenum = phonenum;
	}
	public String getRequest() {
		return request;
	}
	public void setRequest(String request) {
		this.request = request;
	}
	public String getAddress_road() {
		return address_road;
	}
	public void setAddress_road(String address_road) {
		this.address_road = address_road;
	}
	
}
