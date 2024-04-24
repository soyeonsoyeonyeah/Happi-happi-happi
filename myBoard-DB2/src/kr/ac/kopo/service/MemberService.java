package kr.ac.kopo.service;

import kr.ac.kopo.dao.MemberDAO;
import kr.ac.kopo.vo.MemberVO;

public class MemberService {
	
	
	private MemberDAO dao;
	
	public MemberService() {
		dao = new MemberDAO();
	}
	
	public void addBoard(MemberVO board) {
		
		dao.insert(board);
		
	}
	
	
	
    
}
