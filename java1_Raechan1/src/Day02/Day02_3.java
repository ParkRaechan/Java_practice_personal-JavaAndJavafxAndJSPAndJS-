package Day02;

import java.util.Scanner;

public class Day02_3 {
	
	public static void main(String[] args) {
		
		// 문제1 : 급여 계산
		/*
		 * 	[입력조건]
		 * 		기본급 , 수당
		 * 	[ 조건 ] 
		 * 		실수령액 = 기본급 + 수당 - 세금[기본급10%] 
		 * 	[출력조건] 
		 * 		실수령액 출력 
		 */
		
		// * 입력 -> 저장 -> 계산 -> 출력
				// 1. 입력 객체 만든다. [ 자료형 소문자 , 클래스명 대문자 ]
		System.out.print("기본급 : ");
		
		// 2. 입력받은 값을 변수에 저장한다. [ 입력객체는 입력받을때마다 기존 데이터가 사라짐 ]
		Scanner sc1 = new Scanner(System.in);

		// 입력객체명.nextInt() : int형 데이터 가져오기 
				// 입력객체명.next() : 문자열 데이터 가져오기
		int yBase = sc1.nextInt();
		
		
		System.out.print("수당: ");
		int yMoney = sc1.nextInt();
		
		// 3. 변수를 연산(계산) 한다// int*double 후에 int형으로 강제변환(캐스팅) 
		int tax = (int)(yBase * 0.1); // 100% : 1   10% : 0.1
		
		
		int realMoney = yBase + yMoney - tax;
		System.out.println("실수령액 : " + realMoney + "원");
		// 		문자열	+	변수명( 변수내 데이터 호출 )
			//  + : 1. 연결연산자 기능 2.더하기 기능
		
		int 정수1 = 10; int 정수2 = 20;
		
		System.out.println("더하기 : " + 정수1 + 정수2);
		System.out.println("더하기 : " + (정수1 + 정수2));
		System.out.println("빼기 : " + (정수1 - 정수2));
		System.out.println("곱하기 : " + (정수1 * 정수2));
		System.out.println("나누기(묷) : " + (정수1 / 정수2));
		System.out.println("나머지 : " + (정수1 % 정수2));
		
		정수1++;
		System.out.println("증가 : " + 정수1);
		정수1--;
		System.out.println("감소 : " + 정수1);
		
		System.out.println("선위증가 :	 " + (정수1 % 정수2));
		
		
		// 문제2 : 지폐 세기 
		/*
		 * [ 입력조건 ] 
		 * 		금액 
		 * [ 조건 ] 
		 * 		십만원 부터 백원 까지의 개수 세기 
		 * [ 출력조건 ]
		 * 		예) 356789 입력시 
		 * 		십만원 3장 
		 * 		만원 5장
		 * 		천원 6장 
		 * 		백원 7개
		 * 
		 */

		
	}

}
