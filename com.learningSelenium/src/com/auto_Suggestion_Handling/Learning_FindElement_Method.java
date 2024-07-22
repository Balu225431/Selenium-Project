package com.auto_Suggestion_Handling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learning_FindElement_Method  {

	public static void main(String[] args) throws InterruptedException{
		
			WebDriver driver = new ChromeDriver();
			
			driver.manage(). window(). maximize();
			
			driver.get("https://www.google.com");

			Thread.sleep(2000);
			driver.findElement (By.id("APjFqb")).sendKeys("Selenium");

			List<WebElement> suggestions = driver .findElements(By.xpath("//div[@class='wM6W7d']"));
			System.out.println(suggestions);
			
//			for (WebElement suggestion: suggestions) {
//			
//			System.out.println(suggestion.getText());
//			
//			if (suggestion.getText().equals("selenium webdriver")) 
//			{
//			suggestion.click(); 
//			break;
//			}
//			}
			
			for (int i = 0; i < suggestions.size(); i++) {
				
				WebElement suggestion = suggestions.get(i);
				System.out.println(((WebElement) suggestions).getText());
				if (suggestion.getText().equals("selenium webdriver")) 
					{
					suggestion.click(); 
					break;
					}
				
			}
			driver.findElement (By .xpath("//h3[text()='WebDriver']")).click();
			Thread.sleep(2000);
			driver.quit();
			
			

	}

}
