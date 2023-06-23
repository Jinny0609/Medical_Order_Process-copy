package gmt.medical.service;

import java.util.List;

import gmt.medical.model.Categories;
import gmt.medical.model.CategoryInfo;

public interface CategoryService {
	// 카테고리 고유키 이름
	public List<Categories> getcategory();
	// categoryId를 기반으로 해당 카테고리에 대한 정보를 조회
	public List<CategoryInfo> getCategoryInfoListById(int categoryId);
	// 제품 상세정보 불러오기
	public List<CategoryInfo> getProductdetail(int productId, int category_id);
	// 제품 옵션정보 불러오기
	public List<CategoryInfo> getoption_name(int productId);
	// 구매확정테이블에 정보저장
	public void addorderlist(int productId,String productName,String cartOption,int purchaseQuantity,String hcode,int user_id,int productPrice);

}
