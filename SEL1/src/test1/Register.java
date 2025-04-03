package test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Register {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver dr1 = new ChromeDriver();
		dr1.get("https://demowebshop.tricentis.com/");
		
		dr1.findElement(By.xpath("//a[@class='ico-register']")).click();
		dr1.findElement(By.id("gender-male")).click();
		dr1.findElement(By.id("FirstName")).sendKeys("Keerthi");
		dr1.findElement(By.id("LastName")).sendKeys("Vasan");
		dr1.findElement(By.id("Email")).sendKeys("dummy0108@gmail.com");
		dr1.findElement(By.id("Password")).sendKeys("passwo");
		dr1.findElement(By.id("ConfirmPassword")).sendKeys("passwo");
		dr1.findElement(By.id("register-button")).click();
		
		
	}

}
