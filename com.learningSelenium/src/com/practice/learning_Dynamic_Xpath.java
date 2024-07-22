package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class learning_Dynamic_Xpath {

	public static void main(String[] args) {

		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.name("q")).sendKeys("iphone 15");
		driver.findElement(By.xpath("//button[@class='MJG8Up']")).click();
		driver.findElement(By.xpath("//div[text()='Apple iPhone 15 (Pink, 128 GB)']/../../..//div[@class='Nx9bqj _4b5DiR']")).getText();x
	}

}
