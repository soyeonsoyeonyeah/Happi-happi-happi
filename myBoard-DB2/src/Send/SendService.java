package Send;

import kr.ac.kopo.vo.InboxVO;

public class SendService {
	
	
	private SendDAO dao;
	
	public SendService() {
		dao = new SendDAO();
	}
	
	public InboxVO send(InboxVO email) throws Exception{
		
		InboxVO sentVO = dao.insert(email);
		return sentVO;
		
	}
	
	
    
}
