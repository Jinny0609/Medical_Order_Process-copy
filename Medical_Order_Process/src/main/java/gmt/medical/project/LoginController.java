package gmt.medical.project;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import gmt.medical.model.LoginVO;
import gmt.medical.service.LoginService;

@Controller
public class LoginController {
	
	@Autowired
	private LoginService loginservice;
	
	@Autowired
	HttpSession session;
	
	/*로그인*/
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
	        return "redirect:/"; // Replace "success-page" with the actual URL of the success page
	    } else {
	        return "redirect:/Login"; // Replace "failure-page" with the actual URL of the failure page
	    }
	}

	/*회원가입*/
	@RequestMapping(value = "/Sign_up", method = RequestMethod.GET)
	public String signup() {
		return "Sign_up";
	}
	
	/*회원가입*/
	@RequestMapping(value = "/Sign_up", method = RequestMethod.POST)
	public String signup(LoginVO loginVO) {
		loginservice.signup(loginVO);
		return "redirect:/Login";
	}
	
	/*로그아웃*/
	@RequestMapping(value = "/Logout", method = RequestMethod.GET)
	public String Logout(HttpServletRequest request) {
		HttpSession session = request.getSession();
	    session.invalidate();
		return "redirect:/";
	}
}
