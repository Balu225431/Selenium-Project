package com._learning_popups;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender_Popup {

	public static void main(String[] args) throws InterruptedException, AWTException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage(). window(). maximize();
		driver.get ("https://www.hyrtutorials.com/p/calendar-practice.html");
		driver.findElement (By.xpath("//img[@class='ui-datepicker-trigger']")).click();
		WebElement element = driver.findElement(By.className("ui-datepicker-title"));
		String text = element.getText();
		do {
		element = driver.findElement (By.className("ui-datepicker-title"));
		text = element. getText();
		driver. findElement (By.className("ui-icon-circle-triangle-w")).click();
		}while(!text.equals ("September 1947"));
		WebElement element2 = driver.findElement (By.xpath(" (//a[@class='ui-state-default'])[15]"));
		element2.click();
		
	}

}
