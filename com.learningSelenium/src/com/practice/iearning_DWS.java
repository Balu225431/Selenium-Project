package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class iearning_DWS {

	public static void main(String[] args) throws InterruptedException{

		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
//		driver.findElement(By.className("ico-register")).click();
//		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.partialLinkText("Regi")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("gender-male")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("FirstName")).sendKeys("Bala Murugan");
		Thread.sleep(2000);
		driver.findElement(By.name("LastName")).sendKeys("M");
		Thread.sleep(2000);
		driver.findElement(By.id("Email")).sendKeys("murugan661999@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.name("Password")).sendKeys("B123456@m");
		Thread.sleep(2000);
		driver.findElement(By.name("ConfirmPassword")).sendKeys("B123456@m");
		Thread.sleep(2000);
		driver.findElement(By.id("register-button")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("register-continue-button")).click();
		
		
		
		
	}

}
