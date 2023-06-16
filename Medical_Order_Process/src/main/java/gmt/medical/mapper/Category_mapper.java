package gmt.medical.mapper;

import java.util.List;

import gmt.medical.model.Categories;
import gmt.medical.model.CategoryInfo;

public interface Category_mapper {
	
	// 카테고리 고유키 이름
	public List<Categories> getcategory();
	// categoryId를 기반으로 해당 카테고리에 대한 정보를 조회
	public List<CategoryInfo> getCategoryInfoListById(int categoryId);
}
