package com.leraningTask;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.Flipkart.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.name("q")).sendKeys("Iphone 15",Keys.ENTER);
	     List<WebElement> elements = driver.findElements(By.xpath("//div[@class='KzDlHZ']"));
	     List<WebElement> elements2 = driver.findElements(By.xpath("//div[@class='Nx9bqj _4b5DiR']"));
	     
	}

}
