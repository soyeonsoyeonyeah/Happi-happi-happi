package kr.ac.kopo.main;

import kr.ac.kopo.ui.MailUI;

public class BoardMain {
	
	public static void main(String[] args) {
		
		MailUI ui = new MailUI();
		
		try {
		ui.execute();
		} catch(Exception e) {
			e.printStackTrace();
		}
	
	}

}

