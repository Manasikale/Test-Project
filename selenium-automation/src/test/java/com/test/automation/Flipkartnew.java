package com.test.automation;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Flipkartnew 
{
	
	static WebDriver driver;
    static WebDriverWait wait;
    static WebElement element;
    static Object button; 
	
			
		public static void main(String[] args) throws InterruptedException
		{
			System.setProperty("webdriver.chrome.driver", "D:\\automationSoft\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();			
			   
			    
			
			driver.get("http://www.google.com");	
		    wait=new WebDriverWait(driver, 10);
		    //  element = wait.until((((WebElement) ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"lst-ib\"]")))));
		    element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"lst-ib\"]")));
		    element.sendKeys("Flipkart", Keys.ENTER);
//		    element.sendKeys(Keys.ENTER);
		    //	driver.findElement(By.xpath("//*[@id=\"lst-ib\"]")).sendKeys(Keys.ENTER);
			
		    
		    driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/h3/a")).click();
		    wait=new WebDriverWait(driver, 10);
			element = driver.findElement(By.xpath("/html/body/div[2]/div/div/button"));
			element.click();
			driver.findElement(By.xpath("//*[@id=\"container\"]/div/header/div[1]/div/div/div/div[1]/form/div/div[1]/div/input")).sendKeys("dresses", Keys.ENTER);
//			driver.findElement(By.xpath("//*[@id=\"container\"]/div/header/div[1]/div/div/div/div[1]/form/div/div[1]/div/input")).sendKeys(Keys.ENTER);
		    wait=new WebDriverWait(driver, 10);
		    //	Actions builder = new Actions(driver);
			
		    
		    element = wait.until(ExpectedConditions.presenceOfElementLocated(By.partialLinkText("Crease & Clips")));
			Assert.assertNotNull(element, "Web element not found!!");
			element.click();
			String oldTab = driver.getWindowHandle();
			Thread.sleep(10000);
		    ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
		    newTab.remove(oldTab);
			driver.switchTo().window(newTab.get(0));
            Thread.sleep(10000);
//            driver.findElement(By.cssSelector("input")).click();
            element = driver.findElement(By.id("pincodeInputId"));
            element.sendKeys("411057", Keys.ENTER);
//			driver.findElement(By.cssSelector("input")).sendKeys("431006");
//			driver.findElement(By.className("EJrIpC")).sendKeys(Keys.ENTER);
            wait=new WebDriverWait(driver, 10);
           
           element = driver.findElement(By.xpath("//*[@id=\"swatch-0-size\"]/a"));
           element.click();
           JavascriptExecutor js= (JavascriptExecutor) driver;
           js.executeScript("document.getElementsByClassName('_2AkmmA _2Npkh4 _2MWPVK').click();",button);
   	    	
           
			//	Action moveOver = builder.moveToElement(element).build();
			//  moveOver.perform();
			//	wait=new WebDriverWait(driver, 20);
			//	Assert.assertNotNull(element, "Web element not found!!");
			//	element.click();
		}


		private static void safeJavaScriptClick(Object goButton) {
			// TODO Auto-generated method stub
			
		}
}
