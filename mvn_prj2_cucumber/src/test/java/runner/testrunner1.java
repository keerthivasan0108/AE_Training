package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features= {"src//test//resource//Features2"},
	glue = {"stepdef1"},
	plugin = {"pretty","html:target/htmlreport/report.html"},
	tags = "@set3"
)


public class testrunner1 extends AbstractTestNGCucumberTests{

}
