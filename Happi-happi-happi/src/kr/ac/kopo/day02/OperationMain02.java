package kr.ac.kopo.day02;

public class OperationMain02 {

	public static void main(String[] args) {

		int firstNum= 12;
		int secondNum= 3;
		
		boolean result= secondNum != 00 && firstNum % secondNum == 0;
		System.out.println("������� �Ǵ�:" 	
				+ (result == true ? "�����" : "����� �ƴϴ�")) ;
		System.out.println("������� �Ǵ�:" 	
				+ (result == false ? "����� �ƴϴ�" : "�����")) ;
		System.out.println("������� �Ǵ�:" 	
				+ (result ? "�����" : "����� �ƴϴ�")) ;
		System.out.println("������� �Ǵ�:" 	
				+ (!result ? "����� �ƴϴ�" : "�����")) ;

		
	}

}
