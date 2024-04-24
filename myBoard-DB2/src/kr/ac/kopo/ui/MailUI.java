package kr.ac.kopo.ui;

import find.FindUI;
import login_logout.LoginUI;

public class MailUI extends BaseUI{
	
	private int choiceMenu() {
		System.out.println("====================================");
		System.out.println("  >>>>>>>WELCOME TO �Ǵϸ���<<<<<<<");
		System.out.println("====================================");
		System.out.println("1. �α���");
		System.out.println("2. ID/PW ã��");
		System.out.println("3. ȸ������");
		System.out.println("4. ���α׷� ����");
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
				System.out.println("�߸������ϼ̽��ϴ�.");
			}
		}
	}

}