package a;

import java.io.File;

public class FileMain {
	
	public static void main(String[] args) {
		
		
		File dirObj = new File("iotest/a");
		
		System.out.println("���丮 ���� : " + dirObj.isDirectory());
		System.out.println("���Ͽ��� : " + dirObj.isFile());
		System.out.println("���翩�� : " +dirObj.exists());
		System.out.println(dirObj.getParent());
		System.out.println("path : " + dirObj.getPath());
		
		File dirObj2 = new File("iostes/b/����");
		dirObj2.mkdirs();
	
		String [] list = dirObj.list();
		for(String e : list) {
			System.out.println(e);
		}
	
	
		
	
	
	
	}
	
}



