package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class learning_CssSelector {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.cssSelector("[href='/login']")).click();
		driver.findElement(By.cssSelector("[autofocus='autofocus']")).sendKeys("murugan661999@gmail.com");
		driver.findElement(By.cssSelector("[type='password']")).sendKeys("B123456@m");
		driver.findElement(By.cssSelector("[value='Log in']")).click();
		

	}

}
