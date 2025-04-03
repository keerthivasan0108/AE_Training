package pkg1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver dr = new ChromeDriver();
		dr.get("https://demoqa.com/alerts");
		dr.manage().window().maximize();
		
		WebElement element = dr.findElement(By.xpath("//button[@id='alertButton']"));
		element.click();
		
		try {
			Thread.sleep(3000);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		Alert a = dr.switchTo().alert();
		String alert_msg = a.getText();
		System.out.println("Alert msg : "+alert_msg);
		
		a.accept();
		//to cancel we use dismiss
		//a.dismiss();
		
		
	}

}
