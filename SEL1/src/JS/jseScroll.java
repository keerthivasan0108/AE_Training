package JS;

import org.openqa.selenium.JavascriptExecutor;
import testNG.Launcher;

public class jseScroll extends Launcher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		chrome_launcher("https://demowebshop.tricentis.com/");
		
		JavascriptExecutor jse = (JavascriptExecutor) dr1;
		jse.executeScript("window.scrollBy(0,400)");
		
		
		
	}

}
