package JS;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import testNG.Launcher;
public class jseArgs extends Launcher{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		chrome_launcher("https://www.saucedemo.com/");
		
		JavascriptExecutor jse = (JavascriptExecutor) dr1;
		WebElement we1 = dr1.findElement(By.xpath("//*[@id='user-name']"));
		WebElement we2 = dr1.findElement(By.xpath("//*[@id='password']"));
		jse.executeScript("arguments[0].value='standard_user',arguments[1].value='secret_sauce';", we1,we2);

		

	}

}
