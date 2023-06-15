package gmt.medical.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gmt.medical.mapper.Product_info_mapper;
import gmt.medical.model.Product_info;

@Service
public class Product_info_Servicelmpl implements Product_info_Service{	
	 @Autowired
    private Product_info_mapper product_info_mapper;
	
    @Override
    public void addProduct(Product_info productInfo) {
    	product_info_mapper.addProduct(productInfo);
    }
}
