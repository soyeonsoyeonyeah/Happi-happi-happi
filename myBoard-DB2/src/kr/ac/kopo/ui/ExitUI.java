package kr.ac.kopo.ui;

public class ExitUI extends BaseUI {

	@Override
	public void execute() throws Exception {
		System.out.println("=========================================");
		System.out.println("\t 또니메일을 종료합니다");
		System.out.println("=========================================");
		System.exit(0);
	}

}
