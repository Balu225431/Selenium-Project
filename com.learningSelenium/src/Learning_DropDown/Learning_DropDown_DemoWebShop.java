package Learning_DropDown;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Learning_DropDown_DemoWebShop {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.className("ico-login")).click();
		driver.findElement(By.name("Email")).sendKeys("murugan661999@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("B123456@m");
		driver.findElement(By.className("login-button")).click();
		driver.findElement(By.className("cart-label")).click();
		
		WebElement dropdown = driver.findElement(By.className("country-input"));
		Select sel =new Select(dropdown);
		sel.selectByVisibleText("India");
		driver.findElement(By.name("estimateshipping")).click();
		WebElement dropdowns = driver.findElement(By.xpath("//ul[@class='shipping-results']"));
		System.out.println(dropdowns.getText());
		
		Thread.sleep(2000);
		driver.quit();
	}
	

}
