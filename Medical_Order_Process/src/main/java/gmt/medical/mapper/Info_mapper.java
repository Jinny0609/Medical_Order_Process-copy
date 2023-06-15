package gmt.medical.mapper;

import org.apache.ibatis.annotations.Param;

import gmt.medical.model.LoginVO;

public interface Info_mapper {
	// 이메일 갖고오기
	public LoginVO getuseremail(int user_id);
	// 회원정보 검증
	public Boolean checkCredentials(@Param("email_id") String emailId, @Param("password") String password, @Param("user_id") int userId);
	// 회원정보 수정 저장
	public void updateUserInfo(@Param("email_id") String emailId, @Param("password") String password, @Param("user_id") int userId, @Param("name") String name, @Param("phonenum") String phonenum);
}
