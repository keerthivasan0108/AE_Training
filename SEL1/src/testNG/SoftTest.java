package testNG;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftTest {
	
	SoftAssert sa =new SoftAssert();
	
  //Soft test
  @Test
  public void test1() {
	sa.assertEquals(true,false);
	System.out.println("In test 1");
	sa.assertAll();
	  
  }
  
  //Hard test
  @Test
  public void test2() {
	  assertEquals(true,false);
	  System.out.println("In test 2");
  }
}
