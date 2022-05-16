package Day12;

import java.util.Random;

public class Day12_4_차량번호분배프로그램Mine {

	
	public static void main(String[] args) {
		
		Random random = new Random();
		int 난수1 = random.nextInt(10000);
		int 난수2 = random.nextInt(10000);
		int 난수3 = random.nextInt(10000);
		int 난수4 = random.nextInt(10000);
		int 난수5 = random.nextInt(10000);
		int 난수6 = random.nextInt(10000);
		int 난수7 = random.nextInt(10000);
		int 난수8 = random.nextInt(10000);
		int 난수9 = random.nextInt(10000);
		int 난수10 = random.nextInt(10000);
		
		String[] 홀차량 = new String[50];
		String[] 짝차량 = new String[50];
		String 차량번호1 = String.format("%04d", 난수1 );
		String 차량번호2 = String.format("%04d", 난수2 );
		String 차량번호3 = String.format("%04d", 난수3 );
		String 차량번호4 = String.format("%04d", 난수4 );
		String 차량번호5 = String.format("%04d", 난수5 );
		String 차량번호6 = String.format("%04d", 난수6 );
		String 차량번호7 = String.format("%04d", 난수7 );
		String 차량번호8 = String.format("%04d", 난수8 );
		String 차량번호9 = String.format("%04d", 난수9 );
		String 차량번호10 = String.format("%04d", 난수10 );

		String[] 차량 = {차량번호1,차량번호2,차량번호3,차량번호4,차량번호5,차량번호6,차량번호7,차량번호8,
				차량번호9,차량번호10};
		
		
		int i =0;
		for(String temp : 차량) {
			if(temp!=null) {
				System.out.print(차량[i]+" ");
			}
			System.out.println("\n");

		i++;
		}
		
		int j =0;
		for(String temp : 차량) {
			if(temp!=null) {
				if(Integer.parseInt(temp)%2==1) {
					for(int k=0;k<50;k++ ) {
						if(홀차량[k]==null) {
							홀차량[k]=temp;
							break;
						}
					}
				}
				else if(Integer.parseInt(temp)%2==0) {
					for(int k=0;k<50;k++ ) {
						if(짝차량[k]==null) {
							짝차량[k]=temp;
							break;
						}

					}
				}
			}
		j++;
		}		
		int g1=0;
		System.out.println("홀차량 : ");
		for(String temp : 홀차량) {
			if(temp!=null) {
				System.out.print(홀차량[g1]+" ");
				System.out.println("\n");

			}
		g1++;
		}
		
		
		int g2=0;
		System.out.println("짝차량 : ");
		for(String temp : 짝차량) {
			if(temp!=null) {
				System.out.print(짝차량[g2]+" ");
				System.out.println("\n");

			}
		g2++;
		}
		
		
		
		
	}
	// 차량번호 분배 프로그램
	// 조건 
		// 1. 난수 0000~9999[4자리 정수] 사이의 난수 10개 생성해서 배열에 저장 
		// 2. 모든 차량 번호를 배열에 저장 
		// 3. 끝자리 번호로 홀/짝 구분
		// 4. 차량 끝짜리의 번호가 홀수 차량 배열에 저장  
		// 5. 차량 끝짜리의 번호가 짝수 차량 배열에 저장 
		// 6. 홀수차량 배열 출력 // 짝수차량 배열 출력
	
	
	
	
	
	
	
}

