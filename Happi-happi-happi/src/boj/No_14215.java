package boj;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class No_14215 {
	
	public static void main(String[] args) throws Exception {
		
	
		BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
		int[]arr = new int[3];
		
			StringTokenizer st = new StringTokenizer(br.readLine());
			arr[0] = Integer.parseInt(st.nextToken());
			arr[1] = Integer.parseInt(st.nextToken());
			arr[2] = Integer.parseInt(st.nextToken());
			
			Arrays.sort(arr);
			
			int max = arr[2];
			 if(max >= arr[0] + arr[1]) {
				max = (arr[0] + arr[1]) - 1;
			 }
			 
			 int perimeter = arr[0] + arr[1] + max;
				System.out.println(perimeter);
			
		
	}

}
