package Day03;

import java.util.Scanner;

public class Day03_3 {
	
	public static void main(String[] args) {
		
		//문제6
		// 점수를 입력받아 점수가 90점 이상이면 합격 아니면 불합격 출력 
		
		/*
		Scanner sc6 = new Scanner(System.in);
		System.out.print("점수 입력 : ");
		int grade6 = sc6.nextInt();
		
		if(grade6>=90) {
			System.out.println("합격");	
		}
		else System.out.println("불합격");	
		*/
		
		
		//문제7
		// 점수를 입력받아 점수가 90점 이상이면 A등급
		//				점수가 80점 이상이면 B등급
		//				점수가 70점 이상이면 C등급
		//				그외 재시험
		
		/*
		Scanner sc7 = new Scanner(System.in);
		System.out.print("점수 입력 : ");
		int grade7 = sc7.nextInt();
		
		if(grade7>=90) {
			System.out.println("A등급");	
		}
		else if(grade7>=80) {
			System.out.println("B등급");
		}
		else if(grade7>=70) {
			System.out.println("C등급");
		}
		else System.out.println("재시험");	
		*/
		
		
		//문제8 로그인페이지
		// [ 입력 ] : 아이디와 비밀번호를 입력받기
		// [ 조건 ] : 회원아이디가 admin 이고 
		//           비밀번호가 1234 일 경우에는 
		//          로그인 성공 아니면 로그인 실패 출력
		
		/*
		boolean 로그인성공 = false;
		Scanner sc8 = new Scanner(System.in);
		System.out.print("아이디 입력 : ");
		String ID8 = sc8.next();
		System.out.print("비밀번호 입력 : ");
		String PW8 = sc8.next();
		
		if(ID8.equals("admin")) {
			if(PW8.equals("1234")) {
				System.out.println("로그인 성공");
				로그인성공 = true;
			}
			else System.out.println("비밀번호가 틀렸습니다.");
		}
		else System.out.println("아이디가 틀렸습니다.");
		
		if(로그인성공 == false)  System.out.println("로그인 실패");
		*/
		
		
		
		
		
		/* 문제9
		[ 입력 ] : 국어,영어,수학 입력받기
		[ 조건 ]
			평균이 90점 이상이면서 
				국어점수 100점 이면 '국어우수' 출력
				영어점수 100점 이면 '영어우수' 출력
				수학점수 100점 이면 '수학우수' 출력
			평균이 80점 이상이면서 
				국어점수 90점 이면 '국어장려' 출력
				영어점수 90점 이면 '영어정려' 출력
				수학점수 90점 이면 '수학장려' 출력
			그외 재시험 
		 */
		
		
		Scanner sc9 = new Scanner(System.in);
		System.out.print("국어 점수 입력 : ");
		int grade9_1 = sc9.nextInt();
		System.out.print("영어 점수 입력 : ");
		int grade9_2 = sc9.nextInt();
		System.out.print("수학 점수 입력 : ");
		int grade9_3 = sc9.nextInt();
		
		int grade9 = (grade9_1 + grade9_2 + grade9_3)/3;
		
		if(grade9>=90) {
			if(grade9_1==100) System.out.println("국어우수");
			if(grade9_2==100) System.out.println("영어우수");
			if(grade9_3==100) System.out.println("수학우수");
			System.out.print("평균 : " + grade9);
		} //if e
		else if(grade9>=80) {
			if(grade9_1==90) System.out.println("국어장려");
			if(grade9_2==90) System.out.println("영어장려");
			if(grade9_3==90) System.out.println("수학장려");
			System.out.print("평균 : " + grade9);
		}//else if e
		else {System.out.println("재시험");}//else e
		
		
	}

}
