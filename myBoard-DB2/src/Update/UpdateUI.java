package Update;

import kr.ac.kopo.ui.IBoardUI;
import kr.ac.kopo.ui.MailMenu;

public class UpdateUI extends UpdateBaseUI {

	private int choiceMenu() {

		System.out.println("�ش��ϴ� ��ȣ�� �����ϼ���");
		System.out.println("1. ��ȭ��ȣ ����");
		System.out.println("2. ��й�ȣ ����");
		System.out.println("3. �ڷΰ���");
		int type = scanInt("�׸��� �����ϼ��� : ");
		return type;
	}

	@Override
	public void execute() throws Exception {
		while (true) {
			IBoardUI ui = null;
			int type = choiceMenu();
			switch (type) {
			case 1:
				ui = new UpdatePhone();
				break;
			case 2:
				ui = new UpdatePW();
				break;
			case 3:
				new MailMenu().execute();
				break;
			case 4:
				ui = new UpdateID();
				break;

			}

			if (ui != null) {
				ui.execute();
			}

		}

	}
}
