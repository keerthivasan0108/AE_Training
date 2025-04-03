package Oops;


interface A{
	void methodA();
	default void hello() {
		System.out.println("hi");
	}
	
}
interface B{
	void methodB();
}
public class interface1 implements A,B{
	public void methodA(){
		System.out.println("In method A");
	}
	
	public void methodB(){
		System.out.println("In method B");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		interface1 obj  = new interface1();
		obj.methodA();
		obj.methodB();
		obj.hello();
	}

}
