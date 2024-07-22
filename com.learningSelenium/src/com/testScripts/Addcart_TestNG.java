package com.testScripts;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.generic_utilities.Base_Test;
import com.generic_utilities.WebDriver_Utility;

public class Addcart_TestNG extends Base_Test {
	
	@Test
	public void AddCart() throws InterruptedException, IOException {
		
		driver.findElement(By.id("small-searchterms")).sendKeys("Laptop", Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='button'])[2]")).click();
		driver.findElement(By.linkText("Shopping cart")).click();
		
		if (driver.findElement(By.linkText("Shopping cart")).isDisplayed()) 
		{
			Reporter.log("Cart Sucessfully.............", true);
			
		}
//		WebDriver_Utility.getscreenshotofwebpage(driver, "addtocart");
		
	}
		
		@Test
		public void RemoveCart() throws IOException  {
		
			driver.findElement(By.linkText("Shopping cart")).click();
			driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).click();
			driver.findElement(By.name("updatecart")).click();
			
			
			if (driver.findElement(By.linkText("Shopping cart")).isDisplayed()) 
			{
				Reporter.log("Cart Removed Sucessfully.............", true);
				
			}
//			WebDriver_Utility.getscreenshotofwebpage(driver, "cartremoved");
			
		
		

     }
}
