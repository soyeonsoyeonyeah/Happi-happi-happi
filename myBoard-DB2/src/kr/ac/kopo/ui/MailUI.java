package kr.ac.kopo.ui;

import find.FindUI;
import login_logout.LoginUI;

public class MailUI extends BaseUI{
	
	private int choiceMenu() {
		System.out.println("====================================");
		System.out.println("  >>>>>>>WELCOME TO 또니메일<<<<<<<");
		System.out.println("====================================");
		System.out.println("1. 로그인");
		System.out.println("2. ID/PW 찾기");
		System.out.println("3. 회원가입");
		System.out.println("4. 프로그램 종료");
		System.out.println("====================================");
		int type = scanInt("");
		return type;

	}
	
	@Override
	public void execute() throws Exception{
		while (true) {
			IBoardUI ui = null;
			int type = choiceMenu();
			switch (type) {
			case 1:
				ui = new LoginUI();
				break;
			case 2:
				ui = new FindUI();
				break;
			case 3:
				ui = new JoinUI();
				break;
			case 4:
				ui = new ExitUI();
				break;
			}
			
			if(ui != null) {
				ui.execute();
			} else {
				System.out.println("잘못선택하셨습니다.");
			}
		}
	}

}