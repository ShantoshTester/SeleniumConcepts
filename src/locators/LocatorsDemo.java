package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./browsersexe/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/newtours/");
		driver.findElement(By.linkText("REGISTER")).click();
		WebElement firstName = driver.findElement(By.name("firstName"));
		firstName.clear();
		firstName.sendKeys("shantosh");
		driver.findElement(By.name("lastName")).sendKeys("kumar");
		driver.findElement(By.name("phone")).sendKeys("7975635835");
		driver.findElement(By.id("userName")).sendKeys("shantosh@test.com");
		driver.findElement(By.name("address1")).sendKeys("no 615 arizona wall street");
		driver.findElement(By.name("city")).sendKeys("arizona");
		driver.findElement(By.name("state")).sendKeys("ohio");
		driver.findElement(By.name("postalCode")).sendKeys("36265");
		driver.findElement(By.id("email")).sendKeys("shantosh@test.com");
		driver.findElement(By.name("password")).sendKeys("pass@123");
		driver.findElement(By.name("confirmPassword")).sendKeys("pass@123");
		driver.findElement(By.name("submit")).click();
		Thread.sleep(3000);
		driver.close();

	}

}
