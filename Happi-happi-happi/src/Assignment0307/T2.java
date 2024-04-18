package Assignment0307;

import java.util.Scanner;

public class T2 {


	public class Main {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        final int NUM_STUDENTS = 5;
	        int[] scores = new int[NUM_STUDENTS];
	        char[] grades = new char[NUM_STUDENTS];

	        // 성적 입력 받기
	        for (int i = 0; i < NUM_STUDENTS; i++) {
	            System.out.printf("%d's 성적 : ", i + 1);
	            scores[i] = scanner.nextInt();

	            // 성적이 0 이상 100 이하가 아니면 잘못된 입력으로 처리
	            if (scores[i] < 0 || scores[i] > 100) {
	                System.out.println("잘못 입력하셨습니다.");
	                return;
	            }

	            // 학점 부여
	            if (scores[i] >= 90) {
	                grades[i] = 'A';
	            } else if (scores[i] >= 80) {
	                grades[i] = 'B';
	            } else if (scores[i] >= 70) {
	                grades[i] = 'C';
	            } else if (scores[i] >= 60) {
	                grades[i] = 'D';
	            } else {
	                grades[i] = 'F';
	            }
	        }

	        // 결과 출력
	        for (int i = 0; i < NUM_STUDENTS; i++) {
	            System.out.printf("%d점의 학점은 %c입니다\n", scores[i], grades[i]);
	        }

	        scanner.close();
}
	}
}
