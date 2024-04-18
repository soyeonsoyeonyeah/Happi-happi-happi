package boj;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No_1085 {
	
	public static void main(String[] args) throws Exception {
	

		BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
		int[]arr = new int [4];
		
		StringTokenizer st = new StringTokenizer(br.readLine()); 
		arr[0] = Integer.parseInt(st.nextToken());
		arr[1] = Integer.parseInt(st.nextToken());
		arr[2] = Integer.parseInt(st.nextToken());
		arr[3] = Integer.parseInt(st.nextToken());
		
	
		int x = arr[0];
		int y = arr[1];
		int w = arr[2];
		int h = arr[3];
		int min = x;
				
		if (min > y) {
			min = y;
		}
		if (min > h-y) {
			min = h-y;
		}
		if(min > w-x) {
			min = w-x;
		}
		
		System.out.println(min);
		}
		
	

}

