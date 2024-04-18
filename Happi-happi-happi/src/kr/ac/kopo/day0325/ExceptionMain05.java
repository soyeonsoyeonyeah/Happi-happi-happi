package kr.ac.kopo.day0325;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionMain05 {
	
	public static void a() {
		
		try {
		FileReader fr = new FileReader("a.txt");
		} catch(FileNotFoundException)
	}

	
	public static void main(String[] args) {
		a();
	}
}
