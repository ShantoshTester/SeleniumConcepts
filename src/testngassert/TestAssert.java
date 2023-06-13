package testngassert;

import org.testng.Assert;

public class TestAssert {

	public static void main(String[] args) {
		
		String expected = "Selenium";
		System.out.println("Program Starts");
		System.out.println("1 Executed");
		System.out.println("2 Executed");
		System.out.println("3 Executed");
		
		String actual = "Selenium";
		Assert.assertEquals(actual, expected,"expected result didnt not match with actual");
		
		System.out.println("4 Executed");
		System.out.println("5 Executed");
		System.out.println("6 Executed");
		System.out.println("Program Ends");

	}

}
