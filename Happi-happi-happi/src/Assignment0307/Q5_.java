package Assignment0307;

import java.util.Scanner;

public class Q5_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		
		Scanner sc = new Scanner(System.in);
		
	System.out.println("2 - 10������ ���� �Է� :");
	
	//int num = sc.nextInt();
	//sc.nextLine(); //���۸� ����ֱ� ���ؼ�
	
	int num = Integer.parseInt(sc.nextLine()); //���ڿ��� �Է¹����� �̰� ���������� �ٲ��ִ� method,�̷����ϸ�
//���۴� ��� ����������ϱ�~
	
	int cnt = 0;
	if(num >=2 && num <=10) {
		System.out.printf("< 1 ~ 100������ %d�� ��� ���>\n",num);
		for(int i = num; i <= 100; i += num) {
			System.out.println(i + " ");
			++cnt;
		}

		
	}
	
	System.out.println();
	System.out.println("�� ���� :" + cnt + "��" );
	
	
	
	//����� ���� ������ ������ �������� ������ �ʿ�
	
	
	
	
	}

}
