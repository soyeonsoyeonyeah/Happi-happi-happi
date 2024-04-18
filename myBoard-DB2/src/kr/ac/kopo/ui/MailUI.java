package kr.ac.kopo.ui;

public class MailUI extends BaseUI{
	
	private int choiceMenu() {
		System.out.println("****** 또니메일에 오신 것을 환영합니다 ******");
		System.out.println("       ****** MENU ******");
		System.out.println("1. 로그인");
		System.out.println("2. ID/PW 찾기");
		System.out.println("3. 회원가입");
		System.out.println("4. 프로그램 종료");
		int type = scanInt("항목을 선택하세요 : ");
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
				ui = new SearchOneUI();
				break;
			case 3:
				ui = new JoinUI();
				break;
			case 4:
				ui = new UpdateUI();
				break;
			case 5:
				ui = new DeleteUI();
				break;
			case 0:
				ui = new ExitUI();
			}
			
			if(ui != null) {
				ui.execute();
			} else {
				System.out.println("잘못선택하셨습니다.");
			}
		}
	}

}