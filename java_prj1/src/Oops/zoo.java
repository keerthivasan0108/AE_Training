package Oops;

class animal{
	//sleep
	public void sleep() {
		System.out.println("animal can sleep");
	}
	
	//eat
	public void eat() {
		System.out.println("Animal can eat");
	}
}

class dog extends animal{
	//bark
	public void bark() {
		System.out.println("dog is barking");
	}
}

public class zoo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dog dog1 = new dog();
		dog1.sleep();
		dog1.eat();
		
		dog dog2 = new dog();
		dog2.sleep();
		dog2.bark();
	}

}
