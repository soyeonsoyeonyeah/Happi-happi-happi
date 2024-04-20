package kr.ac.kopo.ui;

public class MailUI extends BaseUI{
	
	private int choiceMenu() {
		System.out.println("****** �Ǵϸ��Ͽ� ���� ���� ȯ���մϴ� ******");
		System.out.println("       ****** MENU ******");
		System.out.println("1. �α���");
		System.out.println("2. ID/PW ã��");
		System.out.println("3. ȸ������");
		System.out.println("4. ���α׷� ����");
		int type = scanInt("�׸��� �����ϼ��� : ");
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
				System.out.println("�߸������ϼ̽��ϴ�.");
			}
		}
	}

}