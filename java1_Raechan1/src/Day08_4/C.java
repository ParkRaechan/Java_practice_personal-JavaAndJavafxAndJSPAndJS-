package Day08_4;

import Day08_3.A;

public class C {
	//A클래스와 패키지 다름 클래스도 다름
	
	A a1 = new A(true);  //A에서 public으로 가능
	//A a2 = new A(1);//A에서 default으로 불가능
	//A a3 = new A("문자열");//A에서 private으로 불가능
	
	
	public C() {
		A a = new A(true);
		a.field1 = 1;
		//a.field2 = 1; //불가능
		//a.field3 = 1; //불가능
		
		a.method1();
		//a.method2(); //불가능
		//a.method2(); //불가능
		
	}
}
