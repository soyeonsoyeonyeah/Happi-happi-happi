package kr.ac.kopo.day0315;

public class Member {

	String name;
	int age; 
	String bloodType;
	
	//�����ڸ� �̿��� ��ü�Ӽ��� �ʱ�ȭ
	Member() {
		name = "�˼�����";
		age = -1;
		bloodType = "�˼�����"; 
				
			
		
	}
	
	Member(String name){
		this.name = name;
		this.age = -1;
		this.bloodType = "�˼�����";
	}
	
	Member(String name, int age){
		this.name = name;
		this.age = age;
		this.bloodType = "�˼�����";
	}
	
	Member(String name, int age, String bloodType){
		this.name = name;
		this.age = age;
		this.bloodType = bloodType;
	}
	
	
	/* �ν���Ʈ ��ü�� �Ӽ����� �˷����ϴ� �޼ҵ�
	 * 
	 */
	
	void info() {
		System.out.println("�̸� : " + name 
				+ ", ���� : " + age + ", ������ : " + bloodType);
	
	}
	
}
