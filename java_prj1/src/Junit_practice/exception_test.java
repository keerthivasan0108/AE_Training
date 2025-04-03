package Junit_practice;

import org.junit.Test;

public class exception_test {

	@Test(expected = ArithmeticException.class)
	public void test1() {
		@SuppressWarnings("unused")
		int a = 1/0;
	}
	
	@Test(expected = ArrayIndexOutOfBoundsException.class)
	public void test2(){
		int arr[] = new int[4];
		arr[10] = 10;
	}
	
}
