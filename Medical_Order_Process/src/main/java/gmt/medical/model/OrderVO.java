package gmt.medical.model;

import java.util.List;

public class OrderVO {
	
	 private int product_id;
	 private int user_id;
	 private String purchase_date;
	 private int purchase_quantity;
	 private String product_name;
	 private String option_name;
	 private int product_price;
	 private String image_path;
	 private List<OrderVO> imglist;
	 public List<OrderVO> getImglist() {
		return imglist;
	}
	public void setImglist(List<OrderVO> imglist) {
		this.imglist = imglist;
	}
	public String getImage_path() {
		return image_path;
	}
	public void setImage_path(String image_path) {
		this.image_path = image_path;
	}
	public int getProduct_id() {
		return product_id;
	}
	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getPurchase_date() {
		return purchase_date;
	}
	public void setPurchase_date(String purchase_date) {
		this.purchase_date = purchase_date;
	}
	public int getPurchase_quantity() {
		return purchase_quantity;
	}
	public void setPurchase_quantity(int purchase_quantity) {
		this.purchase_quantity = purchase_quantity;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public String getOption_name() {
		return option_name;
	}
	public void setOption_name(String option_name) {
		this.option_name = option_name;
	}
	public int getProduct_price() {
		return product_price;
	}
	public void setProduct_price(int product_price) {
		this.product_price = product_price;
	}
	
	@Override
	public String toString() {
	    return "OrderVO{" +
	            "product_id=" + product_id +
	            ", user_id=" + user_id +
	            ", purchase_date='" + purchase_date + '\'' +
	            ", purchase_quantity=" + purchase_quantity +
	            ", product_name='" + product_name + '\'' +
	            ", option_name='" + option_name + '\'' +
	            ", product_price=" + product_price +
	            ", image_path=" + image_path +
	            '}';
	}

}
