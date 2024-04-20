package kr.ac.kopo.day0322_02.copy;

import java.util.Scanner;

public class Menu {
	
	
	public void process() {
		Scanner sc = new Scanner(System.in);
		System.out.println("v2. ����� �����͸� �����ϼ��� (1.LG,  2.�Ｚ 3.HP) => ");
		String type = sc.nextLine();

		/*
		switch(type) {
		case "1" :
			LGPrinter lg = new LGPrinter();
			lg.lgPrint();
			break;
		case "2": 
			SamsungPrinter sam = new SamsungPrinter();
			sam.samPrint();
			break;
		default:
			System.out.println("�߸������ϼ̽��ϴ�");
		}
		*/
		
		/*
		switch(type) {
		case "1" :
			LGPrinter lg = new LGPrinter();
			lg.print();
			break;
		case "2": 
			SamsungPrinter sam = new SamsungPrinter();
			sam.print();
		case "3":
			HPPrinter hp = new HPPrinter();
			hp.print();
			break;
		default:
			System.out.println("�߸������ϼ̽��ϴ�");
		}
		*/
		Printer p = null;
		switch(type) {
		case "1" :
			p = new LGPrinter();
			break;
		case "2": 
			p = new SamsungPrinter();
		case "3":
			p = new HPPrinter();
			break;
		default:      
			System.out.println("�߸������ϼ̽��ϴ�");
		}
		
		if(p != null) {
			p.print();
		}
	
	}

}
