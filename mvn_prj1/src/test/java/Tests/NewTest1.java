package Tests;

import org.testng.annotations.Test;

import Listener.Listener1;
import POM_Pages.login_page;
import POM_Pages.products_page;
import Utilities.common_methods;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
@Listeners(Listener1.class)
public class NewTest1 extends common_methods{
	login_page lp;
	products_page pp;
	String obj [];
	@BeforeClass
	@DataProvider(name="dp")
	public Object[][] getdata() throws IOException{
		
		Object[][] arr= new Object[6][];
		for(int i=1;i<7;i++) {
			String uname = excel_data1(i,0);
			String pwd = excel_data1(i,1);
			arr[i-1] = new String[] {uname,pwd};
		}
		
		return arr;
	  }
	
	
  @BeforeMethod
  public void beforeMethod() {
	  chrome_launcher("https://www.saucedemo.com/");
	  lp = new login_page(dr);
	  pp = new products_page(dr);
	  
  }
  
  
  @Test(dataProvider = "dp")
  public void test1(String a,String b) {
	
	  lp.enter_uname(a);
	  lp.enter_pwd(b);
	  lp.click_login();
	  String atitle = pp.get_title();
	  assertEquals("Products",atitle);
	  
  }
  
  
  @AfterMethod
  public void afterMethod() {
	  dr.close();
	  
  }

}
