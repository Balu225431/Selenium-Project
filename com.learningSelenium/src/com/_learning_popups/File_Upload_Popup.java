package com._learning_popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class File_Upload_Popup {

	public static void main(String[] args) throws InterruptedException {

		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://the-internet.herokuapp.com/upload");
		Thread.sleep(2000);
		
	    driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\M.Bala Murugan\\Documents\\BATCH 5.pdf");
	    Thread.sleep(2000);
	    driver.findElement(By.id("file-submit")).click();
	}

}
