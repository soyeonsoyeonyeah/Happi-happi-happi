package Inbox;

import java.util.Scanner;

import kr.ac.kopo.ui.IBoardUI;

public abstract class InboxBaseUI implements IBoardUI{
	
	protected Scanner sc;
	protected InboxService inboxservice;
	
	

	public InboxBaseUI() {
	 inboxservice = new InboxService();
	 sc = new Scanner(System.in);
	
	}

	protected String scanStr(String msg) {
		System.out.println(msg);
		return sc.nextLine();
	}

	protected int scanInt(String msg) {
		return Integer.parseInt(scanStr(msg));

	}

	
} 
