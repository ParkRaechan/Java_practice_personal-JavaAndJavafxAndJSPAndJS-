package Day04;

import java.util.Scanner;
import java.util.Random;

public class Day04_5 {// cs
	
	/* 로또 판별기 
		1. 사용자 6개 수 입력받기 -> 배열 저장 
			1. 1~45 사이 수 만 입력받기 아니면 재입력
			2. 중복x 재입력 
		2. 추첨번호 : 컴퓨터 난수 6개 발생 -> 배열 저장 
			1. 1~45 사이 
			2. 중복x
		3. 사용자번호 와 컴퓨터 추첨번호와 동일 수의 개수
	 */
	
	
	
	//복권 번호 선택
	public static void main(String[] args) {// ms
		Scanner sc1 = new Scanner(System.in);
		int [] you = new int[6];
		int [] com = new int[6];
		System.out.println("로또 번호를 6자리를 입력해주세요.");
		for(int i=0; i<6; i++) {
			System.out.println("1~45입력");
			System.out.println((i+1)+"번째 번호는?");
			int 번호 = sc1.nextInt();
			if(번호 < 1 || 번호 >45) {
				System.out.println("알림)) 선택할 수 없는 번호입니다.[재입력]");
				i--;	
			}
			if(i>=0){
				for(int j=0;j<i;j++) {
					if(you[j]==번호) {
						System.out.println("알림)) 중복된 번호입니다.[재입력]");
						i--;
					}
				}
			}
			you[i] = 번호;
		}
		
		
		//랜덤 번호 뽑기
		Random r1 = new Random();
		for(int k=0; k<6; k++) {
			com[k] = r1.nextInt(46);
			if(k>=1){
				for(int q=0;q<k;q++) {
					if(com[q]==com[k]) {
						k--;
					}
				}
			}
			if(com[k]==0) {k--;}
		}
		
		
		
		//로딩...
		System.out.println("당신의 번호 : "+you[0]+" "+you[1]+" "+you[2]+" "+you[3]+" "+you[4]+" "+you[5]);
		System.out.println("두구두구두구두구두구...!");
		for(int l=0; l<5000; l++) {
			for(int m=0; m<5000; m++) {
				System.out.print("");
			}
		}
		
		
		
		//번호체크
		int 맞춘번호카운트 = 0;
		for(int g=0; g<6; g++) {
			for(int h=0; h<6; h++) {
				if(you[g]==com[h]) {
					맞춘번호카운트++;
				}
			}
		}
		
		
		/*
		//번호체크 방법2
		int 맞춘번호카운트 = 0;
		for(int 비교기준 : you){
			for(int 비교대상 : com) {
				if(비교기준==비교대상) {
					맞춘번호카운트++;
				}
			}
		
		} 
		*/
		 
		 
		
		
		
		//오름차순 만들기
		for(int def=0; def<6; def++) {
			for(int abc=0; abc<=def; abc++) {
				if(com[def]<com[abc]) {
					int temp = com[abc];
					com[abc]=com[def];
					com[def]=temp;
				}
			}
		}
		
		System.out.println("당첨 번호 : "+com[0]+" "+com[1]+" "+com[2]+" "+com[3]+" "+com[4]+" "+com[5]);
		System.out.println("맞춘 번호 개수 : "+맞춘번호카운트);
		
		
	}// me
} // c e 
