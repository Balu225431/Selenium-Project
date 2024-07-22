package com.TakesScreenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakesScreenShot_WebPage {

	public static void main(String[] args) throws InterruptedException, IOException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.Flipkart.com/");
		driver.findElement(By.name("q")).sendKeys("vivo",Keys.ENTER);
		Thread.sleep(2000);
		
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		File source = ts.getScreenshotAs(OutputType.FILE);
		
		File save = new File("C:\\Users\\M.Bala Murugan\\Downloads\\Sample\\flipkart.jpeg");
		
		FileHandler.copy(source, save);
		Thread.sleep(2000);
		driver.quit();
		
	}

}
