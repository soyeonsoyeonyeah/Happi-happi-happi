package kr.ac.kopo.jbdc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class InsertMain02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���̵� �Է� : ");
		String id = sc.nextLine();
		System.out.println("�̸��� �Է� : ");
		String name = sc.nextLine();

		String sql = "insert into t_test(id, name)";
		       sql += " values(\'" + id + "\', \'" + name + "\') ";
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
