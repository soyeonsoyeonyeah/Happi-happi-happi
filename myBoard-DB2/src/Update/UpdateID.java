package Update;

import kr.ac.kopo.vo.MemberVO;
import login_logout.LoginUI;

public class UpdateID extends UpdateBaseUI {

	@Override
	public void execute() throws Exception {

		System.out.println(">>>>���̵𺯰�<<<<<<");
		
		String name = scanStr("�̸��� �Է��ϼ��� : ");
		while(!name.equals(MemberVO.loginVO.getName())){
			name = scanStr("�ùٸ� �̸��� �Է��ϼ���!");
		}
		int phone = scanInt("��ȭ��ȣ�� �Է��ϼ��� : ");
		while (phone != MemberVO.loginVO.getPhone()) {
			phone = scanInt("�ٽ� �ùٸ� ��ȣ�� �Է��϶󱸿�!");
		}
		
		String id = scanStr("�����ϰ� ���� ���̵� �Է��Ͻÿ�: ");

		MemberVO member = new MemberVO();
		member.setName(name);
		member.setPhone(phone);
		member.setId(id);

		updateservice.update(member);

		

			System.out.println();
			LoginUI login = new LoginUI();
			login.execute();
		}

	}


