package Update;

import kr.ac.kopo.vo.MemberVO;

public class UpdatePhone extends UpdateBaseUI {
	
	@Override
	public void execute() throws Exception {
		System.out.println(">>>>��ȭ��ȣ �ٲٱ�<<<<<<");		
		int phone = scanInt("���� ��ȭ��ȣ�� �Է��ϼ��� : ");
		while (phone != MemberVO.loginVO.getPhone()) {
			phone = scanInt("�ٽ� �ùٸ� ��ȣ�� �Է��϶󱸿�!");
		}
		
		String password = scanStr("���� ��й�ȣ�� �Է��ϼ��� : ");
		while (!password.equals(MemberVO.loginVO.getPassword())) { // while �� ��Ÿ ����
			System.out.println("�ùٸ� ��й�ȣ�� �Է��ϼ���!"); // while �� ������ ��¹� �߰�
			password = scanStr("���� ��й�ȣ�� �Է��ϼ��� : "); // ��й�ȣ ���Է�
		}
		int newphone = scanInt("�����ϰ� ���� ��ȭ��ȣ�� �Է��ϼ���:");
		int newphone2 = scanInt("��ȭ��ȣ Ȯ��:");
		while (newphone != newphone2) {
			System.out.println("����� ��ȭ��ȣ ��ġ���� �ʽ��ϴ�. ��~~���ϰ�~~�ϼ���!");
			newphone = scanInt("�����ϰ� ���� ��ȭ��ȣ�� �Է��ϼ���:");
			newphone2 = scanInt("��ȭ��ȣ Ȯ��:");
		}

		MemberVO member = new MemberVO();
		member.setPhone(newphone);
		member.setPassword(password);
	

		updateservice.updatePhone(member);
		

	}

}


