package Assignment;

import java.util.Scanner;

public class Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("���ǰ��� �Է�: ");
		int p = sc.nextInt();
		System.out.println("������ ���� �׼�: ");
		int m = sc.nextInt();

		System.out.println("�Ž����� : " + (m - p) + "��");

		int c = m - p;
		
		int a = c/1000; //õ������
		int b = (c%1000)/500; // 500������
		
		//int c1 = ((c%1000)/500)) /100; //
		
		
		System.out.println("1000�� :" + a + "��");
		System.out.println("500�� :" + b + "��");
		
		
		/*System.out.println("100�� :" + '' + "��");
		System.out.println("50�� :" + '' + "��");
		System.out.println("10�� :" + '' + "��");
		
		System.out.printf("%dõ�� %d�����\n", a, b);
*/
	}


}
