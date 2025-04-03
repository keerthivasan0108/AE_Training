package Junit_practice;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith (Parameterized.class)
public class param_example {
	private int num1,num2,ex_out;
	public param_example(int num1,int num2,int ex_out) {
		
		this.num1 = num1;
		this.num2 = num2;
		this.ex_out = ex_out;
		System.out.println("In Constructor");
	}
	
	@Parameterized.Parameters
	public static List<Object[]> data() {
		Object b[][] = new Object[][]{
				{1,2,3},
				{3,4,7},
				{8,11,19},
				{-2,-6,-8}
				
		};
		
		List<Object[]> c =  Arrays.asList(b);
		return c;
	}
	public int sum(int a,int b) {
		int c = a+b;
		return c;
	}
	
	@Test
	public void test() {
		System.out.println("Num 1 : "+num1+" Num 2 : "+num2+" Ex out : "+ex_out);
		assertEquals(ex_out,sum(num1,num2));
	}

}
