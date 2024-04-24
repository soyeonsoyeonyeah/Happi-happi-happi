package find;

import kr.ac.kopo.vo.MemberVO;
import login_logout.LoginUI;

public class FindID extends FindBaseUI {

	@Override
	public void execute() throws Exception {

		System.out.println("==========================================");
		System.out.println("             >>>>���̵�ã��<<<<<<");
		System.out.println("==========================================");
		String name = scanStr("�̸��� �Է��ϼ��� : ");
		int phone = scanInt("��ȭ��ȣ�� �Է��ϼ��� : ");
		System.out.println("==========================================");

		MemberVO member = new MemberVO();
		member.setName(name);
		member.setPhone(phone);

		MemberVO findVO = findservice.find(member);

		if (findVO == null) {
			System.out.println("�Է��Ͻ� ���� Ȯ�����ּ���. �������� �ʴ� �����Դϴ�.");
			execute();
		} else {
			System.out.println("��ȣ ã�Ƴ¾��");
			MemberVO.loginVO = findVO;
			System.out.println("����� ���̵��!<" + findVO.getId() + "> �Դϴٿ�!! ������ ����Ͻö��!");
			System.out.println("==========================================");

			System.out.println();
			LoginUI login = new LoginUI();
			login.execute();
		}

	}

}
