package Day02;

import java.util.Scanner;

public class Day02_5_문제2_문제14 {
	
	public static void main(String[] args) {
		
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
		
		/*
		System.out.print("금액 : ");
		Scanner sc3 = new Scanner(System.in);
		int yMon1 = sc3.nextInt();
		
		//10만원 장수계산
		int M10 = yMon1 / 100000;
		//10만원 나머지 금액계산
		int M10$ = yMon1 % 100000;
		
		int M1 = M10$ / 10000;
		int M1$ = M10$ % 10000;
		
		
		int M1_1 = M1$/1000;
		int M1_1$ = M1$ % 1000;

		int M1_1_1 = M1_1$ / 100;
		int M1_1_1$ = M1_1$ % 100;
		
		System.out.println("십만원 : " + M10 + "장");
		System.out.println("만원 : " + M1 + "장");
		System.out.println("천원 : " + M1_1 + "장");
		System.out.println("백원 : " + M1_1_1 + "개");
		System.out.println("나머지 : " + M1_1_1$ + "원");
		*/
		
		
		
		
		//문제3 : 하나의 정수를 입력받아 7의 배수인지 출력[ true , false ]
		
		/*
		System.out.print("정수입력 : ");
		Scanner sc3 = new Scanner(System.in);
		int 정수 = sc3.nextInt();
		int re3 = 정수%7 ;
		
		boolean r3 = (re3==0) ? true : false;
		
		System.out.print("결과 : " + r3);
		*/
		
		
		
		
		
		//문제4 : 하나의 정수를 입력받아 홀수 인지 확인 [ true , false ]
		
		/*
		System.out.print("정수입력 : ");
		Scanner sc4 = new Scanner(System.in);
		int 정수 = sc4.nextInt();
		int re2 = 정수%2 ;
		
		boolean r4 = (re2==1) ? true : false;
		
		System.out.print("결과 : " + r4);
		*/
		
		
		
		
		//문제5 : 하나의 정수를 입력받아 7의 배수 이면서 짝수 인지 확인 [ true , false ]
		
		/*
		System.out.print("정수입력 : ");
		Scanner sc5 = new Scanner(System.in);
		int 정수 = sc5.nextInt();
		int re5 = 정수%7 ;
		int re5_1 = 정수%2 ;
		
		boolean r5 = (re5==0) ? ((re5_1==0)? true : false) : false;
		
		System.out.print("결과 : " + r5);
		*/
		
		
		//문제6 : 두개의 정수를 입력받아 더 큰지 출력  [ true , false ]
		
		/*
		System.out.print("첫번째 정수입력 : ");
		Scanner sc6 = new Scanner(System.in);
		int 정수 = sc6.nextInt();

		System.out.print("두번째 정수입력 : ");
		int 정수_1 = sc6.nextInt();
		
		
		boolean r6 = (정수>정수_1)? true : false;
		
		System.out.print("결과 : " + r6);
		*/
		
		
		
		//문제7 : 반지름을 입력받아 원 넓이 출력하기 
				// 원 넓이 공식 => 반지름 * 반지름 * 원주율[3.14]
		
		/*
		System.out.print("반지름 : ");
		Scanner sc7 = new Scanner(System.in);
		int 정수 = sc7.nextInt();

		double 넓이 = 정수 * 정수 * 3.14;
		
		System.out.print("원 넓이 : " + 넓이);
		*/
		
		
		//문제8 : 두 실수를 입력받아 앞실수의 값이 뒤의 값의 몇% 인지 출력하기
				// 예) 54.5   84.3 이면    64.285714%
		
		/*
		System.out.print("첫번째 실수입력 : ");
		Scanner sc8 = new Scanner(System.in);
		double 실수 = sc8.nextFloat();

		System.out.print("두번째 실수입력 : ");
		double 실수_1 = sc8.nextFloat();
		
		double r8 = 실수 / 실수_1 * 100;
		
		System.out.print("결과 : " + r8 + "%");
		*/
		
		
		
		
		
		
		
		//문제9 : 사다리꼴 넓이 구하기[윗변과 밑변 높이를 입력받아 출력하기]
				//사다리꼴 계산식 = > (윗변 * 밑변) * 높이 / 2
		
		/*
		System.out.print("윗변 입력 : ");
		Scanner sc9 = new Scanner(System.in);
		int 윗변 = sc9.nextInt();

		System.out.print("밑변 입력 : ");
		int 밑변 = sc9.nextInt();
		
		System.out.print("높이 입력 : ");
		int 높이 = sc9.nextInt();
		
		int 넓이 = (윗변 + 밑변) * 높이 / 2;
		
		System.out.print("넓이 : " + 넓이);
		*/
		
		
		
		
		//문제10: 키를 정수를 입력받아 표준체중 출력하기
				//표준체중 계산식 = > (키 - 100) * 0.9
		
		/*
		System.out.print("키를 입력하세요 : ");
		Scanner sc10 = new Scanner(System.in);
		float 키 = sc10.nextFloat();

		double 표준체중 = (키 - 100) * 0.9;
		
		System.out.print("표준체중 : " + 표준체중);
		*/
		
		
		
		//문제11: 키와 몸무게를 입력받아 BMI 출력하기
				//BMI 계산식 = > 몸무게 / ((키 / 100) * (키 / 100))
		
		/*
		System.out.print("키를 입력하세요 : ");
		Scanner sc11 = new Scanner(System.in);
		float 키 = sc11.nextFloat();
		
		System.out.print("몸무게를 입력하세요 : ");
		float 몸무게 = sc11.nextFloat();
		
		float BMI = 몸무게 / ((키 / 100.0f) * (키 / 100.0f));
		
		System.out.print("BMI : " + BMI);
		*/
		
		
		//문제12: inch 를 입력받아 cm 로 변환하기 [ 1 inch -> 2.54cm ] 
		
		/*
		System.out.print("inch를 입력하세요 : ");
		Scanner sc12 = new Scanner(System.in);
		Double 키 = sc12.nextDouble();

		Double cm = 키 * 2.54;
		
		System.out.print("변환값 : " + cm);
		*/
		
		//문제13:  중간고사, 기말고사, 수행평가를 입력받아 반영비율별 계산하기
				//소수 둘째 자리 까지 점수 출력하기
				//중간고사 반영비율 => 30 %
				//기말고사 반영비율 => 30 %
				//수행평가 반영비율 => 40 %
		
		/*
		System.out.print("중간고사 입력 : ");
		Scanner sc13 = new Scanner(System.in);
		int 중간 = sc13.nextInt();

		System.out.print("기말고사 입력 : ");
		int 기말 = sc13.nextInt();
		
		System.out.print("수행평가 입력 : ");
		int 수행 = sc13.nextInt();
		
		float 점수 = 중간*30/100 + 기말*30/100 + 수행*40/100;
		
		System.out.printf("점수 : %.2f", 점수);
		*/
		
		
		
		
		
		
		//문제14 :  연산 순서 나열 하고 x와 y값 예측하기
			//int x = 10;
			//int y = x-- + 5 + --x;
			//printf(" x의 값 : %d , y의값 :  %d ", x, y)
		
		/*
		int x = 10;
		int y = x-- + 5 + --x;
		System.out.println("연산순서 : z = x + 5");
		System.out.println("        x-- ");	
		System.out.println("        --x ");
		System.out.println("        z + x");
		System.out.println(" 예상 x = 8, y = 23");
		System.out.printf(" x의 값 : %d , y의값 :  %d ", x, y);
		*/
		
		
		//문제15 : 나이를 입력받아 나이가 10세이상이면 학생 , 20세이상이면 성인 , 40세이상이면 중년 으로 출력하기
		
		/*
		System.out.print("나이 입력 : ");
		Scanner sc15 = new Scanner(System.in);
		int 나이 = sc15.nextInt();

		String age = (나이>=10)? ((나이>=20)? ((나이>=40)? "중년" : "성인"): "학생") : "꼬맹이";
		
		System.out.print(age);
		*/
		
		//문제16 : 3개의 정수를 입력받아 오름차순으로 정렬 
		
		/*
		Scanner sc16 = new Scanner(System.in);
		System.out.print("첫번째 정수를 입력하시오 : ");
		int 첫번째 = sc16.nextInt();
		System.out.print("두번째 정수를 입력하시오 : ");
		int 두번째 = sc16.nextInt();
		System.out.print("세번째 정수를 입력하시오 : ");
		int 세번째 = sc16.nextInt();
		
		int 첫째놈 = (첫번째>두번째)? ((첫번째>세번째)? 첫번째:세번째) : (두번째>세번째)? 두번째:세번째;
		int 두째놈 = (두번째>첫번째)? ((두번째<세번째)? 두번째:(첫번째>세번째)? 첫번째:세번째) : (두번째>세번째)? 두번째:(세번째>첫번째)? 첫번째:세번째;
		int 세째놈 = (첫번째<두번째)? ((첫번째<세번째)? 첫번째:세번째) : (두번째<세번째)? 두번째:세번째;
		
		System.out.print("오른차순 : " +세째놈+" "+두째놈+" "+첫째놈);
		*/
		
		//문제17 : 4개의 정수를 입력받아 내림차순으로 정렬 
		
		/*
		Scanner sc17 = new Scanner(System.in);
		System.out.print("첫번째 정수를 입력하시오 : ");
		int 첫번째 = sc17.nextInt();
		System.out.print("두번째 정수를 입력하시오 : ");
		int 두번째 = sc17.nextInt();
		System.out.print("세번째 정수를 입력하시오 : ");
		int 세번째 = sc17.nextInt();
		System.out.print("네번째 정수를 입력하시오 : ");
		int 네번째 = sc17.nextInt();
		
		int 첫째놈_1 = (첫번째>두번째)? ((첫번째>세번째)? 첫번째:세번째) : (두번째>세번째)? 두번째:세번째;
		int 두째놈_1 = (두번째>첫번째)? ((두번째<세번째)? 두번째:(첫번째>세번째)? 첫번째:세번째) : (두번째>세번째)? 두번째:(세번째>첫번째)? 첫번째:세번째;
		int 세째놈_1 = (첫번째<두번째)? ((첫번째<세번째)? 첫번째:세번째) : (두번째<세번째)? 두번째:세번째;
		
		int 첫째놈 = (네번째>첫째놈_1)? 네번째 : 첫째놈_1;
		int 두째놈 = (네번째<첫째놈_1)? ((네번째>두째놈_1)? 네번째 : 두째놈_1) : 첫째놈_1;
		int 세째놈 = (네번째<첫째놈_1)? ((네번째<두째놈_1)? ((네번째>세째놈_1)? 네번째:세째놈_1) : 두째놈_1 ):두째놈_1;
		int 네째놈 = (네번째<첫째놈_1)? ((네번째<두째놈_1)? ((네번째<세째놈_1)? 네번째:세째놈_1):세째놈_1):세째놈_1;
		
		
		
		System.out.print("내림차순 : " +첫째놈+" "+두째놈+" "+세째놈+" "+네째놈);
		*/
		
		
		// p. 102 확인문제
		
		/*
		int x =10;
		int y =20;
		int z = (++x) + (y--);
		System.out.println(z);
		*/
		
		/*
		int score = 85;
		String result = (!(score>90))? "가" : "나";
		System.out.println(result);
		*/
		
		
	}
	
}








