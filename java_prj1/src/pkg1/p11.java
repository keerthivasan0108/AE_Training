package pkg1;

public class p11 {
	public static int add(int a,int b) {
		return a+b;
	}
	public static int multiply(int a,int b) {
		return a*b;
	}
	
	public static void main(String[] args) {
		int x,y;
		x = add(13,20);
		System.out.println("Sum = "+x);
		y = multiply(3,9);
		System.out.println("Product = "+y);
	}

}
