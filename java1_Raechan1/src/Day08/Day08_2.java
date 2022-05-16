package Day08;

public class Day08_2 {

	public static void main(String[] args) {
	
		//final 고정값만들기
		
		
		Person p1 = new Person("123123-123123","계백");

		
		//2.객체내 필드 수정
		p1.nation="USA";//nation을 final로 하면 수정불가
		//p1.ssn = "456456-456456"; (수정안됨)

	}
	
	
}