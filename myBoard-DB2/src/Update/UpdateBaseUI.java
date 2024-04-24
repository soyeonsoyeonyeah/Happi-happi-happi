package Update;

import java.util.Scanner;

import kr.ac.kopo.ui.IBoardUI;

public abstract class UpdateBaseUI implements IBoardUI{
	
	private Scanner sc;
	protected UpdateService updateservice;
	
	

	public UpdateBaseUI() {
	 sc = new Scanner(System.in);
	 updateservice = new UpdateService();
	}

	protected String scanStr(String msg) {
		System.out.println(msg);
		return sc.nextLine();
	}

	protected int scanInt(String msg) {
		return Integer.parseInt(scanStr(msg));

	}

	
} 
