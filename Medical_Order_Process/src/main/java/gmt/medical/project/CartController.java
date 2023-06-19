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
			String name = option.getName();
			int quantity = option.getQuantity();
			System.out.println(name);
			System.out.println(quantity);
			// 장바구니에 옵션 추가 로직 작성
		}

		// "Product_details" 페이지로 이동하거나 응답을 반환하는 코드
		return "Product_details";
	}
}
