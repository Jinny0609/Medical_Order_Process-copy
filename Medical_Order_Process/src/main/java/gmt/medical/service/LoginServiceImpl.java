package gmt.medical.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gmt.medical.mapper.LoginMapper;
import gmt.medical.model.Hcode;
import gmt.medical.model.LoginVO;

@Service
public class LoginServiceImpl implements LoginService {
	
	@Autowired
	private LoginMapper loginMapper;
	
	// 회원가입 정보 저장
	public void signup(LoginVO loginVO) {
		loginMapper.signup(loginVO);
	}
	// 로그인 정보 검증
	public LoginVO login_Success(LoginVO loginVO) {
		return loginMapper.login_Success(loginVO);
	}
	// 비밀번호 찾기
	public String findpasswordByEmailId(String emailId) {
		return loginMapper.findpasswordByEmailId(emailId);
	}
	// 병원코드 가져오기
	public List<Hcode> gethcode() {
		return loginMapper.gethcode();
	}
}
