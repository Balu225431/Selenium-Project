package com.auto_Suggestion_Handling;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learning_FlipKart_Suggestion {

	public static void main(String[] args) throws InterruptedException {
 
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
	    driver.findElement(By.xpath("//input[@class='Pke_EE']")).sendKeys("iphone12");
		Thread.sleep(2000);
		List<WebElement> suggestion = driver.findElements(By.xpath("(//li[@class='_3D0G9a'])[1]"));
	    System.out.println(suggestion);
		
		
	    for (int i = 0; i < suggestions.size(); i++) {
	    	WebElement webElement = suggestion.get(i);
	    	System.out.println( webElement.getText());
	    	if (suggestion.get) {
				
			}
	    	
	    	
	    	
			
//		}
	}

}
