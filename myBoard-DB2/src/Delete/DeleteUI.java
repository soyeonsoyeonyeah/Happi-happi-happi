package Delete;

import kr.ac.kopo.vo.InboxVO;

public class DeleteUI extends DeleteBaseUI {

	@Override
	public void execute() throws Exception {
		
		

		System.out.println("-------------------------");
		System.out.println("<<< ���ϻ����ϰ� ��������? >>>");
		System.out.println("-------------------------");
		int code = scanInt("�����ϰ���� �̸����� ��ȣ�� �Է��ϼ���");
		System.out.println("-------------------------");

		InboxVO email = new InboxVO(); 
		
		email.setNo(code);

		InboxVO deleteVO = deleteservice.delete(email);

		

		

	}

}
