package Bin;

import java.util.List;

import Restore.RestoreUI;
import kr.ac.kopo.ui.MailMenu;
import kr.ac.kopo.vo.InboxVO;

public class BinUI extends BinBaseUI {

	@Override
	public void execute() throws Exception {
		
		List<InboxVO> list = binservice.bin();
		
		
		if(list.isEmpty()) {
			System.out.println("휴지통이 비었습니다!");
			System.out.println();
			new MailMenu().execute();
		}
		
		else {
			System.out.println("=======================================================================================");
			System.out.println("                   휴지통 휴지통 휴지통이다");
			System.out.println("=======================================================================================");
			System.out.println("번호      보낸사람          받는사람       제목           내용           시간 ");
			for(InboxVO inbox : list) {
				System.out.println(inbox.getNo() +"        " + inbox.getSender() + "         " + inbox.getReceiver() + "      "
						+ inbox.getTitle() + "      " + inbox.getContents() + "    " + inbox.getTime_());
				System.out.println("=======================================================================================");
			}
			
		}
		System.out.println("메일을 복구하고 싶은가용?");
		System.out.println("1. 그렇다");
		System.out.println("2. 아니다");
		int a = sc.nextInt();
		
		switch(a) {
		case 1:
			new RestoreUI().execute();
		}
		



			
		}

	}

