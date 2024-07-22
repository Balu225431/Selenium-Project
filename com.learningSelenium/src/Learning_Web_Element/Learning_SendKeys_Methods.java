package Learning_Web_Element;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learning_SendKeys_Methods {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("email")).sendKeys("SDJHCSHFSDGFWYG", Keys.TAB, "shtcfwhcjwd", Keys.TAB, Keys.TAB, Keys.ENTER);
		Thread.sleep(2000);
		driver.quit();
	}

}
