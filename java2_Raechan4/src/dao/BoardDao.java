package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import dto.Board;
import dto.Reply;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class BoardDao {

	public Connection conn;
	private PreparedStatement ps;
	private ResultSet rs;
	
	public static BoardDao boardDao = new BoardDao();
	
	public BoardDao() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/javafx?serverTimezone=UTC",
					"root","1234");
			
		}catch (Exception e) {System.out.println( "[DB ���� ����]"+e  );}
		
	}
	
	
	//1.�۾��� �޼ҵ�
	public boolean write(Board board) { String sql = "insert into board(btitle,bcontent,bwrite) values(?,?,?)";
	try {
		ps = conn.prepareStatement(sql);
		ps.setString(1, board.getBtitle());
		ps.setString(2, board.getBcontent());
		ps.setString(3, board.getBwrite());
		
		ps.executeUpdate();
		return true;
	
	}catch (Exception e) {
		return false;
	} }
	//2.��� �� ȣ�� �޼ҵ�
	public ObservableList<Board> list() {
		
		ObservableList<Board> boardList = FXCollections.observableArrayList();
		try {
		
		//1.sql�ۼ�
			String sql = "select * from board order by bnum";
		
		//2.sql����
			ps = conn.prepareStatement(sql);
		
		//3.sql����
			rs = ps.executeQuery();
		
		//4.sql���
			while(rs.next()) {
				Board board = new Board(rs.getInt(1),
						rs.getString(2),
						rs.getString(3),
						rs.getString(4),
						rs.getString(5),
						rs.getInt(6));
				
			boardList.add(board);
			
			}
		
			return boardList;
		}catch (Exception e) {

		}
		
		
		return null;
	}
	//3.�� ���� �޼ҵ�
	public boolean delete(int bnum) {
		try {
			String sql = "delete from board where bnum=?";
			ps = conn.prepareStatement(sql);
			ps.setInt(1, bnum);
			ps.executeUpdate();
			return true;
			
		}catch (Exception e) {
			System.out.println("��������");
			return false;
		}
	}
	
	
	//4.�� ���� �޼ҵ�
	public boolean update(int bnum, String title, String content) {
		
		try {
			
			String sql = "update board set btitle=?, bcontent=? where bnum=?";
			ps = conn.prepareStatement(sql);
			ps.setString(1,title);
			ps.setString(2,content);
			ps.setInt(3,bnum);
			ps.executeUpdate();
			return true;
			
			
		}catch (Exception e) {
		System.out.println("����"+e);
		return false;
		}
		
	}
	
	
	//5.����ۼ��޼ҵ�[����Խù���ȣ�߿�]
	public boolean rwrite(Reply reply) {
	
		try {
			String sql = "insert into reply(rcontent,rwrite,bnum)values(?,?,?)";
			ps = conn.prepareStatement(sql);
			ps.setString(1,reply.getRcontent());
			ps.setString(2,reply.getRwrite());
			ps.setInt(3,reply.getBnum());
			ps.executeUpdate();
			return true;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}
	
	
	//6.���ȣ��޼ҵ�
	
	public ObservableList<Reply> replylist(int bnum){
		

		ObservableList<Reply> replylist = FXCollections.observableArrayList();
		try {
		
		//1.sql�ۼ�
			String sql = "select * from Reply where bnum=?";
		
		//2.sql����
			ps = conn.prepareStatement(sql);
			ps.setInt(1, bnum);
		//3.sql����
			rs = ps.executeQuery();
		
		//4.sql���
			while(rs.next()) {
				Reply reply = new Reply(rs.getInt(1),
						rs.getString(2),
						rs.getString(3),
						rs.getString(4),
						rs.getInt(5));
				
				replylist.add(reply);
			
			}
		
			return replylist;
		}catch (Exception e) {
			return null;
		}
		
	}
	
	
}
