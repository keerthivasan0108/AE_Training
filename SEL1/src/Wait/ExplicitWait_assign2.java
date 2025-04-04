package Wait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


import Utilities.common_methods;

public class ExplicitWait_assign2 extends common_methods{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		chrome_launcher("https://the-internet.herokuapp.com/dynamic_controls");
		dr.findElement(By.xpath("//form[@id='input-example']/button")).click();
		WebDriverWait wait = new WebDriverWait(dr,Duration.ofSeconds(10));
		
		WebElement we1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//form[@id='input-example']/input")));
		we1.sendKeys("Hello");
		Thread.sleep(2000);
		dr.close();
		
	}

}
