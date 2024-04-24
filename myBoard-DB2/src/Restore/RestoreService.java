package Restore;

import kr.ac.kopo.vo.InboxVO;

public class RestoreService {
	
	
	private RestoreDAO dao;
	
	public RestoreService() {
		dao = new RestoreDAO();
	}
	
	public InboxVO restore(InboxVO email) throws Exception{
		
		InboxVO sentVO = dao.restore(email);
		return sentVO;
		
	}
	
	
    
}
