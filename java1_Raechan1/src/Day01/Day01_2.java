
package Day01;

public class Day01_2 { // c s 클래스의 시작

	// 1. 출력
		// 1. print() : 출력만
		// 2. printf() : 출력에 꾸미기
		// 3. println() : 출력에 줄바꿈 포함
			// 형식문자
				// %s : 문자열 들어가는 자리 
				// %d : 정수 들어가는 자리 
				// %f : 실수 들어가는 자리
			// 제어문자 [ \ : 엔타위에 원화기호]
						// \n : 줄바꿈
						// \t : 들여쓰기[5칸]
						// \\ : \
						// \" : "
	// 1. System : 시스템 클래스 [ 입출력 관련 만들어진 코즈 제공 ]
	// 2. out : 출력 스트림
	// 3. print : 출력함수
	// 4. ; : 한줄 코드 끝알림
	// * 시스템클래스내 out 이라는 출력스트림을 통해 print 함수를 사용해서
	//	console에 원하는대로 출력할 수 있다.
	
	public static void main(String args[]) { // m s 메인의 시작
		
		// 1. 기본출력
				System.out.print("하고 싶은 말"); // 코드 단위 종료
				System.out.print("java1일차");  // 문자처리 " " 처리
				System.out.print(123);		   // 숫자 " " 처리
				
				// 2. 자동완성
				System.out.println(456);
				System.out.println(789);
				System.out.println(1011);
				
				// 3. 형식출력
				System.out.printf("%s", "하고 싶은 말");
				System.out.printf("java %d", 1);
				System.out.printf("%d", 123);

				// 예제1 [출석부]
				System.out.println("\n\t\t[[출석부]]");
				System.out.println("-------------------------------------------------");
				System.out.println("이름\t1교시\t2교시\t3교시\t비고");
				System.out.println("강호동\t출석\t결석\t출석\t ");
				System.out.println("유재석\t출석\t출석\t출석\t ");
				
				// 예제2
				System.out.printf("\n\t\t%s\n","[[출석부]]");
				System.out.printf("-------------------------------------------------\n");
				System.out.printf("%s\t%s\t%s\t%s\t%s\n", "이름", "1교시", "2교시", "3교시","비고");
				System.out.printf("%s\t%s\t%s\t%s\t%s\n", "강호동", "출석", "결석", "출석", " ");
				System.out.printf("%s\t%s\t%s\t%s\t%s\n", "유재석", "출석", "출석", "출석", " ");

				// 문제1
				System.out.println("\\    /\\");
				System.out.println(" )  ( ')");
				System.out.println("(  /  )");
				System.out.println(" \\(__)|");
														
				//문제2
				System.out.println("\n");
				System.out.println("|\\_/|");
				System.out.println("|q p|   /}");
				System.out.println("( 0 )\"\"\"\\");
				System.out.println("|\"^\"`    |");
				System.out.println("||_/=\\\\__|");
				
				
				
	} // m e 메인의 끝
	
} // c e 클래스의 끝