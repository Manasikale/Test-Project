/**
 * 
 */
package com.test.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Flipcart
{
	WebDriver driver;
    WebDriverWait wait;
    WebElement element; 
	
		@BeforeClass
		public void DependencyTestUsingAnnotation()
		{
			System.setProperty("webdriver.chrome.driver", "D:\\automationSoft\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();			
		}
	
	@Test(groups = { "google" })
		public void show()
		{
			driver.get("http://www.google.com");
		}
	
	@Test(dependsOnMethods = { "show" }, groups = { "google" })
	 	public void init()
		{
		    wait=new WebDriverWait(driver, 20);
//		    element = wait.until((((WebElement) ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"lst-ib\"]")))));
		    element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"lst-ib\"]")));
		    element.sendKeys("Flipkart");
		    element.sendKeys(Keys.ENTER);
//			driver.findElement(By.xpath("//*[@id=\"lst-ib\"]")).sendKeys(Keys.ENTER);
		}
		
	

	@Test(dependsOnMethods = { "init" }, groups = { "flipkart" })
		public void display()
		{
			driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/h3/a")).click();
			driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
			driver.findElement(By.xpath("//*[@id=\"container\"]/div/header/div[1]/div/div/div/div[1]/form/div/div[1]/div/input")).sendKeys("dresses");
			driver.findElement(By.xpath("//*[@id=\"container\"]/div/header/div[1]/div/div/div/div[1]/form/div/div[1]/div/input")).sendKeys(Keys.ENTER);
			
		}	
	
	@Test(dependsOnMethods = { "display" }, groups = { "flipkart" })
	 	public void find() throws InterruptedException
		{
		    wait=new WebDriverWait(driver, 30);
		//	Actions builder = new Actions(driver);
			element = wait.until(ExpectedConditions.presenceOfElementLocated(By.partialLinkText("Crease & Clips")));
			Assert.assertNotNull(element, "Web element not found!!");
			element.click();
//			wait=new WebDriverWait(driver, 30);
			JavascriptExecutor js= (JavascriptExecutor) driver;
			Thread.sleep(10000);
//			element = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("input#pincodeInputId._3X4tVa")));
		//	js.executeScript("document.getElementById("pincodeInputId")", args);
			
//			js.executeScript("document.getElementById('pincodeInputId').setAttribute('value','12345')");
		//	driver.findElement(By.xpath("//input[@placeholder='Enter Delivery Pincode']")).sendKeys("411001");
			WebElement element=driver.findElement(By.id("pincodeInputId"));
			
//			System.out.println(elemenet.getSize());
			element.sendKeys("431006");
//			Assert.assertNotNull(element, "Web element not found!!");
			element.sendKeys(Keys.ENTER);
			driver.findElement(By.xpath("//*[@id=\"swatch-0-size\"]/a")).click();
			driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div/div/div/div[1]/div/div[1]/div[2]/ul/li[1]"));
//			Action moveOver = builder.moveToElement(element).build();
//        	moveOver.perform();
//			wait=new WebDriverWait(driver, 20);
//			Assert.assertNotNull(element, "Web element not found!!");
//			element.click();
		}
	
	@AfterClass
	public void afterClass() 
	{
//     driver.close();
	}
}
