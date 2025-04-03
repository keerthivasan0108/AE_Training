package Oops;

public class Exception1 {

	public static void main(String[] args) {
		
		try {
//			int a=10,b=5,c;
//			c=a/(b-5);
			int arr[] = {1,2,3,4,5};
			arr[10] = 5;
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("In ArrayIndexOutOfBounds Exception catch");
		}
		catch(ArithmeticException e) {
			System.out.println("In Arithmetic Exception catch");
		}
		catch(Exception e) {
			System.out.println("In Exception catch");
		}
		finally {
			System.out.println("In Finally block");
		}
		
	}

}

