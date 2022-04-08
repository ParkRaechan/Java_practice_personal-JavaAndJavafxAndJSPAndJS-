package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import dto.Room;
import dto.Roomlive;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class RoomDao {
	
	private Connection con;
	private PreparedStatement ps;
	private ResultSet rs;
	
	public static RoomDao roomDao = new RoomDao();
	
	public RoomDao() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javafx?serverTimezone=UTC",
					"root","1234");
		}catch(Exception e ) {}
	}
	
	public boolean roomadd(Room room) {
		try{
			
			String sql = "insert into room(roname,roip)values(?,?)";
			ps = con.prepareStatement(sql);
			ps.setString(1, room.getRoname());
			ps.setString(2, room.getRoip());
			ps.executeUpdate();
			
			
			return true;
			
		}catch (Exception e) {System.out.println("방 추가 에러"+e);}
		return false;
	}
	
	public int getroomnum() {//가장최근에 등록된 방번호
		try {
			String sql = "select max(ronum) from room";
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			if(rs.next()) {
				return rs.getInt(1);
			}
			
			
		}catch (Exception e) {}
		
		return 0;
	}
	
	public ObservableList<Room> roomlist(){
		
		ObservableList<Room> roomlist = FXCollections.observableArrayList();
		try {
			String sql = "select *from room order by ronum desc";
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				Room room = new Room(rs.getInt(1),
						rs.getString(2),
						rs.getString(3),0
						);
				roomlist.add(room);
			}
			return roomlist;
		}catch (Exception e) {}
		return null;

	}
	
	
	public boolean addroomnum(Roomlive roomlive) {
		
		String sql = "insert into roomlive(ronum,mid)values(?,?)";
		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1, roomlive.getRonum());
			ps.setString(2, roomlive.getMid());
			ps.executeUpdate();
			return true;
			
			
		}catch (Exception e) {System.out.println("[sql오류]"+e);}
		return false;
	}
	
	public ArrayList<Roomlive> getRoomlivelist(int ronum){
		ArrayList<Roomlive> roomlivelist = new ArrayList<>();
		
		try {
			String sql = "select * from roomlive where ronum=?";
			ps = con.prepareStatement(sql);
			ps.setInt( 1 , ronum );
			rs= ps.executeQuery();
			while( rs.next() ) {
				Roomlive roomlive = new Roomlive(
						rs.getInt(1),
						rs.getInt(2),
						rs.getString(3));
				roomlivelist.add(roomlive);
			}
			return roomlivelist;

		}catch (Exception e) {}
		return roomlivelist;
		
	}
	
	
	
}
