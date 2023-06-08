package actionsclass;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClicking {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./browsersexe/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		
		WebElement forgotPassword = driver.findElement(By.linkText("Forgot your password?"));
		Actions action = new Actions(driver);
		action.contextClick(forgotPassword).build().perform();
		action.sendKeys(Keys.ENTER).build().perform();

	}

}
