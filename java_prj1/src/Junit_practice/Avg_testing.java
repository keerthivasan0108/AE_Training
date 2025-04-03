package Junit_practice;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


@RunWith (Parameterized.class)
public class Avg_testing {
	private int a,b,c,ex_avg;
	public Avg_testing(int a,int b,int c,int ex_avg) {
		this.a = a;
		this.b = b;
		this.c= c;
		this.ex_avg = ex_avg;
	}
	
	@Parameterized.Parameters
	public static List<Object[]> data(){
		Object arr[][] = new Object[][]{
				{1,2,3,2},
				{8,7,6,7},
				{32,38,35,35},
				{40,32,36,36},
				{15,29,22,22}
		};
		
		List<Object[]> out = Arrays.asList(arr);
		return out;
	}
	
	@Test
	public void test() {
		Average_marks ob = new Average_marks();
		System.out.println("a : "+a+" b: "+b+" c : "+c+" ex_avg :  "+ex_avg);
		System.out.println("actual avg : "+ob.avg(a, b, c));
		assertEquals(ex_avg,ob.avg(a, b, c));
	}

}
