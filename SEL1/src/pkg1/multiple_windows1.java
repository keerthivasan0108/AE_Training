package pkg1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class multiple_windows1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver dr = new ChromeDriver();
		dr.get("https://practice.expandtesting.com/windows");
		dr.manage().window().maximize();
		
		
		String whand1 = dr.getWindowHandle();
		dr.findElement(By.xpath("//a[@href='/windows/new']")).click();
		dr.findElement(By.xpath("//a[@href='/windows/new']")).click();
		dr.findElement(By.xpath("//a[@href='/windows/new']")).click();
		int i=1;
		for(String h : dr.getWindowHandles()) {
			dr.switchTo().window(h);
			String title = dr.getTitle();
			System.out.println("Window "+i+" Title : "+title+", Window name : "+h);
			i++;
		}
		
		
	}

}
