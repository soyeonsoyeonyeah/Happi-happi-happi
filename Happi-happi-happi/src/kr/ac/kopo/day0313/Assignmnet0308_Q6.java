package kr.ac.kopo.day0313;

import java.util.Random;

public class Assignmnet0308_Q6 {
	
	public static void main(String[] args) {
		
		
	// 20 ~ 120 ������ ������ ����
		
		Random r = new Random();
		int number = r.nextInt(101) + 20;  // 0+20 ~ 100+20
		
		System.out.println(" < 1 ~ " + number + "369���� >");
		for(int i =1; i <= number; i++) {
			System.out.println(i + "\t");
			
			// �����ڸ�, �����ڸ�
			int n1 = i % 10;
			int n10 = i % 100 / 10;

			System.out.println(n1 + " " + n10);
		}
		
		
	}

}
