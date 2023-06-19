package gmt.medical.project;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import gmt.medical.model.OptionData;

@Controller
public class CartController {

	@RequestMapping(value = "/Cart", method = RequestMethod.GET)
	public String cart() {
		return "Cart";
	}

	@RequestMapping(value = "/Product_details", method = RequestMethod.POST)
	public String Cart_table(@RequestBody List<OptionData> selectedOptions) {
		for (OptionData option : selectedOptions) {
			String name = option.getName();  // 옵션 이름
			int quantity = option.getQuantity(); // 옵션 수량
			// 유저 고유키,상품고유키,상품 가격,상품이름
			// 장바구니에 옵션 추가 로직 작성
		}

		// "Product_details" 페이지로 이동하거나 응답을 반환하는 코드
		return "/Product_details";
	}
}
