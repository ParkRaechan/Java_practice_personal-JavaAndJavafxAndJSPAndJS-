package Day03;

import java.util.Scanner;

public class Day03_4 {
	
	public static void main(String[] args) {
		
		// ��� : 1. if�� 2.switch��
				// if : ���˻�( true Ȥ�� false )  / ����Ǽ� ������ ���� �ʴ°�� 
					// >= <= > < == !=
				// switch : �����Ͱ˻�(��������)		/ ����Ǽ� ������ �ִ� ���
					// ������ case �̸� ���๮ó�� �� -> ���� case �̵� 
				// ����
					// switch( �˻��� ){
					//		case '���ð�' : ���๮; break;
					//		case '���ð�' : ���๮; break;
					//		case '���ð�' : ���๮; break;
					//		default : ���๮;
					// }
				
				// break;  :  ���� ����� swtich Ȥ�� �ݺ��� Ż��[������]
				
		// ��1) ������ 90�� �̸� A 80���̸� B 70���� C �׿� Ż�� 
		/*
		int ���� = 80;
		switch (����) {
		case 90:
			System.out.println("A���");
			break;
		case 80:
			System.out.println("B���");
			break;
		case 70:
			System.out.println("C���");
			break;
		default:
			System.out.println("Ż��");
			break;
		*/
		
		
		
		
		// ��2)
		
		/*
		 	int ��ư = 3;
		 	switch( ��ư ) {
		 		case 1 : System.out.println(" 1������ �̵� "); break;
		 		case 2 : System.out.println(" 2������ �̵� "); break;
		 		case 3 : System.out.println(" 3������ �̵� "); break;
		 		case 4 : System.out.println(" 4������ �̵� "); break;
		 		default : System.out.println(" ���� ");
		 	}
		 */
		
		
		
		 // ��3)
		/*
		 	char ��� = 'B';
		 	switch( ��� ) {
		 		case 'A' : 
		 		case 'B' : System.out.println(" ��� ȸ�� "); break;
		 		case 'C' : 
		 		case 'D' : System.out.println(" �Ϲ� ȸ�� "); break;
		 		default : System.out.println(" �մ� ");
		 	}
		 */
		
		
		
		
		
		 // ��4)
		
		/*
		 	String ���� = "����";
		 	switch( ���� ) { // ���������� ������ .equals ��� X
		 		case "����" : System.out.println("700����");	break;
		 		case "����" : System.out.println("500����");	break;
		 		default : System.out.println("300����");
		 	}
		*/
		
		
		
		
		// ����1 ) ����,����,���� ������ �Է¹޾�  
			// 	����� 90���̻��̸� A���
			//  80���̻��̸� B��� ������ Ż��
			
		Scanner sc1 = new Scanner(System.in);
		System.out.print("���� ���� �Է� : ");
		int grade1_1 = sc1.nextInt();
		System.out.print("���� ���� �Է� : ");
		int grade1_2 = sc1.nextInt();
		System.out.print("���� ���� �Է� : ");
		int grade1_3 = sc1.nextInt();
			
		int grade1 = (grade1_1 + grade1_2 + grade1_3)/3;
		int grade1_4 = grade1/10;

		switch (grade1_4) {
			case 9:
				System.out.print("��� : " + grade1 + " " + "A���");
				break;
			case 8:
				System.out.print("��� : " + grade1 + " " + "B���");
				break;
			default:
				System.out.print("Ż��");
				break;
		}
		
			
	}
		
}


