package Junit_practice;

import static org.junit.Assert.*;

import org.junit.*;
import org.junit.Test;

public class avg_test {
	

		int arr[][] = new int[][]{
				{1,2,3,2},
				{8,7,6,7},
				{32,38,35,35}				
		};
		
	
	int id = 0;
	int a,b,c,ex_avg;
	@Before
	public void setup() {
		
		a = arr[id][0];
		b = arr[id][1];
		c = arr[id][2];
		ex_avg = arr[id][3];
		
	}
	@After
	public void teardown() {
		id++;
	}
	
	Average_marks ob = new Average_marks();
	@Test
	public void test1() {
		System.out.println("in test 1");
		System.out.println("a : "+a+" b: "+b+" c: "+c+" expected_avg : "+ex_avg);
		System.out.println("Actual average : "+ob.avg(a,b,c));
		assertEquals(ex_avg,ob.avg(a,b,c));
		
	}
	
	@Test
	public void test2() {
		System.out.println("");
		System.out.println("in test 2");
		System.out.println("a : "+a+" b: "+b+" c: "+c+" expected_avg : "+ex_avg);
		System.out.println("Actual average : "+ob.avg(a,b,c));
		assertEquals(ex_avg,ob.avg(a,b,c));
	}
	
	@Test
	public void test3() {
		System.out.println("");
		System.out.println("in test 3");
		System.out.println("a : "+a+" b: "+b+" c: "+c+" expected_avg : "+ex_avg);
		System.out.println("Actual average : "+ob.avg(a,b,c));
		assertEquals(ex_avg,ob.avg(a,b,c));
	}

}
