package boj;

import java.util.Scanner;

public class No_1978 {
	
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int a;
	int cnt = 0;

	
	for(int i = 0; i < n; i++) {
		a = sc.nextInt();
		for(int p = 2; p <= a; p++) {
			if(p == a) {
				cnt++;
			}
			if(a % p == 0) {
				break;
			}
		}
}
	System.out.println(cnt);
}
}