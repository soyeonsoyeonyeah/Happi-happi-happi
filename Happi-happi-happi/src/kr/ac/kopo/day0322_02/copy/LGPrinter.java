package kr.ac.kopo.day0322_02.copy;

public class LGPrinter extends Printer {
	
	private String model;
	
	public LGPrinter() {
		model = "LG프린터";
				
	}
	
	public void lgPrint() {
		System.out.println("LG프린터에서 출력됨...");
	}

	@Override
	public void print() {
		lgPrint();
		
	}

}
