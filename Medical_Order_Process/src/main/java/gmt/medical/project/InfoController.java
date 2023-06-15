package gmt.medical.project;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import gmt.medical.model.LoginVO;
import gmt.medical.service.InfoService;

@Controller
public class InfoController {
	
	@Autowired
	private InfoService infoService;

	// 개인정보 수정 전 비밀번호 확인 페이지
	@RequestMapping(value = "/Info_edit", method = RequestMethod.GET)
	public String Info_edit(HttpSession session,LoginVO loginVO) {
		// 세션에서 사용자 고유 키(user_id) 가져오기
	    int user_id = (int) session.getAttribute("user_id");
	    LoginVO email_id = infoService.getuseremail(user_id);
	    session.setAttribute("User_date", email_id);
		return "Info_edit";
	}
	
	@RequestMapping(value = "/Info_edit_Form", method = RequestMethod.GET)
	public String Info_edit_Form() {
		return "/Info_edit_Form";
	}
	
	// 개인정보 수정 후 저장 페이지
	@RequestMapping(value = "/Info_edit_Form", method = RequestMethod.POST)
	public String Info_edit_Form(@RequestParam("user_id") int userId, @RequestParam("email_id") String emailId, @RequestParam("password") String password, Model model) {
		 // 아이디와 비밀번호를 사용하여 DB에서 조회 및 일치 여부 확인
		Boolean isMatch = infoService.checkCredentials(emailId, password, userId);
	    
		if (isMatch != null && isMatch) {
	        // 일치하는 경우 페이지 이동 처리
	        return "redirect:/Info_edit_Form";
	    } else {
	        // 일치하지 않는 경우에 대한 처리 (예: 오류 메시지 표시)
	        model.addAttribute("errorMessage", "아이디와 비밀번호가 일치하지 않습니다.");
	        return "Info_edit";
	    }
	}
	
	// 개인정보 수정 파일 저장
	@RequestMapping(value = "/updateUserInfo", method = RequestMethod.POST)
	public String updateUserInfo(@RequestParam("user_id") int userId, @RequestParam("email_id") String emailId, @RequestParam("password") String password, @RequestParam("name") String name, @RequestParam("phonenum") String phonenum) {
		infoService.updateUserInfo(emailId, password, userId, name, phonenum);
		return "redirect:/Info_edit";
	}
}
