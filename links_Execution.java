package selenium_programs;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class links_Execution {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origin.*");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("Click here to go to ")).click();
		Thread.sleep(3000);
		//driver.findElement(By.linkText("Today's Deals")).click();
		//	Thread.sleep(4000);
			int size=driver.findElements(By.tagName("a")).size();
			System.out.println("no.of links in amazon page is "+size);
			//lists map Set
		List<WebElement> links=driver.findElements(By.tagName("a"));//335
		for(WebElement link:links )
		{
			System.out.println(link.getText());
			System.out.println(link.getAttribute("href"));
		}
			driver.close();
	}

}
