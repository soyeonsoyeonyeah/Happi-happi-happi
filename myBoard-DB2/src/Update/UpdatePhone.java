package Update;

import kr.ac.kopo.vo.MemberVO;

public class UpdatePhone extends UpdateBaseUI {
	
	@Override
	public void execute() throws Exception {
		System.out.println(">>>>전화번호 바꾸기<<<<<<");		
		int phone = scanInt("현재 전화번호를 입력하세요 : ");
		while (phone != MemberVO.loginVO.getPhone()) {
			phone = scanInt("다시 올바른 번호를 입력하라구욧!");
		}
		
		String password = scanStr("현재 비밀번호를 입력하세요 : ");
		while (!password.equals(MemberVO.loginVO.getPassword())) { // while 문 오타 수정
			System.out.println("올바른 비밀번호를 입력하세욧!"); // while 문 내에서 출력문 추가
			password = scanStr("현재 비밀번호를 입력하세요 : "); // 비밀번호 재입력
		}
		int newphone = scanInt("변경하고 싶은 전화번호를 입력하세요:");
		int newphone2 = scanInt("전화번호 확인:");
		while (newphone != newphone2) {
			System.out.println("변경된 전화번호 일치하지 않습니다. 신~~중하게~~하세요!");
			newphone = scanInt("변경하고 싶은 전화번호를 입력하세요:");
			newphone2 = scanInt("전화번호 확인:");
		}

		MemberVO member = new MemberVO();
		member.setPhone(newphone);
		member.setPassword(password);
	

		updateservice.updatePhone(member);
		

	}

}


