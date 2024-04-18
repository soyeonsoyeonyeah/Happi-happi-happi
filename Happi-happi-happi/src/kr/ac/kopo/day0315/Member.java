package kr.ac.kopo.day0315;

public class Member {

	String name;
	int age; 
	String bloodType;
	
	//생성자를 이용한 개체속성의 초기화
	Member() {
		name = "알수없음";
		age = -1;
		bloodType = "알수없음"; 
				
			
		
	}
	
	Member(String name){
		this.name = name;
		this.age = -1;
		this.bloodType = "알수없음";
	}
	
	Member(String name, int age){
		this.name = name;
		this.age = age;
		this.bloodType = "알수없음";
	}
	
	Member(String name, int age, String bloodType){
		this.name = name;
		this.age = age;
		this.bloodType = bloodType;
	}
	
	
	/* 인스턴트 객체의 속성값을 알려고하는 메소드
	 * 
	 */
	
	void info() {
		System.out.println("이름 : " + name 
				+ ", 나이 : " + age + ", 혈액형 : " + bloodType);
	
	}
	
}
