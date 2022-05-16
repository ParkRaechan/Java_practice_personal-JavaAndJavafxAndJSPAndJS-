package Day08.gg;

import java.text.DecimalFormat;
import java.util.*;

import Day07.Book;

public class Day08_5 {

	// ���� ���α׷�
		//�䱸����
		//ȸ�� �ֿ��� : 1.ȸ������ 2.�α��� 3.���̵�ã�� 4.��й�ȣã��
		//���� �ֿ��� : 1.���»��� 2.�Ա� 3.��� 4.��ü 5.����
		//���� : ����, ����, ȸ��
			//�ʵ� : [(Account)���� - �ܱ�,�̵��ݾ�][(Loan)���� - ����???][(Member)ȸ�� - ���̵�,���,�̸�,����ȣ]
			//�޼ҵ� : 

	static Scanner sc = new Scanner(System.in);
	
	static Member[] members = new Member[1000]; 
	static Account[] accounts = new Account[1000]; 
	static Loan[] ls = new Loan[1000];
	
	
	static Random random = new Random();
	static DecimalFormat formatter = new DecimalFormat("###,###");
	
	static Day08_5 a = new Day08_5();

	
	public static void main(String[] args) {
		System.out.println("�׽�Ʈ");
		
		a.menu();
		
	}
	
	void menu() {
		while(true) {
			System.out.println("1.ȸ������ 2.�α��� 3.���̵�ã�� 4.��й�ȣã��");
			int ch = sc.nextInt();
			Member member = new Member();
			Account account = new Account();
			if(ch==1) {
				System.out.println(",,,,,,,,,,ȸ������â,,,,,,,,");
				boolean result =  member.addMember();// ȸ������ �޼ҵ� ȣ�� 
				if( result ) 
					System.err.println(" �˸�]] ȸ������ ���� ");
				else 
					System.err.println(" �˸�]] ȸ������ ����");
			}
			else if(ch==2) {
				System.out.println(",,,,,,,,�α���â,,,,,,,,,,,,");
				if(member.login()==true) {
					//�������α׷� â ����
					System.out.println("�����޴ٳ�");
					a.accountMenu();
				}
				else {System.out.println("�α��ν��ж��~");}
				
			}
			else if(ch==3) {
				member.idCheck();
			}
			else if(ch==4) {
				member.pwCheck();
			}
			else {
				System.out.println("�� �� ���� �Է�");
			}
		}
	}
	
	void accountMenu() {
		while(true) {
			System.out.println("1.���»��� 2.�Ա� 3.��� 4.��ü 5.���� 6.�α׾ƿ�");
			int ch2 = sc.nextInt();
			Member member = new Member();
			Account account = new Account();
			Loan loan = new Loan();
			if(ch2==1) {
				System.out.println(",,,,,,,,,,���»���â,,,,,,,,");
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
				System.out.println("�� �� ���� �Է�");
			}
		}
	}
	
	void loanMenu() {
		while(true) {
			System.out.println("1.������ 2.�����û 3.�����ȯ//[�Ͻúҷλ�ȯ������]// 4.������");
			System.err.println("100�Է½� ��� �����ڸ��-�����ϰ���");
			int ch3 = sc.nextInt();
			Member member = new Member();
			Account account = new Account();
			Loan loan = new Loan();
			if(ch3==1) {
				loan.������();
			}
			else if(ch3==2) {
				loan.�����û();
			}
			else if(ch3==3) {
				loan.�����ȯ();
			}
			else if(ch3==100) {
				System.out.println("��� ������ ��� ����,,,,,,!!");
				System.out.println("������");
				loan.������();
			}
			else if(ch3==4) {
				break;
			}
			
			else {
				System.out.println("�� �� ���� �Է�");
			}
		}
	}
	
}