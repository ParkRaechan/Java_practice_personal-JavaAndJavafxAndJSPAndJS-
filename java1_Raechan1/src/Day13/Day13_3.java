package Day13;

import java.util.Calendar;
import java.util.Scanner;

public class Day13_3 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print(" ���� : ");int year = scanner.nextInt();
		System.out.print(" �� : ");int month = scanner.nextInt();
		
		�޷�(year, month);
		
	}
	
	//�޷¸޼ҵ�
	public static void �޷�(int year, int month) {
		while(true) {
			//
			Calendar calendar = Calendar.getInstance();
			//
			//int year = calendar.get(Calendar.YEAR);
			//int month = calendar.get(Calendar.MONTH)+1;
			int day = calendar.get(Calendar.DAY_OF_MONTH);
			//*�ش� ���� 1���� ����ã��
				//1.
				calendar.set(year, month-1,1);
					System.out.println();
				//
				int sweek = calendar.get(Calendar.DAY_OF_WEEK);
					System.out.println("���ϱ��ϱ� : "+sweek);
				//
				int eweek = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
					System.out.println("�ش糯¥�� ������ �ϼ� : "+eweek);
					
			//
			System.out.println("********************"+year+"��"+(month)+"�� *********************");
			System.out.println("��\t��\tȭ\t��\t��\t��\t��");
			
			for(int i =1; i<sweek; i++) {
							//
				System.out.print("\t");
			}
			//
			for(int i =1; i<=eweek;i++) {
				System.out.print(i+"\t");
				//
				if(sweek%7==0)System.out.println();
				sweek++; //
			}
			Day13_3 a = new Day13_3();
			System.out.println("");
			//��ư [1.< 2.> 3.�ٽð˻�]
			try {
				System.out.println("1.�����޷� �̵� 2.�����޷� �̵� 3.�ٽð˻� 4.����"); 
				Scanner scanner = new Scanner(System.in); int ch =scanner.nextInt();
				if(ch==1) {
					month -= 1;
					if(month ==0) {
						month = 12; year-=1;
					}
					
				}
				else if(ch==2) {
					month += 1;
					if(month == 13) {
						month = 1; year+=1;
					}
				}
				else if(ch==3) {
					System.out.print(" ���� : "); year = scanner.nextInt();
					System.out.print(" �� : "); month = scanner.nextInt();
					
				}
				else if(ch==4) {
					System.out.println("����");
					break;

				}
				else {
					System.out.println("�˼����¹�ȣ");

				}

			} catch (Exception e) { // 
				System.out.println(" ��� ]] �������� �Է��� ���ּ���");
			}		
		}
	}
}
