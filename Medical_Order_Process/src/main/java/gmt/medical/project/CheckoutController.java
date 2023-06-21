package gmt.medical.project;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import gmt.medical.model.CartVO;
import gmt.medical.model.LoginVO;

@Controller
public class CheckoutController {
	// 구매정보 입력 페이지
	@RequestMapping(value = "/Checkout", method = RequestMethod.GET)
	public String Checkout(HttpSession session) {
		 List<CartVO> cartList = (List<CartVO>) session.getAttribute("CartList");
		 Integer user_id = (Integer) session.getAttribute("user_id");
		 int hcode = (int) session.getAttribute("hcode");
		 String name = (String) session.getAttribute("name");
		 String email_id = (String) session.getAttribute("email_id");
		 String phonenum = (String) session.getAttribute("phonenum");
		 
		 session.setAttribute("OtherControllerCartList", cartList); // 세션에 카트 데이터 저장
		 session.setAttribute("User_data_name", name); // 세션에 이름 데이터 저장
		 session.setAttribute("User_data_email_id", email_id); // 세션에 이메일 데이터 저장
		 session.setAttribute("User_data_phonenum", phonenum); // 세션에 폰넘버 데이터 저장
		return "Checkout";
	}
}
