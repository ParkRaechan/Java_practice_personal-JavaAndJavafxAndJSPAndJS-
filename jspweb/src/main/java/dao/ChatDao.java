package dao;

import java.util.ArrayList;

import dto.Board;
import dto.Chat;

public class ChatDao extends Dao {
	public ChatDao() {
		super();
	}
	public static ChatDao chatDao = new ChatDao();
	public static ChatDao getChatDao() { return chatDao; }
	
	
	public boolean write( Chat chat ) { 
		
		String sql = "insert into chat( cname , ccontent , cnum )values(?,?,?)";
		try {
			ps = con.prepareStatement(sql);
			ps.setString( 1 , chat.getCname() );	ps.setString( 2 , chat.getCcontent() );
			ps.setInt( 3 , chat.getCnum() );	
			ps.executeUpdate(); return true;
		}catch (Exception e) { System.out.println( e ); }	return false; 
	}
	
	public boolean update() { 
		
		String sql = "insert into chat( cname , ccontent , cnum )values(?,?,?)";
		try {
			ps = con.prepareStatement(sql);
			
			ps.executeUpdate(); return true;
		}catch (Exception e) { System.out.println( e ); }	return false; 
	}
	
	public ArrayList<Chat> getchatlist() { 
		ArrayList<Chat> chatlist = new ArrayList<Chat>();
		String sql = "select * from chat order by cnum";
		
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while( rs.next() ) {
				Chat chat = new Chat( 
						rs.getString(1),rs.getString(2), 
						rs.getInt(3));
				chatlist.add(chat);
			}
			return chatlist;
		}catch (Exception e) { System.out.println( e );} return null; 

	}
}