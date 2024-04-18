package Assignment0307;

import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("학생1의 성적: ");
		double S1 = sc.nextDouble();
		System.out.println("학생2의 성적: ");
		double S2 = sc.nextDouble();
		System.out.println("학생3의 성적: ");
		double S3 = sc.nextDouble();
		System.out.println("학생4의 성적: ");
		double S4 = sc.nextDouble();
		System.out.println("학생5의 성적: ");
		double S5 = sc.nextDouble();
		
		
		if(S1>=90) {System.out.printf("%d점의 학점은 A입니다",S1);
		}
		
		else if(S1>=80 && S1<=89) {System.out.printf("%d점의 학점은 B입니다",S1);
		}
		else if(S1>=70 && S1<=79) {System.out.printf("%d점의 학점은 C입니다",S1);
		}
		else if(S1>=60 && S1<=69) {System.out.printf("%d점의 학점은 D입니다",S1);
		}
		if(S1<=60) {System.out.printf("%d점의 학점은 F입니다",S1);
	}

		}
		
		}
		
	

	
/*
if(S2>=90) {System.out.printf("%d점의 학점은 A입니다",S2);
if(S2>=80 && S2<=89) {System.out.printf("%d점의 학점은 B입니다",S2);
if(S2>=70 && S2<=79) {System.out.printf("%d점의 학점은 C입니다",S2);
if(S2>=60 && S2<=69) {System.out.printf("%d점의 학점은 D입니다",S2);
if(S2<=60) {System.out.printf("%d점의 학점은 F입니다",S2);
}

}
}
}
if(S3>=90) {System.out.printf("%d점의 학점은 A입니다",S3);
if(S3>=80 && S3<=89) {System.out.printf("%d점의 학점은 B입니다",S3);
if(S3>=70 && S3<=79) {System.out.printf("%d점의 학점은 C입니다",S3);
if(S3>=60 && S3<=69) {System.out.printf("%d점의 학점은 D입니다",S3);
if(S3<=60) {System.out.printf("%d점의 학점은 F입니다",S3);
}

}

}
}	if(S4>=90) {System.out.printf("%d점의 학점은 A입니다",S4);
if(S4>=80 && S4<=89) {System.out.printf("%d점의 학점은 B입니다",S4);
if(S4>=70 && S4<=79) {System.out.printf("%d점의 학점은 C입니다",S4);
if(S4>=60 && S4<=69) {System.out.printf("%d점의 학점은 D입니다",S4);
if(S4<=60) {System.out.printf("%d점의 학점은 F입니다",S4);
}

}
}
}
}
}
}	if(S5>=90) {System.out.printf("%d점의 학점은 A입니다",S5);
if(S5>=80 && S5<=89) {System.out.printf("%d점의 학점은 B입니다",S5);
if(S5>=70 && S5<=79) {System.out.printf("%d점의 학점은 C입니다",S5);
if(S5>=60 && S5<=69) {System.out.printf("%d점의 학점은 D입니다",S5);
if(S5<=60) {System.out.printf("%d점의 학점은 F입니다",S5);
}

}
}
}*/
