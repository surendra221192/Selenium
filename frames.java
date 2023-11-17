package selenium_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class frames {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origin.*");
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		//driver.switchTo().frame(0);
		driver.switchTo().frame(driver.findElement(By.id("frame-one796456169")));
	driver.findElement(By.id("RESULT_TextField-0")).sendKeys("frame program");
	driver.switchTo().defaultContent();
	driver.findElement(By.xpath("//*[text()=\"open cart          \"]")).click();
	}

}
