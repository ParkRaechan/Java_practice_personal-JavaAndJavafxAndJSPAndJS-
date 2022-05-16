
package Day02; // 패키지명

public class Day02_2 {// c s


	public static void main(String args[]) {// m s

		byte var1 = -128;
		byte var2 = -30;
		byte var3 = 0;
		byte var4 = 30;
		byte var5 = 127;
		//byte var6 = 128; //컴파일 에러
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);
		System.out.println(var5);
		
		char c1 = 'A';
		char c2 = 97;
		char c3 = '\u0041';
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		char c4 = '가';
		char c5 = 44032;
		char c6 = '\uac00';
		
		System.out.println(c4);
		System.out.println(c5);
		System.out.println(c6);
		
		int uniCode = c1;
		
		System.out.println(uniCode);
		
		short num1 = 30000;
		//short num2 = 40000; //컴파일 에러
		
		System.out.println(num1);
		
		int num2 = 10;
		int num3 = 012;
		int num4 = 0xA;
		
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		
		long num5 = 10;
		long num6 = 20L;
		//long num7 = 10000000000000; //컴파일 에러
		long num8 = 10000000000000L;
		
		System.out.println(num5);
		System.out.println(num6);
		System.out.println(num8);

		double num9 = 3.14;
		//float num10 = 3.14; //컴파일 에러
		float num11 = 3.14f;

		boolean bol = true;
		
		System.out.println(bol);

	}// m e
	
}// c e