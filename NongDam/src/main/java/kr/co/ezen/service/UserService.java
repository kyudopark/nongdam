package kr.co.ezen.service;

import java.util.HashMap;

import javax.servlet.http.HttpServletResponse;

import kr.co.ezen.entity.User;

public interface UserService {

	
	public void insertUser(User user);
	public User registerCheck(String user_id);
	public User userLogin(User uvo);
	
	public boolean isNameExists(String user_name);
    public boolean isEmailExists(String user_email);
    public User findUserId(String user_name, String user_email);
    
    //이메일발송
    public void sendEmail(User user,String div) throws Exception;

    //비밀번호찾기
    public void findPw(HttpServletResponse resp, User user) throws Exception;

    public int updatePw(User user) throws Exception;
    
    public  User readUser(String user_id);
    
    //public int sendEmailVerification(String user_email);
    
    //public boolean verifyCode(String user_email, String verificationCode);
    
  //카카오 추가 KakaoMapper 삭제하고 여기다 추가함
    public void kakaoInsert(HashMap<String, Object> userInfo);
    public User findKakao(HashMap<String, Object> userInfo);
    public User kakaoNumber(User userInfo);
    public String getAccessToken(String authorize_code);
    public User getUserInfo (String access_Token);
    
}
