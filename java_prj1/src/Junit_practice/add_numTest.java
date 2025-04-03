package Junit_practice;

import static org.junit.Assert.*;

import org.junit.Test;

public class add_numTest {

	@Test
	public void test1() {
		add_num obj = new add_num();
		int i,j;
		i=j=11;
		System.out.println("In testSum test1");
		assertEquals(i+i,obj.add(i, j));
	}
	
	@Test
	public void test2() {
		add_num obj = new add_num();
		
		System.out.println("In testSum test2");
		assertEquals(8,obj.add(5, 3));
	}

}
