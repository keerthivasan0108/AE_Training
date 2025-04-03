package JDBC_assignement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map.Entry;

public class JDBC_METHODS {
	static HashMap<Integer,Student> hm = new HashMap<Integer,Student>();
	static String jdbcURL = "jdbc:mysql://localhost:3306/mydb1";
	static String dbuname = "root";
	static String pass = "Password@12";
	public static void insert() throws SQLException {
		
		//load the jdbc driver
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		
			//Establish a connection
			Connection con = DriverManager.getConnection(jdbcURL,dbuname,pass);
			
			//Execute a query
			String q = "insert into jdbc1(sid,sname,phy,chem) values (101,?,90,85),(102,?,60,88),(103,?,70,90),(104,?,80,76),(105,?,90,88)";
			//Prepared Statement creation
			PreparedStatement pstmt = con.prepareStatement(q);
			//insertion in the ? places
			
			pstmt.setString(1,"ramesh");
			pstmt.setString(2,"vikas");
			pstmt.setString(3,"mahesh");
			pstmt.setString(4,"rakesh");
			pstmt.setString(5,"ravi");
			
			
			int insertedrow = pstmt.executeUpdate();
			if(insertedrow > 0) {
				System.out.println("A No of Students Inserted Successfully");
			}
//			
			con.close();
		
		}
		catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
	public static void getdata() throws SQLException {
		
		//load the jdbc driver
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		
			//Establish a connection
			Connection con = DriverManager.getConnection(jdbcURL,dbuname,pass);
			//create a statement
			Statement stmt = con.createStatement();
			//Execute a query
			String q = "select * from jdbc1";
			
			//resultset
			ResultSet rs = stmt.executeQuery(q);
			System.out.println("-----------------------------------------");
			System.out.println("ID\tName\tphy\tchem\tavg");
			while(rs.next()) {
				int id = rs.getInt("sid");
				String sname = rs.getString("sname");
				int phyy = rs.getInt("phyy");
				int chem = rs.getInt("chem");
				Student s1 = new Student(id,sname,phyy,chem);
				s1.avg();
				System.out.println(s1.sid+"\t"+s1.sname+"\t"+s1.phy+"\t"+s1.chem+"\t"+s1.avg);
				hm.put(s1.sid,s1);
			}
			System.out.println("-----------------------------------------");
			con.close();
		
		}
		catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
	public static void update() throws SQLException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		
			//Establish a connection
			Connection con = DriverManager.getConnection(jdbcURL,dbuname,pass);
			
			//Execute a query
			
			int UpdatedRow = 0;
			for(Entry<Integer,Student> e : hm.entrySet()) {
				String q = "update jdbc1 set avgg = ? where sid = ?";
				PreparedStatement pstmt = con.prepareStatement(q);
				pstmt.setDouble(1, e.getValue().avg);
				pstmt.setInt(2, e.getKey());
				UpdatedRow = pstmt.executeUpdate();
			}
			
			
			
			if(UpdatedRow > 0) {
				System.out.println("");
				System.out.println("The Avgerage of the Students updated Successfully for the student.");
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
