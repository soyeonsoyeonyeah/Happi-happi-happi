package Assignment;

import java.util.Scanner;

public class Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("물건값을 입력: ");
		int p = sc.nextInt();
		System.out.println("지불한 돈의 액수: ");
		int m = sc.nextInt();

		System.out.println("거스름돈 : " + (m - p) + "원");

		int c = m - p;
		
		int a = c/1000; //천원단위
		int b = (c%1000)/500; // 500원단위
		
		//int c1 = ((c%1000)/500)) /100; //
		
		
		System.out.println("1000원 :" + a + "개");
		System.out.println("500원 :" + b + "개");
		
		
		/*System.out.println("100원 :" + '' + "개");
		System.out.println("50원 :" + '' + "개");
		System.out.println("10원 :" + '' + "개");
		
		System.out.printf("%d천원 %d오백원\n", a, b);
*/
	}


}
