
package Day06; // ��Ű����  

public class Day06_2 {// c s
	
	public static void main(String[] args) {
		
		Car myCar = new Car();
		
		// 1.Student : ���ǵ� Ŭ������
		// 2.student : ��ü��[ �ƹ��ų� ] : ��õ[Ŭ������ҹ���]
		// 3.new ������ : �޸�(�������) ����
		// 4.Student() : �����ڸ�()
		// *��ü ������ 4���� �ʿ�
		
		System.out.println(" ����ȸ��: "+ myCar.company);
		System.out.println(" �𵨸�: "+ myCar.model);
		System.out.println(" ����: "+ myCar.color);
		System.out.println(" �ְ�ӵ�: "+ myCar.maxSpeed);
		System.out.println(" ����ӵ�: "+ myCar.speed);

		myCar.speed = 60;
		System.out.println(" ������ �ӵ�: "+ myCar.speed);
		
	}
	
}// c e