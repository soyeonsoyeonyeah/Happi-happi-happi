package find;

import kr.ac.kopo.vo.MemberVO;
import login_logout.LoginUI;

public class FindID extends FindBaseUI {

	@Override
	public void execute() throws Exception {

		System.out.println("==========================================");
		System.out.println("             >>>>아이디찾기<<<<<<");
		System.out.println("==========================================");
		String name = scanStr("이름을 입력하세요 : ");
		int phone = scanInt("전화번호를 입력하세요 : ");
		System.out.println("==========================================");

		MemberVO member = new MemberVO();
		member.setName(name);
		member.setPhone(phone);

		MemberVO findVO = findservice.find(member);

		if (findVO == null) {
			System.out.println("입력하신 값을 확인해주세요. 존재하지 않는 정보입니다.");
			execute();
		} else {
			System.out.println("야호 찾아냈어용");
			MemberVO.loginVO = findVO;
			System.out.println("당신의 아이디는!<" + findVO.getId() + "> 입니다용!! 앞으로 기억하시라용!");
			System.out.println("==========================================");

			System.out.println();
			LoginUI login = new LoginUI();
			login.execute();
		}

	}

}
