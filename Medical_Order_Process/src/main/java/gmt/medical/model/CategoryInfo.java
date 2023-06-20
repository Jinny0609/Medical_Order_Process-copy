package gmt.medical.model;

public class CategoryInfo {
	private String product_image;
    private String product_name;
    private int product_price;
    private int product_count;
    private String image_path;
    private int category_id;
    private int product_id;
    private String option_name;
    
    public String getOption_name() {
		return option_name;
	}
	public void setOption_name(String option_name) {
		this.option_name = option_name;
	}
	// Getters and Setters
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
    
	@Override
	public String toString() {
	    return "CategoryInfo{" +
	            "product_image='" + product_image + '\'' +
	            ", product_name='" + product_name + '\'' +
	            ", product_price=" + product_price +
	            ", product_count=" + product_count +
	            ", image_path='" + image_path + '\'' +
	            ", category_id=" + category_id +
	            ", product_id=" + product_id +
	            ", option_name='" + option_name + '\'' +
	            '}';
	}
}