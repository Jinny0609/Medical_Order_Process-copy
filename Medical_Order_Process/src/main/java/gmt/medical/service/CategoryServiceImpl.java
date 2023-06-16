package gmt.medical.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gmt.medical.mapper.Category_mapper;
import gmt.medical.model.Categories;

@Service
public class CategoryServiceImpl implements CategoryService {
	
	@Autowired
    private Category_mapper category_mapper;
	
	public List<Categories> getcategory() {
		return category_mapper.getcategory();
	}
}
