package kr.ac.kopo.ui;

import kr.ac.kopo.vo.MemberVO;

public class JoinUI extends BaseUI {

	@Override
	public void execute() throws Exception {

		String name = scanStr("�̸�");
		int phone = scanInt("��ȭ��ȣ");
		int bd = scanInt("�������8�ڸ� ex)19951226 ");
		String id = scanStr("���̵� �Է�");
		String password = scanStr("��й�ȣ �Է�");
		String password2 = scanStr("��й�ȣ Ȯ��");
		while (!password.equals(password2)) {
		
			System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�. �ٽ� �Է����ּ���");
			System.out.println();
			password = scanStr("��й�ȣ �Է�");
			password2 = scanStr("��й�ȣ Ȯ��");
			System.out.println();
			
		

		}
		
		MemberVO board = new MemberVO();
		board.setName(name);
		board.setPhone(phone);
		board.setBd(bd);
		board.setId(id);
		board.setPassword(password);
		
		service.addBoard(board);	
		
	System.out.println("ȸ�������� �Ϸ�Ǿ����ϴ�");
	}
}
