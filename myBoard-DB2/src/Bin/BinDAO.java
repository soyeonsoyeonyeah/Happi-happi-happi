package Bin;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import kr.ac.kopo.util.ConnectionFactory;
import kr.ac.kopo.vo.InboxVO;
import kr.ac.kopo.vo.MemberVO;

public class BinDAO {

	
	
	public List<InboxVO> bin() {
		
		List<InboxVO> list = new ArrayList<>();
		StringBuilder sql = new StringBuilder();
		sql.append("select email_cd, sender, receiver, title, contents ");
		sql.append(" , to_char(time_, 'yyyy-mm-dd') time ");
		sql.append(" from email ");
		sql.append("WHERE (receiver = ? OR sender = ?) AND status = 0");
		try (Connection conn = new ConnectionFactory().getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql.toString())
					
			) {
			pstmt.setString(1, MemberVO.loginVO.getId());
			pstmt.setString(2, MemberVO.loginVO.getId());
		
			pstmt.executeUpdate();
			
			
			ResultSet rs = pstmt.executeQuery();
			

			while (rs.next()) {
				int no = rs.getInt("email_cd");
				String sender = rs.getString("sender");
				String receiver = rs.getString("receiver");
				String title = rs.getString("title");
				String contents = rs.getString("contents");
				String time = rs.getString("time");
				
				
				InboxVO inbox= new InboxVO(no, sender, receiver, title, contents, time);
				list.add(inbox);
					
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;

	}
}
