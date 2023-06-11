package iframehandling;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeProgram3 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./browsersexe/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/User/Desktop/IframeEx.html");

		// There are 3 different ways to take the control from parent page to iframe
		// using index - using id or name (only id or name) - using iframe was
		// webelement

		driver.switchTo().frame("actiMind");
		driver.findElement(By.xpath("//button[@class='c-hor-nav-toggler']")).click();
		Thread.sleep(3000);
//		driver.switchTo().defaultContent();
		driver.switchTo().parentFrame();
		driver.findElement(By.linkText("Click Here to Navigate to Google")).click();

	}

}
