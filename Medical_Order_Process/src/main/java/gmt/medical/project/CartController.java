package gmt.medical.project;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import gmt.medical.model.CartVO;
import gmt.medical.model.OptionData;
import gmt.medical.model.RequestData;
import gmt.medical.service.CartService;

@Controller
public class CartController {
	@Autowired
	private CartService cartService;

	@RequestMapping(value = "/Cart", method = RequestMethod.GET)
	public String cart(HttpSession session) {
		int user_id = (int) session.getAttribute("user_id");
		List<CartVO> cartList = cartService.addToCart(user_id);
		session.setAttribute("CartList", cartList);
		return "Cart";
	}
	// 장바구니 버튼 누르면 오는곳
	@RequestMapping(value = "/Product_details", method = RequestMethod.POST)
	public ResponseEntity<String> Cart_table(@RequestBody RequestData requestData, HttpSession session) {
		 List<OptionData> selectedOptions = requestData.getSelectedOptions();
		    int productId = requestData.getProductId();// 제품 고유키
		    String productName = requestData.getProductName(); //제품 이름
		    int productPrice = requestData.getProductPrice(); // 제품 가격
		    String imagePath = requestData.getImage_path(); // 이미지 경로
		    Integer user_id = (Integer) session.getAttribute("user_id"); // 유저 고유키

		    for (OptionData option : selectedOptions) {
		        String name = option.getName(); // 제품 옵션 이름
		        int quantity = option.getQuantity(); // 제품 옵션 수량
			// 장바구니에 옵션 추가 로직 작성
		        cartService.addcatedata(productId,productName,productPrice,user_id,name,quantity,imagePath);
		}
		// "Product_details" 페이지로 이동하거나 응답을 반환하는 코드
		    return new ResponseEntity<> (HttpStatus.OK);
	}
	
	@RequestMapping(value = "/Checkout", method = RequestMethod.POST)
	public ResponseEntity<String> BuyNowServlet(@RequestBody RequestData requestData, HttpSession session) {
	    System.out.println("checkout........." + requestData);

	    List<OptionData> selectedOptions = requestData.getSelectedOptions();
	    int productId = requestData.getProductId(); // 제품 고유키
	    String productName = requestData.getProductName(); // 제품 이름
	    int productPrice = requestData.getProductPrice(); // 제품 가격
	    String imagePath = requestData.getImage_path(); // 이미지 경로
	    Integer user_id = (Integer) session.getAttribute("user_id"); // 유저 고유키

	    try {
	        cartService.additemdelete(user_id);

	        for (OptionData option : selectedOptions) {
	            String name = option.getName(); // 제품 옵션 이름
	            int quantity = option.getQuantity(); // 제품 옵션 수량

	            cartService.additemdata(productId, productName, productPrice, user_id, name, quantity, imagePath);
	        }

	        List<CartVO> cartList = cartService.getitemdata(user_id);
	        session.setAttribute("CartList", cartList);
	    } catch (Exception e) {
	        // 오류 발생 시 콘솔 로그에 출력
	        e.printStackTrace();
	        throw e; // 예외를 다시 던져서 500 오류를 전달
	    }

	    // 페이지로 이동하거나 응답을 반환하는 코드
	    return new ResponseEntity<>(HttpStatus.OK);
	}
	// 장바구니 상품 삭제
		@RequestMapping(value = "/Cart_delete", method = { RequestMethod.GET, RequestMethod.POST })
		public String Cartdelete(int product_id, HttpSession session) {
		    int user_id = (int) session.getAttribute("user_id");
		    cartService.deleteCart(user_id, product_id);
		    return "redirect:/Cart";
		}
}
