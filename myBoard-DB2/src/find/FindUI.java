package find;

import kr.ac.kopo.ui.IBoardUI;

public class FindUI extends FindBaseUI {

	private int choiceMenu() {

		System.out.println("�ش��ϴ� ��ȣ�� �����ϼ���");
		System.out.println("1. ���̵� ã��");
		System.out.println("2. ��й�ȣ ã��");
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
				ui = new FindID();
				break;
			case 2:
				ui = new FindPW();
				break;

			}

			if (ui != null) {
				ui.execute();
			}

		}

	}
}
