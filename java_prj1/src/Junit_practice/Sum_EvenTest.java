package Junit_practice;

import static org.junit.Assert.*;

import org.junit.Test;

public class Sum_EvenTest {
	Sum_Even s = new Sum_Even();

	@Test
	public void test1() {
		
		int a = 424;
		int b = s.sum_of_digits(a);
		assertEquals(10,b);
	}
	
	@Test
	public void test2() {
		
		int a = 3468;		
		int b = s.sum_of_digits(a);
		assertEquals(10,b);
	}
	
	
	
}
