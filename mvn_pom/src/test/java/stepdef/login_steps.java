package stepdef;

import static org.testng.Assert.assertEquals;

import POM_Pages.login_page;
import POM_Pages.products_page;
import Utilities.Base_class;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class login_steps extends Base_class{
	
	login_page lp;
	products_page pp;
	
	@Given("Login page is displayed")
	public void login_page_is_displayed() {
		chrome_launcher("https://www.saucedemo.com/");
	}
	@When("User enters username and password")
	public void user_enters_username_and_password() {
	    lp = new login_page(dr);
	    lp.enter_uname("standard_user");
	    lp.enter_pwd("secret_sauce");
	    
	}
	
	@When("^User enters \"(.*)\" and \"(.*)\"$")
	public void user_enters_username_and_password(String un,String pwd) {
	    lp = new login_page(dr);
	    lp.enter_uname(un);
	    lp.enter_pwd(pwd);
	    
	}
	
	@When("Login button clicked")
	public void login_button_clicked() {
	    lp.click_login();
	}
	@Then("The application should display the message \"(.*)\"$")
	public void the_application_should_display_the_message_products(String exp) {
		pp = new products_page(dr);
	    String actual = pp.get_title();
	    assertEquals(actual,exp);
	}
	@Then("^The application should display the error \"(.*)\"$")
	public void invalid(String exp) {
		String error = lp.error_msg();
		assertEquals(error,exp);
		
	}
}
