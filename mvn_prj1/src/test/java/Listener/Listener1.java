package Listener;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import Utilities.common_methods;


public class Listener1 extends common_methods implements ITestListener {

	@Override
	public void onTestFailure(ITestResult result) {
		Reporter.log("Test Failed : "+result.getName());
		try {
			take_screenshot();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log("Test Success : "+result.getName());
		
	}
	
	
	@Override
	public void onTestStart(ITestResult result) {
		Reporter.log("Test Start : "+result.getName());
		
	}
	
	@Override
	public void onFinish(ITestContext context) {
	    // not implemented
		Reporter.log("Test Finish : "+context.getName());
		
	  }
  
}
