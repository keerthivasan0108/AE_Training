package Oops;

public class bank_acc{
	 int account_no;
	 String acc_name;
	 int balance;
	
	//show details
	public void show_details() {
		System.out.println("---------------------------------------");
		System.out.println("Account Name :"+this.acc_name);
		System.out.println("Account Number : "+this.account_no);
		System.out.println("Account balance : "+this.balance);
		System.out.println("---------------------------------------");
	}
	
	//deposit
	public void deposit(int amt) {
		this.balance = balance+amt;
		System.out.println(amt+" deposited successfully");
	}
	
	//withdraw
	public void withdraw(int amt) {
		this.balance = balance-amt;
		System.out.println(amt+" withdrawen successfully");
	}
	
	//constructor
	 public bank_acc(int account_no,String acc_name,int balance){
		 this.account_no = account_no;
		 this.acc_name = acc_name;
		 this.balance = balance;
		 
	 }
	 
	 public bank_acc(){	 
	 }
	
}