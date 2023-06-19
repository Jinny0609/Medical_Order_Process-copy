package gmt.medical.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gmt.medical.mapper.Product_info_mapper;
import gmt.medical.model.Product_info;
import gmt.medical.model.Product_option;

@Service
public class Product_info_Servicelmpl implements Product_info_Service{	
	 	@Autowired
	    private Product_info_mapper product_info_mapper;
	 
	 	@Override
	    public int addProduct(Product_info productInfo) {
	        product_info_mapper.addProduct(productInfo);
	        System.out.println("Product Info: " + productInfo.toString());
	        return productInfo.getProduct_id(); // 추가된 product의 id 반환
	    }

	 	@Override
	    public void addOption(Product_option productOption) {
	        product_info_mapper.addOption(productOption);
	        System.out.println("Product Option: " + productOption.toString());
	    }
	}
