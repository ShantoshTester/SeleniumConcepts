package testngdemo;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

	@Test
	public void testLoginWithValidCredientials() 
	{
		
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		driver.findElement(By.id("logoutLink")).click();
		
	}

}
