package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features= {"src//test//resource//Features"},
				 glue = {"stepdef"},
				 plugin = {"pretty","html:target/htmlreport/report.html"},
				 tags = "@set2"

)

public class testrunner1 extends AbstractTestNGCucumberTests{
	
}
