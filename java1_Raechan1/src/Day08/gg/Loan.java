package Day08.gg;

import Day07.Book;
import Day07.Day07_5_BookApplication;

public class Loan {
	//필드
	String 대출이름;
	int how;
	double 이자;
	String yName;
	
	public Loan() {
		super();
	}
	public Loan(String 대출이름, int how, double 이자, String yName) {
		super();
		this.대출이름 = 대출이름;
		this.how = how;
		this.이자 = 이자;
		this.yName = yName;
	}
	
	public void 대출목록() {
		System.out.println(" ------- 대출 페이지 -------");
		System.out.println("대출이름\t\t금액\t이자\t누가신청했는가");
		for( Loan temp1 : Day08_5.ls) {
			if( temp1 != null ) { 
				System.out.println( temp1.대출이름 +"\t  "+ temp1.how +"\t" + temp1.이자 +"\t" + temp1.yName);
			}
		}
	}
	
	void 대출등록() {
		System.out.println(" ------- 대출등록 페이지 -------");
		System.out.print(" 대출이름 : ");	String 대출이름 =Day08_5.sc.next();
		System.out.print(" 금액 : ");	int how =Day08_5.sc.nextInt();
		System.out.print(" 이자(%) : ");	double 이자 =Day08_5.sc.nextDouble();

		

		Loan loan = new Loan(대출이름, how, 이자, null);

		int i = 0;
		for( Loan temp4 : Day08_5.ls) {
			if(temp4 == null ) {
				Day08_5.ls[i]=loan;
				System.out.println(" 알림]] 대출등록이 되었습니다. ");
				return; 
			}
			i++; 
		}
	}
	void 대출신청() {
		Member member = new Member();
		Account account = new Account();
		account.balance = member.getMonney();

		System.out.println(" ------- 대출신청 페이지 -------");
		System.out.println("어떤거 대출할거임...,,,@@");
		System.out.print(" 대출이름 : ");	String 대출이름 =Day08_5.sc.next();
		for( Loan temp4  : Day08_5.ls) {
			if(temp4!=null && temp4.대출이름.equals(대출이름)) {
				temp4.yName = Member.yourName;
				System.out.println("대출성공");
				account.balance += temp4.how;
				member.money(account.balance);
				member.getMonney();

				break;
			}
		}
	}
	void 대출상환() {
		Member member = new Member();
		Account account = new Account();
		account.balance = member.getMonney();

		System.out.println(" ------- 대출상환 페이지 -------");
		System.out.println("어떤거 대출상환할거임.!?..,,,@@");
		System.out.print(" 대출이름 : ");	String 대출이름 =Day08_5.sc.next();
		for( Loan temp4  : Day08_5.ls) {
			if(temp4!=null && temp4.대출이름.equals(대출이름)) {
				if(account.balance>=(temp4.how+temp4.how*temp4.이자)) {
					temp4.yName = Member.yourName;
					System.out.println("대출성공");
					account.balance -= (temp4.how+temp4.how*temp4.이자);
					member.money(account.balance);
					member.getMonney();
				}
				else {
					System.out.println("돈없잔슴~~");
				}

				break;
			}
		}
	}
}
