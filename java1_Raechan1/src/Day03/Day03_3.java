package Day03;

import java.util.Scanner;

public class Day03_3 {
	
	public static void main(String[] args) {
		
		//����6
		// ������ �Է¹޾� ������ 90�� �̻��̸� �հ� �ƴϸ� ���հ� ��� 
		
		/*
		Scanner sc6 = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int grade6 = sc6.nextInt();
		
		if(grade6>=90) {
			System.out.println("�հ�");	
		}
		else System.out.println("���հ�");	
		*/
		
		
		//����7
		// ������ �Է¹޾� ������ 90�� �̻��̸� A���
		//				������ 80�� �̻��̸� B���
		//				������ 70�� �̻��̸� C���
		//				�׿� �����
		
		/*
		Scanner sc7 = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int grade7 = sc7.nextInt();
		
		if(grade7>=90) {
			System.out.println("A���");	
		}
		else if(grade7>=80) {
			System.out.println("B���");
		}
		else if(grade7>=70) {
			System.out.println("C���");
		}
		else System.out.println("�����");	
		*/
		
		
		//����8 �α���������
		// [ �Է� ] : ���̵�� ��й�ȣ�� �Է¹ޱ�
		// [ ���� ] : ȸ�����̵� admin �̰� 
		//           ��й�ȣ�� 1234 �� ��쿡�� 
		//          �α��� ���� �ƴϸ� �α��� ���� ���
		
		/*
		boolean �α��μ��� = false;
		Scanner sc8 = new Scanner(System.in);
		System.out.print("���̵� �Է� : ");
		String ID8 = sc8.next();
		System.out.print("��й�ȣ �Է� : ");
		String PW8 = sc8.next();
		
		if(ID8.equals("admin")) {
			if(PW8.equals("1234")) {
				System.out.println("�α��� ����");
				�α��μ��� = true;
			}
			else System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
		}
		else System.out.println("���̵� Ʋ�Ƚ��ϴ�.");
		
		if(�α��μ��� == false)  System.out.println("�α��� ����");
		*/
		
		
		
		
		
		/* ����9
		[ �Է� ] : ����,����,���� �Է¹ޱ�
		[ ���� ]
			����� 90�� �̻��̸鼭 
				�������� 100�� �̸� '������' ���
				�������� 100�� �̸� '������' ���
				�������� 100�� �̸� '���п��' ���
			����� 80�� �̻��̸鼭 
				�������� 90�� �̸� '�������' ���
				�������� 90�� �̸� '��������' ���
				�������� 90�� �̸� '�������' ���
			�׿� ����� 
		 */
		
		
		Scanner sc9 = new Scanner(System.in);
		System.out.print("���� ���� �Է� : ");
		int grade9_1 = sc9.nextInt();
		System.out.print("���� ���� �Է� : ");
		int grade9_2 = sc9.nextInt();
		System.out.print("���� ���� �Է� : ");
		int grade9_3 = sc9.nextInt();
		
		int grade9 = (grade9_1 + grade9_2 + grade9_3)/3;
		
		if(grade9>=90) {
			if(grade9_1==100) System.out.println("������");
			if(grade9_2==100) System.out.println("������");
			if(grade9_3==100) System.out.println("���п��");
			System.out.print("��� : " + grade9);
		} //if e
		else if(grade9>=80) {
			if(grade9_1==90) System.out.println("�������");
			if(grade9_2==90) System.out.println("�������");
			if(grade9_3==90) System.out.println("�������");
			System.out.print("��� : " + grade9);
		}//else if e
		else {System.out.println("�����");}//else e
		
		
	}

}
