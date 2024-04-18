package kr.ac.kopo.day0315;

/*
	생성자 특징
	1. 클래스명 동일
	2. 반환형 없음
	3. 디폴트생성자 지원
	   class내에 선언된 생성자가 없는경우 JVM 자동으로 지원해주는 생성자
	   클래스명() {}
	4. 생성자 오버로딩 지원
	5. 매개변수가 있는 생성자를 만들때는 항상 기본생성자를 만들어둔다.
	6. 생성변수는 속성 초기화가 목적임
*/
	
	class Car {
	Car() {
	System.out.println("디폴트 생성자 Car() 호출...");
	}
	
	Car(String s) {
	System.out.println("Car(String) 생성자 호출...");
	}
	
	
	public static void main(String[] args) {
	
	new Car();
	new Car("소나타");
	
	
	}
}
