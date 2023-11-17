package selenium_programs;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class task1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origin.*");
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");//testautomation--full page
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.navigate().to("https://demo.opencart.com/");//will not wait to load full
		Thread.sleep(5000);
		driver.navigate().back();//testautomation
		Thread.sleep(5000);
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		driver.navigate().back();//testautomation
		driver.findElement(By.partialLinkText("demo.opencart")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Components")).click();
			Thread.sleep(4000);
			int size=driver.findElements(By.tagName("a")).size();
			System.out.println("no.of links in Components page is "+size);
			List<WebElement> links=driver.findElements(By.tagName("a"));
			for(WebElement link:links )
			{
				System.out.println(link.getText());
				System.out.println(link.getAttribute("href"));
			}
				driver.close();
	}

}
