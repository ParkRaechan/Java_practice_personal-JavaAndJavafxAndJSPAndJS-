package Day12;

import java.util.Random;

public class Day12_4_������ȣ�й����α׷�Mine {

	
	public static void main(String[] args) {
		
		Random random = new Random();
		int ����1 = random.nextInt(10000);
		int ����2 = random.nextInt(10000);
		int ����3 = random.nextInt(10000);
		int ����4 = random.nextInt(10000);
		int ����5 = random.nextInt(10000);
		int ����6 = random.nextInt(10000);
		int ����7 = random.nextInt(10000);
		int ����8 = random.nextInt(10000);
		int ����9 = random.nextInt(10000);
		int ����10 = random.nextInt(10000);
		
		String[] Ȧ���� = new String[50];
		String[] ¦���� = new String[50];
		String ������ȣ1 = String.format("%04d", ����1 );
		String ������ȣ2 = String.format("%04d", ����2 );
		String ������ȣ3 = String.format("%04d", ����3 );
		String ������ȣ4 = String.format("%04d", ����4 );
		String ������ȣ5 = String.format("%04d", ����5 );
		String ������ȣ6 = String.format("%04d", ����6 );
		String ������ȣ7 = String.format("%04d", ����7 );
		String ������ȣ8 = String.format("%04d", ����8 );
		String ������ȣ9 = String.format("%04d", ����9 );
		String ������ȣ10 = String.format("%04d", ����10 );

		String[] ���� = {������ȣ1,������ȣ2,������ȣ3,������ȣ4,������ȣ5,������ȣ6,������ȣ7,������ȣ8,
				������ȣ9,������ȣ10};
		
		
		int i =0;
		for(String temp : ����) {
			if(temp!=null) {
				System.out.print(����[i]+" ");
			}
			System.out.println("\n");

		i++;
		}
		
		int j =0;
		for(String temp : ����) {
			if(temp!=null) {
				if(Integer.parseInt(temp)%2==1) {
					for(int k=0;k<50;k++ ) {
						if(Ȧ����[k]==null) {
							Ȧ����[k]=temp;
							break;
						}
					}
				}
				else if(Integer.parseInt(temp)%2==0) {
					for(int k=0;k<50;k++ ) {
						if(¦����[k]==null) {
							¦����[k]=temp;
							break;
						}

					}
				}
			}
		j++;
		}		
		int g1=0;
		System.out.println("Ȧ���� : ");
		for(String temp : Ȧ����) {
			if(temp!=null) {
				System.out.print(Ȧ����[g1]+" ");
				System.out.println("\n");

			}
		g1++;
		}
		
		
		int g2=0;
		System.out.println("¦���� : ");
		for(String temp : ¦����) {
			if(temp!=null) {
				System.out.print(¦����[g2]+" ");
				System.out.println("\n");

			}
		g2++;
		}
		
		
		
		
	}
	// ������ȣ �й� ���α׷�
	// ���� 
		// 1. ���� 0000~9999[4�ڸ� ����] ������ ���� 10�� �����ؼ� �迭�� ���� 
		// 2. ��� ���� ��ȣ�� �迭�� ���� 
		// 3. ���ڸ� ��ȣ�� Ȧ/¦ ����
		// 4. ���� ��¥���� ��ȣ�� Ȧ�� ���� �迭�� ����  
		// 5. ���� ��¥���� ��ȣ�� ¦�� ���� �迭�� ���� 
		// 6. Ȧ������ �迭 ��� // ¦������ �迭 ���
	
	
	
	
	
	
	
}

