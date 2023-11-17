package selenium_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class practice_Exercise1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
         ChromeOptions co=new ChromeOptions();
         co.addArguments("--remote-allow-origin.*");
         WebDriver driver=new ChromeDriver();
         driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
        driver.manage().window().maximize();
        driver.findElement(By.id("gender-male")).click();
         driver.findElement(By.id("FirstName")).sendKeys("Surendra");
         driver.findElement(By.id("LastName")).sendKeys("Babu");
         driver.findElement(By.id("Email")).sendKeys("aa@gmail.com");
         //driver.findElement(By.id("Your Password")).sendKeys("Password");
        // driver.findElement(By.id("Your Password")).sendKeys("Confirm password");
       WebElement ele=driver.findElement(By.id("Company"));
         ele.sendKeys("Oracle"); 
        Thread.sleep(5000);
        ele.clear();
         String expected="nopCommerce demo store. Register";
         String actual=driver.getTitle();
         if (expected.equals(actual))
         {
         System.out.println("open the correct title... test is passed");
         }
         else
         {
        	 System.out.println("test is failed");
         }
         System.out.println(driver.getPageSource());
         driver.close();
      
	}
	}


