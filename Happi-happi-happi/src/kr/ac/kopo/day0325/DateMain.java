         package kr.ac.kopo.day0325;

         import java.util.Scanner;


	public static void main(String[] args) {
		

				Scanner sc = new Scanner(System.in);
				int n = sc.nextInt();
				int a2 = n;
				int b = 1;
				for (int i = 1; i <= n; i++) {
					for (int a = b; a <= n; a++) {
						System.out.print(a <= a2 ? '*' : ' ');
					}

					System.out.println();
					a2--;

				}
			}
		}