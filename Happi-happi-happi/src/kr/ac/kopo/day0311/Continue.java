package kr.ac.kopo.day0311;

public class Continue {

	public static void main(String[] args) {
		
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= 5; j++) {
				System.out.print("A");
				if(j > i) {
					continue;
				}
				System.out.print("B");
			}
			System.out.println();
		}
	}

}
 