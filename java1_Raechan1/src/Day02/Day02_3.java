package Day02;

import java.util.Scanner;

public class Day02_3 {
	
	public static void main(String[] args) {
		
		// ����1 : �޿� ���
		/*
		 * 	[�Է�����]
		 * 		�⺻�� , ����
		 * 	[ ���� ] 
		 * 		�Ǽ��ɾ� = �⺻�� + ���� - ����[�⺻��10%] 
		 * 	[�������] 
		 * 		�Ǽ��ɾ� ��� 
		 */
		
		// * �Է� -> ���� -> ��� -> ���
				// 1. �Է� ��ü �����. [ �ڷ��� �ҹ��� , Ŭ������ �빮�� ]
		System.out.print("�⺻�� : ");
		
		// 2. �Է¹��� ���� ������ �����Ѵ�. [ �Է°�ü�� �Է¹��������� ���� �����Ͱ� ����� ]
		Scanner sc1 = new Scanner(System.in);

		// �Է°�ü��.nextInt() : int�� ������ �������� 
				// �Է°�ü��.next() : ���ڿ� ������ ��������
		int yBase = sc1.nextInt();
		
		
		System.out.print("����: ");
		int yMoney = sc1.nextInt();
		
		// 3. ������ ����(���) �Ѵ�// int*double �Ŀ� int������ ������ȯ(ĳ����) 
		int tax = (int)(yBase * 0.1); // 100% : 1   10% : 0.1
		
		
		int realMoney = yBase + yMoney - tax;
		System.out.println("�Ǽ��ɾ� : " + realMoney + "��");
		// 		���ڿ�	+	������( ������ ������ ȣ�� )
			//  + : 1. ���Ῥ���� ��� 2.���ϱ� ���
		
		int ����1 = 10; int ����2 = 20;
		
		System.out.println("���ϱ� : " + ����1 + ����2);
		System.out.println("���ϱ� : " + (����1 + ����2));
		System.out.println("���� : " + (����1 - ����2));
		System.out.println("���ϱ� : " + (����1 * ����2));
		System.out.println("������(�K) : " + (����1 / ����2));
		System.out.println("������ : " + (����1 % ����2));
		
		����1++;
		System.out.println("���� : " + ����1);
		����1--;
		System.out.println("���� : " + ����1);
		
		System.out.println("�������� :	 " + (����1 % ����2));
		
		
		// ����2 : ���� ���� 
		/*
		 * [ �Է����� ] 
		 * 		�ݾ� 
		 * [ ���� ] 
		 * 		�ʸ��� ���� ��� ������ ���� ���� 
		 * [ ������� ]
		 * 		��) 356789 �Է½� 
		 * 		�ʸ��� 3�� 
		 * 		���� 5��
		 * 		õ�� 6�� 
		 * 		��� 7��
		 * 
		 */

		
	}

}
