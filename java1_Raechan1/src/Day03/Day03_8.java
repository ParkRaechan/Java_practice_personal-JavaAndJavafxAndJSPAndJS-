package Day03;

import java.util.Iterator;
import java.util.Scanner;

public class Day03_8 {
	
	public static void main(String[] args) {
		
		boolean run = true;
		
		int balance = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("-------------------------------");
			System.out.println("1.���� 2.��� 3.�ܰ� 4.����");
			System.out.println("-------------------------------");
			System.out.print("����> ");
			
			int ���� = scanner.nextInt();
			if(����==1) {
				System.out.print("���ݾ�> ");
				int ���ݾ� = scanner.nextInt();
				balance += ���ݾ�;
			}
			else if(����==2) {
				System.out.print("��ݾ�> ");
				int ��ݾ� = scanner.nextInt();
				if(��ݾ� > balance) {System.out.println("�ܾ׺���");}
				else balance -= ��ݾ�;
			}
			else if(����==3) {
				System.out.print("�ܰ�> " + balance);
			}
			else if(����==4) {
				break;
			}
			else System.out.println("�� �� ���� ��� �Է�");
		}
		
		System.out.println("���α׷� ����");
		
	}
		
}


