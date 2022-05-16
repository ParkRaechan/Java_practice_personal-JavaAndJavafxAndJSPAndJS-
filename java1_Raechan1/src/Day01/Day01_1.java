
// 주석처리( 컴파일[실행] 제외 )
	// 1. 주석창
	/* 2. 여러줄
 	주석창 */

// TAB 키 : 들여쓰기 [ 5칸 이동 ] 

package Day01; // 패키지명

public class Day01_1 {// c s
	
	// public : 접근제한자
		// class : 클래스 선언
			// Day01_1 : 클래스 이름
	// * 모든 곳에서 사용하는 Day01_1 이라는 이름을 갖는 클래스 선언
			// { : 시작		} : 끝
	// 1. class { } 안에서 코드 작성[ class 밖에서 작성불가 ]
	// 2. 실행코드 main 함수
		// 1. main 함수
		// 2. ctrl 누른 상태에서 스페이스바 -> 엔터

	public static void main(String args[]) {// m s
		// publc : 접근제한자
			// static : 정적
				// void : 반환타입[돌려주는 값] 없다 
					// main 함수 : 메인 스레드를 가지고 있는 함수[ 필수 ]
					// 스레드 :코드를 읽어주는 흐름
		
		// *main함수 { }안에서 작성된 코드는 실행된다.
		// syso -> ctrl 누른 상태에서 스페이스바

		System.out.print("My name is ParkRaechan"); // 고급언어 [ 사람 이해하는 언어 ]
		//컴파일[ ctrl + F11 ]
			//저장 [ ctrl + s ]

	}// m e
	
}// c e