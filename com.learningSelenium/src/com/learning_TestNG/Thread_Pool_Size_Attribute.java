package com.learning_TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Thread_Pool_Size_Attribute {
	@Test(invocationCount = 10, threadPoolSize = 5)
	public void loginToDwsTest() {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.className("ico-login")).click();

		driver.findElement(By.className("ico-login")).click();
		driver.findElement(By.name("Email")).sendKeys("murugan661999@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("B123456@m");
		driver.findElement(By.className("login-button")).click();

		if (driver.findElement(By.linkText("murugan661999@gmail.com")).isDisplayed()) 
		{
			Reporter.log("User Login Sucessfully.......", true);
			driver.findElement(By.linkText("Log out")).click();
			driver.quit();
		}
	}
}
