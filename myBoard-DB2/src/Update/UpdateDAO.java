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
				System.out.println("아이디를 <" + member.getId() + "> 로 변경했습니다. 저는 천재지요?");
			} else {
				System.out.println("뭔가 문제가 있는디요?");
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
				System.out.println("비밀번호를 변경했습니다. 저는 천재지요?");
			}
			else {
				System.out.println("뭔가 문제가 있는디요?");
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
				System.out.println("전화번호를 <" + member.getPhone() + "> 로 변경했습니다. 저는 천재지요?");
			} else {
				System.out.println("뭔가 문제가 있는디요?");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
