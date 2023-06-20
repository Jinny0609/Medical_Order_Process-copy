package gmt.medical.project;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import gmt.medical.model.CategoryInfo;
import gmt.medical.service.CategoryService;

@Controller
public class CategorieController {

	@Autowired
	private CategoryService categoryService;

	// 카테고리 페이지
	@RequestMapping(value = "/Categorie", method = RequestMethod.GET)
	public String Categorie(@RequestParam("cate") int categoryId, Model model) {
		// categoryId를 기반으로 해당 카테고리에 대한 정보를 조회하고, 결과를 모델에 추가
		List<CategoryInfo> categoryInfoList = categoryService.getCategoryInfoListById(categoryId);
		model.addAttribute("categoryInfoList", categoryInfoList);
		return "Categorie";
	}

	// 제품 상세페이지
	@RequestMapping(value = "/Product_details", method = RequestMethod.GET)
	public String Product_details(HttpSession session, @RequestParam("productId") int productId, @RequestParam("categoryId") int category_id , Model model) {
		List<CategoryInfo> product_detail = categoryService.getProductdetail(productId, category_id);
		List<CategoryInfo> option_name = categoryService.getoption_name(productId);
		 session.setAttribute("Option_name", option_name);
		 session.setAttribute("Product_detail", product_detail);
		 session.setAttribute("productId", productId);
		 session.setAttribute("categoryId", category_id);
		return "Product_details";
	}
}