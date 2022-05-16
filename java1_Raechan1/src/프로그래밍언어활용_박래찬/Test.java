package 프로그래밍언어활용_박래찬;
import java.util.Scanner;

public class Test {

	static Scanner scanner = new Scanner(System.in);
	static Student[] students = new Student[100];
	
	public static void main(String[] args) {
		
		while(true) {
			board();	
		}
		
	
	
	}
	public static void board() {
		Controller.석차();
		System.out.println("-------------------------------------------------------------------------");
		System.out.println("                    성      적      표");
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("\t번호\t이름\t국어\t영어\t수학\t총점\t평균\t석차");
		int i=0;
		for(Student temp : students) {
			if(temp!=null) {
				System.out.printf("\t%d\t%s\t%d\t%d\t%d\t%.0f\t%.2f\t%d\n",i+1,students[i].name,students[i].국어,
						students[i].영어,students[i].수학,students[i].sum,students[i].avg,students[i].grd);
				i++;
			}
			
		}
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("메뉴 : 1. 학생점수등록 2. 학생점수 삭제");
		try {
			int ch = scanner.nextInt();
			if(ch==1) {
				Controller.addS();
			}
			else if(ch==2) {
				Controller.deleteS();
			}
			else {
				System.err.println("잘못된 입력))제시된 번호중 입력해주세요.");
			}
		} catch (Exception e) {
			System.err.println("번호를 입력하시오");
			scanner = new Scanner(System.in);
		}
			
			
			
		
		
		
		
		
		
		
	}
}
