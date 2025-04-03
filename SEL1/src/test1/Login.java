package test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver dr = new ChromeDriver();
		dr.get("https://demowebshop.tricentis.com/");
		
		dr.findElement(By.className("ico-login")).click();
		dr.findElement(By.id("Email")).sendKeys("dummy0108@gmail.com");
		dr.findElement(By.id("Password")).sendKeys("passwo");
		dr.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		
		String s = dr.findElement(By.className("account")).getText();
		System.out.println("Email id :" +s);
		if(s.equals("dummy0108@gmail.com")) {
			System.out.println("Login email is correct");
		}
		else {
			System.out.println("Login email is not correct");
		}
		
		//vote
//		dr.findElement(By.id("pollanswers-1")).click();
//		dr.findElement(By.id("vote-poll-1")).click();
		
		//add to cart
		//dr.findElement(By.xpath("//input[@class='button-2 product-box-add-to-cart-button']")).click();
		
		//unique xpath
		//div[@class='block block-category-navigation']//a[@href='/books']
		dr.findElement(By.xpath("//div[@class='block block-category-navigation']//a[@href='/books']")).click();
		WebElement wb = dr.findElement(By.id("products-orderby"));
		Select s1 = new Select(wb);
		
		//s1.selectByIndex(3);
		s1.selectByContainsVisibleText("Created");
		
		//xpath = //a[@href='/books']
	}

}
