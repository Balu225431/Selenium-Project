package com.leraningTask;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Task5 {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.name("q")).sendKeys("shirts for men",Keys.ENTER);

	
		String parent = driver.getWindowHandle();

		for (int i = 1; i <=5 ; i++)
		{

			driver.findElement(By.xpath("(//a[@class='WKTcLC'])["+i+"]")).click();
			Thread.sleep(2000);
		}

		TakesScreenshot ts=(TakesScreenshot) driver;
		Set<String> allwindow = driver.getWindowHandles();
		allwindow.remove(parent);

		int i=1;

		for (String window : allwindow)
		{
			driver.switchTo().window(window);
			File source = ts.getScreenshotAs(OutputType.FILE);
			File destination=new File("C:\\Users\\M.Bala Murugan\\Downloads\\Sample\\"+i+++".jpeg");
			FileHandler.copy(source, destination);
		}

		driver.switchTo().window(parent);
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination=new File("./screenshots/product"+i+".jpeg");
		FileHandler.copy(source, destination);

		driver.quit();
	}
}
