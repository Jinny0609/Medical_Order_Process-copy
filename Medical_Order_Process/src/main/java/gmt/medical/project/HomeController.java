package gmt.medical.project;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import gmt.medical.model.Categories;
import gmt.medical.service.CategoryService;


@Controller
public class HomeController {
	
	@Autowired
	private CategoryService categoryService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(HttpSession session,Categories categories) {
		// 카테고리 목록 불러오기
		List<Categories> category = categoryService.getcategory();
		session.setAttribute("Category", category);
		return "Home";
	}
	
	@RequestMapping(value = "/Order_list", method = RequestMethod.GET)
	public String Order_list() {
		return "Order_list";
	}
	
	@RequestMapping(value = "/Order_complete", method = RequestMethod.GET)
	public String Order_complete(@RequestParam("product_id") int productId,
								@RequestParam("product_name") String productName,
								@RequestParam("cart_option") String cartOption,
								@RequestParam("purchase_quantity") int purchaseQuantity,HttpSession session) {
		String hcode = (String) session.getAttribute("hcode");
		Integer user_id = (Integer) session.getAttribute("user_id");
		categoryService.addorderlist(productId,productName,cartOption,purchaseQuantity,hcode,user_id);
		return "Order_complete";
	}
	
	
}