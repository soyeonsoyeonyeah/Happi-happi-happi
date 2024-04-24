package find;

import kr.ac.kopo.vo.MemberVO;
import login_logout.LoginUI;

public class FindPW extends FindBaseUI {

	@Override
	public void execute() throws Exception {
		System.out.println(">>>>비밀번호 찾기<<<<<<");
		String id = scanStr("아이디를 입력하세요 : ");
		int phone = scanInt("전화번호를 입력하세요 : ");

		MemberVO member = new MemberVO();
		member.setId(id);
		member.setPhone(phone);

		MemberVO findVO = findservice.findPW(member);

		if (findVO == null) {
			System.out.println("입력하신 값을 확인해주세요. 존재하지 않는 정보입니다.");
			execute();
		} else {
			System.out.println("야호 찾아냈어용");
			System.out.println();
			MemberVO.loginVO = findVO;
			System.out.println("당신의 비밀번호는!<" + findVO.getPassword() + "> 입니다용!! 앞으로 기억하시라용!");
			
			System.out.println();
			LoginUI login = new LoginUI();
			login.execute();
		}

		
	}

}
