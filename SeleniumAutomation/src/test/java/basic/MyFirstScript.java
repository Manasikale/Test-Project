package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MyFirstScript {
	
	
	
	
	@Test
	public void test1() {
		System.out.println("Hello");
		
		System.setProperty("webdriver.chrome.driver", "D:\\automationSoft\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
	}

}
