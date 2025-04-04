package stepdef1;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.common_methods;

public class login_steps extends common_methods{
	
	@Given("Login page is displayed")
	public void login_page() {
		Launch_chrome("https://demowebshop.tricentis.com/");
		
	}
	
	@When("User Click on Login page")
	public void user_click_on_login_page() {
	    // Write code here that turns the phrase above into concrete actions
		dr.findElement(By.className("ico-login")).click();
	}
	@When("^User enters \"(.*)\" and \"(.*)\"$")
	public void user_enters_username_and_password(String un,String pwd) {
	    // Write code here that turns the phrase above into concrete actions
		dr.findElement(By.id("Email")).sendKeys(un);
		dr.findElement(By.id("Password")).sendKeys(pwd);
	}
	@When("Login button clicked")
	public void login_button_clicked() {
	    // Write code here that turns the phrase above into concrete actions
		dr.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
	}
	@Then("The Home Page should be displayed")
	public void the_home_page_should_be_displayed() {
	    // Write code here that turns the phrase above into concrete actions
		String s = dr.findElement(By.className("account")).getText();
		
		assertEquals(s,"dummy0108@gmail.com");
		
	}
	
	@Then("The error {string} should be displayed")
	public void the_error_should_be_displayed(String s) {
	    // Write code here that turns the phrase above into concrete actions
		String e = dr.findElement(By.xpath("//div[@class='validation-summary-errors']//li")).getText();
		System.out.println(e);
	    assertEquals(e,s);
	}

}
