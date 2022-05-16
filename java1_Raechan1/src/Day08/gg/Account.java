package Day08.gg;

import java.util.Random;
import java.util.Scanner;

public class Account {
	
	// field
	int first = Day08_5.random.nextInt(100);
	int second = Day08_5.random.nextInt(100);
	int third = Day08_5.random.nextInt(100);
	static int balance;//계좌잔금
	long account;//계좌번호
	
	public Account() {}
	
	// constructor
	public Account(int first, int second, int third, int balance, long account) {
		super();
		this.first = first;
		this.second = second;
		this.third = third;
		this.balance = balance;
		this.account = account;
	}

	// method
	
	public long account_create() {
		System.out.println("계좌를 생성합니다.");
		System.out.printf("당신의 계좌번호는 : %d - %d - %d 입니다.\n",first, second, third);
		account = first * 10000 + second * 100 + third; 
		return account;
	}
	


	void receipt() {
		Member member = new Member();
		balance = member.getMonney();
		System.out.print("\n입금할 금액 : ");
		int receipt = Day08_5.sc.nextInt();
		if (receipt >= 0 ) {
			balance += receipt;
			member.money(balance);
			member.getMonney();
		} else {
			System.out.println("\n올바른 금액을 입력하세요.");
		}
	}
	
	void transfer() {
		Member member = new Member();
		balance = member.getMonney();
		System.out.println("상대 계좌번호 입력: ");
		long cde = Day08_5.sc.nextLong();
		System.out.println("보내실 금액 입력");
		int m2 = Day08_5.sc.nextInt();
		balance -= m2;
		member.money(balance);
		member.getMonney();
		for(Member temp : Day08_5.members) {
			if(temp!=null && temp.account==cde) {
				temp.yourMoney += m2;
			}
		}
	}
	
	void payment() {
		Member member = new Member();
		balance = member.getMonney();
		System.out.print("\n출금할 금액 : ");
		int payment = Day08_5.sc.nextInt();
		if (payment > balance) {
			System.err.println("\n잔액이 부족합니다.");
			return;
		}
		else {
			balance -= payment;
			member.money(balance);
			System.out.println("\n현재 잔액 : " +balance);
			return;
		}
	}

}
