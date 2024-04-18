package kr.ac.kopo.day0308;

public class Practice9_1 {
	public static void main(String[] args) {
		
		
		//9번문제 두번째 방법
		
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= 5; j++) {
				if(j < i) {
					System.out.print('-');
				} else {
					System.out.print('*');
				}
				
				//System.out.print('-');
			}
			System.out.println();	
		}
		}

}
