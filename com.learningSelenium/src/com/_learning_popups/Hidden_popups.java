package com._learning_popups;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hidden_popups {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.name("q")).sendKeys("iphone15", Keys.ENTER);
		driver.findElement(By.xpath("(//div[@class='KzDlHZ'])[1]")).click();
		
		String parent = driver.getWindowHandle();
		Set<String> allwindow = driver.getWindowHandles();
		allwindow.remove(parent);
		
		for (String window : allwindow) 
		{
			driver.switchTo().window(window);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[text()='Add to cart']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[text()='Remove']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[text()='Remove' and @class='sBxzFz fF30ZI A0MXnh']")).click();
			Thread.sleep(5000);
			driver.quit();
			
		}
		

	}

}
