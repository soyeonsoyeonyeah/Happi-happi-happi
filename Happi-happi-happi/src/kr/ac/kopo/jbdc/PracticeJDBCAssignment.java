package kr.ac.kopo.jbdc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import kr.ac.kopo.util.ConnectionFactory;

public class PracticeJDBCAssignment {	
		public static void main(String[] args) {
		
			
	Scanner sc = new Scanner(System.in);
	System.out.println("급여 입력 : ");
	int salary = Integer.parseInt(sc.nextLine());
	
	
	StringBuilder sql = new StringBuilder();
	sql.append("SELECT JOB_TITLE ,AVG(e.SALARY) AS avg ");
	sql.append("FROM EMPLOYEES e JOIN JOBS j ON e.JOB_ID = j.JOB_ID ");
	sql.append("WHERE e.SALARY >= ? ");
	sql.append("GROUP BY j.JOB_TITLE ");
	sql.append("ORDER BY AVG(e.SALARY) DESC ");
	
	try(
		Connection conn = new ConnectionFactory().getConnection();
		PreparedStatement pstmt = conn.prepareStatement(sql.toString());
	   ) {
		pstmt.setInt(1, salary);
		ResultSet rs = pstmt.executeQuery();
		
		while(rs.next()) {
			String job_title = rs.getString("JOB_TITLE");
			int avgSalary = rs.getInt(2);
			System.out.printf("[%s] %d\n", job_title, avgSalary);
		}
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	
			
	}

	
}

