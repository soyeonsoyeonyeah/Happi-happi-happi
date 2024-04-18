package Assignment0307;

import java.util.Scanner;

public class Q5 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
	System.out.println("2 - 10사이의 정수 입력 :");
	int num = sc.nextInt();
	
	if(num >=2 && num <=10) {
		System.out.printf("< 1 ~ 100사이의 %d의 배수 출력>\n",num);
		for(int i = num; i <= 100; i += num) {
			System.out.println(i + " ");
		}

	}
	
	
	}

}
