package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class common_methods {
	public static WebDriver dr;
	public static void Launch_chrome(String url){
		dr = new ChromeDriver();
		dr.get(url);
		dr.manage().window().maximize();
	}
	
	public void close_chrome() {
		dr.close();
		dr.quit();
	}
}
