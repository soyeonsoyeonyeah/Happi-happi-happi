package kr.ac.kopo.ui;

public class UpdateUI extends BaseUI {

	@Override
	public void execute() throws Exception {

		System.out.println("<<< �Խ��� ���� ���� >>>");
		int no = scanInt("������ �۹�ȣ�� �Է��ϼ��� : ");
		String title = scanStr("������ ������ �Է��ϼ��� : ");
		String writer = scanStr("������ �ۼ��ڸ� �Է��ϼ��� : ");

		System.out.println("[" + no + "]�� �Խñ��� �����Ͽ����ϴ�");

	}

}
