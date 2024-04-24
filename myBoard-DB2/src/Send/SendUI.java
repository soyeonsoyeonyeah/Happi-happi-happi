package Send;

import kr.ac.kopo.vo.InboxVO;
import kr.ac.kopo.vo.MemberVO;

public class SendUI extends SendBaseUI {

	@Override
	public void execute() throws Exception {

		System.out.println("<<< 메일을 보내볼까용? >>>");
		String sender = MemberVO.loginVO.getId();
		//String sender = scanStr("아무거나 보내는사람");
		String receiver = scanStr("누구한테 보낼까용?");
		String title = scanStr("제목은용?");
		String contents = scanStr("내용은용?");
		
	
		InboxVO email = new InboxVO();
		email.setSender(sender);
		email.setReceiver(receiver);
		email.setTitle(title);
		email.setContents(contents);

		
		InboxVO sentVO = sendservice.send(email);

		if (sentVO == null) {
			System.out.println("뭔가 오류가 있슴당!!!!!");

		} else {

		System.out.println("메일을 성공적으로 보냈습니다용");
			
			
		}

	}

}
