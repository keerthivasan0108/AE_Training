package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Launcher {
	protected static WebDriver dr1;
	public static void chrome_launcher(String s) {
		dr1 = new ChromeDriver();
		dr1.get(s);
//		dr1.findElement(By.id("user-name")).sendKeys("standard_user");
//		dr1.findElement(By.name("password")).sendKeys("secret_sauce");
//		dr1.findElement(By.id("login-button")).click();
		dr1.manage().window().maximize();
	}
	public void Edge_launcher() {
		dr1 = new EdgeDriver();
		dr1.get("https://www.saucedemo.com/");
		dr1.findElement(By.id("user-name")).sendKeys("standard_user");
		dr1.findElement(By.name("password")).sendKeys("secret_sauce");
		dr1.findElement(By.id("login-button")).click();
		dr1.manage().window().maximize();
	}
	public void Firefox_launcher() {
		dr1 = new FirefoxDriver();
		dr1.get("https://www.saucedemo.com/");
		dr1.findElement(By.id("user-name")).sendKeys("standard_user");
		dr1.findElement(By.name("password")).sendKeys("secret_sauce");
		dr1.findElement(By.id("login-button")).click();
		dr1.manage().window().maximize();
	}
}
