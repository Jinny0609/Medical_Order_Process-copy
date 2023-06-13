package gmt.medical.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gmt.medical.mapper.Product_add_mapper;
import gmt.medical.model.Product_add;

@Service
public class Product_add_Servicelmpl implements Product_add_Service{
	@Autowired
	private Product_add_mapper productRepository;
	
	@Override
	public void saveProduct(Product_add product) {
		productRepository.saveProduct(product);
	}
}
