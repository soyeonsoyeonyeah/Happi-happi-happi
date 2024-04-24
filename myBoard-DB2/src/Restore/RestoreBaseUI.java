package Restore;

import java.util.Scanner;

import kr.ac.kopo.ui.IBoardUI;

public abstract class RestoreBaseUI implements IBoardUI{
	
	private Scanner sc;
	protected RestoreService restoreservice;
	
	

	public RestoreBaseUI() {
	 sc = new Scanner(System.in);
	 restoreservice = new RestoreService();
	}

	protected String scanStr(String msg) {
		System.out.println(msg);
		return sc.nextLine();
	}

	protected int scanInt(String msg) {
		return Integer.parseInt(scanStr(msg));

	}

	
} 
