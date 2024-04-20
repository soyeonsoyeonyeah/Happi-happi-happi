package Assignment0307;

import java.util.Scanner;

public class T2 {


	public class Main {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        final int NUM_STUDENTS = 5;
	        int[] scores = new int[NUM_STUDENTS];
	        char[] grades = new char[NUM_STUDENTS];

	        // ���� �Է� �ޱ�
	        for (int i = 0; i < NUM_STUDENTS; i++) {
	            System.out.printf("%d's ���� : ", i + 1);
	            scores[i] = scanner.nextInt();

	            // ������ 0 �̻� 100 ���ϰ� �ƴϸ� �߸��� �Է����� ó��
	            if (scores[i] < 0 || scores[i] > 100) {
	                System.out.println("�߸� �Է��ϼ̽��ϴ�.");
	                return;
	            }

	            // ���� �ο�
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

	        // ��� ���
	        for (int i = 0; i < NUM_STUDENTS; i++) {
	            System.out.printf("%d���� ������ %c�Դϴ�\n", scores[i], grades[i]);
	        }

	        scanner.close();
}
	}
}
