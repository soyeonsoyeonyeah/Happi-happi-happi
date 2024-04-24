package Update;

import kr.ac.kopo.vo.MemberVO;

public class UpdateService {
	
	
	private UpdateDAO dao;
	
	public UpdateService() {
		dao = new UpdateDAO();
	}
	
	public void update (MemberVO member) throws Exception{
		
		 dao.update(member);
		
		
	}
	
	public void updatePW(MemberVO member) throws Exception{
		
		dao.updatePW(member);
		
		
	}
	
	public void updatePhone(MemberVO member) throws Exception{
		
		dao.updatePhone(member);
		
		
	}
	
    
}
