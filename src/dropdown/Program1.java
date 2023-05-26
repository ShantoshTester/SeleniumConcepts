package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Program1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./browsersexe/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		
		WebElement countryDropdown = driver.findElement(By.name("country"));
		Select sel = new Select(countryDropdown);
		
		// There are 3 different ways to select a value from dropdown
		// 1 using index
		sel.selectByIndex(10);
		Thread.sleep(3000);
		
		// 2 using visible text -- commonly used
		sel.selectByVisibleText("LITHUANIA");
		Thread.sleep(3000);
		
		// 3 using value
		sel.selectByValue("QATAR");
		Thread.sleep(3000);
		
		driver.close();
			
	}

}
