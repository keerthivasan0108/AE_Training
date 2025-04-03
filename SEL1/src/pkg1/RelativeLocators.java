package pkg1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

import Utilities.common_methods;

public class RelativeLocators extends common_methods{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		chrome_launcher("https://www.saucedemo.com");
		WebElement user = dr.findElement(By.id("user-name"));
		WebElement pass = dr.findElement(By.id("password"));
		WebElement we1 = dr.findElement(with(By.tagName("input")).above(pass));
		WebElement we2 = dr.findElement(with(By.tagName("input")).below(user));
		we1.sendKeys("standard_user");
		we2.sendKeys("secret_sauce");
		dr.findElement(By.id("login-button")).click();
	}


}
