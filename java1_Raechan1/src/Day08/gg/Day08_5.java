package Day08.gg;

import java.text.DecimalFormat;
import java.util.*;

import Day07.Book;

public class Day08_5 {

	// 계좌 프로그램
		//요구사항
		//회원 주요기능 : 1.회원가입 2.로그인 3.아이디찾기 4.비밀번호찾기
		//계좌 주요기능 : 1.계좌생성 2.입금 3.출금 4.이체 5.대출
		//설계 : 통장, 대출, 회원
			//필드 : [(Account)통장 - 잔금,이동금액][(Loan)대출 - 대출???][(Member)회원 - 아이디,비번,이름,폰번호]
			//메소드 : 

	static Scanner sc = new Scanner(System.in);
	
	static Member[] members = new Member[1000]; 
	static Account[] accounts = new Account[1000]; 
	static Loan[] ls = new Loan[1000];
	
	
	static Random random = new Random();
	static DecimalFormat formatter = new DecimalFormat("###,###");
	
	static Day08_5 a = new Day08_5();

	
	public static void main(String[] args) {
		System.out.println("테스트");
		
		a.menu();
		
	}
	
	void menu() {
		while(true) {
			System.out.println("1.회원가입 2.로그인 3.아이디찾기 4.비밀번호찾기");
			int ch = sc.nextInt();
			Member member = new Member();
			Account account = new Account();
			if(ch==1) {
				System.out.println(",,,,,,,,,,회원가입창,,,,,,,,");
				boolean result =  member.addMember();// 회원가입 메소드 호출 
				if( result ) 
					System.err.println(" 알림]] 회원가입 성공 ");
				else 
					System.err.println(" 알림]] 회원가입 실패");
			}
			else if(ch==2) {
				System.out.println(",,,,,,,,로그인창,,,,,,,,,,,,");
				if(member.login()==true) {
					//계좌프로그램 창 띄우기
					System.out.println("성공햇다네");
					a.accountMenu();
				}
				else {System.out.println("로그인실패라네~");}
				
			}
			else if(ch==3) {
				member.idCheck();
			}
			else if(ch==4) {
				member.pwCheck();
			}
			else {
				System.out.println("알 수 없는 입력");
			}
		}
	}
	
	void accountMenu() {
		while(true) {
			System.out.println("1.계좌생성 2.입금 3.출금 4.이체 5.대출 6.로그아웃");
			int ch2 = sc.nextInt();
			Member member = new Member();
			Account account = new Account();
			Loan loan = new Loan();
			if(ch2==1) {
				System.out.println(",,,,,,,,,,계좌생성창,,,,,,,,");
				long abc = account.account_create();
				member.addAccount(abc);
			}
			else if(ch2==2) {
				account.receipt();
			}
			else if(ch2==3) {
				account.payment();
			}
			else if(ch2==4) {
				account.transfer();
			}
			else if(ch2==5) {
				a.loanMenu();
			}
			else if(ch2==6) {
				break;
			}
			else {
				System.out.println("알 수 없는 입력");
			}
		}
	}
	
	void loanMenu() {
		while(true) {
			System.out.println("1.대출목록 2.대출신청 3.대출상환//[일시불로상환만가능]// 4.나가기");
			System.err.println("100입력시 비밀 관리자모드-대출등록가능");
			int ch3 = sc.nextInt();
			Member member = new Member();
			Account account = new Account();
			Loan loan = new Loan();
			if(ch3==1) {
				loan.대출목록();
			}
			else if(ch3==2) {
				loan.대출신청();
			}
			else if(ch3==3) {
				loan.대출상환();
			}
			else if(ch3==100) {
				System.out.println("비밀 관리자 모드 선택,,,,,,!!");
				System.out.println("대출등록");
				loan.대출등록();
			}
			else if(ch3==4) {
				break;
			}
			
			else {
				System.out.println("알 수 없는 입력");
			}
		}
	}
	
}