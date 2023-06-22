package gmt.medical.service;

import java.util.List;

import gmt.medical.model.CartVO;

public interface CartService {
	public void	addcatedata(int productId,String productName,int productPrice,int user_id,String name,int quantity);

	public List<CartVO> addToCart(int user_id);
	
	public void deleteCart(int user_id, int product_id);
}
