package selenium_programs;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.*;
public class google_browser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origin.*");
       WebDriver driver= new ChromeDriver();
       driver.get("https://www.google.com/");
       driver.manage().window().maximize();
       System.out.println("chrome was maximized");
       Thread.sleep(5000);
       driver.manage().window().minimize();
       System.out.println("chrome was manimized");
       Thread.sleep(10000);
       driver.close();


	}

}
