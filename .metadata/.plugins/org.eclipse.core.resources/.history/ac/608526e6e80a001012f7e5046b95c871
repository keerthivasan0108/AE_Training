package testNG;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class parallel2 {
	 LocalDateTime obj = LocalDateTime.now();
	  DateTimeFormatter myformobj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm.ss");
	  String formattedDate = obj.format(myformobj);
	 
  @Test
  public void test2() {
	  WebDriver dr1 = new EdgeDriver();
	  dr1.get("https://www.saucedemo.com/");
	  System.out.println("In Edge ");
	  System.out.println(formattedDate);
	  
  }
}
