package kr.ac.kopo.jbdc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 	JDBC �۾�����
 	1. JDBC����̹� �ε�
 	2. DriverManager���̿��Ͽ� DB ���� �� ���� ��ü ���
 	3. Statement�� �̿��Ͽ� ���� ����
 	4. ��� ������
 	5. ���� ����
 */
public class DBMain {

	public static void main(String[] args) {
		Connection conn = null;
		try {
			// 1�ܰ� : ����̹� �ε�
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("����̹� �ε� �Ϸ�...");
			// 2�ܰ� : DB���� �� Connection ��ü ���
			conn = DriverManager.getConnection(
						"jdbc:oracle:thin:@localhost:1521:xe", 
						"hr", 
						"hr");
			System.out.println("conn : " + conn);
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			// 5�ܰ� : DB���� ����
			if(conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
