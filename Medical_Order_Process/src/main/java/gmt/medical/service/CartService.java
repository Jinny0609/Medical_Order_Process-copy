package gmt.medical.service;

import java.util.List;

import gmt.medical.model.CategoryInfo;



public interface CartService {
	public void	addcatedata(int productId,String productName,int productPrice,int user_id,String name,int quantity);

	public List<CategoryInfo> addToCart(int uesr_id);
	
}
