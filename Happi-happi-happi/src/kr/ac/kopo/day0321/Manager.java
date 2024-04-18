package kr.ac.kopo.day0321;

public class Manager extends Employee {

	
	Employee[] empList;
	
	Manager(){
	super();
  }
	
	Manager(int no, String name, int salary, String grade, Employee[]empList){
		super(no,name,salary,grade);
		this.empList = empList;
		
	}
	
	
	void info() {
		super.info();
		System.out.println("--------------------------------");
		System.out.println("\t <관리사원 리스트>");
		System.out.println("--------------------------------");
		for(Employee e:empList) {
			e.info();
		}
		System.out.println("--------------------------------");
	}
	
	
	
	
	
	
	
}
