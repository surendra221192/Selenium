package selenium_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class uploading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origin.*");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.foundit.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"heroSection-container\"]/div[3]/div[2]")).click();
		driver.findElement(By.id("file-upload")).sendKeys("C://Users//Anvika//OneDrive//Desktop//Classes//weekday_shipra//java.txt");
	}

}
