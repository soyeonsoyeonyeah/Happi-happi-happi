package Update;

import kr.ac.kopo.vo.MemberVO;
import login_logout.LoginUI;

public class UpdatePW extends UpdateBaseUI {
	
	@Override
	public void execute() throws Exception {
		System.out.println(">>>>비밀번호 바꾸기<<<<<<");
		String id = scanStr("아이디를 입력하세요 : ");
		int phone = scanInt("전화번호를 입력하세요 : ");
		while (phone != MemberVO.loginVO.getPhone()) {
			phone = scanInt("다시 올바른 번호를 입력하라구욧!");
		}
		
		String password = scanStr("현재 비밀번호를 입력하세요 : ");
		while (!password.equals(MemberVO.loginVO.getPassword())) { // while 문 오타 수정
			System.out.println("올바른 비밀번호를 입력하세욧!"); // while 문 내에서 출력문 추가
			password = scanStr("현재 비밀번호를 입력하세요 : "); // 비밀번호 재입력
		}
		String newpassword = scanStr("변경하고 싶은 비밀번호를 입력하세요:");
		String newpassword2 = scanStr("비밀번호 확인:");
		while (!newpassword.equals(newpassword2)) {
			System.out.println("변경된 비밀번호가 일치하지 않습니다. 신~~중하게~~하세요!");
			newpassword = scanStr("변경하고 싶은 비밀번호를 입력하세요:");
			newpassword2 = scanStr("비밀번호 확인:");
		}

		MemberVO member = new MemberVO();
		member.setId(id);
		member.setPassword(newpassword);
		member.setPhone(phone);

		updateservice.updatePW(member);
		
		new LoginUI().execute();

	}

}


