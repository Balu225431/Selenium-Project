package com.leraningTask;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class Task4 {

	public static void main(String[] args) throws InterruptedException, IOException {
		
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
			Thread.sleep(4000);

			for (String string0.0 : AllwindowHandle) {
				
			}
			TakesScreenshot Ts = (TakesScreenshot) driver;
			File Ram = Ts.getScreenshotAs(OutputType.FILE);
			File Rom = new File("C:\\Users\\M.Bala Murugan\\Downloads\\Sample\\flipkart1.jpeg");
			FileHandler.copy(Ram, Rom);
			Thread.sleep(4000);
		}
			driver.quit();
	}

}
