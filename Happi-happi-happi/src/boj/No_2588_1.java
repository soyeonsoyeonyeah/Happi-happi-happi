package boj;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class No_2588_1 {

	
		    public static void main(String[] args) throws Exception {
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	     
	        int a = Integer.parseInt(br.readLine());
	        int b = Integer.parseInt(br.readLine());

	        // b�� �� �ڸ����� ���մϴ�.
	        int b1 = b % 10;         // ���� �ڸ�
	        int b2 = (b % 100) / 10; // ���� �ڸ�
	        int b3 = b / 100;        // ���� �ڸ�

	        // ���� ����� ����մϴ�.
	        int result1 = a * b1;
	        int result2 = a * b2;
	        int result3 = a * b3;
	        int total = a * b;

	        // ����� ����մϴ�.
	        System.out.println(result1);
	        System.out.println(result2);
	        System.out.println(result3);
	        System.out.println(total);
	    }
	}
	

