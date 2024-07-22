package com.generic_utilities;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class WebDriver_Utility {
	
	public static void getscreenshotofwebpage(WebDriver driver, String name) throws IOException {
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./ScreenShot/DWS_"+name+".jpeg");
		FileHandler.copy(source, dest);
	}
	
//	public static void scrolltowebelement(WebDriver driver, WebElement element) {
//		
//		JavascriptExecutor js =(JavascriptExecutor) driver;
//		js.executeScript("arguments[0].scrollIntoView(false)", element);
//		
//	}
}
