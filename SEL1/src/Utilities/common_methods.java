package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class common_methods {
	public static WebDriver dr;
	public static void chrome_launcher(String s) {
		dr = new ChromeDriver();
		dr.get(s);
		dr.manage().window().maximize();
	}
}
