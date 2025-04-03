package Oops;

public class encap_bank {

	public static void main(String[] args) {
		
		bank_account acc1 = new bank_account();
		acc1.setAcc_name("Sachin");
		System.out.println("Account No. : "+acc1.getAcc_no()+"\nAccount name : "+acc1.getAcc_name()+"\nAccount balance : "+acc1.getAcc_balance());
		
		
	}

}

class bank_account{
	private int Acc_no = 123;
	private String Acc_name = "keerthi";
	private int Acc_balance = 5000;
	public String getAcc_name() {
		return Acc_name;
	}
	public void setAcc_name(String acc_name) {
		Acc_name = acc_name;
	}
	public int getAcc_balance() {
		return Acc_balance;
	}
	public void setAcc_balance(int acc_balance) {
		Acc_balance = acc_balance;
	}
	public int getAcc_no() {
		return Acc_no;
	}
	
}
