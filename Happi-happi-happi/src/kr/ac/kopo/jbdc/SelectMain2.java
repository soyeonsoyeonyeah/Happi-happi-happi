package kr.ac.kopo.jbdc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import kr.ac.kopo.util.ConnectionFactory;
import kr.ac.kopo.util.JDBCClose;

public class SelectMain2 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�޿��� �Է��Ͻÿ� : ");
		Connection conn = null;
		PreparedStatement pstmt = null;
		int sal = sc.nextInt();
		int cnt = 0;
		
		try {
			//1,2
			conn = new ConnectionFactory().getConnection();
			
			// 3�ܰ� : ������ ���� ���ఴü ���� ���
			
			
			String sql = "SELECT j.JOB_TITLE ,AVG(e.SALARY) AS avg ";
		       sql += "FROM EMPLOYEES e JOIN JOBS j ON e.JOB_ID = j.JOB_ID ";
		       sql += "WHERE e.SALARY >= ? ";
		       sql += "GROUP BY j.JOB_TITLE  ";
		       sql += "ORDER BY AVG(e.SALARY) DESC";

		    pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, sal);
			
			//4�ܰ� : ���� �� ��� ��� 
			 ResultSet rs = pstmt.executeQuery();
			 
			 while(rs.next()){
				 String job_title = rs.getString("JOB_TITLE");
				 int salary = rs.getInt("avg");
				 System.out.println("[" + job_title + "]"  + salary);
				 cnt++;
			 }
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			//5
			JDBCClose.close(conn, pstmt);
		}
			System.out.println();
			System.out.println("\t ��[" + cnt + "]���� �˻��Ǿ����ϴ�.");
		
	}

}
