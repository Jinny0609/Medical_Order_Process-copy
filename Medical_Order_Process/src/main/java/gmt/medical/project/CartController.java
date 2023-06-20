package gmt.medical.project;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import gmt.medical.model.OptionData;
import gmt.medical.model.RequestData;

@Controller
public class CartController {

	@RequestMapping(value = "/Cart", method = RequestMethod.GET)
	public String cart() {
		return "Cart";
	}

	@RequestMapping(value = "/Product_details", method = RequestMethod.POST)
	public String Cart_table(@RequestBody RequestData requestData, HttpSession session) {
		 List<OptionData> selectedOptions = requestData.getSelectedOptions();
		    int productId = requestData.getProductId();
		    String productName = requestData.getProductName();
		    int productPrice = requestData.getProductPrice();
		    Integer user_id = (Integer) session.getAttribute("user_id");

		    for (OptionData option : selectedOptions) {
		        String name = option.getName();
		        int quantity = option.getQuantity();	
			// 유저 고유키,상품고유키,상품 가격,상품이름
			// 장바구니에 옵션 추가 로직 작성
		}
		// "Product_details" 페이지로 이동하거나 응답을 반환하는 코드
		return "/Product_details";
	}
}
