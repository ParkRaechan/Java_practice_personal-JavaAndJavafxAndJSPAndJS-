
package Day04; // ��Ű����
import java.util.Random;
import java.util.Scanner;

public class Day04_3 {// c s
	
	/*
	 * ��������������
		1. ����ڿ��� ����[0]����[1]��[2] ����[3] �߿�  �Է¹ޱ�
		2. ��ǻ�� �����߻�[0~2] 
		3. ����ڿ� ��ǻ���� �¸��� �Ǵ� [ ����Ǽ� ]
		4. 3�� �����ϱ� ������ ���� ���� 
		5. 3�� ���ý� �������� 
			1. �� ���Ӽ� ���	��) 3��
			2. ���� �¸� ���	��) ��ǻ�� 2  ����� 1
	 */
	
	public static void main(String args[]) {// m s

		
		int ��ǻ��=0;
		int �÷��̾�win=0;
		int ��ǻ��win=0;
		
		int �Ѱ��Ӽ�=0;
		int ���=0;
		
		Random r1 = new Random();
		Scanner sc1 = new Scanner(System.in);
		
		System.out.println("-------����������-------");
		System.out.println("����[0] ����[1] ��[2] ��� �� ����[3]");
		System.out.println("��ǻ�͸� �̰ܶ�@@~!");
		while(true) {
			System.out.println("��Ȳ ---- �Ѱ��Ӽ� ---- �÷��̾�win ---- ��ǻ��win ----  ��� ----");
			System.out.println("           "+�Ѱ��Ӽ�+"           "+�÷��̾�win+"              "+��ǻ��win + "          "+���);
			System.out.println("����� ������? ����!����? ��!");
			int you = sc1.nextInt();
			��ǻ�� = r1.nextInt(3);
			if(you==0) {
				if(��ǻ��==0) {
					System.out.println("����� ���� : ����!");
					System.out.println("��ǻ���� ���� : ����!");
					System.out.println("���...");
					���++;
				}
				else if(��ǻ��==1) {
					System.out.println("����� ���� : ����!");
					System.out.println("��ǻ���� ���� : ����!");
					System.out.println("����...");
					��ǻ��win++;
				}
				else {
					System.out.println("����� ���� : ����!");
					System.out.println("��ǻ���� ���� : ��!");
					System.out.println("�̱�...");
					�÷��̾�win++;
				}
				�Ѱ��Ӽ�++;
			}
			if(you==1) {
				if(��ǻ��==0) {
					System.out.println("����� ���� : ����!");
					System.out.println("��ǻ���� ���� : ����!");
					System.out.println("�̱�...");
					�÷��̾�win++;
				}
				else if(��ǻ��==1) {
					System.out.println("����� ���� : ����!");
					System.out.println("��ǻ���� ���� : ����!");
					System.out.println("���...");
					���++;
				}
				else {
					System.out.println("����� ���� : ����!");
					System.out.println("��ǻ���� ���� : ��!");
					System.out.println("����...");
					��ǻ��win++;
				}
				�Ѱ��Ӽ�++;
			}
			if(you==2) {
				if(��ǻ��==0) {
					System.out.println("����� ���� : ��!");
					System.out.println("��ǻ���� ���� : ����!");
					System.out.println("����...");
					��ǻ��win++;
				}
				else if(��ǻ��==1) {
					System.out.println("����� ���� : ��!");
					System.out.println("��ǻ���� ���� : ����!");
					System.out.println("�̱�...");
					�÷��̾�win++;
				}
				else {
					System.out.println("����� ���� : ��!");
					System.out.println("��ǻ���� ���� : ��!");
					System.out.println("���...");
					���++;
				}
				�Ѱ��Ӽ�++;
			}
			if(you==3) {
				if(�÷��̾�win>��ǻ��win) System.out.println("���������....�÷��̾��� ��!!");
				else if(�÷��̾�win<��ǻ��win) System.out.println("���������....��ǻ���� ��!!");
				else System.out.println("���������....����..!!");
				break;
			}
		}
		
		
		
	}// m e
	
}// c e