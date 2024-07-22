package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	private static WebElement element1;

	public static void main(String[] args) throws Exception {

		ChromeDriver driver = new ChromeDriver();
//	   driver.get("https://www.flipkart.com/");
	   driver.manage().window().maximize();
	   Thread.sleep(2000);
	   
	   driver.navigate().to("https://www.amazon.in/");
//	   driver.navigate().back();
	   WebElement element = driver.findElement(By.id("twotabsearchtextbox"));
//	   element.sendKeys("Books");
	   element.sendKeys("BOOK");
	   driver.findElement(By.id("nav-search-submit-button")).click();
	   driver.findElement(By.xpath("(//span[text()='The Power of Your Subconscious Mind'])[1]")).click();
	   driver.navigate().back();
	   driver.findElement(By.id("nav-orders")).click();
	   Thread.sleep(2000);
	   driver.navigate().back();
//	   WebElement element1 = driver.findElement(By.id("twotabsearchtextbox"));
	  
	  
	  
	   
	}
	
}
