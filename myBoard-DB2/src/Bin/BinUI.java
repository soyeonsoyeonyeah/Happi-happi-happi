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
			System.out.println("�������� ������ϴ�!");
			System.out.println();
			new MailMenu().execute();
		}
		
		else {
			System.out.println("=======================================================================================");
			System.out.println("                   ������ ������ �������̴�");
			System.out.println("=======================================================================================");
			System.out.println("��ȣ      �������          �޴»��       ����           ����           �ð� ");
			for(InboxVO inbox : list) {
				System.out.println(inbox.getNo() +"        " + inbox.getSender() + "         " + inbox.getReceiver() + "      "
						+ inbox.getTitle() + "      " + inbox.getContents() + "    " + inbox.getTime_());
				System.out.println("=======================================================================================");
			}
			
		}
		System.out.println("������ �����ϰ� ��������?");
		System.out.println("1. �׷���");
		System.out.println("2. �ƴϴ�");
		int a = sc.nextInt();
		
		switch(a) {
		case 1:
			new RestoreUI().execute();
		}
		



			
		}

	}

