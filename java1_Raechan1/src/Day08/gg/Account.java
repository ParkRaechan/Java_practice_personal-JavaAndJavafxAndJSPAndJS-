package Day08.gg;

import java.util.Random;
import java.util.Scanner;

public class Account {
	
	// field
	int first = Day08_5.random.nextInt(100);
	int second = Day08_5.random.nextInt(100);
	int third = Day08_5.random.nextInt(100);
	static int balance;//�����ܱ�
	long account;//���¹�ȣ
	
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
		System.out.println("���¸� �����մϴ�.");
		System.out.printf("����� ���¹�ȣ�� : %d - %d - %d �Դϴ�.\n",first, second, third);
		account = first * 10000 + second * 100 + third; 
		return account;
	}
	


	void receipt() {
		Member member = new Member();
		balance = member.getMonney();
		System.out.print("\n�Ա��� �ݾ� : ");
		int receipt = Day08_5.sc.nextInt();
		if (receipt >= 0 ) {
			balance += receipt;
			member.money(balance);
			member.getMonney();
		} else {
			System.out.println("\n�ùٸ� �ݾ��� �Է��ϼ���.");
		}
	}
	
	void transfer() {
		Member member = new Member();
		balance = member.getMonney();
		System.out.println("��� ���¹�ȣ �Է�: ");
		long cde = Day08_5.sc.nextLong();
		System.out.println("������ �ݾ� �Է�");
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
		System.out.print("\n����� �ݾ� : ");
		int payment = Day08_5.sc.nextInt();
		if (payment > balance) {
			System.err.println("\n�ܾ��� �����մϴ�.");
			return;
		}
		else {
			balance -= payment;
			member.money(balance);
			System.out.println("\n���� �ܾ� : " +balance);
			return;
		}
	}

}
