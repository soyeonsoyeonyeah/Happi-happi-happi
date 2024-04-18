package boj;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class No_2588_1 {

	
		    public static void main(String[] args) throws Exception {
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	     
	        int a = Integer.parseInt(br.readLine());
	        int b = Integer.parseInt(br.readLine());

	        // b의 각 자리수를 구합니다.
	        int b1 = b % 10;         // 일의 자리
	        int b2 = (b % 100) / 10; // 십의 자리
	        int b3 = b / 100;        // 백의 자리

	        // 곱셈 결과를 계산합니다.
	        int result1 = a * b1;
	        int result2 = a * b2;
	        int result3 = a * b3;
	        int total = a * b;

	        // 결과를 출력합니다.
	        System.out.println(result1);
	        System.out.println(result2);
	        System.out.println(result3);
	        System.out.println(total);
	    }
	}
	

