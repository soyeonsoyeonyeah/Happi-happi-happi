package kr.ac.kopo.ui;

public class LoginUI extends BaseUI  {

	@Override
	public void execute() throws Exception {
	
	System.out.println("<<< 또니메일 로그인 >>>");
	String id = scanStr("아이디를 입력하시오 : ");
	String password = scanStr("비밀번호를 입력하시오 : ");
		
	} 
	
}

/* 
 * 입력한 아이디가 기존에 존재하는지, 그 아이디의 비밀번호가 맞는지
 * 틀리면 "아이디 또는 비밀번호가 일치하지 않습니다"
 

package kr.ac.kopo.day17;

import java.util.ArrayList;
import java.util.List;

/*
 	LIST 특징 - 중복(O), 순서(O)
 		- ArrayList
 		- LinkedList
 */
/*

public class ListMain02 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
//		List<String> list = new LinkedList<String>();
		
		System.out.println("add() 전 원소의 총 개수 : " + list.size());
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		list.add("five");
		System.out.println("add() 후 원소의 총 개수 : " + list.size());
		list.add("one");
		System.out.println("add() 후 원소의 총 개수 : " + list.size());
		
		System.out.println("< 전체 데이터 출력 >");
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("---------------------");
		for(String str : list) {
			System.out.println(str);
		}
		System.out.println("\"seven\" 존재여부 : " + list.contains("seven"));
		System.out.println("\"two\" 존재여부 : " + list.contains("two"));
		list.remove("two");
		System.out.println("\"two\" 존재여부 : " + list.contains("two"));
		
		System.out.println("0번지의 데이터 : " + list.get(0));
		list.add(0, "zero");
		System.out.println("0번지의 데이터 : " + list.get(0));
		System.out.println("1번지의 데이터 : " + list.get(1));
		
		if(list.isEmpty()) {
			System.out.println("데이터가 존재하지 않습니다");
		}else {
			System.out.println("데이터가 존재합니다");
		}
		
		list.clear();
		
		if(list.isEmpty()) {
			System.out.println("데이터가 존재하지 않습니다");
		}else {
			System.out.println("데이터가 존재합니다");
		}
	}
}

*/


