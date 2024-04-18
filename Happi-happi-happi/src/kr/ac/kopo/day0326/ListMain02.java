package kr.ac.kopo.day0326;

import java.util.ArrayList;
import java.util.List;

public class ListMain02 {
	
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		
		System.out.println("add() 전 원소의 총 개수 : " + list.size());
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		list.add("five");
		System.out.println("add() 후 원소의 총 개수 : " + list.size());
	
		list.add("one");
		
	
	}

}
