
// �ּ�ó��( ������[����] ���� )
	// 1. �ּ�â
	/* 2. ������
 	�ּ�â */

// TAB Ű : �鿩���� [ 5ĭ �̵� ] 

package Day07; // ��Ű����

public class Day07_1 {// c s


	public static void main(String args[]) {// m s
		// �޼ҵ� ȣ��(�ҷ�����) ���
			//1. �޼ҵ尡 �����ϴ� Ŭ������ ��ü �ʿ�
			//2. ��ü��.�޼ҵ��() 
				// . : ���ٿ����� ( �ʵ峪 �޼ҵ� ȣ��� )
	 

		//1.��ü ����
		Calculater myCalc = new Calculater();
		//Ŭ������  ��ü��[�̸�] = �޸��Ҵ� ������();
		
		//2.�޼ҵ�ȣ�� [�μ�����]
		myCalc.powerOn();
		
		//3.�޼ҵ�ȣ�� [�μ�2��]
		int result = myCalc.plus(5, 6);
			// *plus�޼ҵ忡 5 �� 6 �����Ŀ� 
			// * 11 �̶�� ����� �޾Ƽ� ������ ���� 		
		System.out.println("result1 : "+ result);

		//4.�޼ҵ�ȣ�� [�μ�2��]
		byte x=10;
		byte y=10;
		double result2 = myCalc.divide(x, y);
		System.out.println();
		System.out.println("result2 : "+ result2);

		// 5. �޼ҵ� ȣ�� [ �μ�x ] 
		myCalc.powerOff();
	}// m e
	
}// c eCs