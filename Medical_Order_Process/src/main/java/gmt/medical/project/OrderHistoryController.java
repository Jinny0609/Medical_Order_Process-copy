package gmt.medical.project;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import gmt.medical.model.OrderHistory;
import gmt.medical.service.OrderHistoryService;

@Controller
public class OrderHistoryController {
	@Autowired
	private OrderHistoryService orderHistoryService;
	
	@RequestMapping(value = "/Order_history", method = RequestMethod.GET)
    public String getOrderHistory(Model model) {
        List<OrderHistory> orderList = orderHistoryService.getOrderList(); // 주문 목록 조회
        model.addAttribute("orderList", orderList); // 조회한 주문 목록을 모델에 추가
        
        return "/Order_history"; // 주문 목록을 출력할 뷰의 이름 반환
    }
}
