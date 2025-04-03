package Oops;

public class Abstraction {

	public static void main(String[] args) {
	
		bank1 b;
		
		b = new HDFC();
		b.print();
		System.out.println("HDFC Bank Rate of Interest is "+b.getRateOfInterest()+" %");
		
		b = new SBI();
		System.out.println("SBI Bank Rate of Interest is "+b.getRateOfInterest()+" %");
	}

}

abstract class bank1{
	abstract int getRateOfInterest();
	public void print() {
		System.out.println("This is a non-abstract method");
	}
}

class HDFC extends bank1{
	int getRateOfInterest() {
		return 7;
	}
}

class SBI extends bank1{
	int getRateOfInterest() {
		return 8;
	}
}
