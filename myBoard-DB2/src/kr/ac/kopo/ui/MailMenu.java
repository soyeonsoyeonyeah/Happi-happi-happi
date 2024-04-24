package kr.ac.kopo.ui;
import Bin.BinUI;
import Inbox.InboxUI;
import Inbox.SentUI;
import Send.SendUI;
import Update.UpdateUI;
import login_logout.LogoutUI;

public class MailMenu extends BaseUI {

	private int choiceMenu() {
		System.out.println("<������ �ϰ�������밡����>");
		System.out.println("=============================");
		System.out.println("1. ���Ͼ���");
		System.out.println("2. ����������");
		System.out.println("3. ����������");
		System.out.println("4. ������");
		System.out.println("5. ȸ������ ����");
		System.out.println("6. �α׾ƿ�");
		System.out.println("0. ���α׷� ����");
		System.out.println("=============================");
		int type = scanInt(" ");
		return type;

	}

	@Override
	public void execute() throws Exception {

		while (true) {
			IBoardUI ui = null;
			int type = choiceMenu();
			switch (type) {
			case 1:
				ui = new SendUI();
				break;
			case 2:
				ui = new InboxUI();
				break;
			case 3:
				ui = new SentUI();
				break;
			case 4:
				ui = new BinUI();
				break;
			case 5:
				ui = new UpdateUI();
				break;
			case 6:
				ui = new LogoutUI();
				break;
			case 0:
				ui = new ExitUI();
			}

			if (ui != null) {
				ui.execute();
			} else {
				System.out.println("�߸������ϼ̽��ϴ�.");
			}
			
		}
	}

}
