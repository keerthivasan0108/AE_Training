package testNG;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class parallel1 {
	
  LocalDateTime obj = LocalDateTime.now();
  DateTimeFormatter myformobj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm.ss");
  String formattedDate = obj.format(myformobj);
  
  @Test
  public void test1() {
	  WebDriver dr1 = new ChromeDriver();
	  dr1.get("https://www.saucedemo.com/");
	  System.out.println("In Chrome ");
	  System.out.println(formattedDate);
	  
  }
}
