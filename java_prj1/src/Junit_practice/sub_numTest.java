package Junit_practice;

import static org.junit.Assert.*;

import org.junit.Test;

public class sub_numTest {

	@Test
	public void test1() {
		sub_num obj = new sub_num();
		System.out.println("In TestSub test1");
		assertEquals(7,obj.sub(12, 5));
	}
	
	@Test
	public void test2() {
		sub_num obj = new sub_num();
		System.out.println("In TestSub test2");
		assertEquals(-8,obj.sub(-11, -3));
	}

}
