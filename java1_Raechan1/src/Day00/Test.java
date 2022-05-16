package Day00;
import java.util.Scanner;

public class Test {
	public static Student[] students = new Student[100];

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while(true) {
			board();
			try {
			int ch = scanner.nextInt();
			}
			catch(Exception e){
				System.err.println("번호입력하세요");
				scanner = new Scanner(System.in);
			}
		}	
	}
	
	public static void board() {
		System.out.println("-------------------------------------------------------------------------");
		System.out.println("                     성      적      표");
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("\t번호\t이름\t국어\t영어\t수학\t총점\t평균\t석차");
		System.out.println("--------------------------------------------------------------------------");
		int i = 0;
		for(Student temp : students) {
			if(temp!=null) {
				
				System.out.println("\t"+i+1+"\t"+students[i].name+"\t"+students[i].국어+"\t"+students[i].영어+"\t"+students[i].수학+"\t"+students[i].sum+"\t"+students[i].평균+"\t"+students[i].등수);
			}
			i++;
		}
		
	}
	
}
