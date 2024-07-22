package Learning_DropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Learning_Multi_Select_Drop_Down {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium08.blogspot.com/2019/11/dropdown.html");
		WebElement DropDown = driver.findElement(By.name("Month"));
		Select sel = new Select(DropDown);
		Thread.sleep(2000);
		sel.selectByIndex(6);
		Thread.sleep(2000);
		sel.selectByValue("May");
		Thread.sleep(2000);
		sel.selectByVisibleText("March");
		Thread.sleep(2000);
		
		List<WebElement> SelectedOptions = sel.getAllSelectedOptions();
		for (WebElement option : SelectedOptions) {
			System.out.println(option.getText());
			
		}
			
//		}
		
////		Deselection Methos
//		sel.deselectByIndex(6);
//		Thread.sleep(2000);
//		sel.deselectByValue("May");
//		Thread.sleep(2000);
//		sel.deselectByVisibleText("March");
//		
//		sel.deselectAll();
		driver.quit();
		
	}
	

}
