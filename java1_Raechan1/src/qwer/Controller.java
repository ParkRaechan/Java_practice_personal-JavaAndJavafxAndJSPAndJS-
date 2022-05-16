package qwer;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public class Controller {
	
	
	
	public static ArrayList<Car> carlist = new ArrayList<>(); 
	
public static void 메인() {
	LocalDate wndoww =LocalDate.now();
	LocalTime endnoww = LocalTime.now();

	System.out.println("\t\t\t현재시간 : "+wndoww+endnoww);
	for(Car q : carlist) {
		if(q.get출차시간()==null) {
			System.out.println(q.get날짜()+"\t"+q.get차량번호()
			+"\t"+q.get입차시간()+"\t주차 중"
			+"\t정산전");
		}
		else {
			System.out.println(q.get날짜()+"\t"+q.get차량번호()
			+"\t"+q.get입차시간()+"\t"+q.get출차시간()
			+"\t"+q.get금액());
		}
			
	}
}
	
	
	// 입차 메소드 
	public static void 입차( String 차량번호 ) {
		// 입차 코드 작성 
			// 1. 입력받은 차량번호(인수) 가져온다.
		String a= 차량번호;
			// * 차량번호 중복체크
		LocalDate wndow =LocalDate.now();
		LocalTime endnow = LocalTime.now();

		Car q3 = new Car(wndow,a,endnow);
		carlist.add(q3);
		
	}
	
	
	
	// 출차 메소드 
	public static void 출차( String 차량번호 ) {
		LocalDate w;
		String f;
		LocalTime c1;
		LocalTime c;
		int 분;
		int 금액2 ;
		String b = 차량번호;
		int i=0;
		for(Car p : carlist) {
			if(p.get차량번호().equals(b)) {
				c =LocalTime.now();
				분 = (int) p.get입차시간().until(c , ChronoUnit.MINUTES);
				if(분<=30) {
					금액2=0;
				}
				else {
					금액2=분*100;
				}
				f=p.get차량번호();
				w=p.get날짜();
				c1=p.get입차시간();
				Car er = new Car(w,f,c1,c,금액2);
				carlist.add(i,er);
				carlist.remove(i+1);
				break;
			}
			i++;
			
		}
	}
	
}
