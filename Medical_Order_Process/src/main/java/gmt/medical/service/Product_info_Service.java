package gmt.medical.service;


import gmt.medical.model.Product_info;
import gmt.medical.model.Product_option;

public interface Product_info_Service {
	public int addProduct(Product_info productInfo);	// 기존 void
	
	public void addOption(Product_option productOption);
}
