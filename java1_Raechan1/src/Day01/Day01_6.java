
package Day01;

import java.util.Scanner;

public class Day01_6 {// c s

	public static void main(String args[]) {// m s		
		
		//입력 개체 선언
		Scanner 입력객체 = new Scanner(System.in);
		
		//입력 대상 안내
		System.out.print("작성자 : ");	
		//입력받은 데이터 저장
		String 작성자 = 입력객체.next();
		
		System.out.print("내용 : ");		
		String 내용 = 입력객체.next();
		
		System.out.print("날짜 : ");		
		String 날짜 = 입력객체.next();
		
		//출력
		System.out.println("-------------방문록-------------");
		System.out.println("|순번|작성자|내용\t  |날짜|");
		System.out.println("|1  |" + 작성자 + "|" + 내용 + "|" + 날짜 +"|");
		System.out.println("------------------------------");
	}// m e
	
}// c e