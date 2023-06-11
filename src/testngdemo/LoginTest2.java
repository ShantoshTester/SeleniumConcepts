package testngdemo;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LoginTest2 extends BaseTest {

	@Test
	public void testLoginWithInValidCredientials() 
	{
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("admin");
		driver.findElement(By.id("loginButton")).click();
		driver.findElement(By.id("logoutLink")).click();
	}

}
