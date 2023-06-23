package gmt.medical.project;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import gmt.medical.model.Categories;
import gmt.medical.model.OrderVO;
import gmt.medical.service.CategoryService;
import gmt.medical.service.Shipping_address_Service;


@Controller
public class HomeController {
	
	@Autowired
	private CategoryService categoryService;
	
	@Autowired
	private Shipping_address_Service shipping_address_service;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(HttpSession session,Categories categories) {
		// 카테고리 목록 불러오기
		List<Categories> category = categoryService.getcategory();
		session.setAttribute("Category", category);
		return "Home";
	}
	
	@RequestMapping(value = "/Order_list", method = RequestMethod.GET)
	public String Order_list(HttpSession session,Model model) {
		Integer user_id = (Integer) session.getAttribute("user_id");
		// 회원이 주문한 상품 정보 가져오기
		List<OrderVO> orderitem = shipping_address_service.getitemlist(user_id);
		    for (OrderVO order : orderitem) {
		        int productId = order.getProduct_id();
		        List<OrderVO> imglist = shipping_address_service.getimglist(productId);
		        order.setImglist(imglist); // OrderVO 객체에 imglist 저장
		    }
		model.addAttribute("Orderitem", orderitem);
		return "Order_list";
	}
	
	@RequestMapping(value = "/Order_complete", method = RequestMethod.GET)
	public String Order_complete(@RequestParam("product_id") List<Integer> productIds,
	                             @RequestParam("product_name") List<String> productNames,
	                             @RequestParam("cart_option") List<String> cartOptions,
	                             @RequestParam("product_count") List<Integer> product_counts,
	                             @RequestParam("product_price") List<Integer> productPrices,
	                             HttpSession session) {
	    String hcode = (String) session.getAttribute("hcode");
	    Integer user_id = (Integer) session.getAttribute("user_id");
	    
	 // 리스트의 크기와 인덱스 범위 검사
	    if (productIds.size() != productNames.size() || productIds.size() != cartOptions.size()
	            || productIds.size() != product_counts.size() || productIds.size() != productPrices.size()) {
	        // 오류 처리 로직 또는 예외 처리
	        // ...
	        return "error"; // 예시로 오류 페이지를 리턴하도록 설정
	    }
	    
	    // 리스트의 길이를 기준으로 반복하면서 값을 추출하여 로직 처리
	    for (int i = 0; i < productIds.size(); i++) {
	        int productId = productIds.get(i);
	        String productName = productNames.get(i);
	        String cartOption = cartOptions.get(i);
	        int product_count = product_counts.get(i);
	        int productPrice = productPrices.get(i);
	        
	        // 로직 처리
	        categoryService.addorderlist(productId, productName, cartOption, product_count, hcode, user_id,productPrice);
	    }
	    
	    return "Order_complete";
	}
	
}