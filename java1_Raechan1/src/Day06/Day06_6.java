package Day06;

import java.util.Scanner;

public class Day06_6 {//c s
	// 비회원제 게시판 [ 클래스 버전 ]
		// 0. 게시물 설계 => 클래스 선언 
			// 필드 : 제목 , 내용 , 작성자 , 비밀번호
			// 생성자 : 사용유무 선택
		// 1. 첫화면 [ 모든 게시물(번호,작성자,제목) 출력 ]
		// 2. 메뉴 [ 1. 글쓰기 2.글보기 ]
			// 1. 글쓰기 [ 제목 , 내용 , 작성자 , 비밀번호 => 4개변수 -> 객체화 ]
			// 2. 글보기 [ 해당 글번호의 입력받아 해당 글 상세페이지(번호,작성자,제목,내용) 표시 ]
				// 글번호는 배열에 저장되는 순서 [ 인덱스 ]
				// 글보기 메뉴 
		// 3. 글보기 메뉴 [ 1. 목록보기 2.삭제 3.수정 ]
			// 1. 삭제시 : 작성자와 비밀번호 입력받아 동일하면 삭제
			// 2. 수정시 : 작성자와 비밀번호 입력받아 동일하면 제목과 내용만 수정 
	
	public static void main(String[] args) {//m s
		// 준비 [ 모든 {} 안에서 사용되는 변수 선언 ]
		Scanner scanner = new Scanner(System.in);
		Board[] boardList = new Board[100];
		
		//프로그램 실행
		while(true) {//[종료조건없음]
			System.out.println("----------커뮤니티----------");
//////////////////////////////모든 게시물 조회///////////////////////
			System.out.println("번호\t작성자\t제목");
			//배열내 모든 객체를 출력하는 반복문
			int index =0;
			for(Board board : boardList) {
				if(board != null) {
					System.out.printf("%d\t%s\t%s\n",index,board.writer,board.title);	
				}
				index++;
			}
////////////////////////////////////////////////////////////////
			System.out.println("1.글쓰기 2.글보기");
			int ch = scanner.nextInt();
			if(ch==1) {// 1. 글쓰기 
/////////////////////////글쓰기코드////////////////////////////////
				//1.4개변수입력받음
				System.out.println("----------------- 글 쓰기 페이지 ----------------");
				System.out.println("title : "); String title = scanner.next();
				System.out.println("content : "); String content = scanner.next();
				System.out.println("writer : "); String writer = scanner.next();
				System.out.println("password : "); String password = scanner.next();
				//2.4개변수객체화[ 객체를 만들어서 4개변수를 객체내 필드에 저장 ]
				Board board = new Board(title, content, writer, password);
							//4개필드르 갖는 생성자 사용
				//3.배열내 빈공간을 찾아서 빈공간에 객체 대입
				int i = 0;
				for(Board temp : boardList) {
					if(temp==null) {
						boardList[i] = board;
						break;
					}
					i++;
				}
/////////////////////////////////////////////////////////////////
			}
			else if(ch==2) {//2.글보기
				System.out.println("게시물 번호(인덱스) 선택"); int bno = scanner.nextInt();
				System.out.printf("작성자: %s  제목 : %s \n"
						,boardList[bno].writer,boardList[bno].title);
				System.out.printf("내용: %s \n "
						,boardList[bno].content);
				System.out.println("---------------------------------");
				System.out.println("1.목로보기(뒤로가기) 2.글삭제 3.글수정");
				int ch2 = scanner.nextInt();
				if(ch2==1) {
					
				}
				else if(ch2==2) {
					
					System.out.println("현 게시물 비밀번호 : "); String password = scanner.next();
					//반복문X
					if(boardList[bno].password.equals(password)) {
						System.out.println("삭제됨");
						boardList[bno] = null;
					}
					else {
						System.out.println("비번이 다름");
					}
					//삭제후 삭제된 인덱스뒤러 한칸씩 앞으로 이동
						//왜??? 만약에 해당코드가 없을경우 배열내 사이사이 공백 발
					for( int i = bno ; i< boardList.length ; i++ ) {
						// * 검색된 게시물의 인덱스부터 마지막인덱스까지 1씩증가 
						
						if( i == boardList.length-1) boardList[ boardList.length-1 ] = null;
						// i가 마지막인덱스 와 같으면 마지막인덱스에는 null 대입
						else boardList[i] = boardList[i+1];// 삭제된 게시물 다음 게시물
						// 마지막 인덱스가 아니면 인덱스 당기기 
						
							// *  	만약에 2번 인덱스 삭제시 
							// 		2인덱스 = 3인덱스 
							//	  	3인덱스 = 4인덱스 
							//		4인덱스 = 5인덱스 
							//      ~~~~~~~~~~~
							//		98인덱스 = 99인덱스 [ 0번~99번 -> 100개 인덱스 ]
							//		99인덱스 = null [ 99번 인덱스 : 마지막인덱스 ] 
					
					}
				}
				else if(ch2==3) {
					System.out.println("----------------- 글 수정 페이지 ----------------");
					System.out.println("title : "); String title = scanner.next();
					System.out.println("content : "); String content = scanner.next();
					System.out.println("writer : "); String writer = scanner.next();
					System.out.println("password : "); String password = scanner.next();
					Board board = new Board(title, content, writer, password);
					boardList[bno] = board;
				}
				
			}
			else {
				System.err.println("알림)) 알 수 없는 번호");
			}
		}// 프로그램 while end  
	}// m e 
}// c e
