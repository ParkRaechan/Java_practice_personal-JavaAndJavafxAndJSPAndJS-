
package Day05; // 패키지명  

import java.util.Iterator;
import java.util.Scanner;

public class Day05_2 {// c s
	// 회원제 방문록 프로그램 [ 2차원배열 ] 
	// 1. 초기메뉴 [ 1. 회원가입 2.로그인 ] 
		// 1. 회원가입 [ 아이디 , 비밀번호 , 이름 ]
		// 2. 로그인 [ 아이디 , 비밀번호 동일하면 로그인처리 ]
	// 2. 로그인시 메뉴 [ 1. 방문록쓰기 2. 로그아웃 ]
		// 1. 방문록쓰기 [ 제목 , 내용 , 작성자(로그인된아이디) ]
		// 2. 로그아웃 [ 초기메뉴로 돌아가기 ]
	public static void main(String args[]) {// m s
	
		//준비
		Scanner scanner = new Scanner(System.in);
		//회원100명 [id,pw,name]저장 배열
		String[][] memberList = new String[100][3]; //100행 3열 => 회원당 1명 [1열=id][2열=pw][3열=이름]
		//방문록100개 [title,contents,writer]저장배열
		String[][] boardList = new String[100][3];
		
		while(true) {//무한루프 [종료조건 : x]
			System.out.println("----------회원제 방문록----------");
			System.out.println("-----------------------------");
			System.out.println("1.회원가입 2.로그인 선택 :");
			int ch = scanner.nextInt();
			
			if(ch==1) {
				System.out.println("-----------회원가입 페이지-----------");
				System.out.print(" MEMBER ID : ");
				String id =scanner.next();
				System.out.print(" MEMBER PASSWORD : ");
				String pw =scanner.next();
				System.out.print(" MEMBER NAME : ");
				String name =scanner.next();
				// String 3개 변수를 입력받아 memberlist 2차원 배열에 저장 
				// 1. 빈 공간[ 정수=0 , 객체(문자열) = null  ]을 찾아서 저장 [ 만약에 빈공간이 없으면 회원 100명 초과 ]
				// 2. 아이디 중복체크 
				
				
				//아이디 중복체크
				boolean idCheck = true;
				for(int i=0;i<memberList.length;i++) {
					if(memberList[i][0]!=null&&memberList[i][0].equals(id)){
						System.err.println("알림)) 동일한 아이디 존재");
						idCheck = false; //저장x
						break;
					}
				}
				
				// 저장부분
				if(idCheck) {
					for(int i=0; i<memberList.length; i++) {
						if(memberList[i][0]==null) {
							memberList[i][0] =id;
							memberList[i][1] =pw;
							memberList[i][2] =name;		
							System.err.println("알림)) 회원가입 완료");
							break;
						}
					}
				}
			}
				else if(ch==2) {
					System.out.println("-----------로그인 페이지-----------");
					System.out.print(" MEMBER ID : ");
					String id =scanner.next();
					System.out.print(" MEMBER PASSWORD : ");
					String pw =scanner.next();
				
					
					boolean loginCheck = false;
					// 배열내 데이터가 입력받은 id와 password가 동일하면 로그인처리
					for(int i=0;i<memberList.length;i++) {
						if(memberList[i][0]!=null && memberList[i][0].equals( id ) &&
								memberList[i][1].equals(pw)) {
							System.err.println(" 알림]] 로그인 성공 ");
							loginCheck = true;
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////
							//방문록 작성후 로그아웃 방지
							while(true) {
								
								
								
							System.out.println("-----------------------------");
							System.out.println("-------------방문록------------");
							System.out.println("번호\t작성자\t제목\t내용");
							
							//모든 방문록 출력
							for(int j=0;j<boardList.length;j++) {
								if(boardList[j][0]!=null)
								System.out.printf("%d\t%s\t%s\t%s \n",
										j,
										boardList[j][2],
										boardList[j][0],
										boardList[j][1]);
							}
							
							System.out.println("1.방문록남기기 2.로그아웃 선택 : ");
							int ch2 = scanner.nextInt();
							if(ch2==1) {
								System.out.println("-------------글쓰기-------------");
								System.out.println(" title : ");
								String title = scanner.next();
								System.out.println(" content : ");
								String content = scanner.next();
								//저장
								for(int j = 0; j<boardList.length;j++) {
									if( boardList[j][0] == null) {
										boardList[j][0] = title;
										boardList[j][1] = content;
										boardList[j][2] = id;
										break;
									}//if e
								}//for e
							}//if e
							else if(ch2==2) {
								System.err.println("알림)) 로그아웃");
								break;
							}//elseif e
							else {
								System.err.println("알림)) 알 수 없는 입력");
							}//else e//회원메뉴 e
							
							
							
							}
////////////////////////////////////////////////////////////////////////////////////////////////
						}//if e
					}//for e
					
					if(loginCheck==false) {
						System.err.println("알림)) 회원정보가 없거나 다릅니다.");
					}//if e
					
				}//elseif e
				else {
				System.err.println("알림)) 알 수 없는 입력입니다.");
				}

		}//while e
		
	}// m e
	
}// c e