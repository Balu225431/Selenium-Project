package com.testScripts;

import java.io.IOException;
import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.generic_utilities.Base_Test;
import com.generic_utilities.WebDriver_Utility;

public class AddressTest extends Base_Test {
	
	@Test
	public void AddAddress() throws IOException {
		
		
		driver.findElement(By.xpath("(//a[@class='account'])[1]")).click();
		driver.findElement(By.xpath("(//a[@class='inactive'])[1]")).click();
		driver.findElement(By.xpath("//input[@value='Add new']")).click();
		driver.findElement(By.xpath("(//input[@class='text-box single-line'])[1]")).sendKeys("Bala");
		driver.findElement(By.xpath("(//input[@class='text-box single-line'])[2]")).sendKeys("M");
		driver.findElement(By.id("Address_Email")).sendKeys("murugan661999@gmail.com");
		driver.findElement(By.id("Address_CountryId")).sendKeys("india");
		driver.findElement(By.id("Address_City")).sendKeys("chennai");
		driver.findElement(By.id("Address_Address1")).sendKeys("235/25 chennai");
		driver.findElement(By.id("Address_ZipPostalCode")).sendKeys("600083");
		driver.findElement(By.id("Address_PhoneNumber")).sendKeys("9853621478");
		driver.findElement(By.xpath("(//input[@class='button-1 save-address-button'])[1]")).click();
		
		
		if (driver.findElement(By.xpath("//strong[text()='Bala M']")).isDisplayed()) 
		{
			Reporter.log("Address Add Sucessfully............", true);
		}
		
		WebDriver_Utility.getscreenshotofwebpage(driver, "AddAddress");
		
		
	}
	
	@Test
	public void DeleteAddress() throws InterruptedException, IOException 
	{
		
		
		driver.findElement(By.xpath("(//a[@class='account'])[1]")).click();
		driver.findElement(By.xpath("(//a[@class='inactive'])[1]")).click();
//		If Multiple Address save but particular address delete use DYNAMIC XPATH
		driver.findElement(By.xpath("//strong[text()='Bala M']/../..//input[@class='button-2 delete-address-button']")).click();
		driver.switchTo().alert().accept();
		Thread.sleep(15000);
	
		Reporter.log("Address Removed Sucessfully............", true);
		
		WebDriver_Utility.getscreenshotofwebpage(driver, "removedaddress");
	}

}
