package find;

import kr.ac.kopo.ui.IBoardUI;

public class FindUI extends FindBaseUI {

	private int choiceMenu() {

		System.out.println("해당하는 번호를 선택하세요");
		System.out.println("1. 아이디 찾기");
		System.out.println("2. 비밀번호 찾기");
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
