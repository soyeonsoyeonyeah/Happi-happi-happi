package find;

import java.util.Scanner;

import kr.ac.kopo.ui.IBoardUI;

public abstract class FindBaseUI implements IBoardUI{
	
	private Scanner sc;
	protected FindService findservice;
	
	

	public FindBaseUI() {
	 sc = new Scanner(System.in);
	 findservice = new FindService();
	}

	protected String scanStr(String msg) {
		System.out.println(msg);
		return sc.nextLine();
	}

	protected int scanInt(String msg) {
		return Integer.parseInt(scanStr(msg));

	}

	
} 
