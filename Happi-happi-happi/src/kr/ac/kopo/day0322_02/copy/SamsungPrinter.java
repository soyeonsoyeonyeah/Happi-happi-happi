package kr.ac.kopo.day0322_02.copy;

public class SamsungPrinter extends Printer {

	String modelName;
	
	public void samPrint() {
		System.out.println("�Ｚ�����Ϳ��� �����...");
	}

	@Override
	public void print() {
		samPrint();
		
	}
	
	
}
