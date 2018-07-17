/**
 * 
 */
package com.test.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * @author Manasi J. Kale
 *
 */
public class TestPriority {
	WebDriver driver;
    WebDriverWait wait;
	
		@BeforeClass
		public void DependencyTestUsingAnnotation()
		{
			System.setProperty("webdriver.chrome.driver", "D:\\automationSoft\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();			
		}
	
	
	@Test(priority=1)
	 	public void init()
		{
		    wait=new WebDriverWait(driver, 20);
		    driver.findElement(By.xpath("//*[@id=\"lst-ib\"]")).sendKeys("Times of india");
			driver.findElement(By.xpath("//*[@id=\"lst-ib\"]")).sendKeys(Keys.ENTER);
		}
		
	@Test(priority=0)
	public void show()
	{
		driver.get("http://www.google.com");
	}
	
	@Test(priority=3)
 	public void find()
	{
		Actions builder = new Actions(driver);
		driver.findElement(By.xpath("//*[@id=\"newsDropDown\"]")).click();
		WebElement element = driver.findElement(By.xpath("//*[@id=\"newsDropDown\"]/span"));
		Assert.assertNotNull(element, "Web element not found!!");
		Action moveOver = builder.moveToElement(element).build();
   	moveOver.perform();
 	}
	
	@Test(priority=2)
		public void display()
		{
		    wait = new WebDriverWait(driver, 20);
			driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/h3/a")).click();
			driver.findElement(By.xpath("/html/body/div[4]/div[2]/span/a[1]")).click();
			driver.findElement(By.xpath("//*[@id=\"main-nav\"]/ul/li[8]/a")).click();
		}	
	
	
	@AfterClass
	public void afterClass() 
	{
    driver.close();
	}

}
 