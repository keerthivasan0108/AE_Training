package Tests;

import org.testng.annotations.Test;

import POM_Pages.login_page;
import POM_Pages.products_page;
import Utilities.common_methods;
import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterMethod;

public class NewTest1 extends common_methods{
	login_page lp;
	products_page pp;
  
  @BeforeMethod
  public void beforeMethod() {
	  chrome_launcher("https://www.saucedemo.com/");
	  lp = new login_page(dr);
	  pp = new products_page(dr);
	  
  }
  
  @Test
  public void test1() {
	  lp.enter_uname("standard_user");
	  lp.enter_pwd("secret_sauce");
	  lp.click_login();
	  String atitle = pp.get_title();
	  assertEquals("Products",atitle);
	  
  }
  
  @Test
  public void test2() {
	  lp.enter_uname("standard_user");
	  lp.enter_pwd("secret_sauce");
	  lp.click_login();
	  String atitle = pp.get_title();
	  assertEquals("Products1",atitle);
	  
  }
  
  @AfterMethod
  public void afterMethod() {
	  dr.close();
	  
  }

}
