package stepdef1;

import static org.testng.Assert.assertEquals;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.google.common.collect.Multiset.Entry;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.common_methods;

public class Add_to_cart extends common_methods{
	public static HashMap<String,Object[]> hm = new HashMap<>();
	public static String product;
	public static double Grandtotal=0;

	@When("User choose {string}")
	public void user_choose(String category) {
		dr.findElement(By.xpath("//div[@class='block block-category-navigation']/div[2]//a[@href='/books']")).click();
	}
	
	@When("User Click on {string}")
	public void user_click_on(String name) {
		
//		dr.findElement(By.xpath("//div[@class='product-grid']//div[@class='picture']//a[@href='/computing-and-internet']")).click();
		dr.findElement(By.linkText(name)).click();
	}
	
	@When("User Click Add to cart")
	public void user_click_add_to_cart() {
		String product = dr.findElement(By.xpath("//div[@class='product-name']/h1")).getText();
		String price = dr.findElement(By.xpath("//div[@class='product-price']/span")).getText();
		Double p = Double.parseDouble(price);
		dr.findElement(By.className("qty-input")).clear();
		dr.findElement(By.className("qty-input")).sendKeys("2");
		
		Integer q = 2;
		System.out.println(q);
		dr.findElement(By.xpath("//div[@class='add-to-cart-panel']//input[2]")).click();
	    dr.findElement(By.xpath("//div[@class='block block-category-navigation']/div[2]//a[@href='/books']")).click();
	    hm.put(product, new Object[] {p,q});
	}
	
	@When("User Check on Shopping cart")
	public void user_click_on_shopping_cart() {
	    
		dr.findElement(By.xpath("//li[@id='topcartlink']//span[@class='cart-label']")).click();
		//table[@class='cart']//tr[@class='cart-item-row'][1]/td[5]/input
		System.out.println("hello");
		int j=1;
		for(java.util.Map.Entry<String,Object[]> e:hm.entrySet()) {
			
			
			String name = dr.findElement(By.xpath("//table[@class='cart']//tr[@class='cart-item-row']["+j+"]/td[3]/a")).getText();
			String xqty = dr.findElement(By.xpath("//table[@class='cart']//tr[@class='cart-item-row']["+j+"]/td[5]/input")).getDomAttribute("value");
			Integer i = Integer.parseInt(xqty);
			String Total = dr.findElement(By.xpath("//table[@class='cart']//tr[@class='cart-item-row']["+j+"]/td[6]/span[2]")).getText();
			Double total = Double.parseDouble(Total);
			String a = e.getKey();
			
			System.out.println(a);
			Object obj[] = e.getValue();
			Double price = (Double) obj[0];
			System.out.println(price);
			int qty = (int) obj[1];
			System.out.println(qty);
			Double tt = qty*price;
			System.out.println(tt);
			System.out.println(total);
			
			
			assertEquals(total,tt);
			Grandtotal = Grandtotal+tt;
			j++;
						
		}
		String g = dr.findElement(By.xpath("//span[@class='product-price order-total']/strong")).getText();
		Double g_total = Double.parseDouble(g);
		assertEquals(g_total,Grandtotal);
	}
	
	@When("User add a Product")
	public void add_product() {
		dr.findElement(By.xpath("//table[@class='cart']//tr[@class='cart-item-row'][1]/td[5]/input")).clear();
		dr.findElement(By.xpath("//table[@class='cart']//tr[@class='cart-item-row'][1]/td[5]/input")).sendKeys("3");
		dr.findElement(By.xpath("//input[@name='updatecart']")).click();
		String a = dr.findElement(By.xpath("//table[@class='cart']//tr[@class='cart-item-row'][1]/td[4]/span[2]")).getText();
		Grandtotal = Grandtotal + (1*Double.parseDouble(a));
		String g = dr.findElement(By.xpath("//span[@class='product-price order-total']/strong")).getText();
		Double g_total = Double.parseDouble(g);
		assertEquals(g_total,Grandtotal);
		
	}
	
	@Then("User remove a Product")
	public void remove_product() {
		dr.findElement(By.xpath("//table[@class='cart']//tr[2]/td[1]/input")).click();
		String a = dr.findElement(By.xpath("//table[@class='cart']//tr[@class='cart-item-row'][2]/td[6]/span[2]")).getText();
		dr.findElement(By.xpath("//input[@name='updatecart']")).click();
		String g = dr.findElement(By.xpath("//span[@class='product-price order-total']/strong")).getText();
		Double g_total = Double.parseDouble(g);
		
		Double b = Double.parseDouble(a);
		Grandtotal = Grandtotal - b;
		assertEquals(g_total,Grandtotal);
	}
	
	
	
}
