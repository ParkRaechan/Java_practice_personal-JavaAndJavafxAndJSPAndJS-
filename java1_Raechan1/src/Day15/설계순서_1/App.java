package Day15.설계순서_1;

import java.util.Scanner;

public class App {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		while( true ) {
			// 1. 모든 차량 표 출력 
				//
			for(Car temp : Controller.carlist) {
				System.out.println("dho");
					System.out.println(temp.get날짜()+"\t"+temp.get차량번호()
					+"\t"+temp.get입차시간()+"\t"+temp.get출차시간()
					+"\t"+temp.get금액());
			}
						// 배열이나 리스트내 모든 객체 호출 반복문
				// 
			System.out.print("1.입차 \t  2.출차 : ");
			int ch = scanner.nextInt();
			
			if( ch == 1 ) {
				// 1. 차량번호를 입력받는다.
				System.out.print("차량번호입력 : ");
				String g = scanner.next();
				// 2. 입력받은 차량번호를 컨트롤내 메소드 에게 넘긴다.
				Controller.입차(g);
				
				
			}else if( ch == 2 ){
				// 1. 차량번호를 입력받는다.
					// 입력
				// 2. 입력받은 차량번호를 컨트롤내 메소드 에게 넘긴다.
				// 3. 메소드 결과 에 따른 출력 
			}
			
		}
		
	} // 
} // 
