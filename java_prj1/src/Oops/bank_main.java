package Oops;

public class bank_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		bank_acc keerthi = new bank_acc(1234,"keerthi",5000);
		
		keerthi.show_details();
		keerthi.deposit(500);
		keerthi.show_details();
		keerthi.withdraw(3000);
		keerthi.show_details();
		
		
		
		
	}

}



