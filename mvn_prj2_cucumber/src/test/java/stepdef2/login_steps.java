package stepdef2;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.ScenarioContext;
import utilities.TestContext;
import utilities.common_methods;

public class login_steps extends common_methods{
	TestContext tContext;
	@Given("The login page is displayed")
	public void login_page() {
		Launch_chrome("https://www.saucedemo.com/");
		System.out.println("Login page is displayed");
		tContext = new TestContext();
	}
	
	
	@When("^User enters \"(.*)\" and \"(.*)\"$")
	public void user_login(String uid,String pwd) {
		System.out.println("User enters valid username and password");
		tContext.set(ScenarioContext.USERNAME.toString(), uid);
//		tContext.set("uname", uid);

		tContext.set(ScenarioContext.SESSION_TOKEN.toString(), "asd5373");
//		tContext.set("session_token", "asd5373");
		
	}
	
	@Then("User session should be available")
	public void verify_session() {
		String storeuid = (String) tContext.get(ScenarioContext.USERNAME.toString());
		String storesessionid = (String) tContext.get(ScenarioContext.SESSION_TOKEN.toString());
		System.out.println("Uid : "+storeuid+" Token  : "+storesessionid);
	}
	
}
