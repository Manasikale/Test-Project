/**
 * 
 */
package com.test.automation;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GooglePageTest
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\automationSoft\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.google.com");
		
		driver.findElement(By.xpath("//*[@id=\"lst-ib\"]")).sendKeys("Times of india");
		driver.findElement(By.xpath("//*[@id=\"lst-ib\"]")).sendKeys(Keys.ENTER);
		
		driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/h3/a")).click();
		driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS) ;
		driver.findElement(By.xpath("/html/body/div[4]/div[2]/span/a[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"main-nav\"]/ul/li[8]/a")).click();
	}

}
 