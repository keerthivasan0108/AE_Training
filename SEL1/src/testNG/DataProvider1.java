package testNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider1 {
	@DataProvider(name = "dp")
	public Object[][] getdata(){
		Object[][] obj = new Object[][] {
			{"User1","Pwd1"},
			{"User2","Pwd2"},
			{"User3","Pwd3"},
		};
		return obj; 
	}
	
  @Test(dataProvider = "dp")
  public void test1(String n,String p) {
	  System.out.println("User : "+n+" Pass : " +p);
  }
}
