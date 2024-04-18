package boj;

import java.util.Scanner;

public class No_10988 {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	String input = sc.nextLine();
	StringBuilder sb = new StringBuilder(input);
	String reversed = sb.reverse().toString();
	
	System.out.println(input.equals(reversed) ? 1:0);
	
	

}
}
