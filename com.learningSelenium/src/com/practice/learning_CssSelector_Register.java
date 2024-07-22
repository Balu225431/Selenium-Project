package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class learning_CssSelector_Register {

	public static void main(String[] args) {
		

		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.cssSelector("[href='/register']")).click();
		driver.findElement(By.cssSelector("[type='radio']")).click();
		driver.findElement(By.cssSelector("[type='text']")).sendKeys("Bala Murugan");
		driver.findElement(By.cssSelector("[type='text']")).sendKeys("M");
		driver.findElement(By.cssSelector("[type='text']")).sendKeys("murugan661999@gmail.com");
		driver.findElement(By.cssSelector("[data-val-length-max='999']")).sendKeys("B123456@m");
		driver.findElement(By.cssSelector("[data-val-equalto-other='*.Password']")).sendKeys("B123456@m");
		driver.findElement(By.cssSelector("[value='Register']")).click();
	}

}
