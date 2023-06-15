package gmt.medical.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gmt.medical.mapper.LoginMapper;
import gmt.medical.model.LoginVO;

@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	LoginMapper log;
	
	@Autowired
	private LoginMapper loginMapper;
	
	// 회원가입 정보 저장
	public void signup(LoginVO loginVO) {
		log.signup(loginVO);
	}
	// 로그인 정보 검증
	public LoginVO login_Success(LoginVO loginVO) {
		return log.login_Success(loginVO);
	}
	// 비밀번호 찾기
	public String findpasswordByEmailId(String emailId) {
		return loginMapper.findpasswordByEmailId(emailId);
	}
}
