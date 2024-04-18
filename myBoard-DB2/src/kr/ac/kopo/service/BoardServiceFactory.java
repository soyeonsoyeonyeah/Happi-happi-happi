package kr.ac.kopo.service;

public class BoardServiceFactory {
	
	private static MemberService service;
	
	public static MemberService getInstance() {
		if(service == null) {
			service = new MemberService();
		}
		return service;
	}

}
