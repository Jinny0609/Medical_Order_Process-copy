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
	public List<CategoryInfo> getCategoryInfoListById(int categoryId){
		return category_mapper.getCategoryInfoListById(categoryId);
	}
}
