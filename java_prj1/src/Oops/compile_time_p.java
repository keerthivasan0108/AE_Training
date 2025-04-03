package Oops;

public class compile_time_p {
	//method overloading
	public static int add(int a,int b) {
		return a+b;
	}
	
	
	public static int add(int a,int b,int c) {
		return a+b+c;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(add(1,2));
		System.out.println(add(1,2,3));
	}

}
