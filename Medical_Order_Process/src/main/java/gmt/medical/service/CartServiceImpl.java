package gmt.medical.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gmt.medical.mapper.Cartmapper;
import gmt.medical.model.CartVO;

@Service
public class CartServiceImpl implements CartService {
	
	@Autowired
    private Cartmapper cartmapper;
	
	public void	addcatedata(int productId,String productName,int productPrice,int user_id,String name,int quantity,String imagePath) {
		cartmapper.addcatedata(productId,productName,productPrice,user_id,name,quantity,imagePath);
	}
	public List<CartVO> addToCart(int uesr_id) {
		return cartmapper.addToCart(uesr_id);
	}
	
	public void additemdelete(int user_id) {
		cartmapper.additemdelete(user_id);
	}
	
	public void	additemdata(int productId,String productName,int productPrice,int user_id,String name,int quantity,String imagePath) {
		cartmapper.additemdata(productId,productName,productPrice,user_id,name,quantity,imagePath);
	}
	
	public List<CartVO> getitemdata(int user_id) {
		return cartmapper.getitemdata(user_id);
	}
		
}
