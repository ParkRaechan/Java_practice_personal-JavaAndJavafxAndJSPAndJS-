package Day08.gg;

public class Member {
	//필드
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
	
	//생성자
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
	
	
	//메소드
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
	
		//회원가입
	public boolean addMember() {
		System.out.print("아이디 입력: ");
		String id = Day08_5.sc.next();
			//중복확인
		
		System.out.print("비밀번호 입력: ");
		String password = Day08_5.sc.next();
		System.out.print("이름 입력: ");
		String name = Day08_5.sc.next();
		System.out.print("휴대폰번호 입력: ");
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
	
		//로그인
	public boolean login() {
		System.out.print("아이디 입력: ");
		String id = Day08_5.sc.next();
		yourId = id;
		System.out.print("비밀번호 입력: ");
		String password = Day08_5.sc.next();
		yourPw = password;
		for(Member temp : Day08_5.members) {
			if(temp!=null && temp.id.equals(id) && temp.password.equals(password)) {
				System.out.println(temp.name+"로그인 성공,,,!");
				yourName = temp.name;
				return true;
			}
		}
		return false;
	}
	
	//아이디찾기
	public void idCheck() {
		System.out.print("이름 입력: ");
		String name = Day08_5.sc.next();
		System.out.print("비밀번호 입력: ");
		String password = Day08_5.sc.next();
		System.out.print("휴대폰 번호 입력: ");
		String phone = Day08_5.sc.next();
		for(Member temp : Day08_5.members) {
			if(temp!=null && temp.name.equals(name) && temp.password.equals(password) && temp.phone.equals(phone)) {
				System.out.println("당신의 아이디는,,,,"+temp.id+",,,입니다.");
			}
		}
	}
	
	//비번찾기
	public void pwCheck() {
		System.out.print("이름 입력: ");
		String name = Day08_5.sc.next();
		System.out.print("아이디 입력: ");
		String id = Day08_5.sc.next();
		System.out.print("휴대폰 번호 입력: ");
		String phone = Day08_5.sc.next();
		for(Member temp : Day08_5.members) {
			if(temp!=null && temp.name.equals(name) && temp.id.equals(id) && temp.phone.equals(phone)) {
				System.out.println("당신의 비밀번호는,,,,"+temp.password+",,,입니다.");
			}
		}
	}
	
	public void addAccount(long abc) {
		for(Member temp : Day08_5.members) {
			if(temp!=null && temp.id.equals(yourId) && temp.password.equals(yourPw)) {
				temp.account = abc;
				System.out.println("당신의 계좌번호,,,"+abc);
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
				System.out.println("계좌 잔금 : "+temp.yourMoney);
				mm=temp.yourMoney;
			}
		}
		return mm;
	}
	
}
