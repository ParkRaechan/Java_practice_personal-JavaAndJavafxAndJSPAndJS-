package 프로그래밍언어응용_박래찬;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class App {
	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		
		
		while(true) {
			// 1. 모든 차량 표 출력 
			System.out.println("--------------------------------------------- 주차 현황 표 --------------------------------------------");
			board();
			System.out.println("----------------------------------------------------------------------------------------------------");
			
			System.out.print("\t\t\t 1.입차 \t  2.출차 : ");
			int ch = scanner.nextInt();
			
			if( ch == 1 ) {
				// 1. 차량번호를 입력받는다.
				System.out.print("차량번호 : ");
				String carNumOrigin = scanner.next();
				// 2. 입력받은 차량번호를 컨트롤내 메소드 에게 넘긴다.
				boolean 결과 = Controller.inCar(carNumOrigin);
				// 3. 메소드 결과 에 따른 출력 
				if(결과==true) {
					System.out.println("입차성공");
				}
				else {
					System.out.println("입차실패");
				}
			}else if( ch == 2 ){
				// 1. 차량번호를 입력받는다.
				System.out.print("차량번호 : ");
				String carNumOrigin = scanner.next();
				// 2. 입력받은 차량번호를 컨트롤내 메소드 에게 넘긴다.
				boolean 결과 = Controller.outCar(carNumOrigin);
				// 3. 메소드 결과 에 따른 출력 
				if(결과==true) {
					System.out.println("출차성공");
				}
				else {
					System.out.println("출차실패");
				}
			}
			else {
				System.out.println("제시된 번호를입력하세요.");
				
			}
		}
		
		
		
		
		
	}
	// 프론트 차량표 출력 메소드
	public static void board() {
		try {
			int i =0;
			LocalDate Date0 = LocalDate.now();
			LocalTime Time0 = LocalTime.now();
			System.out.println("\t\t현재시간 : "+Date0+"\t"+Time0);
			System.out.println("날짜\t\t\t차량번호\t\t입차시간\t\t\t\t출차시간\t\t\t금액");
			for(Car q1 : Controller.carlist ) {
				if(q1.get출차시간()==null) {
					System.out.println(q1.get날짜()+"\t\t"+q1.get차량번호()
					+"\t\t"+q1.get입차시간()+"\t\t주차중\t\t\t정산전");
				}
				else {
					System.out.println(q1.get날짜()+"\t\t"+q1.get차량번호()
					+"\t\t"+q1.get입차시간()+"\t\t"+q1.get출차시간()+"\t\t"+q1.get금액());
				}
				i++;
			}
		} catch (Exception e) {
			System.out.println("잘못된 입력 다시 입력 바랍니다.");
			scanner = new Scanner(System.in);
		}
		
	}
	
	
}
