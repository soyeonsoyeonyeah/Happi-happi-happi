package kr.ac.kopo.ui;

import kr.ac.kopo.vo.MemberVO;

public class JoinUI extends BaseUI {

	@Override
	public void execute() throws Exception {

		String name = scanStr("이름");
		int phone = scanInt("전화번호");
		int bd = scanInt("생년월일8자리 ex)19951226 ");
		String id = scanStr("아이디 입력");
		String password = scanStr("비밀번호 입력");
		String password2 = scanStr("비밀번호 확인");
		while (!password.equals(password2)) {
		
			System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요");
			System.out.println();
			password = scanStr("비밀번호 입력");
			password2 = scanStr("비밀번호 확인");
			System.out.println();
			
		

		}
		
		MemberVO board = new MemberVO();
		board.setName(name);
		board.setPhone(phone);
		board.setBd(bd);
		board.setId(id);
		board.setPassword(password);
		
		service.addBoard(board);	
		
	System.out.println("회원가입이 완료되었습니다");
	}
}
