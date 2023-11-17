package selenium_programs;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Keys1_actions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origin.*");
		WebDriver driver=new ChromeDriver();
		driver.get("https://text-compare.com/");
		driver.manage().window().maximize();
		Thread.sleep(9000);
         WebElement f1=driver.findElement(By.id("inputText1"));
         f1.sendKeys("Selenium");
         WebElement f2=driver.findElement(By.id("inputText2"));
         Actions act=new Actions(driver);
         //ctrl+A
         act.keyDown(Keys.CONTROL);
         act.sendKeys("a");
         act.keyUp(Keys.CONTROL);
         act.perform();
         //Ctrl+C
         act.keyDown(Keys.CONTROL);
         act.sendKeys("c");
         act.keyUp(Keys.CONTROL);
         act.perform();
         //Tab
         act.sendKeys(Keys.TAB).perform();
         //ctrl+V
         act.keyDown(Keys.CONTROL);
         act.sendKeys("v");
         act.keyUp(Keys.CONTROL);
         act.perform();
	}

}
