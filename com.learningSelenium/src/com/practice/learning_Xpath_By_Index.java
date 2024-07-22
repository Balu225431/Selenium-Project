package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class learning_Xpath_By_Index {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@autocapitalize='off'])[1]")).sendKeys("Bala Murugan");
		driver.findElement(By.xpath("(//input[@autocapitalize='off'])[2]")).sendKeys("12345679");

}
	}


