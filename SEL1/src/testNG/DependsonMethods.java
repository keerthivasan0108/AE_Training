package testNG;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class DependsonMethods {
  @Test
  public void login() {
	  assertEquals(true,true);
	  System.out.println("In Login");
  }
  
  @Test(dependsOnMethods = "login")
  public void test1() {
	  System.out.println("In Dashboard");
  }
}
