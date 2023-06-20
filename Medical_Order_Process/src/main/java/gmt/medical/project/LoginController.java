package gmt.medical.project;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import gmt.medical.model.Hcode;
import gmt.medical.model.LoginVO;
import gmt.medical.service.LoginService;

@Controller
public class LoginController {

	@Autowired
	private LoginService loginservice;
	
	/* 로그인 */
	@RequestMapping(value = "/Login", method = RequestMethod.GET)
	public String login() {
		return "Login";
	}

	@RequestMapping(value = "/Login", method = RequestMethod.POST)
	public String login_Success(LoginVO loginVO, HttpSession session) {
		LoginVO result = loginservice.login_Success(loginVO);
		if (result != null) {
			session.setAttribute("user_id", result.getUser_id()); // 세션에 사용자 키(user_id) 설정
			session.setAttribute("name", result.getName()); // 세션에 사용자 이름(nickname) 설정
			session.setAttribute("hcode", result.getHcode()); // 세션에 로그인한 사용자의 병원 코드 설정
			return "redirect:/"; // Replace "success-page" with the actual URL of the success page
		} else {
			return "redirect:/Login"; // Replace "failure-page" with the actual URL of the failure page
		}
	}

	/* 회원가입 */
	@RequestMapping(value = "/Sign_up", method = RequestMethod.GET)
	public String signup(Model model) {
		List<Hcode> hcode =  loginservice.gethcode();
		model.addAttribute("Hcode", hcode);
		return "Sign_up";
	}

	/* 회원가입 */
	@RequestMapping(value = "/Sign_up", method = RequestMethod.POST)
	public String signup(LoginVO loginVO) {
		loginservice.signup(loginVO);
		return "redirect:/Login";
	}

	/* 로그아웃 */
	@RequestMapping(value = "/Logout", method = RequestMethod.GET)
	public String Logout(HttpServletRequest request) {
		HttpSession session = request.getSession();
		session.invalidate();
		return "redirect:/";
	}

	/*비밀번호 찾기*/
	@RequestMapping(value = "/Findpassword", method = RequestMethod.GET)
	public String findPassword() {
	    return "Findpassword";
	}

	@RequestMapping(value = "/Findpassword", method = RequestMethod.POST)
	public String findPassword(@RequestParam("email_id") String emailId, Model model) {
	    String password = loginservice.findpasswordByEmailId(emailId);
	    if (password != null) {
	        model.addAttribute("password", password);
	        return "Findpassword2";
	    } else {
	        model.addAttribute("error", "입력한 이메일이 존재하지 않습니다.");
	        return "Findpassword";
	    }
	}

	/*비밀번호 보여지는 페이지*/
	@RequestMapping(value = "/Findpassword2", method = RequestMethod.GET)
	public String Findpassword2() {
	    return "Findpassword2";
	}
	@RequestMapping(value = "/Order_history", method = RequestMethod.GET)
	public String Order_history() {
	    return "Order_history";
	}
}
