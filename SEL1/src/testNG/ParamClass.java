package testNG;

import org.testng.annotations.Test;



import org.testng.annotations.*;

public class ParamClass {
	

  @Test
  @Parameters({"OS"})
  public void test1(String OS) {
	  System.out.println("Os is : "+OS);
  }
}
