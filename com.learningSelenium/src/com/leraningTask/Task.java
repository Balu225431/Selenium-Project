package com.leraningTask;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task {

	public static void main(String[] args) throws InterruptedException {

		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.Flipkart.com/");
		Thread.sleep(2000);
		
//		Actions action =new Actions(driver);
		driver.findElement(By.name("q")).sendKeys("Iphone 15",Keys.ENTER);
	     List<WebElement> elements = driver.findElements(By.xpath("//div[@class='KzDlHZ']"));
	     List<WebElement> elements2 = driver.findElements(By.xpath("//div[@class='Nx9bqj _4b5DiR']"));
	     
	     for (int i = 0; i <elements.size(); i++) 
	     {
	    	 WebElement webElement = elements.get(i);
	    	 System.out.println(webElement.getText());
	    	 
	    	 WebElement webElement2 = elements2.get(i);
	    	 System.out.println(webElement2.getText());
			
		}
	     
	     
	    driver.quit();
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
//		driver.findElement(By.xpath("//div[@class='KzDlHZ']"));
//		Thread.sleep(2000);
//		System.out.println(MobileSearch.getText());
//		WebElement Print = driver.findElement(By.xpath("//div[text()='Apple iPhone 15 (Black, 128 GB)']/../../..//div[@class='Nx9bqj _4b5DiR']"));
//		System.out.println(Print.getText());

//		for (int i = 1; i <=24; i++) {
//			System.out.println(MobileSearch.getText());
//			System.out.println(Print.getText());
//			
//		}
	}

}
