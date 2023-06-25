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
import gmt.medical.model.OrderCompleteInfo;
import gmt.medical.model.OrderVO;
import gmt.medical.service.CategoryService;
import gmt.medical.service.OrderCompleteService;
import gmt.medical.service.Shipping_address_Service;


@Controller
public class HomeController {
	
	@Autowired
	private CategoryService categoryService;
	
	@Autowired
	private Shipping_address_Service shipping_address_service;
	
	@Autowired
	private OrderCompleteService orderCompleteService;
	
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
	public String Order_complete(
		@RequestParam("product_id") List<Integer> productIds, // productId 리스트 추가
	    @RequestParam("option_id") List<Integer> optionIds, // optionId 리스트 받아옴
	    @RequestParam("purchase_quantity") List<Integer> purchaseQuantities, // purchase_quantity 리스트 받아옴
	    @RequestParam("product_name") List<String> productNames,
	    @RequestParam("cart_option") List<String> cartOptions,
	    @RequestParam("option_count") List<Integer> optionCounts, // product_count를 option_count로 변경
	//	@RequestParam("product_count") List<Integer> product_counts,
	    @RequestParam("product_price") List<Integer> productPrices,
	    HttpSession session,
	    Model model) { // Model 객체를 파라미터로 추가
	    String hcode = (String) session.getAttribute("hcode");
	    Integer user_id = (Integer) session.getAttribute("user_id");
	    
	    // 리스트의 크기와 인덱스 범위 검사
	    if (optionIds.size() != productNames.size() || optionIds.size() != cartOptions.size()
	            || optionIds.size() != optionCounts.size() || optionIds.size() != productPrices.size()) {
	        // 오류 처리 로직 또는 예외 처리
	        // ...
	        return "error"; // 예시로 오류 페이지를 리턴하도록 설정
	    }
	    
	    // 리스트의 길이를 기준으로 반복하면서 값을 추출하여 로직 처리
	    for (int i = 0; i < optionIds.size(); i++) {	// 안되면 optionIds로 수정
	    	int productId = productIds.get(i); // productId 값 받아옴
	        int optionId = optionIds.get(i);	// optionId 값 받아옴
	        int purchase_quantity = purchaseQuantities.get(i); // purchase_quantity 값 받아옴
	        String productName = productNames.get(i);
	        String cartOption = cartOptions.get(i);
	        int optionCount = optionCounts.get(i); // product_count를 optionCount로 변경
	        int productPrice = productPrices.get(i);
	        
	        // 로직 처리
	        categoryService.addorderlist(productId, optionId, productName, cartOption, optionCount, hcode, user_id, productPrice);
	        categoryService.updateOptionCount(productId, optionId, purchase_quantity);
	    }
	    
	    // 주문 정보를 가져온 후 모델에 추가
	    OrderCompleteInfo orderCompleteInfo = orderCompleteService.getOrderCompleteInfo(user_id);
	    if(orderCompleteInfo == null) {
	        return "error"; 
	    }
	    model.addAttribute("orderCompleteInfo", orderCompleteInfo);
	    model.addAttribute("productPrice", orderCompleteInfo.getProductPrice() + 2500); // 개별 제품 가격을 모델에 추가

	    // 총 결제 금액을 가져와 모델에 추가
	    int totalPrice = orderCompleteService.getTotalPrice(user_id);
	    model.addAttribute("totalPriceWithoutDelivery", totalPrice); // 배송비를 제외한 가격
	    model.addAttribute("totalPrice", totalPrice + 2500); // 배송비 포함한 가격
	    
	    return "Order_complete";
	}
}