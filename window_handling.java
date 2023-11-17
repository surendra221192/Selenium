package selenium_programs;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class window_handling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origin.*");
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
	//	System.out.println(driver.getWindowHandle());
		driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
		Thread.sleep(3000);
		Set<String> wind=driver.getWindowHandles();//
		for(String w:wind)
		{
			System.out.println(w);
			String title="Your Store";
			String t=driver.switchTo().window(w).getTitle();
			Thread.sleep(3000);
			if(t.equals(title))
			{
				driver.findElement(By.xpath("//*[text()=\"Shopping Cart\"]")).click();
				Thread.sleep(5000);
			}
		}
		driver.quit();
	}

}
