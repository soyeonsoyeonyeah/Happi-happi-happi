package kr.ac.kopo.day02;

import java.util.Scanner;

/*
 * �ΰ��� ������ �Է¹޾� ù��° �Է°��� �ι�° �Է°��� ��� ���θ� �Ǵ��ϴ� ���α׷� �ۼ�
 * 
 * ù��° ����: 12
 * �ι�° ���� : 4
 * 12�� 4�� ��� ���� �Ǵ� : true
 * ------------------------
 * ù��° ���� : 18
 * �ι�° ���� : 4
 * 18�� 4�� ��� ���� �Ǵ� : false
 */


public class OperationMain03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("ù��° ���� : ");
		int firstNum = sc.nextInt();
		sc.nextLine();
		
		System.out.print("�ι�° ���� : ");
		int secondNum = sc.nextInt();
		sc.nextLine();
		
		// ������� �Ǵ�
		boolean result = secondNum!= 0 && firstNum % secondNum == 0;
		
		System.out.printf("%d�� %d�� ������� �Ǵ� : %b\n", 
				firstNum, secondNum, result);
	System.out.println(firstNum + "�� " + secondNum 
			+ "�� ��� ���� �Ǵ� :" + result);
	
	}

}
