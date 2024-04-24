package Delete;

import kr.ac.kopo.vo.InboxVO;

public class DeleteService {
	
	
	private DeleteDAO dao;
	
	public DeleteService() {
		dao = new DeleteDAO();
	}
	
	public InboxVO delete(InboxVO email) throws Exception{
		
		InboxVO sentVO = dao.delete(email);
		return sentVO;
		
	}
	
	
    
}
