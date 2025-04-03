package Redbus;

import java.sql.SQLException;
import java.util.Map.Entry;
import java.util.Scanner;

public class TicketBook extends Data_functions {
	public static int pos = 0;
	public void show_bus_data() throws SQLException {
		System.out.println();
		System.out.println("R-ID\tFrom\t            To  \tT_Seats\tR_Seats\tcost");
		for(Entry<Integer, BusRoute> e: Hm1t1.entrySet()) {
			System.out.println(e.getValue().rid+"\t"+e.getValue().From+"  \t  "+e.getValue().To+"  \t  "+e.getValue().t_seats+"\t  "+e.getValue().r_seats+" \t"+e.getValue().cost);
		}
		System.out.println();
		
		
	}
	
	public void Book_a_ticket() throws SQLException {
		
		String bid = "b10";
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("Enter a Route id: ");
		String rid = sc.next();
		System.out.println("Enter No of seats : ");
		int n = sc.nextInt();
		Data_functions d = new Data_functions();
		String b_id = bid+pos++;
//		System.out.println(b_id);
		
		d.putdata(rid,n,b_id);
		
		sc.close();
	}
	public void show_booked_tickets() {
		System.out.println(" ");
		System.out.println("BID\tRID  \t  seats\tCost");
		for(Entry<Integer, Booking> e: Hm2t2.entrySet()) {
			System.out.println(e.getValue().bid+"\t"+e.getValue().rid+"  \t  "+e.getValue().no_of_seats+"  \t  "+e.getValue().Total_amt);
		}
		System.out.println();
	}
	
}
