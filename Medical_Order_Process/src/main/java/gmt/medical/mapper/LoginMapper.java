package gmt.medical.mapper;

import java.util.List;

import gmt.medical.model.Hcode;
import gmt.medical.model.LoginVO;

public interface LoginMapper {
	// 회원가입 정보 저장
	public void signup(LoginVO loginVO);
	// 로그인 정보 검증
	public LoginVO login_Success(LoginVO loginVO);
	// 비밀번호 찾기
	public String findpasswordByEmailId(String emailId);
	// 병원 코드 가져 오기 
	public List<Hcode> gethcode();
}
