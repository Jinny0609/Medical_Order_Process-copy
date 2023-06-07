package gmt.medical.project;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {
	@RequestMapping(value = "/Login", method = RequestMethod.GET)
	public String login() {
		return "Login";
	}
	@RequestMapping(value = "/Sign_up", method = RequestMethod.GET)
	public String signup() {
		return "Sign_up";
	}
}
