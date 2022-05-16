
// 주석처리( 컴파일[실행] 제외 )
	// 1. 주석창
	/* 2. 여러줄
 	주석창 */

// TAB 키 : 들여쓰기 [ 5칸 이동 ] 

package Day07; // 패키지명

public class Day07_1 {// c s


	public static void main(String args[]) {// m s
		// 메소드 호출(불러내는) 방법
			//1. 메소드가 존재하는 클래스의 객체 필요
			//2. 객체명.메소드명() 
				// . : 접근연산자 ( 필드나 메소드 호출시 )
	 

		//1.객체 선언
		Calculater myCalc = new Calculater();
		//클래스명  객체명[이름] = 메모리할당 생성자();
		
		//2.메소드호출 [인수없음]
		myCalc.powerOn();
		
		//3.메소드호출 [인수2개]
		int result = myCalc.plus(5, 6);
			// *plus메소드에 5 와 6 전달후에 
			// * 11 이라는 결과값 받아서 변수에 저장 		
		System.out.println("result1 : "+ result);

		//4.메소드호출 [인수2개]
		byte x=10;
		byte y=10;
		double result2 = myCalc.divide(x, y);
		System.out.println();
		System.out.println("result2 : "+ result2);

		// 5. 메소드 호출 [ 인수x ] 
		myCalc.powerOff();
	}// m e
	
}// c eCs