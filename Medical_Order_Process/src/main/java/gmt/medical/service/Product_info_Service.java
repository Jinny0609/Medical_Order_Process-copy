package gmt.medical.service;


import java.util.List;

import gmt.medical.model.Product_info;
import gmt.medical.model.Product_option;

public interface Product_info_Service {
	public void addProduct(Product_info productInfo);
	
	public void addOption(Product_option productOption);

	public void addOptions(List<Product_option> productOptions);
}
