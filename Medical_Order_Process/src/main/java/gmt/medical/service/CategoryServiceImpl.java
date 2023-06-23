package gmt.medical.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gmt.medical.mapper.Category_mapper;
import gmt.medical.model.Categories;
import gmt.medical.model.CategoryInfo;

@Service
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	private Category_mapper category_mapper;

	// 카테고리 고유키 이름
	public List<Categories> getcategory() {
		return category_mapper.getcategory();
	}

	// categoryId를 기반으로 해당 카테고리에 대한 정보를 조회
	public List<CategoryInfo> getCategoryInfoListById(int categoryId) {
		return category_mapper.getCategoryInfoListById(categoryId);
	}

	// 제품 상세 데이터 가져오기
	public List<CategoryInfo> getProductdetail(int productId, int category_id) {
		return category_mapper.getProductdetail(productId, category_id);
	}

	// 제품 옵션정보 불러오기
	public List<CategoryInfo> getoption_name(int productId) {
		return category_mapper.getoption_name(productId);
	}

	// 구매확정테이블에 정보저장
	public void addorderlist(int productId, String productName, String cartOption, int purchaseQuantity, String hcode, int user_id,int productPrice) {
		category_mapper.addorderlist(productId,productName,cartOption,purchaseQuantity,hcode,user_id,productPrice);
	}
	
	// 구매 확정시 총 수량 갯수 업데이트
	public void updatecount(int productId,int product_count) {
		category_mapper.updatecount(productId,product_count);
	}
}
