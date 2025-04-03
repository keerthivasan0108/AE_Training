package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class select {

	public static void main(String[] args) throws SQLException {
		
		//Database credentials
		String jdbcURL = "jdbc:mysql://localhost:3306/mydb1";
		String dbuname = "root";
		String pass = "Password@12";
		//load the jdbc driver
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		
			//Establish a connection
			Connection con = DriverManager.getConnection(jdbcURL,dbuname,pass);
			//create a statement
			Statement stmt = con.createStatement();
			//Execute a query
			String q = "select * from jdbc";
			
			//resultset
			ResultSet rs = stmt.executeQuery(q);
			System.out.println("ID\tName\tmarks");
			while(rs.next()) {
				int id = rs.getInt("sid");
				String name = rs.getString("sname");
				int marks = rs.getInt("marks");
				System.out.println(id+"\t"+name+"\t"+marks);
				
			}
			con.close();
		
		}
		catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}

}
