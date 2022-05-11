package dto;

public class Chat {
	String cname;
	String ccontent;
	int cnum;
	public Chat() {
		super();
	}
	public Chat(String cname, String ccontent, int cnum) {
		super();
		this.cname = cname;
		this.ccontent = ccontent;
		this.cnum = cnum;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCcontent() {
		return ccontent;
	}
	public void setCcontent(String ccontent) {
		this.ccontent = ccontent;
	}
	public int getCnum() {
		return cnum;
	}
	public void setCnum(int cnum) {
		this.cnum = cnum;
	}
	@Override
	public String toString() {
		return "Chat [cname=" + cname + ", ccontent=" + ccontent + ", cnum=" + cnum + "]";
	}
	
	
	
}
