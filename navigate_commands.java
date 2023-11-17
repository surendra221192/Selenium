package selenium_programs;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class navigate_commands {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origin.*");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");//facebook--full page
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.navigate().to("https://www.snapdeal.com");//will not wait to load full
		Thread.sleep(5000);
		driver.navigate().back();//facebook
		Thread.sleep(5000);
		driver.navigate().forward();//snapdeal
		Thread.sleep(5000);
		driver.navigate().refresh();
		driver.get("https://www.amazon.com");
		driver.navigate().back();//snapdeal
		driver.navigate().back();//facebok
		driver.close();	
	}

}
