package test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath_eg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver dr = new ChromeDriver();
		dr.get("https://jqueryui.com/");
		
		//*[text()='Checkboxradio']
		dr.findElement(By.xpath("//*[text()='Checkboxradio']")).click();
		
		//*[contains(text(),'radio')]
		
		//dr.findElement(By.xpath("//a[@href=\"https://jqueryui.com/checkboxradio/\"]")).click();
		WebElement wb = dr.findElement(By.xpath("//iframe[@class='demo-frame']"));
		dr.switchTo().frame(wb);
		
		
		dr.findElement(By.xpath("//label[@for='radio-1']")).click();			
		dr.findElement(By.xpath("//label[@for='checkbox-4']")).click();
		dr.findElement(By.xpath("//label[@for='checkbox-nested-1']")).click();
		
	}

}
