package com.leraningTask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

	public static void main(String[] args) throws InterruptedException {
	
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.className("ico-login")).click();
		driver.findElement(By.name("Email")).sendKeys("murugan661999@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("B123456@m");
		driver.findElement(By.className("login-button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@class='account'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[text()='Addresses'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='button-1 add-address-button']")).click();

	}

}
