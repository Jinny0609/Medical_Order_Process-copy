package gmt.medical.mapper;

import org.apache.ibatis.annotations.Param;

public interface Cartmapper {
	public void	addcatedata(@Param("product_id") int productId, @Param("product_name") String productName, @Param("product_price") int productPrice, @Param("user_id") int user_id, @Param("cart_option") String name, @Param("product_count") int quantity);
}
