package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features= {"src//test//resource//Features"},
				glue = {"stepdef"},
				plugin = {"pretty","html:target/htmlreport/report.html"}
			
				)


public class testrunner extends AbstractTestNGCucumberTests {
	
}
