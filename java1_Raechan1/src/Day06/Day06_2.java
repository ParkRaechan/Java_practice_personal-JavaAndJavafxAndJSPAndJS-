
package Day06; // 패키지명  

public class Day06_2 {// c s
	
	public static void main(String[] args) {
		
		Car myCar = new Car();
		
		// 1.Student : 정의된 클래스명
		// 2.student : 객체명[ 아무거나 ] : 추천[클래스명소문자]
		// 3.new 연산자 : 메모리(저장공간) 생성
		// 4.Student() : 생성자명()
		// *객체 생성시 4가지 필요
		
		System.out.println(" 제작회사: "+ myCar.company);
		System.out.println(" 모델명: "+ myCar.model);
		System.out.println(" 색깔: "+ myCar.color);
		System.out.println(" 최고속도: "+ myCar.maxSpeed);
		System.out.println(" 현재속도: "+ myCar.speed);

		myCar.speed = 60;
		System.out.println(" 수정된 속도: "+ myCar.speed);
		
	}
	
}// c e