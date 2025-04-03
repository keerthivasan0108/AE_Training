package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base_class {
	public static WebDriver dr;
	public static void chrome_launcher(String s) {
		dr = new ChromeDriver();
		dr.get(s);
		dr.manage().window().maximize();
	}
	
	public void close_chrome() {
		dr.close();
		dr.quit();
	}
}
