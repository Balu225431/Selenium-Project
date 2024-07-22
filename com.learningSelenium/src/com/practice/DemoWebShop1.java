package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebShop1 {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
//		driver.findElement(By.className("ico-login")).click();
//		driver.findElement(By.className("email")).sendKeys("murugan661999@gmail.com");
//		driver.findElement(By.id("Password")).sendKeys("123456789");
//		driver.findElement(By.className("login-button")).click();
		
//		driver.findElement(By.className("ico-login")).click();
//		driver.findElement(By.id("Email")).sendKeys("murugan661999@gmail.com");
//		driver.findElement(By.className("password")).sendKeys("123456789");
//		driver.findElement(By.className("login-button")).click();
		
		driver.findElement(By.className("ico-login")).click();
		driver.findElement(By.name("Email")).sendKeys("murugan661999@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("B123456@m");
		driver.findElement(By.className("login-button")).click();


	}

}
