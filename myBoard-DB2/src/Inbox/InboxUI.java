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
			System.out.println("받은 메일이 없는데유?!?!?!");
			new MailMenu().execute();
		}

		else {
			System.out.println("===================================================================================");
			System.out.println("                                " + MemberVO.loginVO.getName() + "님께서 받은 메일임당~!");
			System.out.println("===================================================================================");
			System.out.println("번호      보낸사람          받는사람       제목                내용                    시간 ");
			System.out.println("===================================================================================");
			for (InboxVO inbox : list) {
				System.out.println(inbox.getNo() +"        " + inbox.getSender() + "         " + inbox.getReceiver() + "      "
						+ inbox.getTitle() + "      " + inbox.getContents() + "    " + inbox.getTime_());
				System.out.println("===================================================================================");
			}

		}
		System.out.println();
		System.out.println("메일을 삭제하고 싶은가용?");
		System.out.println("1. 그렇다");
		System.out.println("2. 아니다");
		int a = sc.nextInt();

		switch (a) {
		case 1:
			new DeleteUI().execute();
		}

	}

}
