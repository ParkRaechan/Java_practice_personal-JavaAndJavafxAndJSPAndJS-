package qwer;

import java.util.Scanner;

public class App {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			while( true ) {
				System.out.println("--------------------------------------------- 주차 현황 표 --------------------------------------------"
);
				Controller.메인();
				System.out.println("----------------------------------------------------------------------------------------------------"
						);
				System.out.print("1.입차 \t  2.출차 : ");
				int ch = scanner.nextInt();
				
				if( ch == 1 ) {
					// 1. 차량번호를 입력받는다.
					System.out.print("차량번호입력 : ");
					String g = scanner.next();
					
					Controller.입차(g);
					
					
				}else if( ch == 2 ){
					System.out.print("차량번호입력 : ");
					String g = scanner.next();
					Controller.출차(g);
				}
			}
		}
		catch(Exception e) {
			System.out.println("제대로 된 입력");
			scanner = new Scanner(System.in);
			
		}
		
	} // 
} // 
