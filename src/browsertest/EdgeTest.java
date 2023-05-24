package browsertest;

import org.openqa.selenium.edge.EdgeDriver;

public class EdgeTest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.edge.driver", "./browsersexe/msedgedriver.exe");
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		Thread.sleep(3000);
		driver.close();

	}

}
