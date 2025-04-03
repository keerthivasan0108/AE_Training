package Oops;

public class object_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bank_acc[]acc_list = new bank_acc[3];
		acc_list[0] = new bank_acc(1235,"Keerthivasan",10000);
		acc_list[1] = new bank_acc(1236,"priya",5000);
		acc_list[2] = new bank_acc(1237,"satish",10000);
		
		acc_list[0].show_details();
		acc_list[0].withdraw(5000);
		acc_list[0].show_details();
		
		acc_list[1].show_details();
		acc_list[1].deposit(5000);
		acc_list[1].show_details();
		
		acc_list[2].show_details();
		acc_list[2].withdraw(3000);
		acc_list[2].show_details();
		acc_list[2].deposit(5000);
		acc_list[2].show_details();
		
	}

}
