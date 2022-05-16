package Day13;

import java.text.SimpleDateFormat;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.spi.CalendarDataProvider;

public class Day13_2 {
	
	public static void main(String[] args) {
		
		//
			//
		Date date = new Date(); //date 객체 생성
		System.out.println("현재 날짜/시간 : "+date);
		
			//
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 hh시 ss초");
		// 날짜에 형시기 적용하기 [date 형식 -> String형 반환]
		System.out.println("날짜형식변경 : "+sdf.format(date));
										//
		//
			//
		Calendar now = Calendar.getInstance();//
			//
		System.out.println(" 연도 : "+now.get(Calendar.YEAR));//
		System.out.println(" 월 : "+(now.get(Calendar.MONTH)+1));//
		System.out.println(" 일 : "+now.get(Calendar.DAY_OF_MONTH));//
													//
		System.out.println(" 요일 : "+now.get(Calendar.DAY_OF_WEEK));//
													//
		//
		int week = now.get(Calendar.DAY_OF_WEEK);
		String 요일 = null;
		switch(week) {
			case 1 : 요일 = "일요일"; break;
			case 2 : 요일 = "월요일"; break;
			case 3 : 요일 = "화요일"; break;
			case 4 : 요일 = "수요일"; break;
			case 5 : 요일 = "목요일"; break;
			case 6 : 요일 = "금요일"; break;
			case 7 : 요일 = "토요일"; break;
		}
		System.out.println(" 요일[한글] : "+요일);
		
		//
		System.out.println(" 오전/오후 : "+now.get(Calendar.AM_PM));
		int ampm = now.get(Calendar.AM_PM);
		String 오전오후 = null;
		if(ampm==0) 오전오후="오전";
		else 오전오후 = "오후";
		System.out.println(" 오전/오후 : "+ 오전오후);
		
		System.out.println(" 시 : "+now.get(Calendar.HOUR));
		System.out.println(" 분 : "+now.get(Calendar.MINUTE));
		System.out.println(" 분 : "+now.get(Calendar.SECOND));
		
		//
		ZonedDateTime 협정시 = ZonedDateTime.now(ZoneId.of("UTC"));
			System.out.println(" 협정시 : "+협정시);
		협정시 = ZonedDateTime.now(ZoneId.of("Asia/seoul"));
			System.out.println(" 서울 시간 : "+협정시);
		협정시 = ZonedDateTime.now(ZoneId.of("America/New_York"));
			System.out.println(" 뉴욕 시간 : "+협정시);
		
			
		
	}
	
}
