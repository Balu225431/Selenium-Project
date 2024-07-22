package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {
	public static void main(String[] args) {
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	 driver.get("https://demowebshop.tricentis.com/");
	 driver.findElement(By.name("q")).sendKeys("mobile");
	 driver.findElement(By.className("button-1")).click();
	 
	 
}
}
