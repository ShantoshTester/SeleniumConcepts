package datadrivenframework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RegisterTest {
	
	@DataProvider(name="registerdata")
	public Object[][] registerData()
	{
		Object[][] data = new Object[2][4];
		data[0][0]="shantosh";
		data[0][1]="kumar";
		data[0][2]="986758989";
		data[0][3]="shantosh@test.com";
		
		data[1][0]="shruthi";
		data[1][1]="pallavi";
		data[1][2]="79752002";
		data[1][3]="shruthipallavi@test.com";
		
		return data;
	}
	
	@Test(dataProvider = "registerdata")
	public void testRegistrationForm(String fn,String ln,String ph,String email) throws InterruptedException
	{
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "./browsersexe/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.findElement(By.name("firstName")).sendKeys(fn);
		driver.findElement(By.name("lastName")).sendKeys(ln);
		driver.findElement(By.name("phone")).sendKeys(ph);
		driver.findElement(By.id("userName")).sendKeys(email);
		Thread.sleep(3000);
		driver.close();
	}

}
