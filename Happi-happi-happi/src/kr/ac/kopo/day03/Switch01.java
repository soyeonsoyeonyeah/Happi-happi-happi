package kr.ac.kopo.day03;

import java.util.Random;

/* 
 * 1 �Է½� -> "ONE"
 * 2 �Է½� -> "TWO"
 * 3 �Է½� -> "THEREE"
 * �׿� -> "ERROR"
 * 
 */

public class Switch01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random r = new Random();
		int num = r.nextInt(5) + 1; 
System.out.println("num : " + num);
		
		switch(num) {
		case 1 :
			System.out.println("ONE");
			break;
		case 2 :
			System.out.println("TWO");
			break;
		case 3 :
			System.out.println("THREE");
			break;
		default :
			System.out.println("ERROR");
			break;
	
		}

	}

}
