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

	public void addcatedata(int productId, String productName, int productPrice, int user_id, String name,
			int quantity) {
		cartmapper.addcatedata(productId, productName, productPrice, user_id, name, quantity);
	}

	public List<CartVO> addToCart(int user_id) {
		return cartmapper.addToCart(user_id);
	}

	 public void deleteCart(int user_id, int product_id) {
	        cartmapper.deleteCart(user_id, product_id);
	 }
}
