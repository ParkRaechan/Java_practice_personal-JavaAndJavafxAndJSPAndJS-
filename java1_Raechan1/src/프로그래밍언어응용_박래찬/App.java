package ���α׷��־������_�ڷ���;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class App {
	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		
		
		while(true) {
			// 1. ��� ���� ǥ ��� 
			System.out.println("--------------------------------------------- ���� ��Ȳ ǥ --------------------------------------------");
			board();
			System.out.println("----------------------------------------------------------------------------------------------------");
			
			System.out.print("\t\t\t 1.���� \t  2.���� : ");
			int ch = scanner.nextInt();
			
			if( ch == 1 ) {
				// 1. ������ȣ�� �Է¹޴´�.
				System.out.print("������ȣ : ");
				String carNumOrigin = scanner.next();
				// 2. �Է¹��� ������ȣ�� ��Ʈ�ѳ� �޼ҵ� ���� �ѱ��.
				boolean ��� = Controller.inCar(carNumOrigin);
				// 3. �޼ҵ� ��� �� ���� ��� 
				if(���==true) {
					System.out.println("��������");
				}
				else {
					System.out.println("��������");
				}
			}else if( ch == 2 ){
				// 1. ������ȣ�� �Է¹޴´�.
				System.out.print("������ȣ : ");
				String carNumOrigin = scanner.next();
				// 2. �Է¹��� ������ȣ�� ��Ʈ�ѳ� �޼ҵ� ���� �ѱ��.
				boolean ��� = Controller.outCar(carNumOrigin);
				// 3. �޼ҵ� ��� �� ���� ��� 
				if(���==true) {
					System.out.println("��������");
				}
				else {
					System.out.println("��������");
				}
			}
			else {
				System.out.println("���õ� ��ȣ���Է��ϼ���.");
				
			}
		}
		
		
		
		
		
	}
	// ����Ʈ ����ǥ ��� �޼ҵ�
	public static void board() {
		try {
			int i =0;
			LocalDate Date0 = LocalDate.now();
			LocalTime Time0 = LocalTime.now();
			System.out.println("\t\t����ð� : "+Date0+"\t"+Time0);
			System.out.println("��¥\t\t\t������ȣ\t\t�����ð�\t\t\t\t�����ð�\t\t\t�ݾ�");
			for(Car q1 : Controller.carlist ) {
				if(q1.get�����ð�()==null) {
					System.out.println(q1.get��¥()+"\t\t"+q1.get������ȣ()
					+"\t\t"+q1.get�����ð�()+"\t\t������\t\t\t������");
				}
				else {
					System.out.println(q1.get��¥()+"\t\t"+q1.get������ȣ()
					+"\t\t"+q1.get�����ð�()+"\t\t"+q1.get�����ð�()+"\t\t"+q1.get�ݾ�());
				}
				i++;
			}
		} catch (Exception e) {
			System.out.println("�߸��� �Է� �ٽ� �Է� �ٶ��ϴ�.");
			scanner = new Scanner(System.in);
		}
		
	}
	
	
}
