package Day06;

public class Board {
	
	//1.�ʵ�
	String title;
	String content;
	String writer;
	String password;
	
	//2.������
		//1.�������
	Board(){
		
	}
		//2.1�� �ʵ� ������
	Board(String title) {
		this.title = title;
	}
		//2.2�� �ʵ� ������
	Board(String title,String content){
		this.title = title;
		this.content = title;
	}
	

	//2.3�� �ʵ� ������
	Board(String title,String content,String writer){
		this.title = title;
		this.content = content;
		this.writer = writer;
	}
		//2.4�� �ʵ� ������
	Board(String title,String content,String writer,String password){
		this.title = title;
		this.content = title;
		this.writer = writer;
		this.password = password;
	}
	//3.�޼ҵ�
	
}
