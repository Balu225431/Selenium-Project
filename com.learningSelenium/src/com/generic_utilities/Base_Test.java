package com.generic_utilities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class Base_Test {
	
	public	WebDriver driver;
	
	@BeforeClass
	public void openbrowser() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/");
	}
	
	@BeforeMethod
	public void loginDWS() {
		driver.findElement(By.className("ico-login")).click();
		driver.findElement(By.name("Email")).sendKeys("murugan661999@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("B123456@m");
		driver.findElement(By.className("login-button")).click();
	}
	
	@AfterMethod
	public void logoutDWS() {
		driver.findElement(By.linkText("Log out")).click();
	}
	
	@AfterClass
	public void closebrowser() {
		driver.quit();
	}
}
