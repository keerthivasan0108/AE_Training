package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class update {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		String jdbcURL = "jdbc:mysql://localhost:3306/mydb1";
		String dbuname = "root";
		String pass = "Password@12";
		//load the jdbc driver
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		
			//Establish a connection
			Connection con = DriverManager.getConnection(jdbcURL,dbuname,pass);
			
			//Execute a query
			String q = "update jdbc set marks = ? where sid = ?";
			PreparedStatement pstmt = con.prepareStatement(q);
			pstmt.setInt(1, 100);
			pstmt.setInt(2, 106);
			
			int UpdatedRow = pstmt.executeUpdate();
			if(UpdatedRow > 0) {
				System.out.println("A new mark updated Successfully for the student.");
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
