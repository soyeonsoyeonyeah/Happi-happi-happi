package Send;

import java.util.Scanner;

import kr.ac.kopo.ui.IBoardUI;

public abstract class SendBaseUI implements IBoardUI{
	
	private Scanner sc;
	protected SendService sendservice;
	
	

	public SendBaseUI() {
	 sc = new Scanner(System.in);
	 sendservice = new SendService();
	}

	protected String scanStr(String msg) {
		System.out.println(msg);
		return sc.nextLine();
	}

	protected int scanInt(String msg) {
		return Integer.parseInt(scanStr(msg));

	}

	
} 
