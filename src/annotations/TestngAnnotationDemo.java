package annotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestngAnnotationDemo {
	
	@BeforeSuite
	public void setUpReport()
	{
		System.out.println("Setting up Extent Report");
	}
	
	@AfterSuite
	public void flushReport()
	{
		System.out.println("flush the report");
		System.out.println("Kill all the browser instance");
	}
	
	@BeforeTest
	public void preTest()
	{
		System.out.println("Do a API call and check if the application is UP");
	}
	
	@AfterTest
	public void postTest()
	{
		System.out.println("Get the status code to be 200");
	}
	
	@BeforeClass
	public void clearCache()
	{
		System.out.println("Clear the Cache");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("Garbage Collect the Class from Memory");
	}
	
	@BeforeMethod
	public void setUp()
	{
		System.out.println("Open the browser and navigate to the applicaiton");
	}
	
	@AfterMethod
	public void tearDown()
	{
		System.out.println("Close the browser");
	}
	
	@Test(enabled = true,priority = 1)
	public void b()
	{	
		System.err.println("Test 1 Executed");	
	}
	
	@Test(enabled = true,priority = 2)
	public void a()
	{
		System.err.println("Test 2 Executed");
	}
	
	@Test(enabled = true,invocationCount = 1,priority = 3)
	public void c()
	{
		System.err.println("Test 3 Executed");
	}

}
