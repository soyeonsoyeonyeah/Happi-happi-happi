package find;

import kr.ac.kopo.vo.MemberVO;
import login_logout.LoginUI;

public class FindPW extends FindBaseUI {

	@Override
	public void execute() throws Exception {
		System.out.println(">>>>��й�ȣ ã��<<<<<<");
		String id = scanStr("���̵� �Է��ϼ��� : ");
		int phone = scanInt("��ȭ��ȣ�� �Է��ϼ��� : ");

		MemberVO member = new MemberVO();
		member.setId(id);
		member.setPhone(phone);

		MemberVO findVO = findservice.findPW(member);

		if (findVO == null) {
			System.out.println("�Է��Ͻ� ���� Ȯ�����ּ���. �������� �ʴ� �����Դϴ�.");
			execute();
		} else {
			System.out.println("��ȣ ã�Ƴ¾��");
			System.out.println();
			MemberVO.loginVO = findVO;
			System.out.println("����� ��й�ȣ��!<" + findVO.getPassword() + "> �Դϴٿ�!! ������ ����Ͻö��!");
			
			System.out.println();
			LoginUI login = new LoginUI();
			login.execute();
		}

		
	}

}
