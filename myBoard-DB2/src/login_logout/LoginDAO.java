package login_logout;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import kr.ac.kopo.util.ConnectionFactory;
import kr.ac.kopo.vo.MemberVO;

public class LoginDAO {

	public MemberVO select(MemberVO member) throws Exception {
		StringBuilder sql = new StringBuilder();
		sql.append("select * ");
		sql.append(" from MEMBER ");
		sql.append(" where id = ? and password = ? ");

		try (Connection conn = new ConnectionFactory().getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql.toString())

		) {

			pstmt.setString(1, member.getId());
			pstmt.setString(2, member.getPassword());
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				String id = rs.getString("id");
				String password = rs.getString("password");
				String name = rs.getString("name");
				int phone = rs.getInt("phone");
				int bd = rs.getInt("bd");

				MemberVO loginVO = new MemberVO();
				loginVO.setId(id);
				loginVO.setPassword(password);
				loginVO.setName(name);
				loginVO.setBd(bd);
				loginVO.setPhone(phone);
				

				return loginVO;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;

	}

}
