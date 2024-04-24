package kr.ac.kopo.vo;

public class InboxVO {

	public static MemberVO loginVO;
	private int no;
	private String sender;
	private String receiver;
	private String title;
	private String contents;
	private String time_;
	private int status;

	public InboxVO() {
		super();
	}



	public InboxVO(int no, String sender, String receiver, String title, String contents, String time_, int status) {
		super();
		this.no = no;
		this.sender = sender;
		this.receiver = receiver;
		this.title = title;
		this.contents = contents;
		this.time_ = time_;
		this.status = status;
	}

	public InboxVO(int no, String sender, String receiver, String title, String contents, String time) {
		super();
		this.no = no;
		this.sender = sender; 
		this.receiver = receiver;
		this.title = title;
		this.contents = contents;
		this.time_ = time;
		
	}


	public int getNo() {
		return no;
	}

	public void setNo(int code) {
		this.no = code;
	}

	public static MemberVO getLoginVO() {
		return loginVO;
	}

	public static void setLoginVO(MemberVO loginVO) {
		InboxVO.loginVO = loginVO;
	}

	public String getSender() {
		return sender;
	}

	public void setSender(String sender) {
		this.sender = sender;
	}

	public String getReceiver() {
		return receiver;
	}

	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	public String getTime_() {
		return time_;
	}

	public void setTime_(String time_) {
		this.time_ = time_;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "InboxVO [no=" + no + ", sender=" + sender + ", receiver=" + receiver + ", title=" + title
				+ ", contents=" + contents + ", time_=" + time_ + ", status=" + status + "]";
	}



}
