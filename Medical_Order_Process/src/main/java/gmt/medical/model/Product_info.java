package gmt.medical.model;

import java.util.List;

public class Product_info {
	private int product_id;
    private String product_image;
    private String product_name;
    private int product_price;
    private int product_count;
    private String image_path;
    private int category_id;
	private String cart_option;
    private List<String> optionNames;
    
    @Override
	public String toString() {
	    return "Product_info : {" +
	            "product_id=" + product_id +
	            "cart_option=" + cart_option +
	            ", product_image='" + product_image + '\'' +
	            ", product_name='" + product_name + '\'' +
	            ", product_price=" + product_price +
	            ", product_count=" + product_count +
	            ", image_path='" + image_path + '\'' +
	            ", category_id=" + category_id +
	            ", optionNames=" + optionNames +
	            '}';
	}
    
	public int getProduct_id() {
		return product_id;
	}
	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}
	public String getProduct_image() {
		return product_image;
	}
	public void setProduct_image(String product_image) {
		this.product_image = product_image;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public int getProduct_price() {
		return product_price;
	}
	public void setProduct_price(int product_price) {
		this.product_price = product_price;
	}
	public int getProduct_count() {
		return product_count;
	}
	public void setProduct_count(int product_count) {
		this.product_count = product_count;
	}
	public String getImage_path() {
		return image_path;
	}
	public void setImage_path(String image_path) {
		this.image_path = image_path;
	}
	public int getCategory_id() {
		return category_id;
	}
	public void setCategory_id(int category_id) {
		this.category_id = category_id;
	}
	public List<String> getOptionNames() {
		return optionNames;
	}
	public void setOptionNames(List<String> optionNames) {
		this.optionNames = optionNames;
	}
	public String getCart_option() {
		return cart_option;
	}
	public void setCart_option(String cart_option) {
		this.cart_option = cart_option;
	}
}
