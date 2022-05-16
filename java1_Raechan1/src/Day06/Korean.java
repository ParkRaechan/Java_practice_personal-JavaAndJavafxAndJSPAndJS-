package Day06;

public class Korean {
	// *Korean 클래스 선언
	
	// 1.필드 [데이터 저장되는 곳]
	String nation = "대한민국";
		//국가 변수에 미리 대한민국 대입
	String name;
		//이름 변수에는 초기화X [NULL]
	String ssn;
		//주민등록번호 변수에는 초기화X [NULL]
	
	// 2.생성자 [객체생성시 초기화]
		// 조건1 : 클래스이름 == 생성자이름
		// 조건2 : 외부로 들어오는 매개값[ 인수 ]선언
		// 조건3 : 동일한 생성자 이름 가질 수 없다.
			//오버로딩 : 동일한 이름일경우 코드를 재정의
	// 1.빈생성자[기본생성자] = 깡통생성자[인수 존재X]
	Korean(){
		//내용없기때문에
	}
	
	Korean(String n){
		name = n;
	}
	
	Korean(String n, String s){
		name = n;
		ssn = s;
	}
	
	Korean(String name, String ssn, String nation){
		this.name = name;
		this.ssn = ssn;
		this.nation = nation;
		//내부변수(현재 클래스내 변수)
		//매개변수(외부로부터 변수)
		//내부변수==매개변수 이름 통일
		//내부변수(현재 클래스내 변수)
			//this : 현재클래스 표시
	}
	
	// 3.메소드
}
