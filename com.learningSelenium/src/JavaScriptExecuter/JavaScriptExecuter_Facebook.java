package JavaScriptExecuter;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecuter_Facebook {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.Facebook.com/");
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		WebElement element = driver.findElement(By.id("email"));
		js.executeScript("arguments[0].value='bala@gmail.com'", element);
		Thread.sleep(2000);
		
		WebElement element2 = driver.findElement(By.linkText("Create new account"));
		js.executeScript("arguments[0].click()", element2);
		Thread.sleep(2000);
		
		WebElement element3 = driver.findElement(By.name("custom_gender"));
		js.executeScript("arguments[0].value='Transgender'", element3);
		Thread.sleep(2000);
		
		WebElement element4 = driver.findElement(By.xpath("(//input[@type='radio'])[3]"));
		js.executeScript("arguments[0].click()", element4);
		Thread.sleep(5000);
		
		driver.quit();
	}
	 
}
