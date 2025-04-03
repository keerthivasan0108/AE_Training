package Junit_practice;

import org.junit.Test;

public class Timeout_test {
	//Testing timeout : Test will fail if it takes longer than 1000ms
	@Test(timeout = 1511)
	public void test() throws InterruptedException {
		Thread.sleep(1500);
	}

}
