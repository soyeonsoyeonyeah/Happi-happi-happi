package login_logout;

import kr.ac.kopo.ui.MailMenu;
import kr.ac.kopo.ui.MailUI;
import kr.ac.kopo.vo.MemberVO;

public class LoginUI extends LoginBaseUI {

	@Override
	public void execute() throws Exception {

		System.out.println("<<< 또니메일 로그인 >>>");
		String id = scanStr("아이디를 입력하시오 : ");
		String password = scanStr("비밀번호를 입력하시오 : ");

		MemberVO member = new MemberVO();
		member.setId(id);
		member.setPassword(password);

		MemberVO loginVO = loginservice.login(member);

		if (loginVO == null) {
			
			System.out.println("아이디 또는 비밀번호를 다시 확인해주세요");
			new MailUI().execute();

			
		} else {

			MemberVO.loginVO = loginVO;
			System.out.println("================================================");
			System.out.println("             환영합니다[" + MemberVO.loginVO.getName() + "]님");
			System.out.println("================================================");
			System.out.println();
			new MailMenu().execute();
			//IBoardUI ui = null;
			//ui = new MailMenu();
			
			
		}

	}

}
