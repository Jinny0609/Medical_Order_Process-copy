package gmt.medical.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import gmt.medical.model.CartVO;

public interface Cartmapper {
	public void	addcatedata(@Param("product_id") int productId, @Param("product_name") String productName, @Param("product_price") int productPrice, @Param("user_id") int user_id, @Param("cart_option") String name, @Param("option_count") int optionCount, @Param("image_path") String imagePath);

	 public List<CartVO> addToCart(int uesr_id);
	 
	 public void additemdelete(int uesr_id);
	 
	 public void additemdata(@Param("product_id") int productId, @Param("product_name") String productName, @Param("product_price") int productPrice, @Param("user_id") int user_id, @Param("cart_option") String name, @Param("option_count") int optionCount, @Param("image_path") String imagePath);
	 
	 public List<CartVO> getitemdata(int user_id);
	 
	 public void deleteCart(@Param("user_id") int user_id, @Param("product_id") int product_id);
}
