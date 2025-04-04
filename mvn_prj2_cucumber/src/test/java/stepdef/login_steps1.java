package stepdef;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;


import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.common_methods;

public class login_steps1 extends common_methods{
	
	
	@When("^User enters \"(.*)\" and \"(.*)\"$")
	public void user_enters_username_and_password1(String un,String pwd) {
	    // Write code here that turns the phrase above into concrete actions
		
	    dr.findElement(By.id("user-name")).sendKeys(un);
	    dr.findElement(By.id("password")).sendKeys(pwd);
	}
	
	
	@Then("^The application should display the message \"(.*)\"$")
	public void show_products1(String msg) {
	    // Write code here that turns the phrase above into concrete actions
		
		if(msg.equals("Products")) {
			String s = dr.findElement(By.xpath("//span[@class='title']")).getText();
		    assertEquals(s,msg);
		}
		else {
			String s = dr.findElement(By.xpath("//h3[@data-test='error']")).getText();
		    assertEquals(s,msg);
		}
	    
	}
}
