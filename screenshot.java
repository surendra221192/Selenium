package selenium_programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.*;

public class screenshot {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origin.*");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");//facebook--full page
		driver.manage().window().maximize();
		Thread.sleep(3000);
		//full page screenshot
		/*TakesScreenshot sc = (TakesScreenshot)driver;
	    File src=sc.getScreenshotAs(OutputType.FILE);//capture the screenshot and saves in memory
		File target=new File(".\\screenshot\\facebook.png");
		FileHandler.copy(src, target);*/
		//section
		WebElement sec=driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[2]/div/div[1]"));
		File src=sec.getScreenshotAs(OutputType.FILE);//capture the screenshot and saves in memory
		File target=new File(".\\screenshot\\facebooksection.png");
		FileHandler.copy(src, target);
		driver.close();	
	}

}
