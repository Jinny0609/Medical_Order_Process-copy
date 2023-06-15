package gmt.medical.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gmt.medical.mapper.Info_mapper;
import gmt.medical.model.LoginVO;

@Service
public class InfoServiceImpl implements InfoService{
	
	@Autowired
    private Info_mapper InfoRepository;
	
	// 회원정보 수정 하기전 검증 페이지 이메일 갖고오는 부분
	public LoginVO getuseremail(int user_id) {
		return InfoRepository.getuseremail(user_id);
	}
	
	// 회원정보 검증
	public Boolean checkCredentials(String emailId, String password,int userId) {
		return InfoRepository.checkCredentials(emailId, password, userId);
	}
	// 회원정보 수정 후 저장
	public void updateUserInfo(String emailId, String password, int userId, String name, String phonenum) {
		InfoRepository.updateUserInfo(emailId, password, userId, name, phonenum);
	}
}
