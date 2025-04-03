package Oops;

public class Vehicle {
	
	public void start() {
		System.out.println("Vechicle is Started");
	}
	public Vehicle() {
		System.out.println("In vehicle");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//override polymorphism
		
		Vehicle v = new Vehicle();
		v.start();
		System.out.println("");
		Vehicle v1 = new car();
		System.out.println("");
		v1.start();
		System.out.println("");
		car c = new car();
		System.out.println("");
		c.start();
	}
}

class car extends Vehicle{

	
	public car(){
		System.out.println("In car");
	}
	@Override
	public void start() {
		System.out.println("Car has a self starter");
	}

}