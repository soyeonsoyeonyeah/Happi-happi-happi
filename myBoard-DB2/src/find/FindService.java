package find;

import kr.ac.kopo.vo.MemberVO;

public class FindService {
	
	
	private FindDAO dao;
	
	public FindService() {
		dao = new FindDAO();
	}
	
	public MemberVO find(MemberVO member) throws Exception{
		
		MemberVO findVO = dao.find(member);
		
		return findVO;
		
	}
	
	public MemberVO findPW(MemberVO member) throws Exception{
		
		MemberVO findVO = dao.findPW(member);
		
		return findVO;
		
	}
	
	
    
}
