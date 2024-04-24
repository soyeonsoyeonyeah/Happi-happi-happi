package Delete;

import java.sql.Connection;
import java.sql.PreparedStatement;

import kr.ac.kopo.util.ConnectionFactory;
import kr.ac.kopo.vo.InboxVO;

public class DeleteDAO {
	
	public InboxVO delete(InboxVO email) throws Exception {
		StringBuilder sql = new StringBuilder();
		sql.append(" update email ");
		sql.append(" set status = 0 ");
		sql.append(" where email_cd = ? ");

		try (Connection conn = new ConnectionFactory().getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql.toString())

		) {

			pstmt.setInt(1, email.getNo());
			int cnt  = pstmt.executeUpdate();
			
		
			  
		
			if(cnt > 0) {
				System.out.println("������ �Ϸ�Ǿ�����");
			}
			else {
				System.out.println("���� ��ȣ�ε��???????");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
		

	}

	

}


