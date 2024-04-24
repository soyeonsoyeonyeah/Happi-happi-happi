package Update;

import kr.ac.kopo.vo.MemberVO;
import login_logout.LoginUI;

public class UpdateID extends UpdateBaseUI {

	@Override
	public void execute() throws Exception {

		System.out.println(">>>>아이디변경<<<<<<");
		
		String name = scanStr("이름을 입력하세요 : ");
		while(!name.equals(MemberVO.loginVO.getName())){
			name = scanStr("올바른 이름을 입력하세욧!");
		}
		int phone = scanInt("전화번호를 입력하세요 : ");
		while (phone != MemberVO.loginVO.getPhone()) {
			phone = scanInt("다시 올바른 번호를 입력하라구욧!");
		}
		
		String id = scanStr("변경하고 싶은 아이디를 입력하시오: ");

		MemberVO member = new MemberVO();
		member.setName(name);
		member.setPhone(phone);
		member.setId(id);

		updateservice.update(member);

		

			System.out.println();
			LoginUI login = new LoginUI();
			login.execute();
		}

	}


