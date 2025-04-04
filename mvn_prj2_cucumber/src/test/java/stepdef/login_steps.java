package stepdef;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.common_methods;

public class login_steps extends common_methods {
	@Given("Login page is displayed")
	public void login_page_is_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	    Launch_chrome("https://www.saucedemo.com/");
	    System.out.println("The login page is displayed");
	}
	
	@When("User enters username and password")
	public void user_enters_username_and_password() {
	    // Write code here that turns the phrase above into concrete actions
	    dr.findElement(By.id("user-name")).sendKeys("standard_user");
	    dr.findElement(By.id("password")).sendKeys("secret_sauce");
	}
	
	@When("Login button clicked")
	public void login_button_clicked() {
	    // Write code here that turns the phrase above into concrete actions
	    dr.findElement(By.id("login-button")).click();
	}
	@Then("The application should display the message Products")
	public void show_products() {
	    // Write code here that turns the phrase above into concrete actions
	    String s = dr.findElement(By.xpath("//span[@class='title']")).getText();
	    assertEquals(s,"Products");
	}
	
	
}
