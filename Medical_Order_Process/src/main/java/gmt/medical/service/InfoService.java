package gmt.medical.service;

import gmt.medical.model.LoginVO;

public interface InfoService {
	public LoginVO getuseremail(int user_id);
	public Boolean checkCredentials(String emailId, String password,int userId);
	public void updateUserInfo(String emailId, String password, int userId, String name, String phonenum);
}
