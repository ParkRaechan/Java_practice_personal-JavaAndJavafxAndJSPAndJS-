package application.Day22;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class Day22_2 {
	
	
	//1.�ʵ�
		private Connection connection;
	//2.������
		public Day22_2() {
			
			try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			connection = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/javafx?serverTimezone=UTC" , 
					"root",
					"1234");
					
			System.out.println("DB��������");
			}catch(Exception e) {
				System.out.println("DB��������");
			}
			
		}
	//3.�޼ҵ�
	public boolean write(String �ۼ���, String ����) {
		
		try {
		//1.SQL�ۼ�
			//db�� ���̺� ������ ���� insert into ���̺��(�ʵ��1,�ʵ��2) values(�ʵ��1�ǰ�, �ʵ��2�ǰ�)
		String sql = "insert into test(writer,content) values(?,?)"; 
		
		//2.SQL����[�����SQL����]
		PreparedStatement ps = connection.prepareStatement(sql);
		ps.setString(1, �ۼ���);//[1:ù����?]
		ps.setString(2, ����); //	[2:�ι�°?]
		//3.SQL����
		ps.executeUpdate();
		return true;
		
		
		
		}catch(Exception e) {
			System.out.println("[sql ���� �Ǥ��� ���� : ] "+e);
			
		}
		
		return false;
	}
	
	
	public ArrayList<������> get(){
		
		ArrayList<������> �����͸�� = new ArrayList<>();
		try {
			String sql = "select * from test";
			
			PreparedStatement ps = connection.prepareStatement(sql);
			
			ResultSet rs = ps.executeQuery();
			
			while( rs.next() ){
				������ temp = new ������(
				
				rs.getInt(1),
				rs.getString(2),
				rs.getString(3)
				
						);
				�����͸��.add(temp);
				
			}
			
			return �����͸��;
			
		}catch(Exception e) {
			System.out.println("[sql ���� �Ǥ��� ���� : ] "+e);
			
		}
		return null;
		
		
		
	}
	
}
