package ���α׷��־��Ȱ��_�ڷ���;
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
		Controller.����();
		System.out.println("-------------------------------------------------------------------------");
		System.out.println("                    ��      ��      ǥ");
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("\t��ȣ\t�̸�\t����\t����\t����\t����\t���\t����");
		int i=0;
		for(Student temp : students) {
			if(temp!=null) {
				System.out.printf("\t%d\t%s\t%d\t%d\t%d\t%.0f\t%.2f\t%d\n",i+1,students[i].name,students[i].����,
						students[i].����,students[i].����,students[i].sum,students[i].avg,students[i].grd);
				i++;
			}
			
		}
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("�޴� : 1. �л�������� 2. �л����� ����");
		try {
			int ch = scanner.nextInt();
			if(ch==1) {
				Controller.addS();
			}
			else if(ch==2) {
				Controller.deleteS();
			}
			else {
				System.err.println("�߸��� �Է�))���õ� ��ȣ�� �Է����ּ���.");
			}
		} catch (Exception e) {
			System.err.println("��ȣ�� �Է��Ͻÿ�");
			scanner = new Scanner(System.in);
		}
			
			
			
		
		
		
		
		
		
		
	}
}
