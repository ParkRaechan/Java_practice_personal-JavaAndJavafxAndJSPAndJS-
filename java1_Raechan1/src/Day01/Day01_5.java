
package Day01;

import java.util.Scanner;

public class Day01_5 {// c s

	public static void main(String args[]) {// m s		
		
		// �Է� -> ���� -> ��� 
		// 1. �Է°�ü ����
		Scanner �Է°�ü = new Scanner(System.in);

		// 2. �Է��� ��� �ȳ� // 3. �Է¹��� ������ �ٸ����� ���� [ ��??? ����� ] 
		System.out.print("���̵� : ");	
		String �Ƶ� = �Է°�ü.next();
		
		System.out.print("��й�ȣ : ");		
		String ��� = �Է°�ü.next();
		
		System.out.print("���� : ");		
		String �� = �Է°�ü.next();
		
		System.out.print("�̸��� : ");		
		String ���� = �Է°�ü.next();
	
		// 3. ���
		System.out.println(">>>>>>>>ȸ������ �Ϸ� �Ʒ� ������ Ȯ�����ּ���>>>>>>>");
		System.out.println("���̵�\t��й�ȣ\t����\t�̸���");
		System.out.println( �Ƶ� +"\t" + ��� + "\t" + �� +"\t" + ����);

	}// m e
	
}// c e

/*
����1 : ȸ������ ǥ �ۼ�
[�Է� ��]
	1. ���̵�, ��й�ȣ , ����, �̸���  �Է¹޾� ���� 
[��� ��]
	>>>>>>>>>> ȸ������ �Ϸ� �Ʒ� ������ Ȯ�����ּ��� >>>>>>>>>
	 ���̵�		��й�ȣ		����		�̸���		
	 qwe		1234		���缮		itdanja@kakao.com
*/