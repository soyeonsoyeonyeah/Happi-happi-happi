package kr.ac.kopo.day0322;

import java.util.Arrays;
import java.util.Random;

public class ExceptionMain3 {
	
	public static void main(String[] args) {
		
		System.out.println("------------------- start -----------------------");

		try {
			Random r = new Random();
			int num = r.nextInt(3);
			System.out.println("추출된 난수 : " + num);
			System.out.println(10/num);
			
			int[] nums = new int[3];
			nums[3] = 100;
			System.out.println(Arrays.toString(nums));
			
			
		} catch(ArithmeticException | ArrayIndexOutOfBoundsException ae) {
			System.out.println("예외발생!! => " + ae.getMessage());
			//ae.printStackTrace();
			
		}
		System.out.println("------------------- end -----------------------");
	}

}

