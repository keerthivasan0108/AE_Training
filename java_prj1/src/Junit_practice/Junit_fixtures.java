package Junit_practice;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.BeforeClass;
import org.junit.*;

public class Junit_fixtures {
	@BeforeClass
	public static void Beforeclass() {
		System.out.println("In Before class");
	}
	
	@AfterClass
	public static void AfterClass() {
		System.out.println("In After Class");
	}
	
	@Before
	public void setup() {
		System.out.println("In setup");
	}
	@After
	public void teardown() {
		System.out.println("In teardown");
	}
	
	
	@Test
	public void test1() {
		assertEquals(4,4);
		System.out.println("In test1");
	}
	
	@Test
	public void test2() {
		assertTrue(4<8);
		System.out.println("In test2");
	}
}
