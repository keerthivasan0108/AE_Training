package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features= {"src//test//resource//Features3"},
glue = {"stepdef2"},
plugin = {"pretty","html:target/htmlreport/report.html"}

)


public class runner_context extends AbstractTestNGCucumberTests{

}
