package kr.ac.kopo.day0322;

public class Child02 extends Parent {
	
	private String name;
	private int age;
	
	public Child02() {
		name = "�ڽ�02";
		age = 17;
	}
	
	
	
	@Override
	public void info() {
		System.out.println("���� �ڽ�02�̰�, ���̴� 17���Դϴ�.");
		}
	
		public void play() {
			System.out.println("���� ��ϴ�");
		}
		
		public void sing() {
			System.out.println("���� �뷡�� �θ��ϴ� ");
		}

}
