package kr.ac.kopo.ui;

import java.util.List;

import kr.ac.kopo.vo.BoardVO;

public class SearchAllUI extends BaseUI {

	@Override
	public void execute() throws Exception {

		List<BoardVO> list = service.searchAllBoard();

		System.out.println("------------------------------");
		System.out.println("\t ��ü �Խñ� ��ȸ");
		System.out.println("------------------------------");
		System.out.println("��ȣ\t�ۼ���\t����");
		System.out.println("------------------------------");
		if(list.isEmpty()) {
			System.out.println("�Խñ��� �������� �ʽ��ϴ�");
		} else {
			for(BoardVO board : list) {
				System.out.println(board.getNo()+"\t"
									+board.getRegDate()+ "\t"
									+board.getWriter() +"\t"
									+board.getTitle());
			}
		}
		// TODO Auto-generated method stub

	}

}
