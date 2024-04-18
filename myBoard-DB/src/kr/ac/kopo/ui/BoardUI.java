package kr.ac.kopo.ui;

public class BoardUI extends BaseUI{
	
	private int choiceMenu() {
		System.out.println("****** MENU ******");
		System.out.println("1. ��ü�Խñ� ��ȸ");
		System.out.println("2. �۹�ȣ ��ȸ");
		System.out.println("3. ���� ���");
		System.out.println("4. �Խñ� ����");
		System.out.println("5. �Խñ� ����");
		System.out.println("0. ����");
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
				ui = new SearchAllUI();
				break;
			case 2:
				ui = new SearchOneUI();
				break;
			case 3:
				ui = new AddUI();
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