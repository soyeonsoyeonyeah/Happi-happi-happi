package kr.ac.kopo.jbdc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class InsertMain03 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("아이디를 입력 : ");
		String id = sc.nextLine();
		System.out.println("이름을 입력 : ");
		String name =sc.nextLine();
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			//1단계
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//2단계         
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "hr";
			String password = "hr";
			conn = DriverManager.getConnection(url, user, password);
			
		 //3
		String sql = "insert into t_test(id, name) ";
			   sql += " values(?, ?) ";
	    pstmt = conn.prepareStatement(sql); //아예 객체를 만들면서 쿼리를 넣어주는,,
		pstmt.setString(1, id);
		pstmt.setString(2, name);
	    //4
	   int cnt = pstmt.executeUpdate();
	   System.out.println(cnt + "개 행 삽입...");
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			
		}
	}

}
