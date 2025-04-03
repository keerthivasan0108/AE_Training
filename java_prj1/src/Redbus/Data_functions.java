package Redbus;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map.Entry;

public class Data_functions {
	public static HashMap<Integer,BusRoute> Hm1t1 = new HashMap<Integer,BusRoute>();
	public static HashMap<Integer,Booking> Hm2t2 = new HashMap<Integer,Booking>();
	int G_Total = 0;
	String jdbcURL = "jdbc:mysql://localhost:3306/mydb1";
	String dbuname = "root";
	String pass = "Password@12";
	public static int id= -1;
	
	public void getdata() throws SQLException {
		
		//load the jdbc driver
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		
			//Establish a connection
			Connection con = DriverManager.getConnection(jdbcURL,dbuname,pass);
			//create a statement
			Statement stmt = con.createStatement();
			//Execute a query
			String q = "select * from busroute";
			
			//resultset
			ResultSet rs = stmt.executeQuery(q);
			
			
			
			Integer id = 0;
			
			while(rs.next()) {
				String rid = rs.getString("routeid");
				String From = rs.getString("fromR");
				String To = rs.getString("toR");
				int t_seats = rs.getInt("TotalSeats");
				int r_seats = rs.getInt("RemainingSeats");
				int cost = rs.getInt("cost");
				
				Hm1t1.put(id, new BusRoute(rid,From,To,t_seats,r_seats,cost));
				
				
				id++;
				
			}
			TicketBook b = new TicketBook();
			
			b.show_bus_data();
			con.close();
			
		
		}
		catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
	public void putdata(String rid,int n,String b_id) throws SQLException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		
			//Establish a connection
			Connection con = DriverManager.getConnection(jdbcURL,dbuname,pass);
			
			//Execute a query
			String q = "insert into booking values(?,?,?,?)";
			//Prepared Statement creation
			PreparedStatement pstmt = con.prepareStatement(q);
			
			
			//insertion in the ? places
			TicketBook b = new TicketBook();
			for(Entry<Integer, BusRoute> e: Hm1t1.entrySet()){
				if(rid.equals(e.getValue().rid) && n<=e.getValue().r_seats) {
					
					pstmt.setString(1,b_id);
					pstmt.setString(2,e.getValue().rid);
					pstmt.setInt(3,n);
					int totalamt = n*e.getValue().cost;
					pstmt.setInt(4,totalamt);
					e.getValue().r_seats = e.getValue().r_seats-n;
					
					int insertedrow = pstmt.executeUpdate();
					if(insertedrow > 0) {
						System.out.println("A new Booking Inserted Successfully");
					}
					id=id+1;
					Hm2t2.put(id, new Booking(b_id,rid,n,totalamt));
					
					
				}
				else if(n>e.getValue().r_seats) {
					System.out.println("Enter a valid seats.");
					b.Book_a_ticket();
					
				}
				
				
				
			}
			
			
			
			
//			
			con.close();
		
		}
		catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
	
	
	
}
