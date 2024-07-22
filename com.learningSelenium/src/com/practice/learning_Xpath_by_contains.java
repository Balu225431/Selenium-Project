package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class learning_Xpath_by_contains {

	public static void main(String[] args) {

		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[contains(@placeholder,'Email address or phone number')]")).sendKeys("9742112565");
		driver.findElement(By.xpath("//input[contains(@class,'inputtext _55r1 _6luy _9npi')]")).sendKeys("13251856");
		driver.findElement(By.xpath("//button[contains(@value,'1')]")).click();
	}

}
