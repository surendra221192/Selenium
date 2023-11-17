package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class program_verifytitle {
	WebDriver driver;
	@BeforeTest
	public void launchBrowser()
	{
		 WebDriverManager.edgedriver().setup();
			 driver=new EdgeDriver();
			driver.get("https://www.google.com");
	}
	@Test
	public void title()
	{
		String title=driver.getTitle();
		System.out.println(title);
	}
	@AfterTest
	public void teardown()
	{
		driver.close();
}
}
