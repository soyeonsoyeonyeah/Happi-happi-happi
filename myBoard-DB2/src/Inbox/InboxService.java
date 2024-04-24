package Inbox;

import java.util.List;

import kr.ac.kopo.vo.InboxVO;

public class InboxService {
	
	
	private InboxDAO dao;
	
	public InboxService() {
		dao = new InboxDAO();
	}
	
	public List<InboxVO> searchInbox(){
		
		List<InboxVO> list = dao.inbox();
		return list;
		
	}
	
	
	
	
public List<InboxVO> inbox(){
		
		List<InboxVO> list = dao.inbox2();
		return list;
		
	}
	

	
	
    
}
