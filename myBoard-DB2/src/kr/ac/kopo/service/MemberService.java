package kr.ac.kopo.service;

import java.util.List;

import kr.ac.kopo.dao.MemberDAO;
import kr.ac.kopo.vo.BoardVO;
import kr.ac.kopo.vo.MemberVO;

public class MemberService {
	
	
	private MemberDAO dao;
	
	public MemberService() {
		dao = new MemberDAO();
	}
	
	public void addBoard(MemberVO board) {
		
		dao.insert(board);
		
	}
	
	
	public List<BoardVO> searchAllBoard(){
		List<BoardVO> list = dao.selectALL();
		return list;
	}
    
}
