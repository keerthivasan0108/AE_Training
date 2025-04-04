package Wait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utilities.common_methods;

public class Explicitwait_assignment extends common_methods{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		chrome_launcher("https://the-internet.herokuapp.com/dynamic_controls");
		dr.findElement(By.xpath("//form[@id='checkbox-example']/button")).click();
		WebDriverWait wait = new WebDriverWait(dr,Duration.ofSeconds(10));
		WebElement we1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//form[@id='checkbox-example']/button")));
		we1.click();
		
		WebElement we2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//form[@id='checkbox-example']/div/input")));
		WebElement we3 = dr.findElement(By.id("checkbox"));
		if(we3.isDisplayed()) {
			System.out.println("Check box is Displayed");
		}
		else {
			System.out.print("No Checkbox");
		}
	}

}
