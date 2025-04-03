package JDBC_assignement;

import java.sql.SQLException;
import java.util.Scanner;

public class JDBC_MAIN extends JDBC_METHODS{

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc = new Scanner (System.in);
		int choice = 0;
		do {
			System.out.println("");
			System.out.println("*********************************");
			System.out.println("1) Insert into table");
			System.out.println("2) Get All the data");
			System.out.println("3) Update avgerage marks in db");
			System.out.println("4) Exit");
			System.out.println("*********************************");
			System.out.println("");
			System.out.println("Enter Your Choice : ");
			choice = sc.nextInt();
			
			switch (choice) {
				case 1:
					insert();
					break;
				case 2:
					getdata();
					break;
				case 3:
					update();
					break;
			}
		}while(choice != 4);
		
	}

}
