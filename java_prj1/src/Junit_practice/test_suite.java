package Junit_practice;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ 
	add_numTest.class, 
	sub_numTest.class 
})
public class test_suite {

}
