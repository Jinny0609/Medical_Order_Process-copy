package gmt.medical.model;

import java.util.ArrayList;

public class ProductForm {
	private Product_info productInfo;
    private ArrayList<Product_option> productOptions;
    
	public Product_info getProductInfo() {
		return productInfo;
	}
	public void setProductInfo(Product_info productInfo) {
		this.productInfo = productInfo;
	}
	public ArrayList<Product_option> getProductOptions() {
		return productOptions;
	}
	public void setProductOptions(ArrayList<Product_option> productOptions) {
		this.productOptions = productOptions;
	}
}
