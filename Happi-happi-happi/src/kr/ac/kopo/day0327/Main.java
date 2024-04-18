package kr.ac.kopo.day0327;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();

		int[][] array = new int[N][M];
		int[][] array2 = new int[N][M];

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				array[i][j] = sc.nextInt();

			}
		}
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				array2[i][j] = sc.nextInt();

			}
		}

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				System.out.print(array[i][j] + array[i][j] + " ");
				if (j == M) {
					System.out.println();
				}

			}
		}

	}

}