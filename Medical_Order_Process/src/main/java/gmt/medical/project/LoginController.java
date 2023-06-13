package gmt.medical.project;

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
			session.setAttribute("user_form", result);
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
		System.out.println(loginVO);
		return "redirect:/Login";
	}
}
