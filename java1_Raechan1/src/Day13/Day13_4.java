package Day13;

import java.text.DecimalFormat;
import java.text.MessageFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Day13_4 {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		//
			//
				//
				//
		double num = 1234567.89;
		
		DecimalFormat df = new DecimalFormat("0");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("0.0");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("00000000000000.000000");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("#");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("#.#");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("##############.######");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("#.000");
		System.out.println(df.format(num));

		df = new DecimalFormat("+#.0");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("-#.0");
		System.out.println(df.format(num));
		
		//***********천단위 쉼표***************									중요
		df = new DecimalFormat("금액 #,##0원");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("0.0E0");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("[양]+#,### ; [음]-#.###"); //양수;음수
		System.out.println(df.format(-num));
		
		//****컴퓨토는 백분율X [계산시 1:100%  0.5:50%  0.05:5%]					중요
		df = new DecimalFormat("#.#%");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("\u00A4 #,###");
		System.out.println(df.format(num));
		
		//
		//
		String id = "java";
		String name ="신용권";
		String tel ="010-123-5678";
		
		String text = "회원 ID : {0} \n 회원 이름 : {1} \n회원 전화 :{2}";
		String result1 = MessageFormat.format(text,id,name,tel);
		
		System.out.println(result1);System.out.println();
		
		//*****데이터베이스에서 사용할 예정 ***
		String sql = "insert info member values({0},{1},{2})";
										//
		Object[] 배열 = {id,name,tel};
		String result2 = MessageFormat.format(sql,배열);
		System.out.println(result2);
		
		//Java 7버젼 이전 Date 이후에는 여러가지 날짜 API 추가중
		LocalDate currDate = LocalDate.now();
		System.out.println(" 현재 날짜 : "+currDate);
		
		LocalDate currTime = LocalDate.now();
		System.out.println(" 현재 날짜 : "+currTime);
		
		//Date 현재날짜/시간 [조작이 안되거나 비교기능 불충분]
		//vs
		//LocalDate : 현재날짜			LocalTime : 현재시간
		
		LocalDateTime currdatetime = LocalDateTime.now();
		System.out.println(" 현재날짜/시간 : "+currdatetime);
		
		// ***시간계산
		Instant instant1 = Instant.now();
		Thread.sleep(10); //1초 대기 [코드흐름 1초간 멈춤] //일반예외
		Instant instant2 = Instant.now();
		
		if(instant1.isBefore(instant2)) {
			System.out.println("instant1 더 빠름");
		}
		else if(instant1.isAfter(instant2)) {
			System.out.println("instant1 더 늦음");
		}
		else {
			System.out.println("동일한 시간입니다.");
		}	
		
		System.out.println(" 시간 차 : "+instant1.until(instant2,ChronoUnit.NANOS));
		// 시간단위 : 밀리초 = 1000/1초		마이크로초 = 1000000/1초	 나노초 = 1000000000/1초
		}
}
