package com._learning_popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascript_alert {

	public static void main(String[] args) throws InterruptedException {

			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://the-internet.herokuapp.com/javascript_alerts");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			
			driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
			driver.switchTo().alert().accept();
			
			
		
	}

}
