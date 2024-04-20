package kr.ac.kopo.ui;

import java.util.Scanner;

import kr.ac.kopo.service.BoardServiceFactory;
import kr.ac.kopo.service.MemberService;

public abstract class BaseUI implements IBoardUI {

	private Scanner sc;
	protected MemberService service;

	public BaseUI()
	{
		sc = new Scanner(System.in);
		//service = new BoardService();
		service = BoardServiceFactory.getInstance();
	}

	protected String scanStr(String msg) {
		System.out.println(msg);
		return sc.nextLine();
	}

	protected int scanInt(String msg) {
		return Integer.parseInt(scanStr(msg));

	}

}
