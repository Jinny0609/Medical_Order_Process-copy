package gmt.medical.project;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import gmt.medical.model.OrderHistory;
import gmt.medical.service.OrderHistroyService;

@Controller
public class OrderHistoryController {
	@Autowired
	private OrderHistroyService orderHistroyService;
	
	@RequestMapping(value = "/Order_history", method = RequestMethod.GET)
	public String Order_history(Model model, String email) {
	    List<OrderHistory> orders = orderHistroyService.getOrderHistory(email);
		model.addAttribute("orders", orders);
		return "Order_history";
	}
}
