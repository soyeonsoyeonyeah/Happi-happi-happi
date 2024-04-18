package Assignment0307;

import java.util.Scanner;

public class Q5_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		
		Scanner sc = new Scanner(System.in);
		
	System.out.println("2 - 10사이의 정수 입력 :");
	
	//int num = sc.nextInt();
	//sc.nextLine(); //버퍼를 비워주기 위해서
	
	int num = Integer.parseInt(sc.nextLine()); //문자열로 입력받은걸 이걸 정수값으로 바꿔주는 method,이렇게하면
//버퍼는 계속 비워져있으니까~
	
	int cnt = 0;
	if(num >=2 && num <=10) {
		System.out.printf("< 1 ~ 100사이의 %d의 배수 출력>\n",num);
		for(int i = num; i <= 100; i += num) {
			System.out.println(i + " ");
			++cnt;
		}

		
	}
	
	System.out.println();
	System.out.println("총 개수 :" + cnt + "개" );
	
	
	
	//배수를 찍을 때마다 갯수를 세기위한 변수가 필요
	
	
	
	
	}

}
