package Day06;

public class Board {
	
	//1.필드
	String title;
	String content;
	String writer;
	String password;
	
	//2.생성자
		//1.빈생성자
	Board(){
		
	}
		//2.1개 필드 생성자
	Board(String title) {
		this.title = title;
	}
		//2.2개 필드 생성자
	Board(String title,String content){
		this.title = title;
		this.content = title;
	}
	

	//2.3개 필드 생성자
	Board(String title,String content,String writer){
		this.title = title;
		this.content = content;
		this.writer = writer;
	}
		//2.4개 필드 생성자
	Board(String title,String content,String writer,String password){
		this.title = title;
		this.content = title;
		this.writer = writer;
		this.password = password;
	}
	//3.메소드
	
}
