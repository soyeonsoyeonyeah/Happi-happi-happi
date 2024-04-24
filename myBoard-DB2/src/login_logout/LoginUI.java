package login_logout;

import kr.ac.kopo.ui.MailMenu;
import kr.ac.kopo.ui.MailUI;
import kr.ac.kopo.vo.MemberVO;

public class LoginUI extends LoginBaseUI {

	@Override
	public void execute() throws Exception {

		System.out.println("<<< �Ǵϸ��� �α��� >>>");
		String id = scanStr("���̵� �Է��Ͻÿ� : ");
		String password = scanStr("��й�ȣ�� �Է��Ͻÿ� : ");

		MemberVO member = new MemberVO();
		member.setId(id);
		member.setPassword(password);

		MemberVO loginVO = loginservice.login(member);

		if (loginVO == null) {
			
			System.out.println("���̵� �Ǵ� ��й�ȣ�� �ٽ� Ȯ�����ּ���");
			new MailUI().execute();

			
		} else {

			MemberVO.loginVO = loginVO;
			System.out.println("================================================");
			System.out.println("             ȯ���մϴ�[" + MemberVO.loginVO.getName() + "]��");
			System.out.println("================================================");
			System.out.println();
			new MailMenu().execute();
			//IBoardUI ui = null;
			//ui = new MailMenu();
			
			
		}

	}

}
