package pkg1;
import java.util.*;
public class p8 {

	public static void main(String[] args) {
		int a = 20,b = 15,d = 0;
		System.out.println("Enter the arithemetic operator you want to do : ");
		Scanner sc = new Scanner(System.in);
		char c = sc.next().charAt(0);
		
		switch(c)
		{
		
		case '+':
			d= a+b;
			System.out.println("Addition");
			break;
		case '-':
			d= a-b;
			System.out.println("Subtraction");
			break;
		case '*':
			d= a*b;
			System.out.println("Multiplication");
			break;
		case '/':
			d= a/b;
			System.out.println("Division");
			break;
		default :
			System.out.println("Invalid Operation");
			
		}
		System.out.println(a + " "+c+" "+b+" is "+d);
		sc.close();

	}

}
