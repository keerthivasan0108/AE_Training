package Redbus;

import java.sql.SQLException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Data_functions d = new Data_functions();
//		d.getdata();
//		System.out.println(" ");
//		System.out.println("Updated bus data : ");
//		System.out.println(" ");
		TicketBook b = new TicketBook();
//		b.show_bus_data();
		d.getdata();
		Scanner sc = new Scanner(System.in);
		int choice=0;
		do {
			System.out.println();

			System.out.println("1)Show Bus Routes");
			System.out.println("2)Book a ticket");
			System.out.println("3)show booked tickets");
			System.out.println("4)Exit");
			System.out.println();
			System.out.println("Enter your choice:");
			
			choice = sc.nextInt();
			switch(choice) {
				case 1:
					b.show_bus_data();
					break;
				case 2:
					b.Book_a_ticket();
					break;
					
				case 3:
					b.show_booked_tickets();
					break;
					
				
					
			}
			
			
			
		}while(choice!=4);
		sc.close();
		}

}
