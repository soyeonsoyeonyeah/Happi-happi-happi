package Update;

import java.sql.Connection;
import java.sql.PreparedStatement;

import kr.ac.kopo.util.ConnectionFactory;
import kr.ac.kopo.vo.MemberVO;

public class UpdateDAO {

	public void update(MemberVO member) throws Exception {
		StringBuilder sql = new StringBuilder();
		sql.append(" update MEMBER ");
		sql.append(" set id = ? ");
		sql.append(" where name = ? and phone = ? ");

		try (Connection conn = new ConnectionFactory().getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql.toString())

		) {

			pstmt.setString(1, member.getId());
			pstmt.setString(2, member.getName());
			pstmt.setInt(3, member.getPhone());

			int cnt = pstmt.executeUpdate();

			if (cnt > 0) {
				System.out.println("���̵� <" + member.getId() + "> �� �����߽��ϴ�. ���� õ������?");
			} else {
				System.out.println("���� ������ �ִµ��?");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void updatePW(MemberVO member) throws Exception {
		StringBuilder sql = new StringBuilder();
		sql.append("update MEMBER ");
		sql.append(" set password = ? ");
		sql.append(" where id = ?  and phone = ? ");

		try (Connection conn = new ConnectionFactory().getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql.toString())

		) {

			pstmt.setString(1, member.getPassword());
			pstmt.setString(2, member.getId());
			pstmt.setInt(3, member.getPhone());
			
	int cnt = pstmt.executeUpdate();
			
			if(cnt > 0) {
				System.out.println("��й�ȣ�� �����߽��ϴ�. ���� õ������?");
			}
			else {
				System.out.println("���� ������ �ִµ��?");
			}
	

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void updatePhone(MemberVO member) throws Exception {
		StringBuilder sql = new StringBuilder();
		sql.append("update MEMBER ");
		sql.append(" set phone = ? ");
		sql.append(" where password = ?  ");

		try (Connection conn = new ConnectionFactory().getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql.toString())

		) {

			pstmt.setInt(1, member.getPhone());
			pstmt.setString(2, member.getPassword());

			int cnt = pstmt.executeUpdate();

			if (cnt > 0) {
				System.out.println("��ȭ��ȣ�� <" + member.getPhone() + "> �� �����߽��ϴ�. ���� õ������?");
			} else {
				System.out.println("���� ������ �ִµ��?");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
