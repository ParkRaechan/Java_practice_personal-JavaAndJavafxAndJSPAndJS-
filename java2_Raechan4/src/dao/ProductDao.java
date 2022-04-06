package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import dto.Product;

public class ProductDao {
	
	private Connection con;
	private PreparedStatement ps;
	private ResultSet rs;
	
	public static ProductDao productDao = new ProductDao();
	
	public ProductDao() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javafx?serverTimezone=UTC",
					"root","1234");
		}catch(Exception e ) {}
	}
	
	
	public boolean add( Product product ) {
		try {
			String sql = "insert into product(pname,pimg,pcontent,pcategory,pprice,pactivation,mnum) values(?,?,?,?,?,?,?)";
			ps = con.prepareStatement(sql);
			ps.setString( 1 , product.getPname() );
			ps.setString( 2 , product.getPimg() );
			ps.setString( 3 , product.getPcontent() );
			ps.setString( 4 , product.getPcategory() );
			ps.setInt( 5 , product.getPprice() );
			ps.setInt( 6 , product.getPactivation() );
			ps.setInt( 7 , product.getMnum() );
			ps.executeUpdate();
			
			
			return true;
		}catch(Exception e ) { System.out.println( "[SQL 오류]"+e  ); }
		return false;
	}
	// 2. 모든 제품 출력 
	public ArrayList<Product> list(){
		ArrayList<Product> productlist = new ArrayList<>();
		try {
			String sql = "select * from product";
			ps = con.prepareStatement(sql);
			rs=ps.executeQuery();
			while(rs.next()) {
				Product product = new Product(
				rs.getInt(1),
				rs.getString(2),
				rs.getString(3),
				rs.getString(4),
				rs.getString(5),
				rs.getInt(6),
				rs.getInt(7),
				rs.getString(8),
				rs.getInt(9));
				productlist.add(product);
			
			}
			return productlist;
		}catch (Exception e) {
		return null;
		}
	}
	// 3. 제품 조회
	
	// 4. 제품 삭제
		public boolean delete( int pnum ) {
			try {
				String sql = "delete from product where pnum=?";
				ps = con.prepareStatement(sql);
				ps.setInt(1, pnum);
				ps.executeUpdate();
				return true;
			}catch(Exception e ) { System.out.println( "[SQL 오류]"+e  ); }
			return false;
		}
		// 5. 제품 수정 
		public boolean update( Product product ) {
			
			try {
				String sql = "update product set pname=? , pimg=? , pcontent=?,pcategory=? , pprice=? where pnum=?";
				ps = con.prepareStatement(sql);
				ps.setString( 1 , product.getPname() );
				ps.setString( 2 , product.getPimg() );
				ps.setString( 3 , product.getPcontent() );
				ps.setString( 4 , product.getPcategory() );
				ps.setInt( 5 , product.getPprice() );
				ps.setInt( 6 , product.getPnum() );
				ps.executeUpdate();
				return true;
			}catch(Exception e ) { System.out.println( "[SQL 오류]"+e  ); }
			return false;
			
		}
}
