package stepdef1;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.common_methods;

public class Checkout extends common_methods {
	@Given("Click checkout")
	public void checkout() {
		dr.findElement(By.id("termsofservice")).click();
		dr.findElement(By.id("checkout")).click();
		
	}
	
	@When("User Fill the Billing address")
	public void fill_bill_address() {
		dr.findElement(By.id("BillingNewAddress_Company")).sendKeys("hello");
		WebElement w1 = dr.findElement(By.name("BillingNewAddress.CountryId"));
		Select s = new Select(w1);
		s.selectByVisibleText("India");
		
		dr.findElement(By.xpath("//input[@name='BillingNewAddress.City']")).sendKeys("Bangalore");
		dr.findElement(By.xpath("//input[@name='BillingNewAddress.Address1']")).sendKeys("mayilachandra");
		dr.findElement(By.xpath("//input[@name='BillingNewAddress.ZipPostalCode']")).sendKeys("12345");
		dr.findElement(By.xpath("//input[@name='BillingNewAddress.PhoneNumber']")).sendKeys("1234567890");
		
		
	}
	
	@When("User click billing button")
	public void billing_address() {
		WebDriverWait wt = new WebDriverWait(dr,Duration.ofMillis(10000));
		String xpath = "//div[@id='billing-buttons-container']//input";
		WebElement ele = wt.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
		ele.click();

		
		
	}
	
	@When("User click shipping button")
	public void shipping() {
		WebDriverWait wt = new WebDriverWait(dr,Duration.ofMillis(20000));
		String xpath = "//div[@id='shipping-buttons-container']//input";
		WebElement ele = wt.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
		ele.click();

	}
	@When("User click shipping method button")
	public void shipping_method() {
		WebDriverWait wt = new WebDriverWait(dr,Duration.ofMillis(20000));
		String xpath = "//div[@id='shipping-method-buttons-container']//input";
		WebElement ele = wt.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
		ele.click();

	}
	
	@When("User click payment method button")
	public void payment() {
		WebDriverWait wt = new WebDriverWait(dr,Duration.ofMillis(20000));
		String xpath = "//div[@id='payment-method-buttons-container']//input";
		WebElement ele = wt.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
		ele.click();

	}
	
	@When("User click payment info button")
	public void payment_info() {
		WebDriverWait wt = new WebDriverWait(dr,Duration.ofMillis(20000));
		String xpath = "//div[@id='payment-info-buttons-container']//input";
		WebElement ele = wt.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
		ele.click();

	}
	
	@When("User confirm order")
	public void confirm_order() {
		WebDriverWait wt = new WebDriverWait(dr,Duration.ofMillis(20000));
		String xpath = "//input[@class='button-1 confirm-order-next-step-button']";
		WebElement ele = wt.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
		ele.click();
	}
	
	@Then("Verify that the user Successfully ordered")
	public void product_ordered() {
		dr.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		String title = dr.findElement(By.xpath("//div[@class='title']/strong")).getText();
		String idexp = dr.findElement(By.xpath("//ul[@class='details']/li[1]")).getText();
		String arr[] = idexp.split(":");
		String idex = arr[1];
		String exp = "Your order has been successfully processed!";
		dr.findElement(By.xpath("//div[@class='header-links']//a[@href='/customer/info']")).click();
		dr.findElement(By.xpath("//div[@class='listbox']//a[@href='/customer/orders']")).click();
		
		String idacu = dr.findElement(By.xpath("//div[@class='order-list']/div[1]/div[@class='title']/strong")).getText();
		String arr1[] = idacu.split(":");
		String idac = arr1[1];
		assertEquals(title,exp);
		assertEquals(idac,idex);
		
	}
	
	
}
