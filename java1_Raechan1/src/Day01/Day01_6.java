
package Day01;

import java.util.Scanner;

public class Day01_6 {// c s

	public static void main(String args[]) {// m s		
		
		//�Է� ��ü ����
		Scanner �Է°�ü = new Scanner(System.in);
		
		//�Է� ��� �ȳ�
		System.out.print("�ۼ��� : ");	
		//�Է¹��� ������ ����
		String �ۼ��� = �Է°�ü.next();
		
		System.out.print("���� : ");		
		String ���� = �Է°�ü.next();
		
		System.out.print("��¥ : ");		
		String ��¥ = �Է°�ü.next();
		
		//���
		System.out.println("-------------�湮��-------------");
		System.out.println("|����|�ۼ���|����\t  |��¥|");
		System.out.println("|1  |" + �ۼ��� + "|" + ���� + "|" + ��¥ +"|");
		System.out.println("------------------------------");
	}// m e
	
}// c e