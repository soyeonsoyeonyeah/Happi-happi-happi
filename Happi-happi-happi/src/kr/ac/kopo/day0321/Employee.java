package kr.ac.kopo.day0321;

public class Employee {
	
	int no;
	String name;
	int salary;
	String grade;
	
	Employee(){
		
	}
	
	Employee(int no, String name, int salary, String grade){
		this.no = no;
		this.name = name;
		this.salary = salary;
		this.grade = grade;
	}
	
	void info(){
		System.out.println("�����ȣ:" + no + " �̸�:" + name + " �޿�:" + salary + " ����:" + grade);
	}


}
