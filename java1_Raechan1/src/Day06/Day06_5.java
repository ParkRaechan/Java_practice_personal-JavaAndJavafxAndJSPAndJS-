package Day06;

import java.util.*;

public class Day06_5 {// c s
	public static void main(String[] args) { // main start 
		
		//p.207
		
		// 1.������ڷ� ��ü ����
		Korean k1 = new Korean();
			// 2.��ü������ �ʵ尪 ����
			k1.name = "���缮";
			k1.ssn = "123123-123123";
		System.out.println(" k1 ���� : "+k1.nation);
		System.out.println(" k1 �̸� : "+k1.name);
		System.out.println(" k1 �ֹε�Ϲ�ȣ : "+k1.ssn);
		System.out.println();
		
		// 2.�ʵ� 2������ �����ڷ� ��ü ����
		Korean k2 = new Korean("���ڹ�","011225-1234567");
		System.out.println(" k2 ���� : "+k2.nation);
		System.out.println(" k2 �̸� : "+k2.name);
		System.out.println(" k2 �ֹε�Ϲ�ȣ : "+k2.ssn);
		System.out.println();
		////////////////////////////////////////////////
		
			// 1.������� ��ü
		Korean �ѱ���1 = new Korean();
		System.out.println(" �ѱ���1 ���� : "+�ѱ���1.nation);
		System.out.println();
			// 2.�ʵ�1�� ������ ��ü ����
		Korean �ѱ���2 = new Korean("�̼ҷ�");	
		�ѱ���2.nation = "�ѱ����� �����ϴ� �߱��� �̱���";
		System.out.println(" �ѱ���2 ���� : "+�ѱ���2.nation);
		System.out.println(" �ѱ���2 �̸� : "+�ѱ���2.name);
		System.out.println();
			// 3.�ʵ�2�� ������ ��ü ����
		Korean �ѱ���3 = new Korean("����ȣ","222222-2222222");
		System.out.println(" �ѱ���3 ���� : "+�ѱ���3.nation);
		System.out.println(" �ѱ���3 �̸� : "+�ѱ���3.name);
		System.out.println(" �ѱ���3 �ֹε�Ϲ�ȣ : "+�ѱ���3.ssn);
		System.out.println();
			// 4.�ʵ�3�� ������ ��ü ����
		Korean �ѱ���4 = new Korean("���¾�","696969-6969696","�Ϻ��� �ݹ��´� �ѱ���");
		System.out.println(" �ѱ���4 ���� : "+�ѱ���4.nation);
		System.out.println(" �ѱ���4 �̸� : "+�ѱ���4.name);
		System.out.println(" �ѱ���4 �ֹε�Ϲ�ȣ : "+�ѱ���4.ssn);
		
	} // main end 
}// c e