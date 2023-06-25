package gmt.medical.model;

public class CategoryInfo {
	private String product_image;
    private String product_name;
    private int product_price;
    private int option_count; // changed from product_count to option_count
    private String image_path;
    private int category_id;
    private int product_id;
    private String option_name; // added option_name
    private int option_id;	//added option_id
    
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
	public int getOption_count() {
		return option_count;
	}
	public void setOption_count(int option_count) {
		this.option_count = option_count;
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
	public int getOption_id() {
		return option_id;
	}
	public void setOption_id(int option_id) {
		this.option_id = option_id;
	}
    
//	@Override
//    public String toString() {
//        return "CategoryInfo{" +
//                "product_image='" + product_image + '\'' +
//                ", product_name='" + product_name + '\'' +
//                ", product_price=" + product_price +
//                ", option_count=" + option_count + // changed from product_count to option_count
//                ", image_path='" + image_path + '\'' +
//                ", category_id=" + category_id +
//                ", product_id=" + product_id +
//                ", option_name='" + option_name + '\'' + // added option_name
//                '}';
//    }
}