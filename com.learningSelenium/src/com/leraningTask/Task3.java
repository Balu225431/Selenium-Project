package com.leraningTask;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3 {

	public static void main(String[] args) throws InterruptedException {

		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.Flipkart.com/");
		Thread.sleep(2000);
		
//		Actions action =new Actions(driver);
		 driver.findElement(By.name("q")).sendKeys("Iphone 15",Keys.ENTER);
	     List<WebElement> elements = driver.findElements(By.xpath("//div[@class='KzDlHZ']"));
//	     List<WebElement> elements2 = driver.findElements(By.xpath("//div[contains(text(),'Apple iPhone 15')]/../../..//div[@class='Nx9bqj _4b5DiR']"));
	    
	     
	     for (int i = 0; i <elements.size(); i++) 
	     {
	    	 
	    	 String webElement = elements.get(i).getText();
	    	 System.out.println(webElement);
	    	 WebElement elements2 = driver.findElement(By.xpath("//div[text()='"+webElement+"']/../../..//div[@class='Nx9bqj _4b5DiR']"));
	    	 
	    	 String webElement2 = elements2.getText();
	    	 System.out.println(webElement2);
			
	    	
		}
	     driver.quit();
	    
	}

}
