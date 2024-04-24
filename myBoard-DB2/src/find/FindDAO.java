package find;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import kr.ac.kopo.util.ConnectionFactory;
import kr.ac.kopo.vo.MemberVO;

public class FindDAO {

	public MemberVO find(MemberVO member) throws Exception {
		StringBuilder sql = new StringBuilder();
		sql.append("select id, name, phone ");
		sql.append(" from MEMBER ");
		sql.append(" where name = ? and phone = ? ");

		try (Connection conn = new ConnectionFactory().getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql.toString())

		) {

			pstmt.setString(1, member.getName());
			pstmt.setInt(2, member.getPhone());
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				String id = rs.getString("id");
				int phone = rs.getInt("phone");
				String name = rs.getString("name");

				MemberVO loginVO = new MemberVO();
				loginVO.setId(id);
				loginVO.setName(name);

				return loginVO;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;

	}

	public MemberVO findPW(MemberVO member) throws Exception {
		StringBuilder sql = new StringBuilder();
		sql.append("select id, name, phone, password ");
		sql.append(" from MEMBER ");
		sql.append(" where id = ? and phone = ? ");

		try (Connection conn = new ConnectionFactory().getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql.toString())

		) {

			pstmt.setString(1, member.getId());
			pstmt.setInt(2, member.getPhone());
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				String id = rs.getString("id");
				int phone = rs.getInt("phone");
				String name = rs.getString("name");
				String password = rs.getString("password");

				MemberVO loginVO = new MemberVO();
				loginVO.setId(id);
				loginVO.setName(name);
				loginVO.setPassword(password);

				return loginVO;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;

	}	
	
}
