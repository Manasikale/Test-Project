package com.test.automation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class PopupAlertTest 
{
	WebDriver driver;
	
	@BeforeClass
	public void DependencyTestUsingAnnotation()
	{
        System.setProperty("webdriver.chrome.driver", "D:\\automationSoft\\chromedriver_win32\\chromedriver.exe");
	    driver = new ChromeDriver();
	}
	
	@Test
	public void display() throws InterruptedException
	{
        driver.get("C:\\Users\\Manasi J. Kale\\Desktop\\mk.html");			
        Thread.sleep(2000);
        
        driver.findElement(By.name("UserName")).sendKeys("ManasiKale");
        Thread.sleep(2000);
        
        driver.findElement(By.name("BirthDate")).sendKeys("02/03/1996");
        Thread.sleep(2000);
   
        driver.findElement(By.xpath("/html/body/center[2]/input")).click(); 
        Alert alert1 = driver.switchTo().alert();		
        String alertMessage1= driver.switchTo().alert().getText();		
        System.out.println(alertMessage1);	
        Thread.sleep(2000);
        alert1.accept();		        
	}	
    @AfterClass
    public void afterClass() throws InterruptedException 
    {
    	Thread.sleep(4000);
    	driver.close();
    }
	
}
