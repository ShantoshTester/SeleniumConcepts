package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByCSS {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./browsersexe/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/User/Desktop/csssample.html");
		driver.findElement(By.tagName("input")).sendKeys("admin@test.com");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("iampassword");

	}

}
