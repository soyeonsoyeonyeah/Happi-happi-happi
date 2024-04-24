package Update;

import kr.ac.kopo.ui.IBoardUI;
import kr.ac.kopo.ui.MailMenu;

public class UpdateUI extends UpdateBaseUI {

	private int choiceMenu() {

		System.out.println("해당하는 번호를 선택하세요");
		System.out.println("1. 전화번호 변경");
		System.out.println("2. 비밀번호 변경");
		System.out.println("3. 뒤로가기");
		int type = scanInt("항목을 선택하세요 : ");
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
