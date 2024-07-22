package com.learning_Add_To_Cart;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.grid.sessionqueue.RemoveFromSessionQueue;

public class Add_To_Cart {

	public static void main(String[] args) throws InterruptedException {
		

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.Flipkart.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.name("q")).sendKeys("Iphone 15",Keys.ENTER);
		driver.findElement(By.xpath("(//div[@class='KzDlHZ'])[1]")).click();
		Thread.sleep(2000);
		String ParentwindowHandle = driver.getWindowHandle();
		Set<String> AllwindowHandle = driver.getWindowHandles();
		AllwindowHandle.remove(ParentwindowHandle);
		System.out.println(ParentwindowHandle);
		System.out.println(AllwindowHandle);
		
		for (String windowHandle : AllwindowHandle) {
			driver.switchTo().window(windowHandle);
			driver.findElement(By.xpath("(//div[@class='XqNaEv'])[1]")).click();
			Thread.sleep(1000);
			driver.close();
			
		}
		driver.switchTo().window(ParentwindowHandle);
		driver.findElement(By.xpath("//a[text()='Login']")).click();

	}

}
