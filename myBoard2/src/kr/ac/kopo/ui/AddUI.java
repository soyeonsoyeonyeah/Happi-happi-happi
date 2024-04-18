package kr.ac.kopo.ui;

import kr.ac.kopo.vo.BoardVO;

/* 
 * ������ �Խñ� ����ϱ� ���� ����ڿ� ������ϴ� ���
 */

public class AddUI extends BaseUI{

	@Override
	public void execute() throws Exception {
		
		
		System.out.println("<<< �Խñ� ��� ���� >>>");
		String title = scanStr("����� ������ �Է��ϼ��� : ");
		String writer = scanStr("����� �ۼ��ڸ� �Է��ϼ��� : ");
		
		BoardVO board = new BoardVO();
		board.setTitle(title);
		board.setWriter(writer);
		service.addBoard(board);
		
		System.out.println("���� ����� �Ϸ��Ͽ����ϴ�");
	
	
	
	}
	
	

}
