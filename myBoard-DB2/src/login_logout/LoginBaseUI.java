package login_logout;

import java.util.Scanner;

import kr.ac.kopo.ui.IBoardUI;

public abstract class LoginBaseUI implements IBoardUI{
	
	private Scanner sc;
	protected LoginService loginservice;
	
	

	public LoginBaseUI() {
	 sc = new Scanner(System.in);
	 loginservice = new LoginService();
	}

	protected String scanStr(String msg) {
		System.out.println(msg);
		return sc.nextLine();
	}

	protected int scanInt(String msg) {
		return Integer.parseInt(scanStr(msg));

	}

	
} 
