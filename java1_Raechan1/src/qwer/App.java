package qwer;

import java.util.Scanner;

public class App {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			while( true ) {
				System.out.println("--------------------------------------------- ���� ��Ȳ ǥ --------------------------------------------"
);
				Controller.����();
				System.out.println("----------------------------------------------------------------------------------------------------"
						);
				System.out.print("1.���� \t  2.���� : ");
				int ch = scanner.nextInt();
				
				if( ch == 1 ) {
					// 1. ������ȣ�� �Է¹޴´�.
					System.out.print("������ȣ�Է� : ");
					String g = scanner.next();
					
					Controller.����(g);
					
					
				}else if( ch == 2 ){
					System.out.print("������ȣ�Է� : ");
					String g = scanner.next();
					Controller.����(g);
				}
			}
		}
		catch(Exception e) {
			System.out.println("����� �� �Է�");
			scanner = new Scanner(System.in);
			
		}
		
	} // 
} // 
