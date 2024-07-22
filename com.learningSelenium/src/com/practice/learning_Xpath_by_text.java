package com.practice;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class learning_Xpath_by_text {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		WebElement element=driver.findElement(By.xpath("//h1[text()='Welcome, Please Sign In!']"));
		String text =element.getText();
		
		
	}

}
