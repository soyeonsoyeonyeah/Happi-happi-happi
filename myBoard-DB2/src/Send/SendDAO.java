package Send;

import java.sql.Connection;
import java.sql.PreparedStatement;

import kr.ac.kopo.util.ConnectionFactory;
import kr.ac.kopo.vo.InboxVO;

public class SendDAO {

	public InboxVO insert(InboxVO email) throws Exception {
		StringBuilder sql = new StringBuilder();
		sql.append(" insert into EMAIL(email_cd, sender, receiver, title, contents) ");
		sql.append(" values (seq_email_email_cd.nextval, ?, ?, ?, ?) ");

		try (Connection conn = new ConnectionFactory().getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql.toString())

		) {

			pstmt.setString(1, email.getSender());
			pstmt.setString(2, email.getReceiver());
			pstmt.setString(3, email.getTitle());
			pstmt.setString(4, email.getContents());
			pstmt.executeUpdate();
		
			return email;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;

	}

}
