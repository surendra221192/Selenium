package selenium_programs;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class xpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origin.*");
		WebDriver driver=new ChromeDriver();
		driver.get("https://hrms.indianrail.gov.in/HRMS/login");
		driver.manage().window().maximize();
		Thread.sleep(6000);
		//driver.findElement(By.xpath("/html/body/section/div[3]/div/div[3]/div/a")).click();
		driver.findElement(By.xpath("//a[@class='text-danger h6 bold-text']")).click();
	}

}
	


