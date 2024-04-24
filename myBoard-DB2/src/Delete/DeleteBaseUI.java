package Delete;

import java.util.Scanner;

import kr.ac.kopo.ui.IBoardUI;

public abstract class DeleteBaseUI implements IBoardUI{
	
	private Scanner sc;
	protected DeleteService deleteservice;
	
	

	public DeleteBaseUI() {
	 sc = new Scanner(System.in);
	 deleteservice = new DeleteService();
	}

	protected String scanStr(String msg) {
		System.out.println(msg);
		return sc.nextLine();
	}

	protected int scanInt(String msg) {
		return Integer.parseInt(scanStr(msg));

	}

	
} 
