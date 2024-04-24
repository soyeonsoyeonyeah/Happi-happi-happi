package Delete;

import kr.ac.kopo.vo.InboxVO;

public class DeleteUI extends DeleteBaseUI {

	@Override
	public void execute() throws Exception {
		
		

		System.out.println("-------------------------");
		System.out.println("<<< 메일삭제하고 싶은가용? >>>");
		System.out.println("-------------------------");
		int code = scanInt("삭제하고싶은 이메일의 번호를 입력하세요");
		System.out.println("-------------------------");

		InboxVO email = new InboxVO(); 
		
		email.setNo(code);

		InboxVO deleteVO = deleteservice.delete(email);

		

		

	}

}
