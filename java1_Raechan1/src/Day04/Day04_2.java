
package Day04; // ��Ű����

import java.util.Scanner;

public class Day04_2 {// c s

	public static void main(String args[]) {// m s

	
	Scanner scanner = new Scanner(System.in);
		
		int �ݶ���� = 10;
		int ȯŸ��� = 10;
		int ���̴���� = 10;
		int �ݶ󱸸ż� = 0;
		int ȯŸ���ż� = 0;
		int ���̴ٱ��ż� = 0;
		
		while(true) {
			System.out.println("-------�޴���-------");
			System.out.println("[ 1.�ݶ�(300) 2.ȯŸ(200) 3. ���̴�(100) 4.���� ]");
			System.out.print(">>����");
			int ���� = scanner.nextInt();
			
			if(����==1) {
				if(�ݶ����==0) {
					System.out.println("�˸�)) ������");
				}
				else {
					System.out.println("[[�ݶ�1���� ��ҽ��ϴ�.]]");
					�ݶ󱸸ż�++;
					�ݶ����--;
				}
				
			}
			else if(���� ==2) {
				if(ȯŸ���==0) {
					System.out.println("�˸�)) ������");
				}
				else {
					System.out.println("[[ȯŸ1���� ��ҽ��ϴ�.]]");
					ȯŸ���ż�++;
					ȯŸ���--;
				}
				
			}
			else if(���� ==3) {
				if(���̴����==0) {
					System.out.println("�˸�)) ������");
				}
				else {
					System.out.println("[[���̴�1���� ��ҽ��ϴ�.]]");
					���̴ٱ��ż�++;
					���̴����--;
				}
				
			}
			else if(���� ==4) {
				System.out.println("-------���� ��ǰ ���-------");
				System.out.println("��ǰ��\t����\t�ݾ�");
				if(�ݶ󱸸ż�!=0) System.out.println("�ݶ�\t"+�ݶ󱸸ż�+"\t"+�ݶ󱸸ż�*300);
				if(ȯŸ���ż�!=0) System.out.println("ȯŸ\t"+ȯŸ���ż�+"\t"+ȯŸ���ż�*200);
				if(���̴ٱ��ż�!=0) System.out.println("���̴�\t"+���̴ٱ��ż�+"\t"+���̴ٱ��ż�*100);
				int ������ = �ݶ󱸸ż�*300+ȯŸ���ż�*200+���̴ٱ��ż�*100;
				System.out.println("������ : "+������);
				System.out.println("----------------------------");
				System.out.println("1.���� 2.���");
				int ����2 = scanner.nextInt();
				
				if(����2==1) {
					while(true) {
						System.out.print("�ݾ��� �Է����ֽÿ� : ");
						int �ݾ� = scanner.nextInt();
						if(�ݾ�<������) {
							System.out.println("�����Ұ�");
						}
						else {
							System.out.println("�����Ϸ�");
							System.out.println("�ܵ� : "+(�ݾ�-������));
							�ݶ󱸸ż� = 0;
							ȯŸ���ż� = 0;
							���̴ٱ��ż� = 0;
							break;
						}
					}
				}
				else if(����2==2) {
					System.out.println("�˸�)) ���Ÿ�������");
					�ݶ����+=�ݶ󱸸ż�;
					ȯŸ���+=ȯŸ���ż�;
					���̴����+=���̴ٱ��ż�;
					
					�ݶ󱸸ż�=0;
					ȯŸ���ż�=0;
					���̴ٱ��ż�=0;
				}
				else {
					System.out.println("�˸�)) �˼����� �ൿ");
				}
			}
			else {
				System.out.println("�˸�)) �˼����� �ൿ");
				
			}
		}
	}// m e
	
}// c e