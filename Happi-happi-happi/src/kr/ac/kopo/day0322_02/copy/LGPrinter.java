package kr.ac.kopo.day0322_02.copy;

public class LGPrinter extends Printer {
	
	private String model;
	
	public LGPrinter() {
		model = "LG������";
				
	}
	
	public void lgPrint() {
		System.out.println("LG�����Ϳ��� ��µ�...");
	}

	@Override
	public void print() {
		lgPrint();
		
	}

}
