package Inbox;

import java.util.List;

import Delete.DeleteUI;
import kr.ac.kopo.ui.MailMenu;
import kr.ac.kopo.vo.InboxVO;
import kr.ac.kopo.vo.MemberVO;

public class InboxUI extends InboxBaseUI {

	@Override
	public void execute() throws Exception {

		List<InboxVO> list = inboxservice.inbox();

		if (list.isEmpty()) {
			System.out.println("���� ������ ���µ���?!?!?!");
			new MailMenu().execute();
		}

		else {
			System.out.println("===================================================================================");
			System.out.println("                                " + MemberVO.loginVO.getName() + "�Բ��� ���� �����Ӵ�~!");
			System.out.println("===================================================================================");
			System.out.println("��ȣ      �������          �޴»��       ����                ����                    �ð� ");
			System.out.println("===================================================================================");
			for (InboxVO inbox : list) {
				System.out.println(inbox.getNo() +"        " + inbox.getSender() + "         " + inbox.getReceiver() + "      "
						+ inbox.getTitle() + "      " + inbox.getContents() + "    " + inbox.getTime_());
				System.out.println("===================================================================================");
			}

		}
		System.out.println();
		System.out.println("������ �����ϰ� ��������?");
		System.out.println("1. �׷���");
		System.out.println("2. �ƴϴ�");
		int a = sc.nextInt();

		switch (a) {
		case 1:
			new DeleteUI().execute();
		}

	}

}
