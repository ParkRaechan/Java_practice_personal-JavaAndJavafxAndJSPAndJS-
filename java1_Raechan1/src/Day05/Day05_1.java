
package Day05; // 패키지명  

public class Day05_1 {// c s
 
	public static void main(String args[]) {// m s
		// 변수 : 하나의 데이터 저장 
		// 배열 : 동일한 자료형 데이터를 특정기준[인덱스]으로 나열
		// 1차원 배열 : 길이
			// 형태 : 자료형[] 배열명 = new 자료형[길이];
			// int[] arr = new int[3];
			//	int int int 
			// * int형 변수 3개 저장할수 있는 배열 
			
		// 2차원 배열 : 가로길이 세로길이
			// 형태 : 자료형[][] 배열명 = new 자료형[가로=행][세로=열];
			// int[][] arr2 = new int[4][3];
			//   int int int 
			//   int int int 
			//   int int int 
			//	 int int int 
			// * int형 변수 12개 저장할수 있는 배열 
				
		// 3차원 배열 : 가로깅리 세로길이 높이길이
			// 형태 : 자료형[][][] 배열명 = new 자료형[행][열][높이];
				
				
		// 예제1) 
		
		int[] 배열 = new int[3];
		배열[0] = 80;
		배열[1] = 90;
		배열[2] = 100;
		
		int[][] 배열2 = new int[2][3];
		배열2[0][0] = 80; 배열2[0][1] = 90; 배열2[0][2] = 100;
		배열2[1][0] = 40; 배열2[1][1] = 50; 배열2[1][2] = 60;
		
		System.out.println(" 1차원 배열(주소값) :" + 배열);
		System.out.println(" 2차원 배열(주소값) :" + 배열2);
		
		System.out.println(" 1차원 배열 길이 : "+배열.length);
		System.out.println(" 2차원 배열 행 길이 : "+배열2.length);
		System.out.println(" 2차원 배열 열 길이 : "+배열2[0].length);

		// 예2) 반복문을 이용한 
		int[][] 배열3 = new int[2][50];//int:4바이트 *2*50 => 400바이트 배열 선언
		
		for(int i=0; i<100; i++) {
			if(i<50) {
				배열3[0][i] = i;
			}
			else {
				배열3[1][i-50] = i;
			}
		}
		
		for(int i=0; i<100; i++) {
			if(i<50) {
				System.out.printf("%3d", 배열3[0][i]);
			} 
			else {
				System.out.printf("%3d", 배열3[1][i-50]);
			}
			if(i==49) {System.out.println();}
			
		}
		
	}// m e
	
}// c e