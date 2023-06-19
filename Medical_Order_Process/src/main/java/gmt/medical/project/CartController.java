package gmt.medical.project;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CartController {

	@RequestMapping(value = "/Cart", method = RequestMethod.GET)
	public String cart() {
		return "Cart";
	}

	@RequestMapping(value = "/Cart_table", method = RequestMethod.GET)
	public String Cart_table(@RequestParam("P_name") String productName, @RequestParam("P_price") int productPrice,
			@RequestParam("quantity") int quantity, @RequestParam("selectedOption") String selectedOption) {
		// 전달된 값들을 출력
	    System.out.println("Product Name: " + productName);
	    System.out.println("Product Price: " + productPrice);
	    System.out.println("Quantity: " + quantity);
	    System.out.println("Selected Option: " + selectedOption);
		return "Product_details";
	}

}
