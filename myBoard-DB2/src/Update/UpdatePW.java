package Update;

import kr.ac.kopo.vo.MemberVO;
import login_logout.LoginUI;

public class UpdatePW extends UpdateBaseUI {
	
	@Override
	public void execute() throws Exception {
		System.out.println(">>>>��й�ȣ �ٲٱ�<<<<<<");
		String id = scanStr("���̵� �Է��ϼ��� : ");
		int phone = scanInt("��ȭ��ȣ�� �Է��ϼ��� : ");
		while (phone != MemberVO.loginVO.getPhone()) {
			phone = scanInt("�ٽ� �ùٸ� ��ȣ�� �Է��϶󱸿�!");
		}
		
		String password = scanStr("���� ��й�ȣ�� �Է��ϼ��� : ");
		while (!password.equals(MemberVO.loginVO.getPassword())) { // while �� ��Ÿ ����
			System.out.println("�ùٸ� ��й�ȣ�� �Է��ϼ���!"); // while �� ������ ��¹� �߰�
			password = scanStr("���� ��й�ȣ�� �Է��ϼ��� : "); // ��й�ȣ ���Է�
		}
		String newpassword = scanStr("�����ϰ� ���� ��й�ȣ�� �Է��ϼ���:");
		String newpassword2 = scanStr("��й�ȣ Ȯ��:");
		while (!newpassword.equals(newpassword2)) {
			System.out.println("����� ��й�ȣ�� ��ġ���� �ʽ��ϴ�. ��~~���ϰ�~~�ϼ���!");
			newpassword = scanStr("�����ϰ� ���� ��й�ȣ�� �Է��ϼ���:");
			newpassword2 = scanStr("��й�ȣ Ȯ��:");
		}

		MemberVO member = new MemberVO();
		member.setId(id);
		member.setPassword(newpassword);
		member.setPhone(phone);

		updateservice.updatePW(member);
		
		new LoginUI().execute();

	}

}


