package Day08;

public class Day08_1 {

	public static void main(String[] args) {
	
		Calculator calculator = new Calculator();
	
		System.out.println(" ��ü�� �̿��� ��� ���� : " + calculator.pi);	
		
		System.out.println(" ��ü���� ������� : "+ Calculator.pi);

		double result1 =10 * 10 * Calculator.pi;
		
		//static������ ��ü����� ���
		int result2 = calculator.plus(10, 5);
		//static���� �������ε� �޼ҵ� ��� ����
		int result3 = Calculator.plus(10, 5);
		System.out.println(result2+","+result3);
	}
	
	
}