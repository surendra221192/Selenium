package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class crossbrowsing {
	WebDriver driver;
	@Parameters("browser")
	@BeforeTest
	public void launchApp(String browser)
	{
		if(browser.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			
			
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			
			
		}
		else
		{
			System.out.println("no browser selected");
		}
	}
	@Test
	public void running() throws InterruptedException
	{
		driver.get("https://www.google.com");
		Thread.sleep(3000);
	}
	@AfterTest
	public void teardown()
	{
		driver.close();
	}
	}

	