package application.Day22;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class Day22_2 {
	
	
	//1.필드
		private Connection connection;
	//2.생성자
		public Day22_2() {
			
			try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			connection = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/javafx?serverTimezone=UTC" , 
					"root",
					"1234");
					
			System.out.println("DB연동성공");
			}catch(Exception e) {
				System.out.println("DB연동실패");
			}
			
		}
	//3.메소드
	public boolean write(String 작성자, String 내용) {
		
		try {
		//1.SQL작성
			//db내 테이블에 데이터 저장 insert into 테이블명(필드명1,필드명2) values(필드명1의값, 필드명2의값)
		String sql = "insert into test(writer,content) values(?,?)"; 
		
		//2.SQL실행[연결된SQL설정]
		PreparedStatement ps = connection.prepareStatement(sql);
		ps.setString(1, 작성자);//[1:첫번쨰?]
		ps.setString(2, 내용); //	[2:두번째?]
		//3.SQL실행
		ps.executeUpdate();
		return true;
		
		
		
		}catch(Exception e) {
			System.out.println("[sql 연결 실ㅎ패 사유 : ] "+e);
			
		}
		
		return false;
	}
	
	
	public ArrayList<데이터> get(){
		
		ArrayList<데이터> 데이터목록 = new ArrayList<>();
		try {
			String sql = "select * from test";
			
			PreparedStatement ps = connection.prepareStatement(sql);
			
			ResultSet rs = ps.executeQuery();
			
			while( rs.next() ){
				데이터 temp = new 데이터(
				
				rs.getInt(1),
				rs.getString(2),
				rs.getString(3)
				
						);
				데이터목록.add(temp);
				
			}
			
			return 데이터목록;
			
		}catch(Exception e) {
			System.out.println("[sql 연결 실ㅎ패 사유 : ] "+e);
			
		}
		return null;
		
		
		
	}
	
}
