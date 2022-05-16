package Day03;

import java.util.Iterator;
import java.util.Scanner;

public class Day03_5 {
	
	public static void main(String[] args) {
		
	// 반복문 : 1. for  2. while 3. do~while[x]
			// for : 
				// 어디서부터 어디까지 몇개씩 증가/감소 하면서 반복처리
					// 1부터 10까지 1씩증가하면서 반복처리 => 10번 실행
					// 1부터 10까지 3씩증가하면서 반복처리 => 4번 실행 
				// 1. 초기값  2. 조건식 3.증감식 
				// 형태 
				//		for( 1.초기값 ; 2.조건식 ; 3.증감식 ) {
				//				반복실행문;
				//		}
				
			// for 중첩 : 
				// for1( ) { for2() { for3() { } } } 
				
			// p.121 예제1 
		/*
				for( int i = 1 ; i<=10 ; i++ ) {
					// int i = 1   : 초기값 선언 [ i는 반복변수 ] 
						// i <= 10 : 조건식 [ i가 10 이하이면 실행 아니면 실행불가
							// i++ : 증감식 [ 실행문 실행후 증가 혹은 감소 단위 ]
					// * 변수 i는 1부터 10까지 1씩 증가하면서 실행문 반복처리 
					System.out.print( i + " ");
						// i = 1 일때 i<=10 [ true ] 실행문 -> 증감식 i=2
						// i = 2 일때 i<=10 [ true ] 실행문 -> 증감식 i=3
						// i = 3 일때 i<=10 [ true ] 실행문 -> 증감식 i=4
						// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
						// i = 10 일때 i<=10 [ true ]  실행문 -> 증감식 i=11
						// i = 11 일때 i<=10 [ false ] 반복문 종료 
				}
				
		*/
		
		
		
		// p.122 예제2 : 1부터 100까지 누적합 출력  
		/*
		int sum = 0;
		
		for(int i=1; i<=100; i++) {
			sum+=i;			
		}
		System.out.println("1~100 누적합 : "sum);	
		 */
	
		
		
		
		
		// 예제3 : 1부터 100까지 7배수의 누적합계 
		
		/*
		int sum2 = 0;
			
		for(int i2=1; i2<=100; i2+=7) {
			sum2+=i2;			
		}
		System.out.println("1~100 7배수 누적합 : "sum2);	
		*/
		
		// 예제3 : 1부터 100까지 7배수의 누적합계 
		/*
				int sum3 = 0;
				for( int i = 1 ; i<=100 ; i++ ) {
					// 배수찾기 : 값 % 수 == 0 이면 값 그 수의 배수 
					if( i % 7 == 0 ) sum3 += i;
					// 만약에 i가 7의배수이면 누적합 아니면 x
				}
		 */
	
		
		// 예제4 : 2단 구구단 만들기 [ 2 = 상수 , 곱 =변수 ]
			for( int 곱 = 1 ; 곱<=9 ; 곱++ ) {
				// * 곱은 1부터 9까지 1씩 증가하면 실행 반복처리
				//System.out.println( "2 X "+곱+" = "+ (2*곱) );
				System.out.printf( "2X%d=%d \n" , 곱 , (2*곱) );
			}
				
			// for 중첩
		
		for(int n=2 ; n<=9 ; n++){
			System.out.printf("---------%d단---------\n", n);
			for(int m=1 ; m<=9 ; m++){
				System.out.printf("%d * %d = %d\n", n, m, n*m);
				
			}
		}
	
		
		
	
	}
		
}


