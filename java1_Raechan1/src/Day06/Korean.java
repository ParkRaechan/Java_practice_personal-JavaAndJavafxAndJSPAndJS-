package Day06;

public class Korean {
	// *Korean Ŭ���� ����
	
	// 1.�ʵ� [������ ����Ǵ� ��]
	String nation = "���ѹα�";
		//���� ������ �̸� ���ѹα� ����
	String name;
		//�̸� �������� �ʱ�ȭX [NULL]
	String ssn;
		//�ֹε�Ϲ�ȣ �������� �ʱ�ȭX [NULL]
	
	// 2.������ [��ü������ �ʱ�ȭ]
		// ����1 : Ŭ�����̸� == �������̸�
		// ����2 : �ܺη� ������ �Ű���[ �μ� ]����
		// ����3 : ������ ������ �̸� ���� �� ����.
			//�����ε� : ������ �̸��ϰ�� �ڵ带 ������
	// 1.�������[�⺻������] = ���������[�μ� ����X]
	Korean(){
		//������⶧����
	}
	
	Korean(String n){
		name = n;
	}
	
	Korean(String n, String s){
		name = n;
		ssn = s;
	}
	
	Korean(String name, String ssn, String nation){
		this.name = name;
		this.ssn = ssn;
		this.nation = nation;
		//���κ���(���� Ŭ������ ����)
		//�Ű�����(�ܺηκ��� ����)
		//���κ���==�Ű����� �̸� ����
		//���κ���(���� Ŭ������ ����)
			//this : ����Ŭ���� ǥ��
	}
	
	// 3.�޼ҵ�
}
