package login_logout;

import kr.ac.kopo.vo.MemberVO;

public class LoginService {
	
	
	private LoginDAO dao;
	
	public LoginService() {
		dao = new LoginDAO();
	}
	
	public MemberVO login(MemberVO member) throws Exception{
		
		MemberVO.loginVO = dao.select(member);
		return MemberVO.loginVO;
		
	}
	
	
    
}
