package Day02;

import java.util.Scanner;

public class Day02_5_����2_����14 {
	
	public static void main(String[] args) {
		
		// ����2 : ���� ���� 
		/*
		 * [ �Է����� ] 
		 * 		�ݾ� 
		 * [ ���� ] 
		 * 		�ʸ��� ���� ��� ������ ���� ���� 
		 * [ ������� ]
		 * 		��) 356789 �Է½� 
		 * 		�ʸ��� 3�� 
		 * 		���� 5��
		 * 		õ�� 6�� 
		 * 		��� 7��
		 * 
		 */
		
		/*
		System.out.print("�ݾ� : ");
		Scanner sc3 = new Scanner(System.in);
		int yMon1 = sc3.nextInt();
		
		//10���� ������
		int M10 = yMon1 / 100000;
		//10���� ������ �ݾװ��
		int M10$ = yMon1 % 100000;
		
		int M1 = M10$ / 10000;
		int M1$ = M10$ % 10000;
		
		
		int M1_1 = M1$/1000;
		int M1_1$ = M1$ % 1000;

		int M1_1_1 = M1_1$ / 100;
		int M1_1_1$ = M1_1$ % 100;
		
		System.out.println("�ʸ��� : " + M10 + "��");
		System.out.println("���� : " + M1 + "��");
		System.out.println("õ�� : " + M1_1 + "��");
		System.out.println("��� : " + M1_1_1 + "��");
		System.out.println("������ : " + M1_1_1$ + "��");
		*/
		
		
		
		
		//����3 : �ϳ��� ������ �Է¹޾� 7�� ������� ���[ true , false ]
		
		/*
		System.out.print("�����Է� : ");
		Scanner sc3 = new Scanner(System.in);
		int ���� = sc3.nextInt();
		int re3 = ����%7 ;
		
		boolean r3 = (re3==0) ? true : false;
		
		System.out.print("��� : " + r3);
		*/
		
		
		
		
		
		//����4 : �ϳ��� ������ �Է¹޾� Ȧ�� ���� Ȯ�� [ true , false ]
		
		/*
		System.out.print("�����Է� : ");
		Scanner sc4 = new Scanner(System.in);
		int ���� = sc4.nextInt();
		int re2 = ����%2 ;
		
		boolean r4 = (re2==1) ? true : false;
		
		System.out.print("��� : " + r4);
		*/
		
		
		
		
		//����5 : �ϳ��� ������ �Է¹޾� 7�� ��� �̸鼭 ¦�� ���� Ȯ�� [ true , false ]
		
		/*
		System.out.print("�����Է� : ");
		Scanner sc5 = new Scanner(System.in);
		int ���� = sc5.nextInt();
		int re5 = ����%7 ;
		int re5_1 = ����%2 ;
		
		boolean r5 = (re5==0) ? ((re5_1==0)? true : false) : false;
		
		System.out.print("��� : " + r5);
		*/
		
		
		//����6 : �ΰ��� ������ �Է¹޾� �� ū�� ���  [ true , false ]
		
		/*
		System.out.print("ù��° �����Է� : ");
		Scanner sc6 = new Scanner(System.in);
		int ���� = sc6.nextInt();

		System.out.print("�ι�° �����Է� : ");
		int ����_1 = sc6.nextInt();
		
		
		boolean r6 = (����>����_1)? true : false;
		
		System.out.print("��� : " + r6);
		*/
		
		
		
		//����7 : �������� �Է¹޾� �� ���� ����ϱ� 
				// �� ���� ���� => ������ * ������ * ������[3.14]
		
		/*
		System.out.print("������ : ");
		Scanner sc7 = new Scanner(System.in);
		int ���� = sc7.nextInt();

		double ���� = ���� * ���� * 3.14;
		
		System.out.print("�� ���� : " + ����);
		*/
		
		
		//����8 : �� �Ǽ��� �Է¹޾� �սǼ��� ���� ���� ���� ��% ���� ����ϱ�
				// ��) 54.5   84.3 �̸�    64.285714%
		
		/*
		System.out.print("ù��° �Ǽ��Է� : ");
		Scanner sc8 = new Scanner(System.in);
		double �Ǽ� = sc8.nextFloat();

		System.out.print("�ι�° �Ǽ��Է� : ");
		double �Ǽ�_1 = sc8.nextFloat();
		
		double r8 = �Ǽ� / �Ǽ�_1 * 100;
		
		System.out.print("��� : " + r8 + "%");
		*/
		
		
		
		
		
		
		
		//����9 : ��ٸ��� ���� ���ϱ�[������ �غ� ���̸� �Է¹޾� ����ϱ�]
				//��ٸ��� ���� = > (���� * �غ�) * ���� / 2
		
		/*
		System.out.print("���� �Է� : ");
		Scanner sc9 = new Scanner(System.in);
		int ���� = sc9.nextInt();

		System.out.print("�غ� �Է� : ");
		int �غ� = sc9.nextInt();
		
		System.out.print("���� �Է� : ");
		int ���� = sc9.nextInt();
		
		int ���� = (���� + �غ�) * ���� / 2;
		
		System.out.print("���� : " + ����);
		*/
		
		
		
		
		//����10: Ű�� ������ �Է¹޾� ǥ��ü�� ����ϱ�
				//ǥ��ü�� ���� = > (Ű - 100) * 0.9
		
		/*
		System.out.print("Ű�� �Է��ϼ��� : ");
		Scanner sc10 = new Scanner(System.in);
		float Ű = sc10.nextFloat();

		double ǥ��ü�� = (Ű - 100) * 0.9;
		
		System.out.print("ǥ��ü�� : " + ǥ��ü��);
		*/
		
		
		
		//����11: Ű�� �����Ը� �Է¹޾� BMI ����ϱ�
				//BMI ���� = > ������ / ((Ű / 100) * (Ű / 100))
		
		/*
		System.out.print("Ű�� �Է��ϼ��� : ");
		Scanner sc11 = new Scanner(System.in);
		float Ű = sc11.nextFloat();
		
		System.out.print("�����Ը� �Է��ϼ��� : ");
		float ������ = sc11.nextFloat();
		
		float BMI = ������ / ((Ű / 100.0f) * (Ű / 100.0f));
		
		System.out.print("BMI : " + BMI);
		*/
		
		
		//����12: inch �� �Է¹޾� cm �� ��ȯ�ϱ� [ 1 inch -> 2.54cm ] 
		
		/*
		System.out.print("inch�� �Է��ϼ��� : ");
		Scanner sc12 = new Scanner(System.in);
		Double Ű = sc12.nextDouble();

		Double cm = Ű * 2.54;
		
		System.out.print("��ȯ�� : " + cm);
		*/
		
		//����13:  �߰����, �⸻���, �����򰡸� �Է¹޾� �ݿ������� ����ϱ�
				//�Ҽ� ��° �ڸ� ���� ���� ����ϱ�
				//�߰���� �ݿ����� => 30 %
				//�⸻��� �ݿ����� => 30 %
				//������ �ݿ����� => 40 %
		
		/*
		System.out.print("�߰���� �Է� : ");
		Scanner sc13 = new Scanner(System.in);
		int �߰� = sc13.nextInt();

		System.out.print("�⸻��� �Է� : ");
		int �⸻ = sc13.nextInt();
		
		System.out.print("������ �Է� : ");
		int ���� = sc13.nextInt();
		
		float ���� = �߰�*30/100 + �⸻*30/100 + ����*40/100;
		
		System.out.printf("���� : %.2f", ����);
		*/
		
		
		
		
		
		
		//����14 :  ���� ���� ���� �ϰ� x�� y�� �����ϱ�
			//int x = 10;
			//int y = x-- + 5 + --x;
			//printf(" x�� �� : %d , y�ǰ� :  %d ", x, y)
		
		/*
		int x = 10;
		int y = x-- + 5 + --x;
		System.out.println("������� : z = x + 5");
		System.out.println("        x-- ");	
		System.out.println("        --x ");
		System.out.println("        z + x");
		System.out.println(" ���� x = 8, y = 23");
		System.out.printf(" x�� �� : %d , y�ǰ� :  %d ", x, y);
		*/
		
		
		//����15 : ���̸� �Է¹޾� ���̰� 10���̻��̸� �л� , 20���̻��̸� ���� , 40���̻��̸� �߳� ���� ����ϱ�
		
		/*
		System.out.print("���� �Է� : ");
		Scanner sc15 = new Scanner(System.in);
		int ���� = sc15.nextInt();

		String age = (����>=10)? ((����>=20)? ((����>=40)? "�߳�" : "����"): "�л�") : "������";
		
		System.out.print(age);
		*/
		
		//����16 : 3���� ������ �Է¹޾� ������������ ���� 
		
		/*
		Scanner sc16 = new Scanner(System.in);
		System.out.print("ù��° ������ �Է��Ͻÿ� : ");
		int ù��° = sc16.nextInt();
		System.out.print("�ι�° ������ �Է��Ͻÿ� : ");
		int �ι�° = sc16.nextInt();
		System.out.print("����° ������ �Է��Ͻÿ� : ");
		int ����° = sc16.nextInt();
		
		int ù°�� = (ù��°>�ι�°)? ((ù��°>����°)? ù��°:����°) : (�ι�°>����°)? �ι�°:����°;
		int ��°�� = (�ι�°>ù��°)? ((�ι�°<����°)? �ι�°:(ù��°>����°)? ù��°:����°) : (�ι�°>����°)? �ι�°:(����°>ù��°)? ù��°:����°;
		int ��°�� = (ù��°<�ι�°)? ((ù��°<����°)? ù��°:����°) : (�ι�°<����°)? �ι�°:����°;
		
		System.out.print("�������� : " +��°��+" "+��°��+" "+ù°��);
		*/
		
		//����17 : 4���� ������ �Է¹޾� ������������ ���� 
		
		/*
		Scanner sc17 = new Scanner(System.in);
		System.out.print("ù��° ������ �Է��Ͻÿ� : ");
		int ù��° = sc17.nextInt();
		System.out.print("�ι�° ������ �Է��Ͻÿ� : ");
		int �ι�° = sc17.nextInt();
		System.out.print("����° ������ �Է��Ͻÿ� : ");
		int ����° = sc17.nextInt();
		System.out.print("�׹�° ������ �Է��Ͻÿ� : ");
		int �׹�° = sc17.nextInt();
		
		int ù°��_1 = (ù��°>�ι�°)? ((ù��°>����°)? ù��°:����°) : (�ι�°>����°)? �ι�°:����°;
		int ��°��_1 = (�ι�°>ù��°)? ((�ι�°<����°)? �ι�°:(ù��°>����°)? ù��°:����°) : (�ι�°>����°)? �ι�°:(����°>ù��°)? ù��°:����°;
		int ��°��_1 = (ù��°<�ι�°)? ((ù��°<����°)? ù��°:����°) : (�ι�°<����°)? �ι�°:����°;
		
		int ù°�� = (�׹�°>ù°��_1)? �׹�° : ù°��_1;
		int ��°�� = (�׹�°<ù°��_1)? ((�׹�°>��°��_1)? �׹�° : ��°��_1) : ù°��_1;
		int ��°�� = (�׹�°<ù°��_1)? ((�׹�°<��°��_1)? ((�׹�°>��°��_1)? �׹�°:��°��_1) : ��°��_1 ):��°��_1;
		int ��°�� = (�׹�°<ù°��_1)? ((�׹�°<��°��_1)? ((�׹�°<��°��_1)? �׹�°:��°��_1):��°��_1):��°��_1;
		
		
		
		System.out.print("�������� : " +ù°��+" "+��°��+" "+��°��+" "+��°��);
		*/
		
		
		// p. 102 Ȯ�ι���
		
		/*
		int x =10;
		int y =20;
		int z = (++x) + (y--);
		System.out.println(z);
		*/
		
		/*
		int score = 85;
		String result = (!(score>90))? "��" : "��";
		System.out.println(result);
		*/
		
		
	}
	
}








