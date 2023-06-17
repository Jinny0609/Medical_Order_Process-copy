package gmt.medical.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import gmt.medical.mapper.Product_info_mapper;
import gmt.medical.model.Product_info;
import gmt.medical.model.Product_option;

@Service
public class Product_info_Servicelmpl implements Product_info_Service{	
	 @Autowired
	    private Product_info_mapper product_info_mapper;
	 
	    @Override
	    public void addProduct(Product_info productInfo) {
	        product_info_mapper.addProduct(productInfo);
	        System.out.println("Product Info: " + productInfo.toString());
	    }

	    @Override
	    public void addOption(Product_option productOption) {
	        product_info_mapper.addOption(productOption);
	        System.out.println("Option: " + productOption.toString());
	    }
	    
	    @Override
	    @Transactional // 여러개의 DB 삽입 연산을 하나의 트랜잭션으로 묶어줍니다.
	    public void addOptions(List<Product_option> productOptions) {
	        for (Product_option option : productOptions) {
	            product_info_mapper.addOption(option);
	            System.out.println("Option: " + option.toString());
	        }
	    }
	}
