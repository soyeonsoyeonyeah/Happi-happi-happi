package kr.ac.kopo.day0325;
import java.util.Scanner;

public class New {

	


		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			
			
			for (int i = 0; i < n; i++) {
				for (int a = 0; a < n; a++) {
					System.out.print(a < i ? ' ' : '*');
				}

				System.out.println();
				

			}
		}
	}
	

