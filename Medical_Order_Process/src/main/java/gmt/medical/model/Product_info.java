package gmt.medical.model;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

public class Product_info {
	private int product_id;
    private String product_image;
    private String product_name;
    private int product_price;
    private String image_path;
    private int category_id;
    private MultipartFile save_image;
    private List<String> optionNames;
    private List<Integer> optionCounts;	// 옵션 가격 리스트 추가 됨
    private String cart_option;
     
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

	public MultipartFile getSave_image() {
		return save_image;
	}

	public void setSave_image(MultipartFile save_image) {
		this.save_image = save_image;
	}

	public List<String> getOptionNames() {
		return optionNames;
	}

	public void setOptionNames(List<String> optionNames) {
		this.optionNames = optionNames;
	}

	public List<Integer> getOptionCounts() {
		return optionCounts;
	}

	public void setOptionCounts(List<Integer> optionCounts) {
		this.optionCounts = optionCounts;
	}

	public String getCart_option() {
		return cart_option;
	}

	public void setCart_option(String cart_option) {
		this.cart_option = cart_option;
	}

	@Override
    public String toString() {
        return "{" +
                "product_id=" + product_id +
                ", product_image='" + product_image + '\'' +
                ", product_name='" + product_name + '\'' +
                ", product_price=" + product_price +
                ", image_path='" + image_path + '\'' +
                ", category_id=" + category_id +
                ", save_image='" + (save_image != null ? save_image.getOriginalFilename() : "null") + '\'' +
                ", optionNames=" + optionNames +
                '}';
    }
	
}
