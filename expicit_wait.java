package selenium_programs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class expicit_wait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
	
		WebDriver driver =new ChromeDriver(options);
		driver.get("https://www.google.com");
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.manage().window().maximize();
		WebElement search=driver.findElement(By.name("q"));
		search.sendKeys("selenium");
		search.sendKeys(Keys.RETURN);//enter key
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(2));
		
		WebElement ele=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[text()=\"Selenium\"]")));
		ele.click();
	}

}
