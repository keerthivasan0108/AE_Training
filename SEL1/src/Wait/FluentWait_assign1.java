package Wait;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import Utilities.common_methods;

public class FluentWait_assign1 extends common_methods{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		chrome_launcher("https://the-internet.herokuapp.com/dynamic_controls");
		dr.findElement(By.xpath("//form[@id='input-example']/button")).click();
		
		Wait<WebDriver> wt = new FluentWait<>(dr)
				.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(2));
		
		wt.until(ExpectedConditions.elementToBeClickable(By.xpath("//form[@id='input-example']/input"))).sendKeys("hello");
		
		Thread.sleep(2000);
		dr.close();
				
		
	}

}
