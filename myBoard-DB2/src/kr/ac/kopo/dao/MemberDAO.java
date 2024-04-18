package kr.ac.kopo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

import kr.ac.kopo.util.ConnectionFactory;
import kr.ac.kopo.vo.BoardVO;
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

	public List<BoardVO> selectALL() {
		// TODO Auto-generated method stub
		return null;
	}
	
/*
	private String title() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<BoardVO> selectALL() {
		
		List<BoardVO> list = new ArrayList<>();
		StringBuilder sql = new StringBuilder();
		sql.append("select no, title, writer ");
		sql.append(" , to_char(reg_date, 'yyyy-mm-dd') reg_date ");
		sql.append(" from tbl_board ");
		try (Connection conn = new ConnectionFactory().getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql.toString())) {
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				int no = rs.getInt("no");
				String title = rs.getString("title");
				String writer = rs.getString("writer");
				String regDate = rs.getString("reg_date");
				
				BoardVO board = new BoardVO(no, title, writer, regDate);
				list.add(board);
					
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
		*/
	
}
