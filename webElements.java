package selenium_programs;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class webElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origin.*");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		String expected="Facebook – log in or sign up";
		String actual=driver.getTitle();
		if(expected.equals(actual))
		{
			System.out.println("opened the correct website ..test is pass");
		}
		else
		{
			System.out.println("test failed");
		}
		
		System.out.println("current url of page="+driver.getCurrentUrl());
		//System.out.println(driver.getPageSource());
	
		//driver.close();
		driver.quit();
	}

}
