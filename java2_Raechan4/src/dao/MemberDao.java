package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import dto.Member;

public class MemberDao {
	
	private Connection con;
	private PreparedStatement ps;
	private ResultSet rs;
	
	public static MemberDao memberDao= new MemberDao();
	
	public MemberDao() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/javafx?serverTimezone=UTC" , 
					"root",
					"1234");
			System.out.println("DB연동성공");
		}catch(Exception e) {
			System.out.println("DB연동실패");
			
		}
		
	}
	
	public boolean idcheck(String id) {
		try {
			// 1. SQL 작성
				// 검색 : select * from 테이블명 where 조건( 필드명=값 )
			String sql = "select * from member where mid=?";
			// 2. SQL 조작 
			ps = con.prepareStatement(sql);
			ps.setString(1, id);
			// 3. SQL 실행 
			rs = ps.executeQuery(); // select 실행 -> 검색은 결과물 존재 -> resultset O
			// resultset 처음 기본 값은 : null ---next()---> 결과 레코드
			// 4. SQL 결과
			if( rs.next() ){ // 만약에 다음 결과물이 존재하면 => 해당 아이디가 존재 -> 중복O 
				return true; // 해당 아이디는 중복이 존재
			}
		}catch(Exception e ) { System.out.println( "[SQL 오류]"+e  ); }
		return false; // 해당 아이디는 중복이 없음 
	}
	public boolean signup(Member member) {
		
		try{
		String sql = "insert into member(mid,mpassword,memail,maddress,mpoint,mcince)values(?,?,?,?,?,?)"; 
		ps = con.prepareStatement(sql);
		ps.setString(1, member.getMid());
		ps.setString(2, member.getMpassword());
		ps.setString(3, member.getMemail());
		ps.setString(4, member.getMaddress());
		ps.setInt(5, member.getMpoint());
		ps.setString(6, member.getMcince());
		ps.executeUpdate(); // insert 실행

		return true;
		}catch (Exception e) {
		System.out.println("에러"+e);
		return false;
		}
		
	}
	// 2. 로그인 메소드 ( 인수 : 로그인시 필요한 아이디,비밀번호 )
	public boolean login( String id , String password ) {
		try {
		
		//1.
		String sql = "select * from member where mid=? and mpassword=?";
		//2.
		ps = con.prepareStatement(sql);
		ps.setString(1, id);
		ps.setString(2, password);
		//3.
		rs = ps.executeQuery();
		//4.
		if(rs.next()) {
			return true;
		}
		
		
		}catch (Exception e) {
			System.out.println("오류" +e);
		}
		
		
		return false;}
		// 3. 아이디찾기 메소드 ( 인수 : 아이디찾기 시 필요한 이메일 )
	public String findid( String email ) {try {
		// 1. SQL 작성
		String sql = "select * from member where memail=?";
		// 2. SQL 조작
		ps = con.prepareStatement(sql);
		ps.setString( 1 , email );
		// 3. SQL 실행 
		rs =  ps.executeQuery(); // select 실행문 -> rs  
		// 4. SQL 결과
		if( rs.next() ) { // 실행 결과의 다음 레코드(가로) 가져오기 
			return rs.getString(2); // 필드(세로) 번호 
			//rs.getString(가져올필드순서번호);
		}
	}catch(Exception e ) { System.out.println( "[SQL 오류]"+e  ); }
	return null;}
		// 4. 비밀번호찾기 메소드 ( 인수 : 비밀번호찾기 시 필요한 아이디, 이메일 )
	public String findpassword( String id , String email ) {try {
		// 1. SQL 작성
		String sql = "select * from member where mid=? and memail=?";
		// 2. SQL 조작
		ps = con.prepareStatement(sql);
		ps.setString(1, id );	ps.setString(2, email );
		// 3. SQL 실행
		rs = ps.executeQuery();
		// 4. SQL 결과
		if( rs.next() ) {
			return rs.getString(3); // 패스워드는 db테이블내 3번째 필드 이므로 3 
		}
	}catch(Exception e ) { System.out.println( "[SQL 오류]"+e  ); }
	return null;}
	
	
	// 5. 아이디 인수 로 회원정보 호출 
		public Member getmember( String id ) {
			try {
			// 1. SQL 작성
				String sql = "select * from member where mid=?";
			// 2. SQL 조작
				ps = con.prepareStatement(sql);
				ps.setString( 1 , id);
			// 3. SQL 실행
				rs = ps.executeQuery();
			// 4. SQL 결과
				if( rs.next() ) {
					// 1. 객체 선언
					Member member = new Member(
							rs.getInt(1) ,
							rs.getString(2),
							rs.getString(3),
							rs.getString(4), 
							rs.getString(5), 
							rs.getInt(6), 
							rs.getString(7) );
					// rs.next() : 결과내 다음 레코드(줄,가로)
					// rs.getInt( 필드순서번호 ) : 해당 필드의 자료형이 정수형으로 가져오기
					// rs.getString( 필드순서번호 ) : 해당 필드의 자료형이 문자열로 가져오기
					// 2. 반환
					return member;
				}
			}catch(Exception e ) { System.out.println( "[SQL 오류]"+e  ); } 
			return null;
		}
	
		// 6. 회원탈퇴 [ 회원번호를 인수로 받아 해당 회원번호의 레코드 삭제 ]
		public boolean delete( int mnum ) {
			try {
					// 레코드삭제 : delete from 테이블명 where 조건 
				String sql = "delete from member where mnum = ?"; // 1.SQL 작성
				ps = con.prepareStatement(sql); // 2.SQL 조작
				ps.setInt(1, mnum);
				ps.executeUpdate(); // insert , update , delete 실행 // 3.SQL 실행
				return true; // 4.SQL 결과
				
			}catch(Exception e ) { System.out.println( "[SQL 오류]"+e  ); }
			return false;
		}
		
		
		//7.회원정보수정
		public boolean update(int mnum ,String email,String address) {
			try {
				String sql = "update member set memail=?, maddress=? where mnum=?";
				ps = con.prepareStatement(sql); // 2.SQL 조작
				ps.setString(1, email);
				ps.setString(2, address);
				ps.setInt(3, mnum);
				ps.executeUpdate(); // insert , update , delete 실행 // 3.SQL 실행
				return true; // 4.SQL 결과
				
			}catch (Exception e) {

				return false;
			
			}
			
			
		}
		// 8. 해당 회원번호로 해당 id 찾기
		public String getmid( int mnum ) {
			try {
				String sql ="select mid from member where mnum = ?";
				ps = con.prepareStatement(sql);
				ps.setInt(1, mnum);
				rs = ps.executeQuery();
				if( rs.next() ) {
					return rs.getString(1);// 찾은 id 반환
				}
			}catch(Exception e ) { System.out.println( "[SQL 오류]"+e  ); }
			return null;
		}
		
		
		//인수에따른전체수 반환
		public int counttotal(String tname) {
			
			String sql = "select count(*) from "+ tname;
			try {
				ps = con.prepareStatement(sql);
				rs = ps.executeQuery();
				if(rs.next()) {
					return rs.getInt(1);
				}
				
				
				
			}catch (Exception e) {}
			
			return 0;
			
		}
		
		// 10. ( 인수 : 테이블명 , 날짜필드명 )의 날짜별 레코드 전체 개수 반환
		public Map<String, Integer> datetotal( String 테이블명 , String 날짜필드명 ){
			Map<String, Integer> map  = new TreeMap<>();
			
			String sql = "select substring_index( "+날짜필드명+" , ' ' , 1 )  , count(*)"
						+ " from "+테이블명
						+ " group by substring_index( "+날짜필드명+" , ' ' , 1 )";
			try {
				ps = con.prepareStatement(sql);
				rs = ps.executeQuery();
				while( rs.next() ) {
					map.put( rs.getString(1) , rs.getInt(2) );
					// 결과의 해당 레코드의 첫번째필드[날짜]   , 두번째 필드[가입자수] 
				}
				return map;
			}catch( Exception e ) {} return null;
		}
		
}
