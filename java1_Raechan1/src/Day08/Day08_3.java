package Day08;

import java.util.Random;

public class Day08_3 {

	public static void main(String[] args) {
	
		//패키지 : 폴더가능 [클래스 식별]
			//하위패키지 :패키지명.하위패키지명.
		//import : 현 패키지를 제외한 다른 패키지내 클래스 호출
			//클래스파일 상단에 작성
			// * : 모든 클래스
			// 클래스 자동 완성시 -> 해당 클래스 import 자동 작성
		//접근제한자
			//public : 모든 곳에서 접근[호출가능]
			//private : 현 클래스내에서만 접근 가능[호출가능] : 은닉화
			//protected : 동일한 패키지내에서만 접근 가능[호출가능]
				// * 자식클래스 패키지 ----> 부모클래스 패키지
			//default(생략) : 동일한 패키지내에서만 접근 가능[호출가능]
		
		//클래스설계 관례
			//*중요*필드는 private
			//생성자는 public / protected
			//메소드는 선택 pubic / private
	}
	
}