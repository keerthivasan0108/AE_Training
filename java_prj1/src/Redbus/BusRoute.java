package Redbus;

public class BusRoute extends Data_functions{
	String rid;
	String From;
	String To;
	int t_seats;
	int r_seats;
	int cost;
	
	public BusRoute(String rid,String From,String To,int t_seats,int r_seats,int cost) {
		this.rid= rid;
		this.From = From;
		this.To = To;
		this.t_seats = t_seats;
		this.r_seats = r_seats;
		this.cost = cost;
	}
	
	
	public BusRoute() {
		
	}
	
}
