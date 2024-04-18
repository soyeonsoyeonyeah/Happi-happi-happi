package kr.ac.kopo.day0322_02.copy;

public class SamsungPrinter extends Printer {

	String modelName;
	
	public void samPrint() {
		System.out.println("삼성프린터에서 출력중...");
	}

	@Override
	public void print() {
		samPrint();
		
	}
	
	
}
