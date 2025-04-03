package testNG;

import org.testng.annotations.Test;

public class new_group {
  
  @Test(groups = {"F1", "F2"})
  public void sanityTest() {
	  System.out.println("Sanity test");
  }
  
  @Test(groups = {"F1"})
  public void test1(){
	  System.out.println("In group F1");
  }
  
  
  @Test(groups = {"F1"})
  public void test2(){
	  System.out.println("In group F1");
	  
  }
  
  @Test(groups = {"F2"})
  public void test3(){
	  System.out.println("In group F1");
	  
  }
  
  @Test(groups = {"F2"})
  public void test4(){
	  System.out.println("In group F2");
	  
  }
}

