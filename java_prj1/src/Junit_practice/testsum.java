package Junit_practice;

import static org.junit.Assert.*;

import org.junit.Test;

public class testsum {
	
	sum s;
	int input[] = {12,58,78,2};
	
	@Test
	public void test1() {
		s = new sum();
		System.out.println("In Test");
		int m = s.getSum(input);
		System.out.println("Sum : "+m);
		assertEquals(m,150);
	}
	
	

}
