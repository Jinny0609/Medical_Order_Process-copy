package gmt.medical.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import gmt.medical.model.Categories;
import gmt.medical.model.CategoryInfo;

public interface Category_mapper {
	
	// 카테고리 고유키 이름
	public List<Categories> getcategory();
	// categoryId를 기반으로 해당 카테고리에 대한 정보를 조회
	public List<CategoryInfo> getCategoryInfoListById(int categoryId);
	// 제품상세데이터
	public List<CategoryInfo> getProductdetail(@Param("product_id") int productId, @Param("category_id") int category_id);
	// 제품 옵션
	public List<CategoryInfo> getoption_name(int productId);
	// 구매확정테이블에 정보저장
	public void addorderlist(
			  @Param("product_id") int productId,
			  @Param("product_name") String productName,
			  @Param("option_name") String optionName,
			  @Param("purchase_quantity") int purchaseQuantity,
			  @Param("hcode") String hcode,
			  @Param("user_id") int userId
			);
}
