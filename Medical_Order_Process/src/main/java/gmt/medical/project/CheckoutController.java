package gmt.medical.project;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import gmt.medical.model.CartVO;
import gmt.medical.model.Shipping_address;
import gmt.medical.service.Shipping_address_Service;

@Controller
public class CheckoutController {
	
	@Autowired
	private Shipping_address_Service addressService;
	
	// 구매정보 입력 페이지
	@RequestMapping(value = "/Checkout", method = RequestMethod.GET)
	public String Checkout(HttpSession session) {
		 List<CartVO> cartList = (List<CartVO>) session.getAttribute("CartList");
		 Integer user_id = (Integer) session.getAttribute("user_id");
		 String hcode = (String) session.getAttribute("hcode");
		 String name = (String) session.getAttribute("name");
		 String email_id = (String) session.getAttribute("email_id");
		 String phonenum = (String) session.getAttribute("phonenum");
		 Shipping_address address = addressService.getaddressdate(user_id);
		 
		 session.setAttribute("OtherControllerCartList", cartList); // 세션에 카트 데이터 저장
		 session.setAttribute("User_data_name", name); // 세션에 이름 데이터 저장
		 session.setAttribute("User_data_email_id", email_id); // 세션에 이메일 데이터 저장
		 session.setAttribute("User_data_phonenum", phonenum); // 세션에 폰넘버 데이터 저장
		 session.setAttribute("Address", address); // 최근 배송지 주소 저장
		return "Checkout";
	}
}
