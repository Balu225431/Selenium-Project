package Learning_Web_Element;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learning_WebElement_RDEST_TN {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zomato.com/");
		
		driver.findElement(By.linkText("Sign up")).click();
		
		WebElement element = driver.findElement(By.xpath("//button[@class='sc-1kx5g6g-1 elxuhW']"));
		System.out.println(Element);
		
	}

}
