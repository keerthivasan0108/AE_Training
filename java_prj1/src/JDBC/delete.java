package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class delete {

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
			String q = "delete from jdbc where sid = ?";
			PreparedStatement pstmt = con.prepareStatement(q);
			pstmt.setInt(1, 104);
			
			int DeletedRow = pstmt.executeUpdate();
			if(DeletedRow > 0) {
				System.out.println("A Student Deleted Successfully");
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
