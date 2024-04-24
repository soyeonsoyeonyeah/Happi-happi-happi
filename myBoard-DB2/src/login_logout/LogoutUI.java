package login_logout;

import kr.ac.kopo.ui.MailUI;
import kr.ac.kopo.vo.MemberVO;

public class LogoutUI extends LoginBaseUI {

	@Override
	public void execute() throws Exception {
		MemberVO.loginVO = null;
		System.out.println("·Î±×¾Æ¿ôµÇ¾ú½¿´ç");
		new MailUI().execute();
	
		
	}

}
