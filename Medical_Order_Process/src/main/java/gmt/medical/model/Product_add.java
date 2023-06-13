package gmt.medical.model;

import java.util.Map;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Product_add {
	private int category_id;
	private String product_image;
	private String product_name;
	private int product_price;
	private int product_count;
	private String product_option;
	private Map<String, Object> product_option_map;
	
	public String getProduct_option() {
		return this.product_option;
	}
	
	public void setProduct_option(String product_option) throws Exception {
		ObjectMapper objectMapper = new ObjectMapper();
		this.product_option = product_option;
		this.product_option_map = objectMapper.readValue(product_option, new TypeReference<Map<String, Object>>() {});
	}

	
	public Map<String, Object> getProduct_option_map(){
		return this.product_option_map;
	}

	public int getCategory_id() {
		return category_id;
	}

	public void setCategory_id(int category_id) {
		this.category_id = category_id;
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

	public void setProduct_option_map(Map<String, Object> product_option_map) {
		this.product_option_map = product_option_map;
	}
}
