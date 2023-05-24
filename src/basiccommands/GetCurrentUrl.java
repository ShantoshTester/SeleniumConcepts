package basiccommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentUrl {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./browsersexe/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://appium.io/");
		Thread.sleep(1000);
		String currenturl = driver.getCurrentUrl();
		System.out.println("Current URL : "+currenturl);
		Thread.sleep(3000);
		driver.close();

	}

}
