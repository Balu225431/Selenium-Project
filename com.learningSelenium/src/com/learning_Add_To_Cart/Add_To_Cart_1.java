package com.learning_Add_To_Cart;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Add_To_Cart_1 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.Flipkart.com/");
		Thread.sleep(2000);

		Actions action = new Actions(driver);
		driver.findElement(By.name("q")).sendKeys("Iphone 15", Keys.ENTER);
		driver.findElement(By.xpath("(//div[@class='KzDlHZ'])[1]")).click();
		Thread.sleep(2000);
		String ParentwindowHandle = driver.getWindowHandle();
		Set<String> AllwindowHandle = driver.getWindowHandles();
		AllwindowHandle.remove(ParentwindowHandle);
		System.out.println(ParentwindowHandle);
		System.out.println(AllwindowHandle);

		for (String windowHandle : AllwindowHandle) {
			driver.switchTo().window(windowHandle);
			WebElement addtocart = driver.findElement(By.xpath("//button[@class='QqFHMw vslbG+ In9uk2']"));
			action.scrollToElement(addtocart).perform();
			action.click(addtocart).perform();

		}
		for (int i = 2; i <=5; i++) {
			driver.switchTo().window(ParentwindowHandle);
			driver.findElement(By.xpath("(//div[@class='KzDlHZ'])[2]")).click();
			Thread.sleep(2000);
		}
//		driver.switchTo().window(ParentwindowHandle);
//		driver.findElement(By.xpath("(//div[@class='KzDlHZ'])[2]")).click();
//		Thread.sleep(2000);
//
//		driver.switchTo().window(ParentwindowHandle);
//		driver.findElement(By.xpath("(//div[@class='KzDlHZ'])[3]")).click();
//		Thread.sleep(2000);
//
//		driver.switchTo().window(ParentwindowHandle);
//		driver.findElement(By.xpath("(//div[@class='KzDlHZ'])[4]")).click();
//		Thread.sleep(2000);
//
//		driver.switchTo().window(ParentwindowHandle);
//		driver.findElement(By.xpath("(//div[@class='KzDlHZ'])[5]")).click();
//		Thread.sleep(2000);

	}

}
