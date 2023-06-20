package gmt.medical.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gmt.medical.mapper.Cartmapper;

@Service
public class CartServiceImpl implements CartService {
	
	@Autowired
    private Cartmapper cartmapper;
	
	public void	addcatedata(int productId,String productName,int productPrice,int user_id,String name,int quantity) {
		cartmapper.addcatedata(productId,productName,productPrice,user_id,name,quantity);
	}
}
