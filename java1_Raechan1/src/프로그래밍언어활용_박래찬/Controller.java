package 프로그래밍언어활용_박래찬;

import java.util.Scanner;

public class Controller {
	
	static void addS() {
		int i=0;
		for(Student temp : Test.students) {
			
			if(temp==null) {
				System.out.println("등록할 점수의 학생 이름 : ");
				String a = Test.scanner.next();
				
				System.out.println("국어 점수 : ");
				int b = Test.scanner.nextInt();
				
				System.out.println("영어 점수 : ");
				int c = Test.scanner.nextInt();
				
				System.out.println("수학 점수 : ");
				int d = Test.scanner.nextInt();
						
				float e = b + c + d;
				float f = e/3;
				
				Student st = new Student(a,b,c,d,e,f);
				
				Test.students[i] = st;
				
				i++;
				
				break;
			}
			else {i++;}
			
		}
		
		
		
	}
	
	static void deleteS() {
		int i=0;
		for(Student temp : Test.students) {
			
			if(temp!=null) {
				System.out.println("삭제할 점수의 학생 이름 : ");
				String a = Test.scanner.next();
				System.out.println("학생 번호 : ");
				int b = Test.scanner.nextInt();
				if(Test.students[i].name.equals(a)&&(i+1)==b) {
					for(int j = i; j<99 ; j++) {
						if(temp!=null) {
							if(Test.students[j+1]==null) {
								Test.students[j] = null;
							}
							Test.students[j] = Test.students[j+1];
						}
						
					}
					
					break;
				}
								
				i++;
				
				break;
			}
			else {i++;}
			
		}
	}
	
	public static void 석차() {
		int i =0;
		for(Student temp : Test.students) {
			for(int j = i+1;j<99;j++) {
				if(temp!=null) {
					if(Test.students[j]==null) {
						Test.students[i].grd=i+1;
						break;
					}
					else if(Test.students[i].sum<Test.students[j].sum) {
						Test.students[i].grd=Test.students[i].grd+2;
						Test.students[j].grd=Test.students[i].grd+1;
						
					}
					
				}
			}
		i++;
		}
		
	}
}
