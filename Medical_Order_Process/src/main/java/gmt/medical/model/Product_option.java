package gmt.medical.model;

public class Product_option {
	private int product_id;
	private String option_name;
	private int option_count; // 옵션 가격 필드 추가 됨
	private int category_id;
	
	public int getProduct_id() {
		return product_id;
	}

	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}

	public String getOption_name() {
		return option_name;
	}

	public void setOption_name(String option_name) {
		this.option_name = option_name;
	}

	public int getOption_count() {
		return option_count;
	}

	public void setOption_count(int option_count) {
		this.option_count = option_count;
	}

	public int getCategory_id() {
		return category_id;
	}

	public void setCategory_id(int category_id) {
		this.category_id = category_id;
	}

	@Override
	public String toString() {
	    return "{" +
	            "product_id=" + product_id +
	            ", option_name='" + option_name + '\'' +
	            ", category_id=" + category_id +
	            '}';
	}
}
