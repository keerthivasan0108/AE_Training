package pkg1;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Valid Pass
		String u1 = "standard_user";
		String p1 = "secret_sauce";
		//Invalid Pass
		String p2 = "pass";
		
		//Expected Results
		String e1 = "Products";
		String e2 = "Product";
		String e3 = "Epic sadface: Username and password do not match any user in this service";
		String e4 = "expe";
		
		Login l = new Login();
		l.check(u1,p1,e1);
		l.check(u1,p1,e2);		
		l.check(u1,p2,e3);
		l.check(u1,p2,e4);
		
			
	}

}
