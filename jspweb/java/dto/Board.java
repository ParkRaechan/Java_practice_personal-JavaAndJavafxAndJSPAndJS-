package dto;

public class Board {
	
	private int bno;
	private String btitle;
	private String bcontent;
	private int mno;
	private String bfile;
	private int bview;
	private String bdate;
	private String mid; /*화면표시용*/
	
	//빈생성자,풀생성자 있는것이 좋다
	public Board() {
		super();
	}
	public Board(int bno, String btitle, String bcontent, int mno, String bfile, int bview, String bdate, String mid) {
		super();
		this.bno = bno;
		this.btitle = btitle;
		this.bcontent = bcontent;
		this.mno = mno;
		this.bfile = bfile;
		this.bview = bview;
		this.bdate = bdate;
		this.mid = mid;
	}
	@Override
	public String toString() {
		return "Board [bno=" + bno + ", btitle=" + btitle + ", bcontent=" + bcontent + ", mno=" + mno + ", bfile="
				+ bfile + ", bview=" + bview + ", bdate=" + bdate + ", mid=" + mid + "]";
	}
	
	// 필드저장/호출용 메소드
	public int getBno() {
		return bno;
	}
	public void setBno(int bno) {
		this.bno = bno;
	}
	public String getBtitle() {
		return btitle;
	}
	public void setBtitle(String btitle) {
		this.btitle = btitle;
	}
	public String getBcontent() {
		return bcontent;
	}
	public void setBcontent(String bcontent) {
		this.bcontent = bcontent;
	}
	public int getMno() {
		return mno;
	}
	public void setMno(int mno) {
		this.mno = mno;
	}
	public String getBfile() {
		return bfile;
	}
	public void setBfile(String bfile) {
		this.bfile = bfile;
	}
	public int getBview() {
		return bview;
	}
	public void setBview(int bview) {
		this.bview = bview;
	}
	public String getBdate() {
		return bdate;
	}
	public void setBdate(String bdate) {
		this.bdate = bdate;
	}
	public String getMid() {
		return mid;
	}
	public void setMid(String mid) {
		this.mid = mid;
	}
	
	
	
}
