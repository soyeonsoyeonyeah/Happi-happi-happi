package Send;

import kr.ac.kopo.vo.InboxVO;
import kr.ac.kopo.vo.MemberVO;

public class SendUI extends SendBaseUI {

	@Override
	public void execute() throws Exception {

		System.out.println("<<< ������ ���������? >>>");
		String sender = MemberVO.loginVO.getId();
		//String sender = scanStr("�ƹ��ų� �����»��");
		String receiver = scanStr("�������� �������?");
		String title = scanStr("��������?");
		String contents = scanStr("��������?");
		
	
		InboxVO email = new InboxVO();
		email.setSender(sender);
		email.setReceiver(receiver);
		email.setTitle(title);
		email.setContents(contents);

		
		InboxVO sentVO = sendservice.send(email);

		if (sentVO == null) {
			System.out.println("���� ������ �ֽ���!!!!!");

		} else {

		System.out.println("������ ���������� ���½��ϴٿ�");
			
			
		}

	}

}
