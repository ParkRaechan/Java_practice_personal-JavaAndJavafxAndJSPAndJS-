package Day06;

import java.util.*;

public class Day06_5 {// c s
	public static void main(String[] args) { // main start 
		
		//p.207
		
		// 1.빈생성자로 객체 생성
		Korean k1 = new Korean();
			// 2.객체생성후 필드값 변경
			k1.name = "유재석";
			k1.ssn = "123123-123123";
		System.out.println(" k1 국적 : "+k1.nation);
		System.out.println(" k1 이름 : "+k1.name);
		System.out.println(" k1 주민등록번호 : "+k1.ssn);
		System.out.println();
		
		// 2.필드 2개갖는 생성자로 객체 생성
		Korean k2 = new Korean("박자바","011225-1234567");
		System.out.println(" k2 국적 : "+k2.nation);
		System.out.println(" k2 이름 : "+k2.name);
		System.out.println(" k2 주민등록번호 : "+k2.ssn);
		System.out.println();
		////////////////////////////////////////////////
		
			// 1.빈생성자 객체
		Korean 한국인1 = new Korean();
		System.out.println(" 한국인1 국적 : "+한국인1.nation);
		System.out.println();
			// 2.필드1개 생성자 객체 생성
		Korean 한국인2 = new Korean("이소룡");	
		한국인2.nation = "한국인이 좋아하는 중국계 미국인";
		System.out.println(" 한국인2 국적 : "+한국인2.nation);
		System.out.println(" 한국인2 이름 : "+한국인2.name);
		System.out.println();
			// 3.필드2개 생성자 객체 생성
		Korean 한국인3 = new Korean("콩진호","222222-2222222");
		System.out.println(" 한국인3 국적 : "+한국인3.nation);
		System.out.println(" 한국인3 이름 : "+한국인3.name);
		System.out.println(" 한국인3 주민등록번호 : "+한국인3.ssn);
		System.out.println();
			// 4.필드3개 생성자 객체 생성
		Korean 한국인4 = new Korean("금태양","696969-6969696","일본계 금발태닝 한국인");
		System.out.println(" 한국인4 국적 : "+한국인4.nation);
		System.out.println(" 한국인4 이름 : "+한국인4.name);
		System.out.println(" 한국인4 주민등록번호 : "+한국인4.ssn);
		
	} // main end 
}// c e