package Day08.gg;

import Day07.Book;
import Day07.Day07_5_BookApplication;

public class Loan {
	//�ʵ�
	String �����̸�;
	int how;
	double ����;
	String yName;
	
	public Loan() {
		super();
	}
	public Loan(String �����̸�, int how, double ����, String yName) {
		super();
		this.�����̸� = �����̸�;
		this.how = how;
		this.���� = ����;
		this.yName = yName;
	}
	
	public void ������() {
		System.out.println(" ------- ���� ������ -------");
		System.out.println("�����̸�\t\t�ݾ�\t����\t������û�ߴ°�");
		for( Loan temp1 : Day08_5.ls) {
			if( temp1 != null ) { 
				System.out.println( temp1.�����̸� +"\t  "+ temp1.how +"\t" + temp1.���� +"\t" + temp1.yName);
			}
		}
	}
	
	void ������() {
		System.out.println(" ------- ������ ������ -------");
		System.out.print(" �����̸� : ");	String �����̸� =Day08_5.sc.next();
		System.out.print(" �ݾ� : ");	int how =Day08_5.sc.nextInt();
		System.out.print(" ����(%) : ");	double ���� =Day08_5.sc.nextDouble();

		

		Loan loan = new Loan(�����̸�, how, ����, null);

		int i = 0;
		for( Loan temp4 : Day08_5.ls) {
			if(temp4 == null ) {
				Day08_5.ls[i]=loan;
				System.out.println(" �˸�]] �������� �Ǿ����ϴ�. ");
				return; 
			}
			i++; 
		}
	}
	void �����û() {
		Member member = new Member();
		Account account = new Account();
		account.balance = member.getMonney();

		System.out.println(" ------- �����û ������ -------");
		System.out.println("��� �����Ұ���...,,,@@");
		System.out.print(" �����̸� : ");	String �����̸� =Day08_5.sc.next();
		for( Loan temp4  : Day08_5.ls) {
			if(temp4!=null && temp4.�����̸�.equals(�����̸�)) {
				temp4.yName = Member.yourName;
				System.out.println("���⼺��");
				account.balance += temp4.how;
				member.money(account.balance);
				member.getMonney();

				break;
			}
		}
	}
	void �����ȯ() {
		Member member = new Member();
		Account account = new Account();
		account.balance = member.getMonney();

		System.out.println(" ------- �����ȯ ������ -------");
		System.out.println("��� �����ȯ�Ұ���.!?..,,,@@");
		System.out.print(" �����̸� : ");	String �����̸� =Day08_5.sc.next();
		for( Loan temp4  : Day08_5.ls) {
			if(temp4!=null && temp4.�����̸�.equals(�����̸�)) {
				if(account.balance>=(temp4.how+temp4.how*temp4.����)) {
					temp4.yName = Member.yourName;
					System.out.println("���⼺��");
					account.balance -= (temp4.how+temp4.how*temp4.����);
					member.money(account.balance);
					member.getMonney();
				}
				else {
					System.out.println("�����ܽ�~~");
				}

				break;
			}
		}
	}
}
