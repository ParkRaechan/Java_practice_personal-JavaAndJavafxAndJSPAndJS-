package Day13;

import java.util.Calendar;
import java.util.Scanner;

public class Day13_3 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print(" 연도 : ");int year = scanner.nextInt();
		System.out.print(" 월 : ");int month = scanner.nextInt();
		
		달력(year, month);
		
	}
	
	//달력메소드
	public static void 달력(int year, int month) {
		while(true) {
			//
			Calendar calendar = Calendar.getInstance();
			//
			//int year = calendar.get(Calendar.YEAR);
			//int month = calendar.get(Calendar.MONTH)+1;
			int day = calendar.get(Calendar.DAY_OF_MONTH);
			//*해당 월의 1일의 요일찾기
				//1.
				calendar.set(year, month-1,1);
					System.out.println();
				//
				int sweek = calendar.get(Calendar.DAY_OF_WEEK);
					System.out.println("요일구하기 : "+sweek);
				//
				int eweek = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
					System.out.println("해당날짜의 마지막 일수 : "+eweek);
					
			//
			System.out.println("********************"+year+"년"+(month)+"월 *********************");
			System.out.println("일\t월\t화\t수\t목\t금\t토");
			
			for(int i =1; i<sweek; i++) {
							//
				System.out.print("\t");
			}
			//
			for(int i =1; i<=eweek;i++) {
				System.out.print(i+"\t");
				//
				if(sweek%7==0)System.out.println();
				sweek++; //
			}
			Day13_3 a = new Day13_3();
			System.out.println("");
			//버튼 [1.< 2.> 3.다시검색]
			try {
				System.out.println("1.이전달로 이동 2.다음달로 이동 3.다시검색 4.종료"); 
				Scanner scanner = new Scanner(System.in); int ch =scanner.nextInt();
				if(ch==1) {
					month -= 1;
					if(month ==0) {
						month = 12; year-=1;
					}
					
				}
				else if(ch==2) {
					month += 1;
					if(month == 13) {
						month = 1; year+=1;
					}
				}
				else if(ch==3) {
					System.out.print(" 연도 : "); year = scanner.nextInt();
					System.out.print(" 월 : "); month = scanner.nextInt();
					
				}
				else if(ch==4) {
					System.out.println("종료");
					break;

				}
				else {
					System.out.println("알수없는번호");

				}

			} catch (Exception e) { // 
				System.out.println(" 경고 ]] 정상적인 입력을 해주세요");
			}		
		}
	}
}
