package Day08_4;

import Day08_3.A;

public class C {
	//AŬ������ ��Ű�� �ٸ� Ŭ������ �ٸ�
	
	A a1 = new A(true);  //A���� public���� ����
	//A a2 = new A(1);//A���� default���� �Ұ���
	//A a3 = new A("���ڿ�");//A���� private���� �Ұ���
	
	
	public C() {
		A a = new A(true);
		a.field1 = 1;
		//a.field2 = 1; //�Ұ���
		//a.field3 = 1; //�Ұ���
		
		a.method1();
		//a.method2(); //�Ұ���
		//a.method2(); //�Ұ���
		
	}
}
