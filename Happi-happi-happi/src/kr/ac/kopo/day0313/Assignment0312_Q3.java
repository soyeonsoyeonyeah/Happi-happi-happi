package kr.ac.kopo.day0313;

import java.util.Scanner;

public class Assignment0312_Q3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double [] grade = new double[5];
		
		
		for(int i = 1; i < grade.length; i++) {
		System.out.println("������ �Է��Ͻÿ� : ");
		grade [i] = sc.nextDouble();
		
	}
		
		for(int i = 1; i < grade.length; i++) {
			System.out.printf("%d \'s ���� : %f \n",i,grade[i]);
		}
		
		
}
}
