package kr.ac.kopo.day0322;

public class CastMain01 {
	
	/*
	public static void print(Child02 c) {
		c.info();
	}
	
	public static void print(Child01 c2) {
		c2.info();
	}
	*/
	
	//객체형변환 묵시적형변환
	
	public static Parent getObject() {
		return new Child01();
	}
	public static void print (Parent p) {
		
	}
	
	
	
	public static void main(String[] args) {
		
		Parent obj = getObject();
		print(new Child02());
		
		
		Parent p = new Child01();
		p.info();
		
		p = new Child02();
		p.info();
		
		
		
		
		
	
	
	
		
	/*	
		Child02 c02 = new Child02();
		print(c02);
	//	c02.play();
	//	c02.sing();
	//	c02.info();
		
		Child01 c01 = new Child01();
		print(c01);
	//	c01.info();
	//	c01.study();
	//	c01.sleep();
		
		
		Parent p = new Parent();
		print(p);
		p.info();
		
		
		
		
		*/
}
}
