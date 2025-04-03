package testNG;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider2 extends Launcher{
	int num=1;
//	String xp_p1 = "//div[@class='inventory_list']/div[";
//	String xp_p3 = "]/div[2]//a/div";
//	String full_xp;
	
	static ArrayList<String> arr = new ArrayList<>();
	
	
	@BeforeClass
	public void before() {
		chrome_launcher(null);
		List l_all = dr1.findElements(By.xpath("//div[@class='inventory_list']/div"));
		for(int i=1;i<l_all.size();i++) {
			String xp_p1 = "//div[@class='inventory_list']/div[";
			
			String xp_p3 = "]/div[2]//a/div";
			String full_xp =  xp_p1+i+xp_p3;
			arr.add(full_xp);
		}
		System.out.println(arr);
	}
	
	@DataProvider(name = "dp")
	public Object[] getdata(){
		Object[] obj = new Object[] {
				"Sauce Labs Backpack","Sauce Labs Bike Light",
				"Sauce Labs Bolt T-Shirt","Sauce Labs Fleece Jacket",
				"Sauce Labs Onesie","Test.allTheThings()"
				
		};
		return obj; 
	}
	
  @Test(dataProvider = "dp")
  public void test1(String e_name) {
//	  full_xp = xp_p1+num+xp_p3;
	  String p_name = dr1.findElement(By.xpath(arr.get(num-1))).getText();
	  assertEquals(p_name,e_name);	 
	  num++;
	  
  }
  
  
}
