package kr.ac.kopo.day0315;

public class MethodMain04 {

	public static void main(String[] args) {
	

		GugudanUtil gu = new GugudanUtil();
		
		int startDan = gu.inputDan("���۴��� �Է� : ");
		int endDan = gu.inputDan("������� �Է� : ");
		gu.print(startDan, endDan);
		
		int dan = gu.inputDan();
		gu.print(dan);
		gu.print();
	}

}






