
package Day04; // ��Ű����

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
		
		
		
		
		//������� ������ i�� ���������� ����ؼ� �״������ʹ� ���������� int i ��� ����
		int sum = 0;
		for(int j = 1; j<=100; j++) {
			sum+=j;
		}
		System.out.println("for��� 1~100�� : "+sum);
		
		
		
		
		int j =1;
		int sum2 = 0;
		while(j<=100) {
			sum2 += j;
			j++;
		}
		System.out.println("while��� 1~100�� : "+sum2);
		
		
		
		
		
		
		while(true) {
			System.out.println("���ѷ���");
			Scanner scanner = new Scanner(System.in);
			int exit = scanner.nextInt();
			if(exit==3) break;
		}
		
		
		
		
		
	}// m e
	
}// c e