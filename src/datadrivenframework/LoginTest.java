package datadrivenframework;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
	
	@DataProvider(name="actiData")
	public Object[][] testData()
	{
		Object[][] data = new Object[2][2];
		
		data[0][0]="admin";
		data[0][1]="manager";

		data[1][0]="admin";
		data[1][1]="manager";
		
		return data;
	}
	
	@DataProvider(name="actiData1")
	public Object[][] testData1()
	{
		Object[][] data = new Object[1][2];
		
		data[0][0]="admin";
		data[0][1]="manager";
		
		return data;
	}

	@Test(dataProvider = "actiData1")
	public void testLoginWithValidCredientials(String username,String password) 
	{	
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password);
		driver.findElement(By.id("loginButton")).click();
		driver.findElement(By.id("logoutLink")).click();	
	}

}
