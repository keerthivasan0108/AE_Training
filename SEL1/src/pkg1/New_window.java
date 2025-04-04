package pkg1;

import Utilities.common_methods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class New_window{
	
	public static void main(String args[]) {
		WebDriver dr = new ChromeDriver();
		dr.navigate().to("https://www.google.com");
		dr.manage().window().maximize();
		
		String curr = dr.getWindowHandle();
		dr.switchTo().newWindow(WindowType.TAB);
		dr.get("https://www.flipkart.com");
		dr.switchTo().window(curr);
		dr.close();
	}
	
	
}
