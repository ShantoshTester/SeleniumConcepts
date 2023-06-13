package testngassert;

import org.testng.Assert;

public class TestAssert2 {

	public static void main(String[] args) {
		
		String title = "Welcome to the World of Automation Testing by Shantosh";
		System.out.println("Program Starts");
		System.out.println("1 Executed");
		System.out.println("2 Executed");
		System.out.println("3 Executed");
		
		Assert.assertTrue(title.contains("Shantosh"));
		
		System.out.println("4 Executed");
		System.out.println("5 Executed");
		System.out.println("6 Executed");
		System.out.println("Program Ends");

	}

}
