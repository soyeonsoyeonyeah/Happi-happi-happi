package kr.ac.kopo.jbdc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertMain01 {

	public static void main(String[] args) {

		String sql = "insert into t_test(id, name)";
		sql += " values ('hong', 'ȫ�浿') ";
		Connection conn = null;
		Statement stmt = null;
		try {
			// 1�ܰ�
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 2�ܰ�
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "hr";
			String password = "hr";
			conn = DriverManager.getConnection(url, user, password);

			// 3�ܰ� : ���� ���ఴü ����
			stmt = conn.createStatement();

			// 4�ܰ� : ���� ���� �� ��� ���
			int cnt = stmt.executeUpdate(sql);
			System.out.println("�� " + cnt + "�� �� ����");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			// 5�ܰ� ���� ����
			if (stmt != null) {
				try {

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			if (conn != null) {
				try {

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}

	}

}
