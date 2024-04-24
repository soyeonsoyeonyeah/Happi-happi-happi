package kr.ac.kopo.service;

import login_logout.LoginService;

public class BoardServiceFactory {
	
	private static MemberService service;
	private static LoginService logservice;
	
	public static MemberService getInstance() {
		if(service == null) {
			service = new MemberService();
		}
		return service;
	}
	
	public static LoginService getInstance1() {
		if(logservice == null) {
			logservice = new LoginService();
		}
		return logservice;
	

}
	
}
