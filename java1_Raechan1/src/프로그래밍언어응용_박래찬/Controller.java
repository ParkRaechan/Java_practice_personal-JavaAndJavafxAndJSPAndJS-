package 프로그래밍언어응용_박래찬;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Scanner;

public class Controller {

	Scanner scanner = new Scanner(System.in);
	
	public static ArrayList<Car> carlist = new ArrayList<>();
	
	
	
	
	
	public static boolean inCar(String carNum) {
		// 1. 입력받은 차량번호(인수) 가져온다.
		String num = carNum;
		// * 차량번호 중복체크
		for(Car q1 : carlist) {
			if(q1.get차량번호().equals(num)) {
				System.out.println("차량번호 중복,,,,다시입력");
				return false;
			}
		}
		
		// 2. 입차날짜(현재날짜) 을 구한다( ????? : )
		LocalDate day1 = LocalDate.now();
		// 3. 입차시간(현재시간) 을 구한다( ????? : )
		LocalTime time1 = LocalTime.now();
		// * 출차시간 , 금액은 출차시 x 
		// 4. 차량번호,입차날짜,입차시간 => 3개변수 -> 1객체화
		Car car1 = new Car(day1,num,time1);
		// 5. 차량객체를 배열이나 리스트 에 저장 
		carlist.add(car1);
		return true;
	}
	
	
	
	
	public static boolean outCar(String carNum) {
		LocalDate date2;
		String num;
		LocalTime time2;
		LocalTime time3;
		int gold;
		
		// 1. 입력받은 차량번호(인수) 가져온다.
		num = carNum;
		// 2. 배열 or 리스트내 동일한 차량번호를 찾아서 
		int i =0;
		for(Car q2 : carlist) {
			if(q2.get차량번호().equals(num)) {
				// 3. 출차시간(현재시간) 을 구한다 (????? : )
				time3 = LocalTime.now();
				// 4. 계산 [ 출차시간 - 입차시간 => (분-30)/10 *1000  ]
				int whileTime =  (int)q2.get입차시간().until(time3,ChronoUnit.MINUTES);
				if(whileTime<30) {
					gold = 0;
				}
				else {
					gold = whileTime*1000/10;	
				}
				// 5. (수정)찾은 객체내 출시간과 금액을 대입한다.
				date2 = q2.get날짜();
				time2 = q2.get입차시간();
				Car car2 = new Car(date2,num,time2,time3,gold);
				carlist.add(i,car2);
				carlist.remove(i+1);
				return true;
			}
			i++;
		}
		
		return false;
	}
	
	
	
	
	
}
