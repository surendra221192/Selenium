package selenium_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class moveToElement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origin.*");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement contribute=driver.findElement(By.xpath("//*[text()='Contribute']"));
		WebElement cla=driver.findElement(By.xpath("//*[text()='CLA']"));
		WebElement style=driver.findElement(By.xpath("//*[text()='Style Guides']"));
		WebElement bugtriage=driver.findElement(By.xpath("//*[text()='Bug Triage']"));
		
		Actions act=new Actions(driver);
		/*act.moveToElement(contribute).build().perform();
		act.moveToElement(cla).build().perform();
		act.moveToElement(style).build().perform();
		act.moveToElement(bugtriage).click().build().perform();*/
		act.moveToElement(contribute).moveToElement(cla).moveToElement(style).moveToElement(bugtriage).click().build().perform();
		

	}

}
