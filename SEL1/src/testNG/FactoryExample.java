package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class FactoryExample {
	WebDriver dr;
	
	private String browser;
	public FactoryExample(String browser){
		this.browser = browser;
	}
	
  @Test
  public void testMethod() {
	  switch(browser) {
	  case "Chrome":
		  dr = new ChromeDriver();
		  break;
		  
	  case "FireFox":
		  dr = new FirefoxDriver();
		  break;
	  case "Edge":
		  dr = new EdgeDriver();
		  break;
	  }
	  
  }
  @AfterMethod
  public void after() {
	  dr.get("https://www.saucedemo.com/");
	  dr.manage().window().maximize();
	  System.out.println("Running test on Browser : "+browser);
	  dr.findElement(By.id("user-name")).sendKeys("standard_user");
	  dr.findElement(By.name("password")).sendKeys("secret_sauce");
	  dr.findElement(By.id("login-button")).click();
  }
  
  @Factory
  public static Object[] factoryMethod() {
	  Object[] bw = {
			  new FactoryExample("Chrome"),
			  new FactoryExample("FireFox"),
			  new FactoryExample("Edge")
	  };
	  return bw;
  }
  
}
