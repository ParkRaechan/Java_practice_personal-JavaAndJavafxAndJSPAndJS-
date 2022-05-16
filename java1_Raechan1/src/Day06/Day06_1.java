
package Day06; // 패키지명  

public class Day06_1 {// c s
	
	public static void main(String[] args) {
		
		Student s1 = new Student();
		
		// 1.Student : 정의된 클래스명
		// 2.student : 객체명[ 아무거나 ] : 추천[클래스명소문자]
		// 3.new 연산자 : 메모리(저장공간) 생성
		// 4.Student() : 생성자명()
		// *객체 생성시 4가지 필요
		System.out.println(" s1 변수가 Student 객체를 참조합니다. ");
		System.out.println(s1);
		
		Student s2 = new Student();
		System.out.println(" s2 변수가 Student 객체를 참조합니다. ");
		System.out.println(s2);
		
	}
	
}// c e