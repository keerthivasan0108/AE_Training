package Listener;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(Listener1.class)
public class listener_report {
  @Test
  public void test1() {
	  System.out.println("In Test1");
	  assertTrue(false);
	  
  }
  
  @Test
  public void test2() {
	  System.out.println("In Test2");
	  assertFalse(false);
	  
  }
}
