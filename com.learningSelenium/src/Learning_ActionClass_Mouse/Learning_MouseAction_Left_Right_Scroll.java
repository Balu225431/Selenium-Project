package Learning_ActionClass_Mouse;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Learning_MouseAction_Left_Right_Scroll {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		Actions action =new Actions(driver);
//		action.contextClick().perform();
		
		WebElement register = driver.findElement(By.linkText("Register"));
//		action.click(register).perform();
		
		WebElement addtocart = driver.findElement(By.xpath("(//input[@value='Add to cart'])[2]"));
		action.scrollToElement(addtocart).perform();
		action.click(addtocart).perform();

	}

}
