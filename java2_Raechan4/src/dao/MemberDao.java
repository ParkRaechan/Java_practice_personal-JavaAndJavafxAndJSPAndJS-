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
			System.out.println("DB��������");
		}catch(Exception e) {
			System.out.println("DB��������");
			
		}
		
	}
	
	public boolean idcheck(String id) {
		try {
			// 1. SQL �ۼ�
				// �˻� : select * from ���̺�� where ����( �ʵ��=�� )
			String sql = "select * from member where mid=?";
			// 2. SQL ���� 
			ps = con.prepareStatement(sql);
			ps.setString(1, id);
			// 3. SQL ���� 
			rs = ps.executeQuery(); // select ���� -> �˻��� ����� ���� -> resultset O
			// resultset ó�� �⺻ ���� : null ---next()---> ��� ���ڵ�
			// 4. SQL ���
			if( rs.next() ){ // ���࿡ ���� ������� �����ϸ� => �ش� ���̵� ���� -> �ߺ�O 
				return true; // �ش� ���̵�� �ߺ��� ����
			}
		}catch(Exception e ) { System.out.println( "[SQL ����]"+e  ); }
		return false; // �ش� ���̵�� �ߺ��� ���� 
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
		ps.executeUpdate(); // insert ����

		return true;
		}catch (Exception e) {
		System.out.println("����"+e);
		return false;
		}
		
	}
	// 2. �α��� �޼ҵ� ( �μ� : �α��ν� �ʿ��� ���̵�,��й�ȣ )
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
			System.out.println("����" +e);
		}
		
		
		return false;}
		// 3. ���̵�ã�� �޼ҵ� ( �μ� : ���̵�ã�� �� �ʿ��� �̸��� )
	public String findid( String email ) {try {
		// 1. SQL �ۼ�
		String sql = "select * from member where memail=?";
		// 2. SQL ����
		ps = con.prepareStatement(sql);
		ps.setString( 1 , email );
		// 3. SQL ���� 
		rs =  ps.executeQuery(); // select ���๮ -> rs  
		// 4. SQL ���
		if( rs.next() ) { // ���� ����� ���� ���ڵ�(����) �������� 
			return rs.getString(2); // �ʵ�(����) ��ȣ 
			//rs.getString(�������ʵ������ȣ);
		}
	}catch(Exception e ) { System.out.println( "[SQL ����]"+e  ); }
	return null;}
		// 4. ��й�ȣã�� �޼ҵ� ( �μ� : ��й�ȣã�� �� �ʿ��� ���̵�, �̸��� )
	public String findpassword( String id , String email ) {try {
		// 1. SQL �ۼ�
		String sql = "select * from member where mid=? and memail=?";
		// 2. SQL ����
		ps = con.prepareStatement(sql);
		ps.setString(1, id );	ps.setString(2, email );
		// 3. SQL ����
		rs = ps.executeQuery();
		// 4. SQL ���
		if( rs.next() ) {
			return rs.getString(3); // �н������ db���̺� 3��° �ʵ� �̹Ƿ� 3 
		}
	}catch(Exception e ) { System.out.println( "[SQL ����]"+e  ); }
	return null;}
	
	
	// 5. ���̵� �μ� �� ȸ������ ȣ�� 
		public Member getmember( String id ) {
			try {
			// 1. SQL �ۼ�
				String sql = "select * from member where mid=?";
			// 2. SQL ����
				ps = con.prepareStatement(sql);
				ps.setString( 1 , id);
			// 3. SQL ����
				rs = ps.executeQuery();
			// 4. SQL ���
				if( rs.next() ) {
					// 1. ��ü ����
					Member member = new Member(
							rs.getInt(1) ,
							rs.getString(2),
							rs.getString(3),
							rs.getString(4), 
							rs.getString(5), 
							rs.getInt(6), 
							rs.getString(7) );
					// rs.next() : ����� ���� ���ڵ�(��,����)
					// rs.getInt( �ʵ������ȣ ) : �ش� �ʵ��� �ڷ����� ���������� ��������
					// rs.getString( �ʵ������ȣ ) : �ش� �ʵ��� �ڷ����� ���ڿ��� ��������
					// 2. ��ȯ
					return member;
				}
			}catch(Exception e ) { System.out.println( "[SQL ����]"+e  ); } 
			return null;
		}
	
		// 6. ȸ��Ż�� [ ȸ����ȣ�� �μ��� �޾� �ش� ȸ����ȣ�� ���ڵ� ���� ]
		public boolean delete( int mnum ) {
			try {
					// ���ڵ���� : delete from ���̺�� where ���� 
				String sql = "delete from member where mnum = ?"; // 1.SQL �ۼ�
				ps = con.prepareStatement(sql); // 2.SQL ����
				ps.setInt(1, mnum);
				ps.executeUpdate(); // insert , update , delete ���� // 3.SQL ����
				return true; // 4.SQL ���
				
			}catch(Exception e ) { System.out.println( "[SQL ����]"+e  ); }
			return false;
		}
		
		
		//7.ȸ����������
		public boolean update(int mnum ,String email,String address) {
			try {
				String sql = "update member set memail=?, maddress=? where mnum=?";
				ps = con.prepareStatement(sql); // 2.SQL ����
				ps.setString(1, email);
				ps.setString(2, address);
				ps.setInt(3, mnum);
				ps.executeUpdate(); // insert , update , delete ���� // 3.SQL ����
				return true; // 4.SQL ���
				
			}catch (Exception e) {

				return false;
			
			}
			
			
		}
		// 8. �ش� ȸ����ȣ�� �ش� id ã��
		public String getmid( int mnum ) {
			try {
				String sql ="select mid from member where mnum = ?";
				ps = con.prepareStatement(sql);
				ps.setInt(1, mnum);
				rs = ps.executeQuery();
				if( rs.next() ) {
					return rs.getString(1);// ã�� id ��ȯ
				}
			}catch(Exception e ) { System.out.println( "[SQL ����]"+e  ); }
			return null;
		}
		
		
		//�μ���������ü�� ��ȯ
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
		
		// 10. ( �μ� : ���̺�� , ��¥�ʵ�� )�� ��¥�� ���ڵ� ��ü ���� ��ȯ
		public Map<String, Integer> datetotal( String ���̺�� , String ��¥�ʵ�� ){
			Map<String, Integer> map  = new TreeMap<>();
			
			String sql = "select substring_index( "+��¥�ʵ��+" , ' ' , 1 )  , count(*)"
						+ " from "+���̺��
						+ " group by substring_index( "+��¥�ʵ��+" , ' ' , 1 )";
			try {
				ps = con.prepareStatement(sql);
				rs = ps.executeQuery();
				while( rs.next() ) {
					map.put( rs.getString(1) , rs.getInt(2) );
					// ����� �ش� ���ڵ��� ù��°�ʵ�[��¥]   , �ι�° �ʵ�[�����ڼ�] 
				}
				return map;
			}catch( Exception e ) {} return null;
		}
		
}
