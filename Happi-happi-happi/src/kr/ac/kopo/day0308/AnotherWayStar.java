package kr.ac.kopo.day0308;

public class AnotherWayStar {


/*
  	----*
 	---**
 	--***
 	-****
 	*****
 	-****
 	--***
 	---**
 	----*
 */


	public static void main(String[] args) {
		
		int col = 5;
		for(int i = 1; i <= 9; i++) {
			for(int j = 1; j <= 5; j++) {
				System.out.print(j < col ? '-' : '*');
			}
			System.out.println();
			if(i < 5) {
				col--;
			} else { 
				col++;
			}
		}
		
		/*
		int nStar = 1;
		for(int i = 1; i <= 9; i++) {
			for(int j = 1; j <= 5-nStar; j++) {
				System.out.print('-');
			}
			for(int j = 1; j <= nStar; j++) {
				System.out.print('*');
			}
			System.out.println();
			if(i < 5) {
				nStar++;
			} else {
				nStar--;
			}
		}
		*/
		
		/*
		for(int i = 1; i <= 9; i++) {
			if(i <= 5) {
				for(int j = 1; j <= 5; j++) {
					if(j < 6-i) {
						System.out.print('-');
					}else {
						System.out.print('*');
					}
				}
			} else {
				for(int j = 1; j <= 5; j++) {
					if(j < i-4) {
						System.out.print('-');
					} else {
						System.out.print('*');
					}
				}
			}
			System.out.println();
		}
		*/
		
		/*
		for(int i = 1; i <= 9; i++) {
			if(i <= 5) {
				for(int j = 1; j <= 5-i; j++) {
					System.out.print('-');
				}
				for(int j = 1; j <= i; j++) {
					System.out.print('*');
				}
			} else {
				for(int j = 1; j <= i-5; j++) {
					System.out.print('-');
				}
				for(int j = 1; j <= 10-i; j++) {
					System.out.print('*');
				}
			}
			System.out.println();
		}
		*/
	}
}




