package kr.ac.kopo.day0315;

public class ConstructorMain02 {

	public static void main(String[] args) {
		

	
	Member m = new Member();
	Member m2 = new Member("ȫ�浿");
	Member m3 = new Member("��浿",30);
	Member m4 = new Member("���浿", 24, "AB");
	
	m.info();
	m2.info();
	m3.info();
	m4.info();
	
	}
}