package Day08.gg;

public class Member {
	//�ʵ�
	String name;
	String id;
	String password;
	String phone;
	long account;
	int yourMoney;
	int mm;
	static String yourName;
	static String yourId;
	static String yourPw;
	
	//������
	public Member() {}
	public Member(String name, String id, String password, String phone) {
		this.name = name;
		this.id = id;
		this.password = password;
		this.phone = phone;
	}
	public Member(String name, String id, String password, String phone,long account) {
		this.name = name;
		this.id = id;
		this.password = password;
		this.phone = phone;
		this.account = account;
	}
	public Member(String name, String id, String password, String phone,long account,int yourMoney) {
		this.name = name;
		this.id = id;
		this.password = password;
		this.phone = phone;
		this.account = account;
		this.yourMoney = yourMoney;
	}
	
	
	//�޼ҵ�
		//getter setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
		//ȸ������
	public boolean addMember() {
		System.out.print("���̵� �Է�: ");
		String id = Day08_5.sc.next();
			//�ߺ�Ȯ��
		
		System.out.print("��й�ȣ �Է�: ");
		String password = Day08_5.sc.next();
		System.out.print("�̸� �Է�: ");
		String name = Day08_5.sc.next();
		System.out.print("�޴�����ȣ �Է�: ");
		String phone = Day08_5.sc.next();
		
		Member member = new Member(name,id,password,phone);

		
		int i = 0;
		for(Member temp : Day08_5.members) {
			if(temp==null) {
				Day08_5.members[i]=member;
				return true;
			}
			i++;
		}
	return false;
	}
	
		//�α���
	public boolean login() {
		System.out.print("���̵� �Է�: ");
		String id = Day08_5.sc.next();
		yourId = id;
		System.out.print("��й�ȣ �Է�: ");
		String password = Day08_5.sc.next();
		yourPw = password;
		for(Member temp : Day08_5.members) {
			if(temp!=null && temp.id.equals(id) && temp.password.equals(password)) {
				System.out.println(temp.name+"�α��� ����,,,!");
				yourName = temp.name;
				return true;
			}
		}
		return false;
	}
	
	//���̵�ã��
	public void idCheck() {
		System.out.print("�̸� �Է�: ");
		String name = Day08_5.sc.next();
		System.out.print("��й�ȣ �Է�: ");
		String password = Day08_5.sc.next();
		System.out.print("�޴��� ��ȣ �Է�: ");
		String phone = Day08_5.sc.next();
		for(Member temp : Day08_5.members) {
			if(temp!=null && temp.name.equals(name) && temp.password.equals(password) && temp.phone.equals(phone)) {
				System.out.println("����� ���̵��,,,,"+temp.id+",,,�Դϴ�.");
			}
		}
	}
	
	//���ã��
	public void pwCheck() {
		System.out.print("�̸� �Է�: ");
		String name = Day08_5.sc.next();
		System.out.print("���̵� �Է�: ");
		String id = Day08_5.sc.next();
		System.out.print("�޴��� ��ȣ �Է�: ");
		String phone = Day08_5.sc.next();
		for(Member temp : Day08_5.members) {
			if(temp!=null && temp.name.equals(name) && temp.id.equals(id) && temp.phone.equals(phone)) {
				System.out.println("����� ��й�ȣ��,,,,"+temp.password+",,,�Դϴ�.");
			}
		}
	}
	
	public void addAccount(long abc) {
		for(Member temp : Day08_5.members) {
			if(temp!=null && temp.id.equals(yourId) && temp.password.equals(yourPw)) {
				temp.account = abc;
				System.out.println("����� ���¹�ȣ,,,"+abc);
			}
		}
	}
	
	public void money(int balance1) {		
		for(Member temp : Day08_5.members) {
			if(temp!=null && temp.id.equals(yourId) && temp.password.equals(yourPw)) {
				temp.yourMoney = balance1;
			}
		}
	}
	
	public int getMonney() {
		for(Member temp : Day08_5.members) {
			if(temp!=null && temp.id.equals(yourId) && temp.password.equals(yourPw)) {
				System.out.println("���� �ܱ� : "+temp.yourMoney);
				mm=temp.yourMoney;
			}
		}
		return mm;
	}
	
}
