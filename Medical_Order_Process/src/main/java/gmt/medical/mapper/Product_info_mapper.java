package gmt.medical.mapper;

import gmt.medical.model.Product_info;
import gmt.medical.model.Product_option;

public interface Product_info_mapper {
	public void addProduct(Product_info productInfo);
	
	public void addOption(Product_option productOption);
}
