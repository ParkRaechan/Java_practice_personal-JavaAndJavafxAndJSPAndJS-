
package Day04; // 패키지명

import java.util.Scanner;

public class Day04_1 {// c s

	public static void main(String args[]) {// m s
	
		
		
		
		for(int i=1; i<=10; i++) {
			System.out.print(i+" ");
		}
		
		
		
		
		int i =1;
		while (i<=10) {
			System.out.print(i+" ");
			i++;
		}
		
		
		
		
		//순서대로 따져서 i를 전역변수로 사용해서 그다음부터는 지역변수로 int i 사용 못함
		int sum = 0;
		for(int j = 1; j<=100; j++) {
			sum+=j;
		}
		System.out.println("for사용 1~100합 : "+sum);
		
		
		
		
		int j =1;
		int sum2 = 0;
		while(j<=100) {
			sum2 += j;
			j++;
		}
		System.out.println("while사용 1~100합 : "+sum2);
		
		
		
		
		
		
		while(true) {
			System.out.println("무한루프");
			Scanner scanner = new Scanner(System.in);
			int exit = scanner.nextInt();
			if(exit==3) break;
		}
		
		
		
		
		
	}// m e
	
}// c e