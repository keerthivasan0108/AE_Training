package pkg1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public void check(String un,String pass,String ex) {
		WebDriver dr1 = new ChromeDriver();
		dr1.get("https://www.saucedemo.com/");
		
		
		dr1.findElement(By.id("user-name")).sendKeys(un);
		dr1.findElement(By.name("password")).sendKeys(pass);
		dr1.findElement(By.id("login-button")).click();
		
		if(un.equals("standard_user") && pass.equals("secret_sauce")) {
		
			String s = dr1.findElement(By.xpath("//span[@class='title']")).getText();
	
			System.out.println("Text Read : "+s);
			
			if(s.equals(ex)) {
				System.out.println("Valid Login Credinals : Test case - Pass");
				System.out.println();
			}
			else {
				System.out.println("Valid Login Credinals : Test case - Fail");
				System.out.println();
			}
		}
		else {
			String s = dr1.findElement(By.xpath("//h3[@data-test = 'error']")).getText();

			System.out.println("Text Read : "+s);
			
			if(s.equals(ex)) {
				System.out.println("InValid Login Credinals : Test case - Pass");
				System.out.println();
			}
			else {
				System.out.println("InValid Login Credinals : Test case - Fail");
				System.out.println();
			}
		}
	}
	
	

}
