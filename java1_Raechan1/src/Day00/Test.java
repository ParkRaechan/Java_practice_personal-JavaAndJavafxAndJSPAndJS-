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
				System.err.println("��ȣ�Է��ϼ���");
				scanner = new Scanner(System.in);
			}
		}	
	}
	
	public static void board() {
		System.out.println("-------------------------------------------------------------------------");
		System.out.println("                     ��      ��      ǥ");
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("\t��ȣ\t�̸�\t����\t����\t����\t����\t���\t����");
		System.out.println("--------------------------------------------------------------------------");
		int i = 0;
		for(Student temp : students) {
			if(temp!=null) {
				
				System.out.println("\t"+i+1+"\t"+students[i].name+"\t"+students[i].����+"\t"+students[i].����+"\t"+students[i].����+"\t"+students[i].sum+"\t"+students[i].���+"\t"+students[i].���);
			}
			i++;
		}
		
	}
	
}
