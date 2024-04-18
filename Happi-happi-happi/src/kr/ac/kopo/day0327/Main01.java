package kr.ac.kopo.day0327;

import java.util.Scanner;

public class Main01 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		
		String [] str = new String[n];
		int j = 0;
		
		for(int i = 0; i < n; i++){
		 str [i] = sc.nextLine();
		}
			for(j = 0; j < n; j++) {
		System.out.printf("%s%s\n",str[j].charAt(0), str[j].charAt(str[j].length()-1));
			
		}
		
	}
	}

