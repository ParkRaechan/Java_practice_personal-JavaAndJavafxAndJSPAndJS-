package Day15.�������_1;

import java.util.Scanner;

public class App {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		while( true ) {
			// 1. ��� ���� ǥ ��� 
				//
			for(Car temp : Controller.carlist) {
				System.out.println("dho");
					System.out.println(temp.get��¥()+"\t"+temp.get������ȣ()
					+"\t"+temp.get�����ð�()+"\t"+temp.get�����ð�()
					+"\t"+temp.get�ݾ�());
			}
						// �迭�̳� ����Ʈ�� ��� ��ü ȣ�� �ݺ���
				// 
			System.out.print("1.���� \t  2.���� : ");
			int ch = scanner.nextInt();
			
			if( ch == 1 ) {
				// 1. ������ȣ�� �Է¹޴´�.
				System.out.print("������ȣ�Է� : ");
				String g = scanner.next();
				// 2. �Է¹��� ������ȣ�� ��Ʈ�ѳ� �޼ҵ� ���� �ѱ��.
				Controller.����(g);
				
				
			}else if( ch == 2 ){
				// 1. ������ȣ�� �Է¹޴´�.
					// �Է�
				// 2. �Է¹��� ������ȣ�� ��Ʈ�ѳ� �޼ҵ� ���� �ѱ��.
				// 3. �޼ҵ� ��� �� ���� ��� 
			}
			
		}
		
	} // 
} // 
