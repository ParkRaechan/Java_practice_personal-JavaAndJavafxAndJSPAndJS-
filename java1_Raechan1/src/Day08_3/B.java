package Day08_3;

public class B {
// A와 패키지는 같지만 클래스가 다름
	//1.필드
	A a1 = new A(true);//A에서 public으로 가능
	A a2 = new A(1);//A에서 default으로 가능
	//A a3 = new A("문자열");//A에서 private으로 불가능
	
	//2.생성자
	public B() {
		A a = new A(true);
		a.field1=1;
		a.field2=1;
		//a.field3=1; //불가능
	
		a.method1();
		a.method2();
		//a.method3(); //불가능
		
	}
	//3.메소드
}
