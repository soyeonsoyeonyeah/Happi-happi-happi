package Restore;

import kr.ac.kopo.vo.InboxVO;

public class RestoreUI extends RestoreBaseUI {

	@Override
	public void execute() throws Exception {
		
		

		System.out.println("<<< ���� ���� >>>");
		int code = scanInt("�����ϰ���� ���Ϲ�ȣ�� �����");

		InboxVO email = new InboxVO(); 
		
		email.setNo(code);

		InboxVO deleteVO = restoreservice.restore(email);

		

		

	}

}
