package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class insertinto {

	public static void main(String[] args) throws SQLException {
		
		String jdbcURL = "jdbc:mysql://localhost:3306/mydb1";
		String dbuname = "root";
		String pass = "Password@12";
		//load the jdbc driver
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		
			//Establish a connection
			Connection con = DriverManager.getConnection(jdbcURL,dbuname,pass);
			
			//Execute a query
			String q = "insert into jdbc values(?,?,?)";
			//Prepared Statement creation
			PreparedStatement pstmt = con.prepareStatement(q);
			//insertion in the ? places
			pstmt.setInt(1, 107);
			pstmt.setString(2, "vijay");
			pstmt.setInt(3, 85);
			
			
			
			int insertedrow = pstmt.executeUpdate();
			if(insertedrow > 0) {
				System.out.println("A new Student Inserted Successfully");
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
