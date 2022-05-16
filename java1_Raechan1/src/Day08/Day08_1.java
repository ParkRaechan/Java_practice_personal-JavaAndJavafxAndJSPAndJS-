package Day08;

public class Day08_1 {

	public static void main(String[] args) {
	
		Calculator calculator = new Calculator();
	
		System.out.println(" 객체를 이용한 멤버 접근 : " + calculator.pi);	
		
		System.out.println(" 객체없이 멤버접근 : "+ Calculator.pi);

		double result1 =10 * 10 * Calculator.pi;
		
		//static없을시 객체만들어 사용
		int result2 = calculator.plus(10, 5);
		//static으로 원본으로도 메소드 사용 가능
		int result3 = Calculator.plus(10, 5);
		System.out.println(result2+","+result3);
	}
	
	
}