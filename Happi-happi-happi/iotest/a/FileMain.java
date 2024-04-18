package a;

import java.io.File;

public class FileMain {
	
	public static void main(String[] args) {
		
		
		File dirObj = new File("iotest/a");
		
		System.out.println("디렉토리 여부 : " + dirObj.isDirectory());
		System.out.println("파일여부 : " + dirObj.isFile());
		System.out.println("존재여부 : " +dirObj.exists());
		System.out.println(dirObj.getParent());
		System.out.println("path : " + dirObj.getPath());
		
		File dirObj2 = new File("iostes/b/구름");
		dirObj2.mkdirs();
	
		String [] list = dirObj.list();
		for(String e : list) {
			System.out.println(e);
		}
	
	
		
	
	
	
	}
	
}



