package kr.ac.kopo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import kr.ac.kopo.util.ConnectionFactory;
import kr.ac.kopo.vo.MemberVO;

public class MemberDAO {

	public void insert(MemberVO board) {
		StringBuilder sql = new StringBuilder();
		sql.append("insert into MEMBER(member_cd, id, password, name, bd, phone) ");
		sql.append(" values ( seq_tbl_board_no.nextval, ?, ?, ?, ?, ?) ");

		try (Connection conn = new ConnectionFactory().getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql.toString())

		) {
			String name = board.getName();
			int phone = board.getPhone();
			int bd = board.getBd();
			String id = board.getId();
			String password = board.getPassword();
			pstmt.setString(1, id);
			pstmt.setString(2, password);
			pstmt.setString(3, name);
			pstmt.setInt(4, bd);
			pstmt.setInt(5, phone);
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
	


