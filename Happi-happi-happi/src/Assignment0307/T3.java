package Assignment0307;

import java.util.Scanner;

public class T3 {


public class Practice06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int i = 1; i <= 5; i++) {
			System.out.println(i + "s' 성적 : ");
			int score = sc.nextInt();
			char grade = ' ';

			if (score >= 90)
				grade = 'A';
			else if (score >= 80)
				grade = 'B';
			else if (score >= 70)
				grade = 'C';
			else if (score >= 60)
				grade = 'D';
			else
				grade = 'F';

			if (score > 100)
				System.out.println("잘못입력하셨습니다");
			else
				System.out.printf("%d점의 학점은 %c입니다\n", score, grade);
		}
	}
}

}
