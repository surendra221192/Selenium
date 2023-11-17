package selenium_programs;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origin.*");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
		driver.manage().window().maximize();
		//id
		driver.findElement(By.id("FirstName")).sendKeys("firstname");
		Thread.sleep(3000);
         //name
		driver.findElement(By.name("LastName")).sendKeys("lastname");
		Thread.sleep(3000);
		//class
		driver.findElement(By.className("ico-login")).click();
		Thread.sleep(4000);
         //linkText
		driver.findElement(By.linkText("Wishlist")).click();
           //partial link text
		driver.findElement(By.partialLinkText("Jewe")).click();
		driver.findElement(By.partialLinkText("Vintage")).click();
		System.out.println(driver.findElements(By.tagName("div")).size());
		
		//driver.findElement(By.cssSelector("button#add-to-wishlist-button-42")).click();

		driver.findElement(By.cssSelector("#add-to-wishlist-button-42")).click();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("span.wishlist-label")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[name='addtocart']")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("button.button-2.wishlist-add-to-cart-button[type=\"submit\"]")).click();
		
		

		//driver.close();
		
	}

}



	


