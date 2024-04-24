package Bin;

import java.util.Scanner;

import kr.ac.kopo.ui.IBoardUI;

public abstract class BinBaseUI implements IBoardUI{
	
	protected Scanner sc;
	protected BinService binservice;
	
	

	public BinBaseUI() {
		binservice = new BinService();
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
