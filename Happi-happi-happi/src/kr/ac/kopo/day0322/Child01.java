package kr.ac.kopo.day0322;

public class Child01 extends Parent {
	
	
	
	private String name;
	private int age;
	
	public Child01 () {
		name = "�ڽ�01";
		age = 20;
				
	}
	
	@Override
	public void info() {
		System.out.println("���� �ڽ�01 �̰� ���̴� " + age + "���Դϴ�");
	}
	
	public void study() {
		System.out.println("���� ���θ� �մϴ�");
	}
	
	public void sleep() {
		System.out.println("���� ���� ��ϴ�");
	}




}
