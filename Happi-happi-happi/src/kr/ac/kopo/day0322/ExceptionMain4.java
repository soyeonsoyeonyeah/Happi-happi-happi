package kr.ac.kopo.day0322;

import java.util.Arrays;
import java.util.Random;

public class ExceptionMain4 {
	
	public static void main(String[] args) {
		
		System.out.println("------------------- start -----------------------");

		try {
			Random r = new Random();
			int num = r.nextInt(3);
			System.out.println("����� ���� : " + num);
			System.out.println(10/num);
			
			int[] nums = new int[3];
			nums[3] = 100;
			System.out.println(Arrays.toString(nums));
			
			//����������ȯ Exception
		} catch(Exception e) {
			System.out.println("���ܹ߻�!! => " + e.getMessage());
			//ae.printStackTrace();
			
		 try {
			
		} catch (Exception e2) {
			
		}
			
		}
		System.out.println("------------------- end -----------------------");
	}

}

