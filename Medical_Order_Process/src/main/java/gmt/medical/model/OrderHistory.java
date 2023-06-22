package gmt.medical.model;

import java.util.Date;

public class OrderHistory {
	private int list_id;
    private String email_id ;
    private String product_name;
    private String product_price;
    private String option_name;
    private String hcode;
    private Date product_saledata;
    private int purchase_quantity;
    private int product_count;
    private String hname;		// 병원이름
	public int getList_id() {
		return list_id;
	}
	public void setList_id(int list_id) {
		this.list_id = list_id;
	}
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public String getProduct_price() {
		return product_price;
	}
	public void setProduct_price(String product_price) {
		this.product_price = product_price;
	}
	public String getOption_name() {
		return option_name;
	}
	public void setOption_name(String option_name) {
		this.option_name = option_name;
	}
	public String getHcode() {
		return hcode;
	}
	public void setHcode(String hcode) {
		this.hcode = hcode;
	}
	public Date getProduct_saledata() {
		return product_saledata;
	}
	public void setProduct_saledata(Date product_saledata) {
		this.product_saledata = product_saledata;
	}
	public int getPurchase_quantity() {
		return purchase_quantity;
	}
	public void setPurchase_quantity(int purchase_quantity) {
		this.purchase_quantity = purchase_quantity;
	}
	public int getProduct_count() {
		return product_count;
	}
	public void setProduct_count(int product_count) {
		this.product_count = product_count;
	}
	public String getHname() {
		return hname;
	}
	public void setHname(String hname) {
		this.hname = hname;
	}
    
	@Override
    public String toString() {
        return "OrderHistory{" +
                "list_id=" + list_id +
                ", email_id='" + email_id + '\'' +
                ", product_name='" + product_name + '\'' +
                ", product_price='" + product_price + '\'' +
                ", option_name='" + option_name + '\'' +
                ", hcode='" + hcode + '\'' +
                ", product_saledata=" + product_saledata +
                ", purchase_quantity=" + purchase_quantity +
                ", product_count=" + product_count +
                ", hname= " + hname +
                '}';
    }
	
}
