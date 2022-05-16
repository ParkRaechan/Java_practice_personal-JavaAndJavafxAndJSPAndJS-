package Day08;

public class Day08_4 {

	// Setter Getter 메소드
		//필드는 private 사용되는 경우가 많다
		//외부에서 필드에 접근할 수 있다.
		//목적 : 외부에서 필드에 직접접근 제한하고 메소드를 통한 필드 접근
		//Setter 메소드 : 필드 데이터 변경
		//Getter 메소드 : 필드 데이터 호출
	
	public static void main(String[] args) {
		//1.객체생성
		Car myCar = new Car();
		//2.
		myCar.setSpeed(-50);
		//3.
		System.out.println("현재속도"+myCar.getSpeed());
		//4.
		myCar.setSpeed(60);
		System.out.println("현재속도"+myCar.getSpeed());
		//5.
		if(!myCar.isStop()) {//정지상태가 아니면
			// ! : 부정연산자 [true->false/false->true]
			myCar.setStop(true);
		}
		System.out.println("현재속도"+myCar.getSpeed());
	
	}
	
}