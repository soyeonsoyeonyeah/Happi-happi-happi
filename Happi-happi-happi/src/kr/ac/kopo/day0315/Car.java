package kr.ac.kopo.day0315;

/*
	������ Ư¡
	1. Ŭ������ ����
	2. ��ȯ�� ����
	3. ����Ʈ������ ����
	   class���� ����� �����ڰ� ���°�� JVM �ڵ����� �������ִ� ������
	   Ŭ������() {}
	4. ������ �����ε� ����
	5. �Ű������� �ִ� �����ڸ� ���鶧�� �׻� �⺻�����ڸ� �����д�.
	6. ���������� �Ӽ� �ʱ�ȭ�� ������
*/
	
	class Car {
	Car() {
	System.out.println("����Ʈ ������ Car() ȣ��...");
	}
	
	Car(String s) {
	System.out.println("Car(String) ������ ȣ��...");
	}
	
	
	public static void main(String[] args) {
	
	new Car();
	new Car("�ҳ�Ÿ");
	
	
	}
}
