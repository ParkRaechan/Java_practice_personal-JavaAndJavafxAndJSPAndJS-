package Day04;

import java.util.Scanner;
import java.util.Random;

public class Day04_5 {// cs
	
	/* �ζ� �Ǻ��� 
		1. ����� 6�� �� �Է¹ޱ� -> �迭 ���� 
			1. 1~45 ���� �� �� �Է¹ޱ� �ƴϸ� ���Է�
			2. �ߺ�x ���Է� 
		2. ��÷��ȣ : ��ǻ�� ���� 6�� �߻� -> �迭 ���� 
			1. 1~45 ���� 
			2. �ߺ�x
		3. ����ڹ�ȣ �� ��ǻ�� ��÷��ȣ�� ���� ���� ����
	 */
	
	
	
	//���� ��ȣ ����
	public static void main(String[] args) {// ms
		Scanner sc1 = new Scanner(System.in);
		int [] you = new int[6];
		int [] com = new int[6];
		System.out.println("�ζ� ��ȣ�� 6�ڸ��� �Է����ּ���.");
		for(int i=0; i<6; i++) {
			System.out.println("1~45�Է�");
			System.out.println((i+1)+"��° ��ȣ��?");
			int ��ȣ = sc1.nextInt();
			if(��ȣ < 1 || ��ȣ >45) {
				System.out.println("�˸�)) ������ �� ���� ��ȣ�Դϴ�.[���Է�]");
				i--;	
			}
			if(i>=0){
				for(int j=0;j<i;j++) {
					if(you[j]==��ȣ) {
						System.out.println("�˸�)) �ߺ��� ��ȣ�Դϴ�.[���Է�]");
						i--;
					}
				}
			}
			you[i] = ��ȣ;
		}
		
		
		//���� ��ȣ �̱�
		Random r1 = new Random();
		for(int k=0; k<6; k++) {
			com[k] = r1.nextInt(46);
			if(k>=1){
				for(int q=0;q<k;q++) {
					if(com[q]==com[k]) {
						k--;
					}
				}
			}
			if(com[k]==0) {k--;}
		}
		
		
		
		//�ε�...
		System.out.println("����� ��ȣ : "+you[0]+" "+you[1]+" "+you[2]+" "+you[3]+" "+you[4]+" "+you[5]);
		System.out.println("�α��α��α��α��α�...!");
		for(int l=0; l<5000; l++) {
			for(int m=0; m<5000; m++) {
				System.out.print("");
			}
		}
		
		
		
		//��ȣüũ
		int �����ȣī��Ʈ = 0;
		for(int g=0; g<6; g++) {
			for(int h=0; h<6; h++) {
				if(you[g]==com[h]) {
					�����ȣī��Ʈ++;
				}
			}
		}
		
		
		/*
		//��ȣüũ ���2
		int �����ȣī��Ʈ = 0;
		for(int �񱳱��� : you){
			for(int �񱳴�� : com) {
				if(�񱳱���==�񱳴��) {
					�����ȣī��Ʈ++;
				}
			}
		
		} 
		*/
		 
		 
		
		
		
		//�������� �����
		for(int def=0; def<6; def++) {
			for(int abc=0; abc<=def; abc++) {
				if(com[def]<com[abc]) {
					int temp = com[abc];
					com[abc]=com[def];
					com[def]=temp;
				}
			}
		}
		
		System.out.println("��÷ ��ȣ : "+com[0]+" "+com[1]+" "+com[2]+" "+com[3]+" "+com[4]+" "+com[5]);
		System.out.println("���� ��ȣ ���� : "+�����ȣī��Ʈ);
		
		
	}// me
} // c e 
