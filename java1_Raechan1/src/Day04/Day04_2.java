
package Day04; // 패키지명

import java.util.Scanner;

public class Day04_2 {// c s

	public static void main(String args[]) {// m s

	
	Scanner scanner = new Scanner(System.in);
		
		int 콜라재고 = 10;
		int 환타재고 = 10;
		int 사이다재고 = 10;
		int 콜라구매수 = 0;
		int 환타구매수 = 0;
		int 사이다구매수 = 0;
		
		while(true) {
			System.out.println("-------메뉴판-------");
			System.out.println("[ 1.콜라(300) 2.환타(200) 3. 사이다(100) 4.결제 ]");
			System.out.print(">>선택");
			int 선택 = scanner.nextInt();
			
			if(선택==1) {
				if(콜라재고==0) {
					System.out.println("알림)) 재고없음");
				}
				else {
					System.out.println("[[콜라1개를 담았습니다.]]");
					콜라구매수++;
					콜라재고--;
				}
				
			}
			else if(선택 ==2) {
				if(환타재고==0) {
					System.out.println("알림)) 재고없음");
				}
				else {
					System.out.println("[[환타1개를 담았습니다.]]");
					환타구매수++;
					환타재고--;
				}
				
			}
			else if(선택 ==3) {
				if(사이다재고==0) {
					System.out.println("알림)) 재고없음");
				}
				else {
					System.out.println("[[사이다1개를 담았습니다.]]");
					사이다구매수++;
					사이다재고--;
				}
				
			}
			else if(선택 ==4) {
				System.out.println("-------결제 제품 목록-------");
				System.out.println("제품명\t수량\t금액");
				if(콜라구매수!=0) System.out.println("콜라\t"+콜라구매수+"\t"+콜라구매수*300);
				if(환타구매수!=0) System.out.println("환타\t"+환타구매수+"\t"+환타구매수*200);
				if(사이다구매수!=0) System.out.println("사이다\t"+사이다구매수+"\t"+사이다구매수*100);
				int 결제액 = 콜라구매수*300+환타구매수*200+사이다구매수*100;
				System.out.println("결제액 : "+결제액);
				System.out.println("----------------------------");
				System.out.println("1.결제 2.취소");
				int 선택2 = scanner.nextInt();
				
				if(선택2==1) {
					while(true) {
						System.out.print("금액을 입력해주시오 : ");
						int 금액 = scanner.nextInt();
						if(금액<결제액) {
							System.out.println("결제불가");
						}
						else {
							System.out.println("결제완료");
							System.out.println("잔돈 : "+(금액-결제액));
							콜라구매수 = 0;
							환타구매수 = 0;
							사이다구매수 = 0;
							break;
						}
					}
				}
				else if(선택2==2) {
					System.out.println("알림)) 구매목록지우기");
					콜라재고+=콜라구매수;
					환타재고+=환타구매수;
					사이다재고+=사이다구매수;
					
					콜라구매수=0;
					환타구매수=0;
					사이다구매수=0;
				}
				else {
					System.out.println("알림)) 알수없는 행동");
				}
			}
			else {
				System.out.println("알림)) 알수없는 행동");
				
			}
		}
	}// m e
	
}// c e