package kr.ac.kopo.day0308;

public class Practice9 {

	public static void main(String[] args) {
	
//	
//		
//		for(int i = 5; i > 0; i--) {
//			for(int j = 
//		}
//		System.out.print('_');


		for(int i = 1; i <= 5; i ++) {
			for(int j = 1; j <= i-1; j++) {
				System.out.print('-');
			}
			for(int j = 1; j <= 6-i; j++) {
				System.out.print('*');
			}
			
			System.out.println();
		}
		}
		}