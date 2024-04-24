package Bin;

import java.util.List;

import kr.ac.kopo.vo.InboxVO;

public class BinService {
	
	
	private BinDAO dao;
	
	public BinService() {
		dao = new BinDAO();
	}
	
	
	
	
public List<InboxVO> bin(){
		
		List<InboxVO> list = dao.bin();
		return list;
		
	}
	

	
	
    
}
