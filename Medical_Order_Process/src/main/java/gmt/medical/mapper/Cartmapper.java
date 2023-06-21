package gmt.medical.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import gmt.medical.model.CartVO;

public interface Cartmapper {
	public void	addcatedata(@Param("product_id") int productId, @Param("product_name") String productName, @Param("product_price") int productPrice, @Param("user_id") int user_id, @Param("cart_option") String name, @Param("product_count") int quantity, @Param("image_path") String imagePath);

	 public List<CartVO> addToCart(int uesr_id);
}
