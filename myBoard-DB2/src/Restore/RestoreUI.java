package Restore;

import kr.ac.kopo.vo.InboxVO;

public class RestoreUI extends RestoreBaseUI {

	@Override
	public void execute() throws Exception {
		
		

		System.out.println("<<< 메일 복구 >>>");
		int code = scanInt("복구하고싶은 메일번호를 쓰삼요");

		InboxVO email = new InboxVO(); 
		
		email.setNo(code);

		InboxVO deleteVO = restoreservice.restore(email);

		

		

	}

}
