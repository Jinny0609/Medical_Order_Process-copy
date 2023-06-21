package gmt.medical.model;

public class Product_option {
	private int product_id;
	private String option_name;
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
